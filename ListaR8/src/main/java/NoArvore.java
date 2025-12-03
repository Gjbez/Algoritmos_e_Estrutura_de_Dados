

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author gbez
 */
public class NoArvore<T> { 
    private T info; 
    private NoArvore<T> prim; 
    private NoArvore<T> prox; 

    public NoArvore(T info){ 
        this.info = (T) info; 
        prim = null; 
        prox = null;
    }

    public void inserirfilho(NoArvore<T> sa){ 
        sa.setProx(prim); 
        setPrim(sa);      
    }

    public T getInfo() { 
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NoArvore<T> getPrim() { 
        return prim;
    }

    public void setPrim(NoArvore<T> prim) { 
        this.prim = prim;
    }

    public NoArvore<T> getProx() { 
        return prox;
    }

    public void setProx(NoArvore<T> prox) { 
        this.prox = prox;
    }

}
