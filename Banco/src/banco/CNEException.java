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
public class CNEException extends Exception{
    public CNEException(){
        super("conta não encontrada");
    }
}
