/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author LUCHO
 */
public class AuxliarInterfaz extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    public AuxliarInterfaz() {
        initComponents();
    }
    
    public void asignarEscuchas(ActionListener escucha) {

        btAc.addActionListener(escucha);
        jButton1.addActionListener(escucha);
        jButton10.addActionListener(escucha);
        jButton11.addActionListener(escucha);
        jButton2.addActionListener(escucha);
        jButton3.addActionListener(escucha);
        jButton4.addActionListener(escucha);
        jButton5.addActionListener(escucha);
        jButton6.addActionListener(escucha);
        jButton8.addActionListener(escucha);
        BregistrarPaciente.addActionListener(escucha);
        this.setVisible(true);
        


    }

    public JButton getBtAc() {
        return btAc;
    }

    public void setBtAc(JButton btAc) {
        this.btAc = btAc;
    }

    public JComboBox<String> getCbTipoId() {
        return cbTipoId;
    }

    public void setCbTipoId(JComboBox<String> cbTipoId) {
        this.cbTipoId = cbTipoId;
    }

    public JComboBox<String> getCbUnidadEdad() {
        return cbUnidadEdad;
    }

    public void setCbUnidadEdad(JComboBox<String> cbUnidadEdad) {
        this.cbUnidadEdad = cbUnidadEdad;
    }

    public JCheckBox getCkb() {
        return ckb;
    }

    public void setCkb(JCheckBox ckb) {
        this.ckb = ckb;
    }

    public JButton getjButton1() {
        return jButton1;
    }

    public void setjButton1(JButton jButton1) {
        this.jButton1 = jButton1;
    }

    public JButton getjButton10() {
        return jButton10;
    }

    public void setjButton10(JButton jButton10) {
        this.jButton10 = jButton10;
    }

    public JButton getjButton11() {
        return jButton11;
    }

    public void setjButton11(JButton jButton11) {
        this.jButton11 = jButton11;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JButton getjButton3() {
        return jButton3;
    }

    public void setjButton3(JButton jButton3) {
        this.jButton3 = jButton3;
    }

    public JButton getjButton4() {
        return jButton4;
    }

    public void setjButton4(JButton jButton4) {
        this.jButton4 = jButton4;
    }

    public JButton getjButton5() {
        return jButton5;
    }

    public void setjButton5(JButton jButton5) {
        this.jButton5 = jButton5;
    }

    public JButton getjButton6() {
        return jButton6;
    }

    public void setjButton6(JButton jButton6) {
        this.jButton6 = jButton6;
    }

    public JButton getjButton8() {
        return jButton8;
    }

    public void setjButton8(JButton jButton8) {
        this.jButton8 = jButton8;
    }

    public JButton getjButton9() {
        return BregistrarPaciente;
    }

    public void setjButton9(JButton jButton9) {
        this.BregistrarPaciente = jButton9;
    }

    public JCheckBox getjCheckBox1() {
        return jCheckBox1;
    }

    public void setjCheckBox1(JCheckBox jCheckBox1) {
        this.jCheckBox1 = jCheckBox1;
    }

    public JCheckBox getjCheckBox10() {
        return jCheckBox10;
    }

    public void setjCheckBox10(JCheckBox jCheckBox10) {
        this.jCheckBox10 = jCheckBox10;
    }

    public JCheckBox getjCheckBox13() {
        return jCheckBox13;
    }

    public void setjCheckBox13(JCheckBox jCheckBox13) {
        this.jCheckBox13 = jCheckBox13;
    }

    public JCheckBox getjCheckBox15() {
        return jCheckBox15;
    }

    public void setjCheckBox15(JCheckBox jCheckBox15) {
        this.jCheckBox15 = jCheckBox15;
    }

    public JCheckBox getjCheckBox16() {
        return jCheckBox16;
    }

    public void setjCheckBox16(JCheckBox jCheckBox16) {
        this.jCheckBox16 = jCheckBox16;
    }

    public JCheckBox getjCheckBox17() {
        return jCheckBox17;
    }

    public void setjCheckBox17(JCheckBox jCheckBox17) {
        this.jCheckBox17 = jCheckBox17;
    }

    public JCheckBox getjCheckBox18() {
        return jCheckBox18;
    }

    public void setjCheckBox18(JCheckBox jCheckBox18) {
        this.jCheckBox18 = jCheckBox18;
    }

    public JCheckBox getjCheckBox19() {
        return jCheckBox19;
    }

    public void setjCheckBox19(JCheckBox jCheckBox19) {
        this.jCheckBox19 = jCheckBox19;
    }

    public JCheckBox getjCheckBox2() {
        return jCheckBox2;
    }

    public void setjCheckBox2(JCheckBox jCheckBox2) {
        this.jCheckBox2 = jCheckBox2;
    }

    public JCheckBox getjCheckBox20() {
        return jCheckBox20;
    }

    public void setjCheckBox20(JCheckBox jCheckBox20) {
        this.jCheckBox20 = jCheckBox20;
    }

    public JCheckBox getjCheckBox21() {
        return jCheckBox21;
    }

    public void setjCheckBox21(JCheckBox jCheckBox21) {
        this.jCheckBox21 = jCheckBox21;
    }

    public JCheckBox getjCheckBox22() {
        return jCheckBox22;
    }

    public void setjCheckBox22(JCheckBox jCheckBox22) {
        this.jCheckBox22 = jCheckBox22;
    }

    public JCheckBox getjCheckBox23() {
        return jCheckBox23;
    }

    public void setjCheckBox23(JCheckBox jCheckBox23) {
        this.jCheckBox23 = jCheckBox23;
    }

    public JCheckBox getjCheckBox24() {
        return jCheckBox24;
    }

    public void setjCheckBox24(JCheckBox jCheckBox24) {
        this.jCheckBox24 = jCheckBox24;
    }

    public JCheckBox getjCheckBox25() {
        return jCheckBox25;
    }

    public void setjCheckBox25(JCheckBox jCheckBox25) {
        this.jCheckBox25 = jCheckBox25;
    }

    public JCheckBox getjCheckBox26() {
        return jCheckBox26;
    }

    public void setjCheckBox26(JCheckBox jCheckBox26) {
        this.jCheckBox26 = jCheckBox26;
    }

    public JCheckBox getjCheckBox27() {
        return jCheckBox27;
    }

    public void setjCheckBox27(JCheckBox jCheckBox27) {
        this.jCheckBox27 = jCheckBox27;
    }

    public JCheckBox getjCheckBox28() {
        return jCheckBox28;
    }

    public void setjCheckBox28(JCheckBox jCheckBox28) {
        this.jCheckBox28 = jCheckBox28;
    }

    public JCheckBox getjCheckBox29() {
        return jCheckBox29;
    }

    public void setjCheckBox29(JCheckBox jCheckBox29) {
        this.jCheckBox29 = jCheckBox29;
    }

    public JCheckBox getjCheckBox4() {
        return jCheckBox4;
    }

    public void setjCheckBox4(JCheckBox jCheckBox4) {
        this.jCheckBox4 = jCheckBox4;
    }

    public JCheckBox getjCheckBox5() {
        return jCheckBox5;
    }

    public void setjCheckBox5(JCheckBox jCheckBox5) {
        this.jCheckBox5 = jCheckBox5;
    }

    public JCheckBox getjCheckBox6() {
        return jCheckBox6;
    }

    public void setjCheckBox6(JCheckBox jCheckBox6) {
        this.jCheckBox6 = jCheckBox6;
    }

    public JCheckBox getjCheckBox7() {
        return jCheckBox7;
    }

    public void setjCheckBox7(JCheckBox jCheckBox7) {
        this.jCheckBox7 = jCheckBox7;
    }

    public JCheckBox getjCheckBox8() {
        return jCheckBox8;
    }

    public void setjCheckBox8(JCheckBox jCheckBox8) {
        this.jCheckBox8 = jCheckBox8;
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public void setjComboBox2(JComboBox<String> jComboBox2) {
        this.jComboBox2 = jComboBox2;
    }

    public JComboBox<String> getjComboBox3() {
        return jComboBox3;
    }

    public void setjComboBox3(JComboBox<String> jComboBox3) {
        this.jComboBox3 = jComboBox3;
    }

    public JComboBox<String> getjComboBox4() {
        return jComboBox4;
    }

    public void setjComboBox4(JComboBox<String> jComboBox4) {
        this.jComboBox4 = jComboBox4;
    }

    public JComboBox<String> getjComboBox5() {
        return jComboBox5;
    }

    public void setjComboBox5(JComboBox<String> jComboBox5) {
        this.jComboBox5 = jComboBox5;
    }

    public JComboBox<String> getjComboBox6() {
        return jComboBox6;
    }

    public void setjComboBox6(JComboBox<String> jComboBox6) {
        this.jComboBox6 = jComboBox6;
    }

    public JComboBox<String> getjComboBox7() {
        return jComboBox7;
    }

    public void setjComboBox7(JComboBox<String> jComboBox7) {
        this.jComboBox7 = jComboBox7;
    }

    public JComboBox<String> getjComboBox8() {
        return jComboBox8;
    }

    public void setjComboBox8(JComboBox<String> jComboBox8) {
        this.jComboBox8 = jComboBox8;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel24() {
        return jLabel24;
    }

    public void setjLabel24(JLabel jLabel24) {
        this.jLabel24 = jLabel24;
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public void setjLabel25(JLabel jLabel25) {
        this.jLabel25 = jLabel25;
    }

    public JLabel getjLabel26() {
        return jLabel26;
    }

    public void setjLabel26(JLabel jLabel26) {
        this.jLabel26 = jLabel26;
    }

    public JLabel getjLabel27() {
        return jLabel27;
    }

    public void setjLabel27(JLabel jLabel27) {
        this.jLabel27 = jLabel27;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel31() {
        return jLabel31;
    }

    public void setjLabel31(JLabel jLabel31) {
        this.jLabel31 = jLabel31;
    }

    public JLabel getjLabel32() {
        return jLabel32;
    }

    public void setjLabel32(JLabel jLabel32) {
        this.jLabel32 = jLabel32;
    }

    public JLabel getjLabel33() {
        return jLabel33;
    }

    public void setjLabel33(JLabel jLabel33) {
        this.jLabel33 = jLabel33;
    }

    public JLabel getjLabel34() {
        return jLabel34;
    }

    public void setjLabel34(JLabel jLabel34) {
        this.jLabel34 = jLabel34;
    }

    public JLabel getjLabel36() {
        return jLabel36;
    }

    public void setjLabel36(JLabel jLabel36) {
        this.jLabel36 = jLabel36;
    }

    public JLabel getjLabel37() {
        return jLabel37;
    }

    public void setjLabel37(JLabel jLabel37) {
        this.jLabel37 = jLabel37;
    }

    public JLabel getjLabel38() {
        return jLabel38;
    }

    public void setjLabel38(JLabel jLabel38) {
        this.jLabel38 = jLabel38;
    }

    public JLabel getjLabel39() {
        return jLabel39;
    }

    public void setjLabel39(JLabel jLabel39) {
        this.jLabel39 = jLabel39;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel40() {
        return jLabel40;
    }

    public void setjLabel40(JLabel jLabel40) {
        this.jLabel40 = jLabel40;
    }

    public JLabel getjLabel41() {
        return jLabel41;
    }

    public void setjLabel41(JLabel jLabel41) {
        this.jLabel41 = jLabel41;
    }

    public JLabel getjLabel42() {
        return jLabel42;
    }

    public void setjLabel42(JLabel jLabel42) {
        this.jLabel42 = jLabel42;
    }

    public JLabel getjLabel44() {
        return jLabel44;
    }

    public void setjLabel44(JLabel jLabel44) {
        this.jLabel44 = jLabel44;
    }

    public JLabel getjLabel45() {
        return jLabel45;
    }

    public void setjLabel45(JLabel jLabel45) {
        this.jLabel45 = jLabel45;
    }

    public JLabel getjLabel46() {
        return jLabel46;
    }

    public void setjLabel46(JLabel jLabel46) {
        this.jLabel46 = jLabel46;
    }

    public JLabel getjLabel47() {
        return jLabel47;
    }

    public void setjLabel47(JLabel jLabel47) {
        this.jLabel47 = jLabel47;
    }

    public JLabel getjLabel48() {
        return jLabel48;
    }

    public void setjLabel48(JLabel jLabel48) {
        this.jLabel48 = jLabel48;
    }

    public JLabel getjLabel49() {
        return jLabel49;
    }

    public void setjLabel49(JLabel jLabel49) {
        this.jLabel49 = jLabel49;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel50() {
        return jLabel50;
    }

    public void setjLabel50(JLabel jLabel50) {
        this.jLabel50 = jLabel50;
    }

    public JLabel getjLabel51() {
        return jLabel51;
    }

    public void setjLabel51(JLabel jLabel51) {
        this.jLabel51 = jLabel51;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTabbedPane getjTabbedPane1() {
        return jTabbedPane1;
    }

    public void setjTabbedPane1(JTabbedPane jTabbedPane1) {
        this.jTabbedPane1 = jTabbedPane1;
    }

    public JTextArea getjTextArea1() {
        return jTextArea1;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.jTextArea1 = jTextArea1;
    }

    public JTextField getjTextField14() {
        return jTextField14;
    }

    public void setjTextField14(JTextField jTextField14) {
        this.jTextField14 = jTextField14;
    }

    public JTextField getjTextField15() {
        return jTextField15;
    }

    public void setjTextField15(JTextField jTextField15) {
        this.jTextField15 = jTextField15;
    }

    public JTextField getjTextField19() {
        return jTextField19;
    }

    public void setjTextField19(JTextField jTextField19) {
        this.jTextField19 = jTextField19;
    }

    public JTextField getjTextField20() {
        return jTextField20;
    }

    public void setjTextField20(JTextField jTextField20) {
        this.jTextField20 = jTextField20;
    }

    public JTextField getjTextField21() {
        return jTextField21;
    }

    public void setjTextField21(JTextField jTextField21) {
        this.jTextField21 = jTextField21;
    }

    public JTextField getjTextField22() {
        return jTextField22;
    }

    public void setjTextField22(JTextField jTextField22) {
        this.jTextField22 = jTextField22;
    }

    public JTextField getjTextField23() {
        return jTextField23;
    }

    public void setjTextField23(JTextField jTextField23) {
        this.jTextField23 = jTextField23;
    }

    public JPanel getJpAntecedentesFamiliares() {
        return jpAntecedentesFamiliares;
    }

    public void setJpAntecedentesFamiliares(JPanel jpAntecedentesFamiliares) {
        this.jpAntecedentesFamiliares = jpAntecedentesFamiliares;
    }

    public JPanel getJpAntecedentesPersonales() {
        return jpAntecedentesPersonales;
    }

    public void setJpAntecedentesPersonales(JPanel jpAntecedentesPersonales) {
        this.jpAntecedentesPersonales = jpAntecedentesPersonales;
    }

    public JPanel getJpDatosPersonales() {
        return jpDatosPersonales;
    }

    public void setJpDatosPersonales(JPanel jpDatosPersonales) {
        this.jpDatosPersonales = jpDatosPersonales;
    }

    public JComboBox getSpSexo() {
        return spSexo;
    }

    public void setSpSexo(JComboBox spSexo) {
        this.spSexo = spSexo;
    }



    public JFormattedTextField getTfApellido1() {
        return tfApellido1;
    }

    public void setTfApellido1(JFormattedTextField tfApellido1) {
        this.tfApellido1 = tfApellido1;
    }

    public JFormattedTextField getTfApellido2() {
        return tfApellido2;
    }

    public void setTfApellido2(JFormattedTextField tfApellido2) {
        this.tfApellido2 = tfApellido2;
    }

    public JFormattedTextField getTfCelular() {
        return tfCelular;
    }

    public void setTfCelular(JFormattedTextField tfCelular) {
        this.tfCelular = tfCelular;
    }

    public JPasswordField getTfConfirmarContraseña() {
        return tfConfirmarContraseña;
    }

    public void setTfConfirmarContraseña(JPasswordField tfConfirmarContraseña) {
        this.tfConfirmarContraseña = tfConfirmarContraseña;
    }

    public JPasswordField getTfContraseña() {
        return tfContraseña;
    }

    public void setTfContraseña(JPasswordField tfContraseña) {
        this.tfContraseña = tfContraseña;
    }

    public JFormattedTextField getTfDireccion() {
        return tfDireccion;
    }

    public void setTfDireccion(JFormattedTextField tfDireccion) {
        this.tfDireccion = tfDireccion;
    }

    public JFormattedTextField getTfDocId() {
        return tfDocId;
    }

    public void setTfDocId(JFormattedTextField tfDocId) {
        this.tfDocId = tfDocId;
    }

    public JFormattedTextField getTfEdad() {
        return tfEdad;
    }

    public void setTfEdad(JFormattedTextField tfEdad) {
        this.tfEdad = tfEdad;
    }

    public JFormattedTextField getTfEmail() {
        return tfEmail;
    }

    public void setTfEmail(JFormattedTextField tfEmail) {
        this.tfEmail = tfEmail;
    }

    public JFormattedTextField getTfFechaNac() {
        return tfFechaNac;
    }

    public void setTfFechaNac(JFormattedTextField tfFechaNac) {
        this.tfFechaNac = tfFechaNac;
    }

    public JFormattedTextField getTfNombres() {
        return tfNombres;
    }

    public void setTfNombres(JFormattedTextField tfNombres) {
        this.tfNombres = tfNombres;
    }

    public JFormattedTextField getTfOcupacion() {
        return tfOcupacion;
    }

    public void setTfOcupacion(JFormattedTextField tfOcupacion) {
        this.tfOcupacion = tfOcupacion;
    }

    public JFormattedTextField getTfTelefono() {
        return tfTelefono;
    }

    public void setTfTelefono(JFormattedTextField tfTelefono) {
        this.tfTelefono = tfTelefono;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        BregistrarPaciente = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jpDatosPersonales = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfContraseña = new javax.swing.JPasswordField();
        tfConfirmarContraseña = new javax.swing.JPasswordField();
        jLabel44 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JFormattedTextField();
        jLabel45 = new javax.swing.JLabel();
        tfCelular = new javax.swing.JFormattedTextField();
        jLabel46 = new javax.swing.JLabel();
        cbUnidadEdad = new javax.swing.JComboBox<String>();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        tfApellido1 = new javax.swing.JFormattedTextField();
        tfApellido2 = new javax.swing.JFormattedTextField();
        tfNombres = new javax.swing.JFormattedTextField();
        tfDocId = new javax.swing.JFormattedTextField();
        tfFechaNac = new javax.swing.JFormattedTextField();
        tfOcupacion = new javax.swing.JFormattedTextField();
        tfDireccion = new javax.swing.JFormattedTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JFormattedTextField();
        cbTipoId = new javax.swing.JComboBox<String>();
        tfEdad = new javax.swing.JFormattedTextField();
        btAc = new javax.swing.JButton();
        spSexo = new javax.swing.JComboBox();
        jpAntecedentesFamiliares = new javax.swing.JPanel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox18 = new javax.swing.JCheckBox();
        jCheckBox19 = new javax.swing.JCheckBox();
        jCheckBox20 = new javax.swing.JCheckBox();
        jCheckBox21 = new javax.swing.JCheckBox();
        jCheckBox22 = new javax.swing.JCheckBox();
        jCheckBox23 = new javax.swing.JCheckBox();
        jCheckBox24 = new javax.swing.JCheckBox();
        jCheckBox25 = new javax.swing.JCheckBox();
        jCheckBox26 = new javax.swing.JCheckBox();
        jCheckBox27 = new javax.swing.JCheckBox();
        jCheckBox28 = new javax.swing.JCheckBox();
        jCheckBox29 = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        jpAntecedentesPersonales = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jComboBox4 = new javax.swing.JComboBox<String>();
        jComboBox5 = new javax.swing.JComboBox<String>();
        jTextField19 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel32 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        ckb = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jComboBox6 = new javax.swing.JComboBox<String>();
        jComboBox7 = new javax.swing.JComboBox<String>();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel34 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<String>();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jTextField23 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox10 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton8.setText("Buscar Paciente");

        BregistrarPaciente.setText("Registrar Paciente");

        jButton10.setText("Desactivar Paciente");

        jpDatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos Personales"));

        jLabel1.setText("Contraseña");

        jLabel2.setText("Confirmar Contraseña");

        tfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfContraseñaActionPerformed(evt);
            }
        });

        tfConfirmarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConfirmarContraseñaActionPerformed(evt);
            }
        });

        jLabel44.setText("Edad");

        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        jLabel45.setText("Dirección residencia");

        tfCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCelularActionPerformed(evt);
            }
        });

        jLabel46.setText("Ocupación");

        cbUnidadEdad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AÑOS" }));

        jLabel47.setText("Fecha nacimiento");

        jLabel48.setText("Unidad Edad");

        jLabel49.setText("Primer Apellido");

        jLabel50.setText("Segundo Apellido");

        jLabel42.setText("Sexo");

        jLabel51.setText("Nombres");

        tfApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellido1ActionPerformed(evt);
            }
        });

        tfApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellido2ActionPerformed(evt);
            }
        });

        tfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNombresActionPerformed(evt);
            }
        });

        tfDocId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDocIdActionPerformed(evt);
            }
        });

        tfFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFechaNacActionPerformed(evt);
            }
        });

        tfOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOcupacionActionPerformed(evt);
            }
        });

        tfDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDireccionActionPerformed(evt);
            }
        });

        jLabel37.setText("Correo electrónico");

        jLabel38.setText("Celular");

        jLabel39.setText("Tipo Doc. Identidad");

        jLabel40.setText("Doc. Identidad");

        jLabel41.setText("Teléfono");

        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        cbTipoId.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "T.I.", "C.C." }));

        btAc.setText("Actualizar");

        spSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FEMENINO", "MASCULINO" }));

        javax.swing.GroupLayout jpDatosPersonalesLayout = new javax.swing.GroupLayout(jpDatosPersonales);
        jpDatosPersonales.setLayout(jpDatosPersonalesLayout);
        jpDatosPersonalesLayout.setHorizontalGroup(
            jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAc))
                    .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(68, 68, 68)
                                .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(jLabel51)
                                        .addGap(58, 58, 58)
                                        .addComponent(tfNombres))
                                    .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel50)
                                            .addComponent(jLabel49))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfApellido1)
                                            .addComponent(tfApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(35, 35, 35)
                                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel44))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosPersonalesLayout.createSequentialGroup()
                                            .addComponent(spSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)))
                                    .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(cbTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel40))
                                .addGap(18, 18, 18)
                                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tfOcupacion)
                                        .addComponent(tfDocId, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfFechaNac, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbUnidadEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosPersonalesLayout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosPersonalesLayout.createSequentialGroup()
                                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel41)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel37))
                                        .addGap(24, 24, 24)))
                                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 118, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpDatosPersonalesLayout.setVerticalGroup(
            jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDocId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(tfFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(cbUnidadEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46)))
                    .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(tfApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(cbTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(tfApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(tfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)))
                    .addGroup(jpDatosPersonalesLayout.createSequentialGroup()
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38)
                            .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpDatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfConfirmarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDatosPersonalesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAc)
                .addContainerGap())
        );

        jpAntecedentesFamiliares.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Antecedentes Familiares"));

        jCheckBox13.setText("Hermanos");

        jCheckBox15.setText("Padres");

        jCheckBox16.setText("Abuelos");

        jCheckBox17.setText("Tíos");

        jLabel3.setText("Infarto");

        jLabel4.setText("Diabetes");

        jLabel5.setText("Hipertensión");

        jLabel6.setText("ACV");

        jCheckBox18.setText("Padres");

        jCheckBox19.setText("Hermanos");

        jCheckBox20.setText("Abuelos");

        jCheckBox21.setText("Tíos");

        jCheckBox22.setText("Padres");

        jCheckBox23.setText("Hermanos");

        jCheckBox24.setText("Abuelos");

        jCheckBox25.setText("Tíos");

        jCheckBox26.setText("Padres");

        jCheckBox27.setText("Hermanos");

        jCheckBox28.setText("Abuelos");

        jCheckBox29.setText("Tíos");

        jButton11.setText("Actualizar");

        javax.swing.GroupLayout jpAntecedentesFamiliaresLayout = new javax.swing.GroupLayout(jpAntecedentesFamiliares);
        jpAntecedentesFamiliares.setLayout(jpAntecedentesFamiliaresLayout);
        jpAntecedentesFamiliaresLayout.setHorizontalGroup(
            jpAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAntecedentesFamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAntecedentesFamiliaresLayout.createSequentialGroup()
                        .addComponent(jCheckBox16)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox15)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox17)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox13))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addGroup(jpAntecedentesFamiliaresLayout.createSequentialGroup()
                        .addComponent(jCheckBox20)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox18)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox21)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox19))
                    .addComponent(jLabel5)
                    .addGroup(jpAntecedentesFamiliaresLayout.createSequentialGroup()
                        .addComponent(jCheckBox24)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox22)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox25)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox23))
                    .addGroup(jpAntecedentesFamiliaresLayout.createSequentialGroup()
                        .addComponent(jCheckBox28)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox26)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox29)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox27)))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAntecedentesFamiliaresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addContainerGap())
        );
        jpAntecedentesFamiliaresLayout.setVerticalGroup(
            jpAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAntecedentesFamiliaresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox15)
                    .addComponent(jCheckBox16)
                    .addComponent(jCheckBox17)
                    .addComponent(jCheckBox13))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox18)
                    .addComponent(jCheckBox20)
                    .addComponent(jCheckBox21)
                    .addComponent(jCheckBox19))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox22)
                    .addComponent(jCheckBox24)
                    .addComponent(jCheckBox25)
                    .addComponent(jCheckBox23))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAntecedentesFamiliaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox26)
                    .addComponent(jCheckBox28)
                    .addComponent(jCheckBox29)
                    .addComponent(jCheckBox27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addContainerGap())
        );

        jpAntecedentesPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Antecedentes Personales"));

        jLabel36.setText("Frecuencia");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel31.setText("Hace cuanto");

        jCheckBox1.setText("Diabetes");

        jLabel32.setText("Frecuencia");

        jCheckBox2.setText("Hipertensión");

        ckb.setText("Infarto");

        jCheckBox4.setText("Actividad física");

        jCheckBox5.setText("Consume licor");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBox6.setText("Fuma cigarrillo");

        jLabel33.setText("Hace cuanto");

        jCheckBox7.setText("Convive con fumadores");

        jLabel34.setText("Frecuencia");

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel18.setText("Hace cuanto");

        jCheckBox8.setText("Otras sustancias");

        jLabel16.setText("Frecuencia");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox10.setText("ACV");

        jButton1.setText("Actualizar");

        jLabel7.setText("Medicamentos");

        javax.swing.GroupLayout jpAntecedentesPersonalesLayout = new javax.swing.GroupLayout(jpAntecedentesPersonales);
        jpAntecedentesPersonales.setLayout(jpAntecedentesPersonalesLayout);
        jpAntecedentesPersonalesLayout.setHorizontalGroup(
            jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckb)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox10)))
                    .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addGap(43, 43, 43)
                .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAntecedentesPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18))
                            .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(10, 10, 10)))
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField15)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCheckBox7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                                .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField20)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCheckBox5))
                        .addGap(18, 18, 18)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox4)
                                        .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                                            .addComponent(jLabel36)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addComponent(jCheckBox8)
                    .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAntecedentesPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addGap(18, 18, 18))
                            .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(10, 10, 10)))
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField22)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jpAntecedentesPersonalesLayout.setVerticalGroup(
            jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ckb)
                            .addComponent(jCheckBox6))
                        .addGap(18, 18, 18)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox4))
                        .addGap(18, 18, 18)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox7)
                    .addComponent(jCheckBox10))
                .addGap(18, 18, 18)
                .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpAntecedentesPersonalesLayout.createSequentialGroup()
                        .addComponent(jCheckBox8)
                        .addGap(18, 18, 18)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpAntecedentesPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jpDatosPersonales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jpAntecedentesPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(35, 35, 35)
                                .addComponent(jpAntecedentesFamiliares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(81, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BregistrarPaciente)
                                .addGap(581, 581, 581))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10)
                                .addGap(501, 501, 501))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpDatosPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpAntecedentesFamiliares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpAntecedentesPersonales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BregistrarPaciente)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton8))
                .addGap(94, 94, 94))
        );

        jTabbedPane1.addTab("Administración Pacientes", jPanel1);

        jLabel23.setText("Reporte 1");

        jButton2.setText("Generar");

        jLabel24.setText("Reporte 2");

        jButton3.setText("Generar");

        jLabel25.setText("Reporte 3");

        jButton4.setText("Generar");

        jLabel26.setText("Reporte 4");

        jButton5.setText("Generar");

        jLabel27.setText("Reporte 5");

        jButton6.setText("Generar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel23)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel24)))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel25)))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel26)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel27)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addGap(30, 30, 30)
                        .addComponent(jButton6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(30, 30, 30)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(30, 30, 30)
                        .addComponent(jButton4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(30, 30, 30)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(30, 30, 30)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reportes", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfContraseñaActionPerformed

    private void tfConfirmarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConfirmarContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConfirmarContraseñaActionPerformed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void tfCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCelularActionPerformed

    private void tfApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellido1ActionPerformed

    private void tfApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellido2ActionPerformed

    private void tfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNombresActionPerformed

    private void tfDocIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDocIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDocIdActionPerformed

    private void tfFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFechaNacActionPerformed

    private void tfOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOcupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOcupacionActionPerformed

    private void tfDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDireccionActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BregistrarPaciente;
    private javax.swing.JButton btAc;
    private javax.swing.JComboBox<String> cbTipoId;
    private javax.swing.JComboBox<String> cbUnidadEdad;
    private javax.swing.JCheckBox ckb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox23;
    private javax.swing.JCheckBox jCheckBox24;
    private javax.swing.JCheckBox jCheckBox25;
    private javax.swing.JCheckBox jCheckBox26;
    private javax.swing.JCheckBox jCheckBox27;
    private javax.swing.JCheckBox jCheckBox28;
    private javax.swing.JCheckBox jCheckBox29;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JPanel jpAntecedentesFamiliares;
    private javax.swing.JPanel jpAntecedentesPersonales;
    private javax.swing.JPanel jpDatosPersonales;
    private javax.swing.JComboBox spSexo;
    private javax.swing.JFormattedTextField tfApellido1;
    private javax.swing.JFormattedTextField tfApellido2;
    private javax.swing.JFormattedTextField tfCelular;
    private javax.swing.JPasswordField tfConfirmarContraseña;
    private javax.swing.JPasswordField tfContraseña;
    private javax.swing.JFormattedTextField tfDireccion;
    private javax.swing.JFormattedTextField tfDocId;
    private javax.swing.JFormattedTextField tfEdad;
    private javax.swing.JFormattedTextField tfEmail;
    private javax.swing.JFormattedTextField tfFechaNac;
    private javax.swing.JFormattedTextField tfNombres;
    private javax.swing.JFormattedTextField tfOcupacion;
    private javax.swing.JFormattedTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
