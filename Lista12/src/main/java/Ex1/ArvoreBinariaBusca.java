/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1;

/**
 *
 * @author gbez
 */
public class ArvoreBinariaBusca extends ArvoreBinariaAbtract {

    @Override
    public NoArvoreBinaria buscar(int info) {
        NoArvoreBinaria p = raiz;
        while (p != null && p.getInfo() != info) {
            if (info < p.getInfo()) {
                p = p.getEsquerda();
            } else {
                p = p.getDireita();
            }
        }
        return p;
    }

    public void inserir(int info) {
        NoArvoreBinaria novo = new NoArvoreBinaria(info);
        NoArvoreBinaria p = raiz;
        NoArvoreBinaria pai = null;

        if (raiz == null) {
            raiz = novo;
        } else {
            p = raiz;
            while (true) {
                pai = p;
                if (info < p.getInfo()) {
                    p = p.getEsquerda();
                    if (p == null) {
                        pai.setEsquerda(novo);
                        return;
                    }
                } else {
                    p = pai.getDireita();
                    if (p == null) {
                        pai.setDireita(novo);
                        return;
                    }
                }
            }
        }
    }

    private NoArvoreBinaria extrairSucessor(NoArvoreBinaria excluir) {
        NoArvoreBinaria atual = excluir.getDireita();
        NoArvoreBinaria paiSucessor = excluir;
        NoArvoreBinaria sucessor = excluir;

        while (atual != null) {
            paiSucessor = sucessor;
            sucessor = atual;
            atual = atual.getEsquerda();
        }

        if (sucessor != excluir.getDireita()) {
            paiSucessor.setEsquerda(sucessor.getDireita());
            sucessor.setDireita(excluir.getDireita());
        }

        return sucessor;
    }

    public void retirar(int info) {
        NoArvoreBinaria p = raiz;
        NoArvoreBinaria pai = null;
        boolean filhoEsquerda = false;

        // Localizar o nó a ser removido:
        while (p != null && p.getInfo() != info) {
            pai = p;
            if (info < p.getInfo()) {
                filhoEsquerda = true;
                p = p.getEsquerda();
            } else {
                filhoEsquerda = false;
                p = p.getDireita();
            }
        }

        if (p != null) {
            // Identifica que está removendo uma folha:
            if (p.getEsquerda() == null && p.getDireita() == null) {
                if (p == raiz) {
                    raiz = null;
                } else {
                    if (filhoEsquerda == true) {
                        pai.setEsquerda(null);
                    } else {
                        pai.setDireita(null);
                    }
                }
                if (p.getDireita() == null) {
                    if (p == raiz) {
                        raiz = p.getEsquerda();
                    } else {
                        if (filhoEsquerda == true) {
                            pai.setEsquerda(p.getEsquerda());
                        } else {
                            pai.setDireita(p.getDireita());
                        }
                    }
                } else {
                    if (p.getEsquerda() == null) {
                        if (p == raiz) {
                            raiz = p.getDireita();
                        } else {
                            if (filhoEsquerda == true) {
                                pai.setEsquerda(p.getDireita());
                            } else {
                                pai.setDireita(p.getDireita());
                            }
                        }
                    } else { // Nó com dois filhos
                        NoArvoreBinaria sucessor = extrairSucessor(p);
                        if (p == raiz) {
                            raiz = sucessor;
                        } else {
                            if (filhoEsquerda == true) {
                                pai.setEsquerda(sucessor);
                            } else {
                                pai.setDireita(sucessor);
                            }
                        }
                        sucessor.setEsquerda(p.getEsquerda());
                    }
                }
            }
        }
    }
}
