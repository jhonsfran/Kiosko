/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.LoginInterfaz;

/**
 *
 * @author Univalle_F
 */
public class KioskoSalud {
    
    public static void main(String args[]) {
        // TODO code application logic here
        LoginInterfaz interfazLogin = new LoginInterfaz();
        LoginController controlLogin = new LoginController(interfazLogin);
        
    }
}
