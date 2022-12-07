
package view;

public class AdminMainWindow extends javax.swing.JFrame {

    public javax.swing.JButton getModificar_funciones() {
        return modificar_funciones;
    }

    public void setModificar_funciones(javax.swing.JButton modificar_funciones) {
        this.modificar_funciones = modificar_funciones;
    }

    public javax.swing.JButton getModificarObra() {
        return modificarObra;
    }

    public void setModificarObra(javax.swing.JButton modificarObra) {
        this.modificarObra = modificarObra;
    }

    public javax.swing.JButton getModificar_usuarios() {
        return modificar_usuarios;
    }

    public void setModificar_usuarios(javax.swing.JButton modificar_usuarios) {
        this.modificar_usuarios = modificar_usuarios;
    }

    public javax.swing.JButton getVenderBoleto() {
        return venderBoleto;
    }

    public void setVenderBoleto(javax.swing.JButton venderBoleto) {
        this.venderBoleto = venderBoleto;
    }

    /*public javax.swing.JButton getAniadirAdministrador1() {
        return modificar_funciones;
    }

    public void setAniadirAdministrador1(javax.swing.JButton aniadirAdministrador1) {
        this.modificar_funciones = aniadirAdministrador1;
    }*/

    public javax.swing.JButton getCerrarSesion() {
        return cerrarSesion;
    }

    public void setCerrarSesion(javax.swing.JButton cerrarSesion) {
        this.cerrarSesion = cerrarSesion;
    }

   
    public AdminMainWindow() {
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

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        cerrarSesion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        modificar_usuarios = new javax.swing.JButton();
        modificarObra = new javax.swing.JButton();
        venderBoleto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        modificar_funciones = new javax.swing.JButton();

        jButton3.setText("Añadir Usuario");

        jButton4.setText("Modificar Usuario");

        jButton5.setText("Modificar Cartelera");

        jButton6.setText("Regresar");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMINISTRADOR");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton1.setText("Añadir Obras");

        jButton2.setText("Modificar Obras");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 30, 46));

        cerrarSesion.setBackground(new java.awt.Color(88, 91, 112));
        cerrarSesion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        cerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion.setText("Cerrar sesión");
        cerrarSesion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(205, 214, 244));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMINISTRADOR");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Obras");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuarios");

        modificar_usuarios.setBackground(new java.awt.Color(88, 91, 112));
        modificar_usuarios.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        modificar_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        modificar_usuarios.setText("Ir a Usuarios");
        modificar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_usuariosActionPerformed(evt);
            }
        });

        modificarObra.setBackground(new java.awt.Color(88, 91, 112));
        modificarObra.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        modificarObra.setForeground(new java.awt.Color(255, 255, 255));
        modificarObra.setText("Ir a Obras");
        modificarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarObraActionPerformed(evt);
            }
        });

        venderBoleto.setBackground(new java.awt.Color(88, 91, 112));
        venderBoleto.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        venderBoleto.setForeground(new java.awt.Color(255, 255, 255));
        venderBoleto.setText("Vender Boleto");
        venderBoleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venderBoletoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Funciones");

        modificar_funciones.setBackground(new java.awt.Color(88, 91, 112));
        modificar_funciones.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        modificar_funciones.setForeground(new java.awt.Color(255, 255, 255));
        modificar_funciones.setText("Ir a Funciones");
        modificar_funciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_funcionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(modificarObra)
                                .addGap(24, 24, 24)
                                .addComponent(modificar_funciones)
                                .addGap(18, 18, 18)
                                .addComponent(modificar_usuarios))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(14, 14, 14)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(venderBoleto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarObra)
                    .addComponent(modificar_funciones)
                    .addComponent(modificar_usuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(venderBoleto))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrarSesionActionPerformed

    private void modificar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_usuariosActionPerformed
        
    }//GEN-LAST:event_modificar_usuariosActionPerformed

    private void modificarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarObraActionPerformed
    }//GEN-LAST:event_modificarObraActionPerformed

    private void venderBoletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venderBoletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_venderBoletoActionPerformed

    private void modificar_funcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_funcionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificar_funcionesActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton cerrarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JButton modificarObra;
    private javax.swing.JButton modificar_funciones;
    public javax.swing.JButton modificar_usuarios;
    public javax.swing.JButton venderBoleto;
    // End of variables declaration//GEN-END:variables
}
