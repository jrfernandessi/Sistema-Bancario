/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author junior
 */
public class Conta extends ContaAbstrata{
    public Conta(String numero){
        super(numero);
    }

    
    public void sacar(double valor) throws SIException{
        if(valor<=saldo){
            saldo = saldo - valor;
        }
        else{
            throw new SIException();
        }
    }
  
    
    
    
   
    
}
