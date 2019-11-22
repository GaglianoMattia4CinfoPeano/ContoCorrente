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
public class ContoEsteso extends ContoBancario{
    
    private int fido;
    
    public ContoEsteso(String nomeConto, int bilancio) {
        super(nomeConto, bilancio);
        fido=1000;
    }

    public ContoEsteso(String nomeConto) {
        super(nomeConto);
        fido=1000;
    }

    public ContoEsteso(int fido, String nomeConto, int bilancio) {
        super(nomeConto, bilancio);
        this.fido = fido;
    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
        this.fido = fido;
    }
    
    public void prelievo (int b){
        if(bilancio+fido>=b){
            bilancio-=b;
        }
        else{
            throw new IllegalArgumentException("Non è possibile prelevare oltre il proprio bilancio");
        }
    }
    
    
}
