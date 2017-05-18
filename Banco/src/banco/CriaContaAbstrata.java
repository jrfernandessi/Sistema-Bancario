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
public class CriaContaAbstrata {
    public static void main(String[] args){
        ContaAbstrata conta = new Conta("123");
        conta = new ContaImposto("321");
    }
}
