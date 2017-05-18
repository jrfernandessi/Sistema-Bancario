/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author junior
 */
public class Banco implements IBanco {

    private ArrayList<ContaAbstrata> contas;
    private double taxa = 0.1;

    public Banco() {
        contas = new ArrayList<ContaAbstrata>();
    }

    public void cadastrar(ContaAbstrata conta) {
        contas.add(conta);
    }
    public void remover(ContaAbstrata conta) throws CNEException{
        procurarConta(conta.obterNumero());
        contas.remove(conta);        
    }

    public ContaAbstrata procurarConta(String numConta) throws CNEException {
        for (ContaAbstrata aux : contas) {
            if (aux.obterNumero().equals(numConta)) {
                return aux;
            }
        }
        throw new CNEException();
    }

    public void depositar(String numConta, double valor) throws CNEException {
        ContaAbstrata conta = procurarConta(numConta);
        conta.depositar(valor);
        

    }

    public void sacar(String numconta, double valor) throws SIException, CNEException {
        ContaAbstrata conta = procurarConta(numconta);
        conta.sacar(valor);
        

    }

    public void transferir(String origem, String destino, double valor) throws SIException {
        ContaAbstrata conta = procurarConta(origem);
        if (conta == null) {
            System.out.println("conta origem inexistente");
        } else {
            conta.sacar(valor);
        }
        conta = procurarConta(destino);
        if (conta == null) {
            System.out.println("conta destino inexistente");
        } else {
            conta.depositar(valor);
        }
    }

    public double saldo(String numConta) {
        return procurarConta(numConta).obterSaldo();
    }

    public void rendeJuros(String numConta) {
        ContaAbstrata conta = procurarConta(numConta);
        if (conta instanceof ContaPoupanca) {
            ((ContaPoupanca) conta).rendeJuros(taxa);
        } else {
            System.out.println("conta não é poupanca");
        }
    }

    public double saldoTotal() {
        double saldoTotal = 0;
        for (ContaAbstrata conta : contas) {
            saldoTotal += conta.obterSaldo();
        }
        return saldoTotal;
    }

    public int numeroContas() {
        return contas.size();
    }

}
