/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author Guilherme e Gustavo
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Classe responsável por exibir a interface gráfica do validador de HTML.
 */
public class InterfaceGraficaValidador extends JFrame {

    private JTextField campoArquivo;
    private JTextArea areaResultado;
    private JTextArea areaTags;
    private JButton botaoProcessar;

    /**
     * Construtor que inicializa a interface gráfica com componentes de entrada,
     * saída e botão de validação.
     */
    public InterfaceGraficaValidador() {
        super("Validador de Arquivo HTML");

        campoArquivo = new JTextField(30);
        botaoProcessar = new JButton("Processar");
        areaResultado = new JTextArea(5, 50);
        areaResultado.setEditable(false);
        areaResultado.setBorder(BorderFactory.createTitledBorder("Resultado da Análise"));

        areaTags = new JTextArea(10, 50);
        areaTags.setEditable(false);
        areaTags.setBorder(BorderFactory.createTitledBorder("Tags Encontradas"));

        JPanel painelSuperior = new JPanel();
        painelSuperior.add(new JLabel("Arquivo:"));
        painelSuperior.add(campoArquivo);

        JButton botaoBuscar = new JButton("...");
        painelSuperior.add(botaoBuscar);
        painelSuperior.add(botaoProcessar);

        JScrollPane scrollResultado = new JScrollPane(areaResultado);
        JScrollPane scrollTags = new JScrollPane(areaTags);

        setLayout(new BorderLayout());
        add(painelSuperior, BorderLayout.NORTH);
        add(scrollResultado, BorderLayout.CENTER);
        add(scrollTags, BorderLayout.SOUTH);

        // Botão de busca de arquivo
        botaoBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFileChooser seletor = new JFileChooser();
                int opcao = seletor.showOpenDialog(null);
                if (opcao == JFileChooser.APPROVE_OPTION) {
                    File arquivo = seletor.getSelectedFile();
                    campoArquivo.setText(arquivo.getAbsolutePath());
                }
            }
        });

        // Botão de processar
        botaoProcessar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String caminho = campoArquivo.getText();
                if (caminho.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Selecione um arquivo!");
                    return;
                }
                processarComSaidaCapturada(caminho);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Executa o validador HTML e redireciona a saída padrão para os campos de
     * texto da GUI.
     */
    private void processarComSaidaCapturada(String caminhoArquivo) {
        areaResultado.setText("");
        areaTags.setText("");

        // Salva a saída original
        PrintStream originalOut = System.out;

        try {
            ByteArrayOutputStream bufferSaida = new ByteArrayOutputStream();
            PrintStream saidaCapturada = new PrintStream(bufferSaida);
            System.setOut(saidaCapturada);

            // Executa o validador
            ValidadorHTML validador = new ValidadorHTML();
            validador.processarArquivo(caminhoArquivo);

            // Restaura a saída original
            System.out.flush();
            System.setOut(originalOut);

            // Separa resultado e tags com base no conteúdo
            String[] linhas = bufferSaida.toString().split("\n");
            boolean emTags = false;
            for (String linha : linhas) {
                if (linha.trim().equalsIgnoreCase("Tags encontradas:")) {
                    emTags = true;
                    continue;
                }
                if (emTags) {
                    areaTags.append(linha + "\n");
                } else {
                    areaResultado.append(linha + "\n");
                }
            }

        } catch (Exception e) {
            System.setOut(originalOut);
            JOptionPane.showMessageDialog(null, "Erro ao processar arquivo:\n" + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new InterfaceGraficaValidador();
    }
}
