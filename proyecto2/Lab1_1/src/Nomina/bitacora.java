package Nomina;


import CONTENEDOR.Contenedor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lsosa
 */
public class bitacora extends javax.swing.JFrame {

    /**
     * Creates new form bitacora
     */
    public bitacora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSueldo = new javax.swing.JTextField();
        txtfech = new javax.swing.JTextField();
        txtpuesto = new javax.swing.JComboBox<>();
        contra = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        txtcod = new javax.swing.JTextField();
        txtemp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        Editar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        label_estatus = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtSueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 201, 227, -1));
        getContentPane().add(txtfech, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 152, 227, -1));

        txtpuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contador/a", "Auxiliar", "Secretario/a", "Vendedor/a", "Chofer", "Mensajero/a" }));
        txtpuesto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                txtpuestoItemStateChanged(evt);
            }
        });
        txtpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpuestoActionPerformed(evt);
            }
        });
        getContentPane().add(txtpuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 230, 20));
        getContentPane().add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 241, 227, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setText("Grabar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 17, 144, -1));

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 66, 144, -1));

        jLabel2.setText("Empleado");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel3.setText("Cargo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, -1));

        jLabel4.setText("Sueldo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 204, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 200, 144, -1));

        jLabel5.setText("Contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 244, -1, -1));

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Empleado", "Cargo", "Fecha Contrato", "Sueldo", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 763, 110));
        getContentPane().add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 220, -1));
        getContentPane().add(txtemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 230, -1));

        jLabel6.setText("Fecha de Contrato");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 152, -1, -1));

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 90, 30));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 70, 140, -1));

        Editar.setBackground(new java.awt.Color(255, 51, 51));
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        getContentPane().add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 111, 144, -1));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 159, 144, -1));

        jButton7.setText("REGRESAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 460, 110, 30));

        label_estatus.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(label_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, -1, -1));

        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpuestoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_txtpuestoItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_txtpuestoItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON GRABAR
        try {
            
           Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/Bitacora_BD14","root","");
           PreparedStatement pst = cn.prepareStatement("insert into Bitacora_de_empleado values(?,?,?,?,?,?,?)");
           
            pst.setString(1, "0");
            pst.setString(2, txtcod.getText().trim());
            pst.setString(3, txtemp.getText().trim());
            pst.setString(4, txtpuesto.getSelectedItem().toString());
            pst.setString(5, txtfech.getText().trim());
            pst.setString(6, txtSueldo.getText().trim());
            pst.setString(7, contra.getText().trim());
            pst.executeUpdate();
            
            txtcod.setText("");
            txtemp.setText("");
            txtpuesto.setSelectedItem("");
            txtfech.setText("");
            txtSueldo.setText("");
            contra.setText("");
            
           
            label_estatus.setText("Regiatro exitoso");
            
        } catch (Exception e) {
            
        }
 //-----------------------------------------------------------------------------------------------------------------
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        Object  [] fila=new Object [6];
        fila[0]=txtcod.getText();
        fila[1]=txtemp.getText();
        fila[2]=txtpuesto.getSelectedItem().toString();
        fila[3]=txtfech.getText();
        fila[4]=txtSueldo.getText();
        fila[5]=contra.getText();
        modelo.addRow(fila);
        tblDatos.setModel(modelo);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTON NUEVO
        

  //-----------------------------------------------------------------------------------------------------------------
        this.txtcod.setText("");
        this.txtemp.setText("");
        this.txtpuesto.setSelectedIndex(0);
        this.txtfech.setText("");
        this.txtSueldo.setText("");
        this.contra.setText("");
        txtcod.grabFocus();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         try{
             Connection cn;
            cn = DriverManager.getConnection("jdbc:mysql://localhost/Bitacora_BD14", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from Bitacora_de_empleado where ID = ?");
            pst.setString(1, txtid.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txtcod.setText(rs.getString("Codigo"));
                txtemp.setText(rs.getString("Empleado"));
                txtpuesto.setSelectedItem(rs.getString("Cargo"));
                txtfech.setText(rs.getString("Fecha"));
                txtSueldo.setText(rs.getString("Sueldo"));
                contra.setText(rs.getString("Contraseña"));
            } else {
                JOptionPane.showMessageDialog(null, "Empleado no registrado.");
            }

        }catch (Exception e){

        }

        
     
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // BOTON EDITAR

        try{ 
            String ID = txtid.getText().trim();
            
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/Bitacora_BD14","root","");
            PreparedStatement pst = cn.prepareStatement("update Bitacora_de_empleado set  Codigo=?, Empleado=?, Cargo=?,Fecha=?, Sueldo=?,Contraseña=? where ID = " + ID);

            pst.setString(1, txtcod.getText().trim());
            pst.setString(2, txtemp.getText().trim());
            pst.setString(3, txtpuesto.getSelectedItem().toString());
            pst.setString(4, txtfech.getText().trim());
            pst.setString(5, txtSueldo.getText().trim());
            pst.setString(6, contra.getText().trim());

            pst.executeUpdate();

            label_estatus.setText("Registro Editado con exito");

        } catch (Exception e) {

        }
//-------------------------------------------------------------------------------------
        String [] datos=new String [5];
        datos[0]=txtcod.getText();
        datos[1]=txtemp.getText();
        datos[2]=txtpuesto.getSelectedItem().toString();
        datos[3]=txtfech.getText();
        datos[4]=txtSueldo.getText();
        int i = 0;
    }//GEN-LAST:event_EditarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON ELIMINAR

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/Bitacora_BD14", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from Bitacora_de_empleado where ID = ?" );

            pst.setString(1, txtid.getText().trim());

            pst.executeUpdate();

            txtcod.setText("");
            txtemp.setText("");
            txtpuesto.setSelectedItem("");
            txtfech.setText("");
            txtSueldo.setText("");
            txtid.setText("");

            label_estatus.setText("Registro Eliminado con exito");

        } catch (Exception e) {
        }
//-------------------------------------------------------------------------------------------------------------
        DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
        int a=tblDatos.getSelectedRow();
        if (a<0){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila");
        }else{
            int confirmar = JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar el registro?");
            if (JOptionPane.OK_OPTION == confirmar){
                modelo.removeRow(a);
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpuestoActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // REGRESAR
        Contenedor GN= new Contenedor(); 
         GN.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bitacora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JPasswordField contra;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_estatus;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtemp;
    private javax.swing.JTextField txtfech;
    private javax.swing.JTextField txtid;
    private javax.swing.JComboBox<String> txtpuesto;
    // End of variables declaration//GEN-END:variables
}
