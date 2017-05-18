/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

/**
 *
 * @author Junior
 */
public class SIException extends Exception{
    
    public SIException(){
        super("Saldo Insuficiente na conta");
    }
    
}
