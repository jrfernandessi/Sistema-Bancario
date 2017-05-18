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
public abstract class ContaAbstrata {

    protected String numero;
    protected double saldo;

    public ContaAbstrata(String numero) {
        this.numero = numero;
        saldo = 0;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public abstract void sacar(double valor) throws SIException;

    public String obterNumero() {
        return numero;
    }

    public double obterSaldo() {
        return saldo;
    }

}
