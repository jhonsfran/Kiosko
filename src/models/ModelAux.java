/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Univalle_F
 */
public class ModelAux extends ModelMain{
    
    
    public boolean consultarAuxiliar(String id_auxiliar) {
        
        boolean validar = false;
        
        
        String query = "SELECT aux_id FROM auxiliar WHERE aux_id = '"+id_auxiliar+"';";

        List result = this.executeQuery(query);
        
        
        for (Object object : result) {

            Map row = (Map) object;
            if (row.get("aux_id") != null) {
                validar = true;
            }

        }

        return validar;

    }
    
    public boolean consultarPaciente(String id_paciente) {

        boolean validar = false;

        String query = "SELECT pac_id FROM paciente WHERE pac_id = '" + id_paciente + "';";

        List result = this.executeQuery(query);

        for (Object object : result) {

            Map row = (Map) object;
            if (row.get("aux_id") != null) {
                validar = true;
            }

        }

        return validar;

    }
    
   
    
    
}
