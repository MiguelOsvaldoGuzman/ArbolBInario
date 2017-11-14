/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;


public class nodo {
    
    private int valor;
    
    private nodo padre;
    private nodo hojaderecha;
    private nodo hojaizquierda;
    
    public nodo(int valor){
        this.valor=valor;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the padre
     */
    public nodo getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(nodo padre) {
        this.padre = padre;
    }

    /**
     * @return the hojaderecha
     */
    public nodo getHojaderecha() {
        return hojaderecha;
    }

    /**
     * @param hojaderecha the hojaderecha to set
     */
    public void setHojaderecha(nodo hojaderecha) {
        this.hojaderecha = hojaderecha;
    }

    /**
     * @return the hojaizquierda
     */
    public nodo getHojaizquierda() {
        return hojaizquierda;
    }

    /**
     * @param hojaizquierda the hojaizquierda to set
     */
    public void setHojaizquierda(nodo hojaizquierda) {
        this.hojaizquierda = hojaizquierda;
    }
   
    
}
