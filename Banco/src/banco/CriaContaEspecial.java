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
public class CriaContaEspecial {
    public static void main(String[] args){
        Conta conta = new ContaEspecial("123-2");
        conta.depositar(100);
        ((Conta) conta).depositar(100);
        System.out.println(conta.obterSaldo());
        System.out.println(((ContaEspecial) conta).obterBonus());
    }
    
    
}
