/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import javax.swing.JOptionPane;

/**
 *
 * @author junior
 */
public class CriaContaGUI {
    public static void main(String[] x){
        Banco banco = new Banco();
        int op;
        do{
           op = Integer.parseInt(JOptionPane.showInputDialog("digite 1 para cadastrar uma conta\n"+
            "digite 2 para realizar deposito\n"+
            "digite 3 para realizar saque\n"+
            "digite 4 para realizar transferencia\n"+
            "digite 5 para obter o saldo\n"+
            "digite 0 para sair"));
           switch(op){
                case 1:
                    String numero = JOptionPane.showInputDialog("digite o numero da conta a ser cadastrada");
                    Conta conta = new Conta(numero);
                    banco.cadastrar(conta);
                    break;
                case 2:
                    numero = JOptionPane.showInputDialog("digite o numero da conta");
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("digite o valor a ser depositado"));
                    banco.depositar(numero, valor);
                    break;
                case 3:
                    numero = JOptionPane.showInputDialog("digite o numero da conta");
                    valor = Double.parseDouble(JOptionPane.showInputDialog("digite o valor a ser sacado"));
                    banco.sacar(numero, valor);
                    break;
                case 4:
                    numero = JOptionPane.showInputDialog("digite o numero da conta de origem");
                    String destino = JOptionPane.showInputDialog("digite o numeroo da conta de destino");
                    valor = Double.parseDouble(JOptionPane.showInputDialog("digite o valor a ser transferido"));
                    break;
                case 5:
                    numero = JOptionPane.showInputDialog("digite o numero da conta que deseja obter o saldo");                    
                    JOptionPane.showMessageDialog(null,banco.saldo(numero));
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"obrigado por utilizar o sistema");
                    break;
                default :
                    JOptionPane.showMessageDialog(null,"opção inexistente por favor tente novamente");
                    break;
            }
        }while(op!=0);
    }
}
