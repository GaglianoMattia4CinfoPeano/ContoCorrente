/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

/**
 *
 * @author gagliano.mattia
 */
public class ContoBancario {
    private String nomeConto;
    protected int bilancio;

    public ContoBancario(String nomeConto, int bilancio) {
        this.nomeConto = nomeConto;
        this.bilancio=bilancio;
    }

    public ContoBancario(String nomeConto) {
        this.nomeConto = nomeConto;
        bilancio=0;
    }
    

    public String getNomeConto() {
        return nomeConto;
    }

    public int getBilancio() {
        return bilancio;
    }
    
    public void deposito (int b){
        bilancio+=b;
    }
    
    public void prelievo (int b){
        if(bilancio<b){
            throw new IllegalArgumentException("Non è possibile prelevare oltre il proprio bilancio");
        }
        else{
            bilancio-=b;
        }
    }
    
    
    
    
    
}
