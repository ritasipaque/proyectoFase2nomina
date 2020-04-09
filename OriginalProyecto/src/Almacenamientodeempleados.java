
import java.sql.*;
import javax.swing.JOptionPane;
public class Almacenamientodeempleados extends javax.swing.JFrame {

    /**
     * Creates new form Almacenamientodeempleados
     */
    public Almacenamientodeempleados() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_NombreEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_DepartamentoEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_PuestoEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_TelefonoEmpleado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_CuentaEmpleado = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_DireccionEmpleado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_SexoEmpleado = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_EdadEmpleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_CorreoEmpleado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Almacenamiento de Empleados ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Registro de Empleados");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nombre del Empleado : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Departamento del Empleado:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Puesto del Empleado:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Telefono del Empleado:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Datos del Empleado");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("No.de Cuenta del Empleado:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Direccion del Empleado:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Sexo del Empleado: ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Edad del Empleado:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Correo del Empleado: ");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modifcar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Ingrese el codigo del empleado :");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_CorreoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(txt_EdadEmpleado)
                            .addComponent(txt_SexoEmpleado)
                            .addComponent(txt_DireccionEmpleado)
                            .addComponent(txt_CuentaEmpleado)
                            .addComponent(txt_TelefonoEmpleado)
                            .addComponent(txt_PuestoEmpleado)
                            .addComponent(txt_DepartamentoEmpleado)
                            .addComponent(txt_NombreEmpleado))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(31, 31, 31)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(label_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_NombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txt_DepartamentoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_PuestoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_TelefonoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(txt_CuentaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_DireccionEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_SexoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_EdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_CorreoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(label_status))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
=======
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("update Mantenimiento set NombreEmpleado = ?, DepartamentoEmpleado = ?, PuestoEmpleado = ?, telefonoEmpleado = ?, CuentaEmpleado = ?, DireccionEmpleado = ?, SexoEmpleado = ?, EdadEmpleado = ?, CorreoEmpleado = ?    where ID = " + ID);

            pst.setString(1, txt_NombreEmpleado.getText().trim());
            pst.setString(2, txt_DepartamentoEmpleado.getText().trim());
            pst.setString(3, txt_PuestoEmpleado.getText().trim());
            pst.setString(4, txt_TelefonoEmpleado.getText().trim());
            pst.setString(5, txt_CuentaEmpleado.getText().trim());
            pst.setString(6, txt_DireccionEmpleado.getText().trim());
            pst.setString(7, txt_SexoEmpleado.getText().trim());
            pst.setString(8, txt_EdadEMpleado.getText().trim());
            pst.setString(9, txt_CorreoEmpleao.getText().trim());
            pst.executeUpdate();

            label_status.setText("Modificacion exitosa.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from Mantenimiento where ID = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_NombreEmpleado.setText("");
            txt_DepartamentoEmpleado.setText("");
            txt_PuestoEmpleado.setText("");
            txt_TelefonoEmpleado.setText("");
            txt_CuentaEmpleado.setText("");
            txt_DireccionEmpleado.setText("");
            txt_SexoEmpleado.setText("");
            txt_EdadEMpleado.setText("");
            txt_CorreoEmpleado.setText("");

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

>>>>>>> 897b2d3ba03def0c97b93ea38df59103723d86d6
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // se registran todo los empleados 
        try {
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into Mantenimiento values(?,?,?,?,?,?,?,?,?,?)");
                                 

            pst.setString(1, "0");
            pst.setString(2, txt_NombreEmpleado.getText().trim());
            pst.setString(3, txt_DepartamentoEmpleado.getText().trim());
            pst.setString(4, txt_PuestoEmpleado.getText().trim());
            pst.setString(5, txt_TelefonoEmpleado.getText().trim());
            pst.setString(6, txt_CuentaEmpleado.getText().trim());
            pst.setString(7, txt_DireccionEmpleado.getText().trim());
            pst.setString(8, txt_SexoEmpleado.getText().trim());
            pst.setString(9, txt_EdadEmpleado.getText().trim());
            pst.setString(10,  txt_CorreoEmpleado.getText().trim());     
            pst.executeUpdate();

            txt_NombreEmpleado.setText("");
            txt_DepartamentoEmpleado.setText("");
            txt_PuestoEmpleado.setText("");
            txt_TelefonoEmpleado.setText("");
            txt_CuentaEmpleado.setText("");
            txt_DireccionEmpleado.setText("");
            txt_SexoEmpleado.setText("");
            txt_EdadEmpleado.setText("");
            txt_CorreoEmpleado.setText("");
            label_status.setText("Registro exitoso.");
        } catch (Exception e) {

        }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // se buscan todos los empleados que se han registrado y ver si existe detro de la base de datos
       
        
        try {
            Connection cn;
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from Mantenimiento where ID = ?");
            pst.setString(1, txt_buscar.getText().trim());

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                txt_NombreEmpleado.setText(rs.getString("NombreEmpleado"));
                txt_DepartamentoEmpleado.setText(rs.getString("DepartamentoEmpleado"));
                txt_TelefonoEmpleado.setText(rs.getString("telefonoEmpleado"));
                txt_PuestoEmpleado.setText(rs.getString ("PuestoEmpleado"));
                txt_CuentaEmpleado.setText(rs.getString("CuentaEmpleado"));
                txt_DireccionEmpleado.setText(rs.getString("DireccionEmpleado"));
                txt_SexoEmpleado.setText(rs.getString("SexoEmpleado"));
                txt_EdadEmpleado.setText(rs.getString("EdadEmpleado"));
                txt_CorreoEmpleado.setText(rs.getString("CorreoEmpleado"));

            } else {
                JOptionPane.showMessageDialog(null, "Empleado no registrado.");
            }

        } catch (Exception e) {

        }  
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // es la funcion donde podemos modifcar cualquier dato de los empleados
        
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("update Mantenimiento set NombreEmpleado = ?, DepartamentoEmpleado = ?, PuestoEmpleado = ?, telefonoEmpleado = ?, CuentaEmpleado = ?, DireccionEmpleado = ?, SexoEmpleado = ?, EdadEmpleado = ?, CorreoEmpleado = ?    where ID = " + ID);
            
            pst.setString(1, txt_NombreEmpleado.getText().trim());
            pst.setString(2, txt_DepartamentoEmpleado.getText().trim());
            pst.setString(3, txt_PuestoEmpleado.getText().trim());
            pst.setString(4, txt_TelefonoEmpleado.getText().trim());
            pst.setString(5, txt_CuentaEmpleado.getText().trim());
            pst.setString(6, txt_DireccionEmpleado.getText().trim());
            pst.setString(7, txt_SexoEmpleado.getText().trim());
            pst.setString(8, txt_EdadEmpleado.getText().trim());
            pst.setString(9, txt_CorreoEmpleado.getText().trim());
            pst.executeUpdate();

            label_status.setText("Modificacion exitosa.");

        } catch (Exception e) {
        }
      
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Aqui podemos eliminar cualquier registro que se alla registrado anteriormente.
        
       try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins800", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from Mantenimiento where ID = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_NombreEmpleado.setText("");
            txt_DepartamentoEmpleado.setText("");
            txt_PuestoEmpleado.setText("");
            txt_TelefonoEmpleado.setText("");
            txt_CuentaEmpleado.setText("");
            txt_DireccionEmpleado.setText("");
            txt_SexoEmpleado.setText("");
            txt_EdadEmpleado.setText("");
            txt_CorreoEmpleado.setText("");

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        } 
        
        
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
 

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
            java.util.logging.Logger.getLogger(Almacenamientodeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Almacenamientodeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Almacenamientodeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Almacenamientodeempleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Almacenamientodeempleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_CorreoEmpleado;
    private javax.swing.JTextField txt_CuentaEmpleado;
    private javax.swing.JTextField txt_DepartamentoEmpleado;
    private javax.swing.JTextField txt_DireccionEmpleado;
    private javax.swing.JTextField txt_EdadEmpleado;
    private javax.swing.JTextField txt_NombreEmpleado;
    private javax.swing.JTextField txt_PuestoEmpleado;
    private javax.swing.JTextField txt_SexoEmpleado;
    private javax.swing.JTextField txt_TelefonoEmpleado;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
