/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author junior
 */
public class CriaConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Banco banco = new Banco();
        Scanner ler = new Scanner(System.in);
        int op;
        do{
            System.out.println("digite 1 para cadastrar uma conta");
            System.out.println("digite 2 para realizar deposito");
            System.out.println("digite 3 para realizar saque");
            System.out.println("digite 4 para realizar transferencia");
            System.out.println("digite 5 para obter o saldo");
            System.out.println("digite 0 para sair");
            op = ler.nextInt();
            switch(op){
                case 1:
                    System.out.println("digite o numero da conta a ser cadastrada");
                    String numero = ler.next();
                    Conta conta = new Conta(numero);
                    banco.cadastrar(conta);
                    break;
                case 2:
                    System.out.println("digite o numero da conta");
                    numero = ler.next();
                    System.out.println("digite o valor a ser depositado");
                    double valor = ler.nextDouble();
                    banco.depositar(numero, valor);
                    break;
                case 3:
                    System.out.println("digite o numero da conta");
                    numero = ler.next();
                    System.out.println("digite o valor a ser sacado");
                    valor = ler.nextDouble();
                    banco.sacar(numero, valor);
                    break;
                case 4:
                    System.out.println("digite o numero da conta de origem");
                    numero = ler.next();
                    System.out.println("digite o numeroo da conta de destino");
                    String destino = ler.next();
                    System.out.println("digite o valor a ser transferido");
                    valor = ler.nextDouble();
                    banco.transferir(numero, destino, valor);
                    break;
                case 5:
                    System.out.println("digite o numero da conta que deseja obter o saldo");
                    numero = ler.next();
                    banco.saldo(numero);
                    break;
                case 0:
                    System.out.println("obrigado por utilizar o sistema");
                    break;
                default :
                    System.out.println("opção inexistente por favor tente novamente");
                    break;
            }
        }while(op!=0);

    }

}