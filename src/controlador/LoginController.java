/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.LoginInterfaz;
import entity.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelAux;
import models.ModelMain;

/**
 *
 * @author Univalle_F
 */
public class LoginController implements ActionListener{
    
    LoginInterfaz login;
    
    public LoginController(LoginInterfaz inter) {
        login = inter;
        login.asignarEscuchas(this);
    }
    
    public void setearCampos() {
        login.getTfUsername().setText("");
        login.getTfConstraseña().setText("");
    }

    public void validarUsuario() {

        ModelMain<Login> modelo = new ModelMain();
        ModelAux modelo_aux = new ModelAux();
        int tipo_user = 0;
        

        String username = login.getTfUsername().getText();//Se captura el username de la interfaz   
        String password = login.getTfConstraseña().getText();//Se captura el password de la interfaz

        Login user = modelo.getByIDString(Login.class, username);
        
        if(modelo_aux.consultarAuxiliar(username)){
            tipo_user = 1; 
            
        }else if(modelo_aux.consultarPaciente(password)){
            tipo_user = 2;
        }else{
            tipo_user = 0;
        }
        
        /*codificacion de los roles*/
        //1-> auxiliar
        //2-> paciente
        
        if (user.getLoginUser().equals(username)) {
            if (user.getLoginPassword().equals(password)) {
                
                switch (tipo_user) {
                    case 1://auxiliar
                        login.setVisible(false);
                        AuxiliarControlador mi_auxiliar = new AuxiliarControlador();
                        break;

                    case 2://paciente
                        login.setVisible(false);
                        PacienteControlador mi_paciente = new PacienteControlador();
                        break;

                    default:
                        break;
                }
            } else {
                login.getErrorLabel().setText("Password incorrecto");
                setearCampos();
            }
        } else {
            login.getErrorLabel().setText("Usuario incorrecto");
            setearCampos();
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == login.getBtIngresoAuth()) {
            //validarUsuario();
            
            AuxiliarControlador mi_auxiliar = new AuxiliarControlador();
        }
    }
}
