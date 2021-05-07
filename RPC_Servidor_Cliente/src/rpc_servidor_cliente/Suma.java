/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpc_servidor_cliente;

/**
 *
 * @author Carmen Santamaria
 */
public class Suma {
    
    public String suma(String a, String b){
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
    
}
