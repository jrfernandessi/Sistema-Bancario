package banco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Junior
 */
public class ContaImposto extends ContaAbstrata{
    public ContaImposto(String numero){
       super(numero);
    }
    
    public void sacar(double valor){
        saldo = saldo - valor - (valor*0.01);
    }
    
    
    
}
