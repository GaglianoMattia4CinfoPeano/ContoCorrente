/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

import javax.swing.JOptionPane;

/**
 *
 * @author gagliano.mattia
 */
public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContoBancario conto1 = new ContoBancario("rfgjirej");
        ContoBancario conto2 = new ContoBancario("gjtwccbfj", 1500);
        ContoEsteso conto3 = new ContoEsteso("gfnrkwmjd");
        ContoEsteso conto4 = new ContoEsteso("rtuibhrerjk", 6000);
        ContoEsteso conto5 = new ContoEsteso("345hehbr", 5900);
        System.out.println("identificativo conto1: "+conto1.getNomeConto());
        System.out.println("identificativo conto2: "+conto2.getNomeConto());
        System.out.println("identificativo conto3: "+conto3.getNomeConto());
        System.out.println("identificativo conto4: "+conto4.getNomeConto());
        System.out.println("identificativo conto5: "+conto5.getNomeConto());
        conto1.deposito(Integer.parseInt(JOptionPane.showInputDialog("Inserire versamento")));
        conto2.deposito(Integer.parseInt(JOptionPane.showInputDialog("Inserire versamento")));
        conto3.deposito(Integer.parseInt(JOptionPane.showInputDialog("Inserire versamento")));
        conto4.deposito(Integer.parseInt(JOptionPane.showInputDialog("Inserire versamento")));
        conto5.deposito(Integer.parseInt(JOptionPane.showInputDialog("Inserire versamento")));
        System.out.println("bilancio conto1: "+conto1.getBilancio());
        System.out.println("bilancio conto2: "+conto2.getBilancio());
        System.out.println("bilancio conto3: "+conto3.getBilancio());
        System.out.println("bilancio conto4: "+conto4.getBilancio());
        System.out.println("bilancio conto5: "+conto5.getBilancio());
        System.out.println("fido conto3: "+conto3.getFido());
        System.out.println("fido conto4: "+conto4.getFido());
        System.out.println("fido conto5: "+conto5.getFido());
        conto3.setFido(Integer.parseInt(JOptionPane.showInputDialog("Inserire nuovo valore fido: ")));
        conto4.setFido(Integer.parseInt(JOptionPane.showInputDialog("Inserire nuovo valore fido: ")));
        conto5.setFido(Integer.parseInt(JOptionPane.showInputDialog("Inserire nuovo valore fido: ")));
        System.out.println("fido conto3: "+conto3.getFido());
        System.out.println("fido conto4: "+conto4.getFido());
        System.out.println("fido conto5: "+conto5.getFido());
    }
    
}
