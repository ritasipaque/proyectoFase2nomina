package Recibo;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import CONTENEDOR.Contenedor;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Alejandro
 */
public class recibo extends javax.swing.JFrame {

    /**
     * Creates new form recibo
     */
    public recibo() {
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

        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        TxtNombre1 = new javax.swing.JTextField();
        Puesto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNoCuenta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Sueldo1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        IGSS = new javax.swing.JTextField();
        ISR = new javax.swing.JTextField();
        txtOtros = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Totales = new javax.swing.JTextField();
        Label_status = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 51, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ingresa el código de la persona: ");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));
        jPanel5.add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 110, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Recibo de pago");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 51, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS EMPLEADO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Puesto");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("No. de cuenta personal");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Hrs extras trabajadas");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nombre");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Sueldo");

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton2)
                        .addGap(23, 23, 23)
                        .addComponent(jButton3)
                        .addGap(15, 15, 15)
                        .addComponent(jButton5))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(TxtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Puesto, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(Sueldo1))))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(TxtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(Sueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 160));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Sueldo Total");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        jButton6.setText("Regresar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, -1, -1));

        jPanel7.setBackground(new java.awt.Color(0, 51, 153));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DESCUENTOS A DESCONTAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("OTROS");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("IGSS");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ISR");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ISR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(IGSS, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IGSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ISR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        Totales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalesActionPerformed(evt);
            }
        });
        jPanel5.add(Totales, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 64, -1));

        Label_status.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Label_status.setForeground(new java.awt.Color(255, 0, 0));
        Label_status.setText("...");
        jPanel5.add(Label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 60, 30));

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recibo/bi.jpg"))); // NOI18N
        jLabel17.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 45)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Desarrollo Empresarial S.A.");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("No. 00019564-123");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recibo/bi.jpg"))); // NOI18N
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 200));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/nominabancos", "root", "");//"Jose Alejandro Jeronimo"
            PreparedStatement pst = cn.prepareStatement("delete from bancoss where ID = ?");//"Jose Alejandro Jeronimo"

            // Jaqueline Carrera
            pst.setString(1, txt_buscar.getText().trim());// Busca lo que se encuntra en el txt
            pst.executeUpdate();

            //Vacia los txt seleccionados
            txt_buscar.setText("");
            TxtNombre1.setText("");
            Puesto.setText("");
            Sueldo1.setText("");
            txtNoCuenta.setText("");
            txtHoras.setText("");
            IGSS.setText("");
            ISR.setText("");
            txtOtros.setText("");
            Totales.setText("");

            // si se cumple aparecera mensaje en el label
            Label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // REGRESAR
        Contenedor frm = new Contenedor();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void TotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Codigo que permite insertar registros en al base de datos
        //Diseño del JFrame trabajado por ambos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/nominabancos", "root", "");//conexión a MYSQL "Jose Alejandro Jeronimo"
            PreparedStatement pst = cn.prepareStatement("insert into bancoss values(?,?,?,?,?,?,?,?,?,?)");// conexión a la tabla "Jose Alejandro Jeronimo"

            //La tabla y BD de MYSQL fueron trabajadas por "Jose Alejandro Jeronimo"
            //"Jaqueline Carrera" Trabajó el codigo de JAVA junto con modificaciones por Jose Alejandro Jeronimo

            pst.setString(1, "0");
            pst.setString(2, TxtNombre1.getText().trim());//Nombre
            pst.setString(3, Puesto.getText().trim());//Puesto
            pst.setString(4, Sueldo1.getText().trim()); // Sueldo
            pst.setString(5, txtNoCuenta.getText().trim()); // No. de cuenta
            pst.setString(6, txtHoras.getText().trim()); // Horas extras
            pst.setString(7, IGSS.getText().trim()); //IGSS
            pst.setString(8, ISR.getText().trim()); //ISR
            pst.setString(9, txtOtros.getText().trim()); //Otros
            pst.setString(10, Totales.getText().trim()); //Totales
            pst.executeUpdate();

            //Borra lo que hay en campos
            TxtNombre1.setText("");
            Puesto.setText("");
            Sueldo1.setText("");
            txtNoCuenta.setText("");
            txtHoras.setText("");
            IGSS.setText("");
            ISR.setText("");
            txtOtros.setText("");
            Label_status.setText("Registro exitoso.");
        }catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/nominabancos", "root", "");//"Jose Alejandro Jeronimo"
            PreparedStatement pst = cn.prepareStatement("update bancoss set Nombre = ?, Puesto = ?, Sueldo = ?, NodeCuenta = ?, HorasExtras = ?, IGSS = ?, ISR = ?, Otros = ?, Totales = ? where ID = " + ID);//"Jose Alejandro Jeronimo"

            //La tabla y BD de MYSQL fueron trabajadas por "Jose Alejandro Jeronimo"
            //"Jaqueline Carrera" Trabajó el codigo de JAVA junto con modificaciones por Jose Alejandro Jeronimo

            pst.setString(1, TxtNombre1.getText().trim());//Nombre
            pst.setString(2, Puesto.getText().trim());//Puesto
            pst.setString(3, Sueldo1.getText().trim()); // Sueldo
            pst.setString(4, txtNoCuenta.getText().trim()); // No. de cuenta
            pst.setString(5, txtHoras.getText().trim()); // Horas extras
            pst.setString(6, IGSS.getText().trim()); //IGSS
            pst.setString(7, ISR.getText().trim()); //ISR
            pst.setString(8, txtOtros.getText().trim()); //Otros
            pst.setString(9, Totales.getText().trim()); //Totales

            pst.executeUpdate();

            //Si se cumple que aparecera el siguiente mensaje en el Label
            Label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Codigo que permite consultar registros en la base de datos
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3307/nominabancos", "root", "");// "Jose Alejandro Jeronimo"
            PreparedStatement pst = cn.prepareStatement("select * from bancoss where ID = ?");//"Jose Alejandro Jeronimo"
            //La tabla y BD de MYSQL fueron trabajadas por "Jose Alejandro Jeronimo"
            //"Jaqueline Carrera" Trabajó el codigo de JAVA junto con modificaciones por Jose Alejandro Jeronimo

            pst.setString(1, txt_buscar.getText().trim());//busca lo que hay en el txt en la base de datos

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                //Busca lo que está en las " " y lo trae a los txt correspondientes
                TxtNombre1.setText(rs.getString("Nombre"));
                Puesto.setText(rs.getString("Puesto"));
                Sueldo1.setText(rs.getString("Sueldo"));
                txtNoCuenta.setText(rs.getString("NodeCuenta"));
                txtHoras.setText(rs.getString("HorasExtras"));
                IGSS.setText(rs.getString("IGSS"));
                ISR.setText(rs.getString("ISR"));
                txtOtros.setText(rs.getString("Otros"));
                Totales.setText(rs.getString("Totales"));

            } else {
                //si el campo no existiera que aparecera un mensaje en el LABEL
                JOptionPane.showMessageDialog(null, "Persona no registrada.");
            }

        }catch (Exception e){

        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recibo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recibo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField IGSS;
    public static javax.swing.JTextField ISR;
    private javax.swing.JLabel Label_status;
    public static javax.swing.JTextField Puesto;
    public static javax.swing.JTextField Sueldo1;
    public static javax.swing.JTextField Totales;
    public static javax.swing.JTextField TxtNombre1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNoCuenta;
    private javax.swing.JTextField txtOtros;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables

   
}
