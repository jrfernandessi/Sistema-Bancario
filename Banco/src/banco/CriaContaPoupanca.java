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
public class CriaContaPoupanca {
    public static void main(String[] args){
        Conta conta = new ContaPoupanca("123");
        
        
        conta.depositar(20);
        System.out.println(conta.obterSaldo());
        conta.sacar(10);
        System.out.println(conta.obterSaldo());
        ((ContaPoupanca) conta).rendeJuros(0.1);
        System.out.println(conta.obterSaldo());
        
        if(conta instanceof ContaPoupanca){
            System.out.println("conta poupanca");
        }
       
        
        
    }
    
}
