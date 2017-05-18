/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

import static java.util.jar.Pack200.Packer.ERROR;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Junior
 */
public class TesteException {
   public static void main(String[] args){
       Banco banco = new Banco();
       ContaAbstrata conta = new Conta("123");
       banco.cadastrar(conta);
       banco.depositar("123", 20);
       
       try {
           banco.sacar("123", 30);
       } catch (SIException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
           JOptionPane.showMessageDialog(null, ex.getMessage(), "erro", Error);
       }
       
   }
    
}
