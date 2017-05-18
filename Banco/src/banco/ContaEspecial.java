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
public class ContaEspecial extends Conta{
    private double bonus;
    
    public ContaEspecial(String numero){
        super(numero);
        bonus = 0;
    }
    public void rendeBonus(){
        super.depositar(bonus);
        bonus = 0;
    }
    public double obterBonus(){
        return bonus;
    }
    public void depositar(double valor){
        super.depositar(valor);
        bonus = bonus +(valor*0.1);
    }
    
}
