/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Vista.AuxliarInterfaz;
import entity.Login;
import entity.Paciente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import models.ModelMain;


/**
 *
 * @author Univalle_F
 */
public class AuxiliarControlador implements ActionListener{
    
    
    private AuxliarInterfaz interfaz;
    
    public AuxiliarControlador(){
        interfaz = new AuxliarInterfaz();
        interfaz.asignarEscuchas(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == interfaz.getjButton9()) {
            
            ModelMain<Paciente> modelo = new ModelMain();
            
            String id = interfaz.getTfDocId().getText();
            String contrasena = interfaz.getTfContraseña().getText();
            String contrasenaConfima = interfaz.getTfConfirmarContraseña().getText();
            
            if(contrasena.equals(contrasenaConfima)){
                
                Login mi_login = new Login(id,contrasena);
                String tipo_id = interfaz.getCbTipoId().getSelectedItem().toString();
                String apellido1 = interfaz.getTfApellido1().getText();
                String apellido2 = interfaz.getTfApellido2().getText();
                String nombres = interfaz.getTfNombres().getText();
                String edad = interfaz.getTfEdad().getText();
                String sexo = interfaz.getSpSexo().getSelectedItem().toString();
                int unidad_edad = interfaz.getCbUnidadEdad().getSelectedIndex() + 1;
                String fecha_nacimiento = interfaz.getTfFechaNac().getText();//esta fecha debe pedirse con un datedesde interfaz
                String ocupacion = interfaz.getTfOcupacion().getText();
                String celular = interfaz.getTfCelular().getText();
                String telefono = interfaz.getTfTelefono().getText();
                String email = interfaz.getTfEmail().getText();
                String direccion = interfaz.getTfEmail().getText();
                Date fecha_registro = new Date();
                boolean estado = true;
                
                //JOptionPane.showMessageDialog(null, mi_login+""+tipo_id+apellido1+apellido2+nombres+edad+sexo.charAt(0)+unidad_edad+fecha_registro+ocupacion+celular+telefono+email+direccion+fecha_registro+estado);
                
                Paciente mi_paciente = new Paciente(mi_login, tipo_id, apellido1, apellido2, nombres, edad, sexo.charAt(0), unidad_edad, fecha_registro, ocupacion, celular, telefono, email, direccion, fecha_registro, estado);
                
                modelo.insertIdString(mi_paciente);
                
                JOptionPane.showMessageDialog(null, "El Paciente se ha guardado exitosamente");
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            }
            
        }
    }
    
    
}
