/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;


public class Arbol {
    
    private nodo raiz;
    
    public Arbol(int valor){
        this.raiz=new nodo(valor);
    }

    /**
     * @return the raiz
     */
    public nodo getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(nodo raiz) {
        this.raiz = raiz;
    }
/**
 *
 * @author miguel
 */
    
}
