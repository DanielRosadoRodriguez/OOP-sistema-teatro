package view;

import javax.swing.JButton;
import javax.swing.JTextField;

public class AdminCRUDFuncion extends javax.swing.JFrame {

    public javax.swing.JComboBox<String> getComboBoxNombreObra() {
        return comboBoxNombreObra;
    }

    public void setComboBoxNombreObra(javax.swing.JComboBox<String> comboBoxNombreObra) {
        this.comboBoxNombreObra = comboBoxNombreObra;
    }

    public javax.swing.JLabel getGetFechaTxtprovisional() {
        return fechaTxtprovisional;
    }

    public void setGetFechaTxtprovisional(javax.swing.JLabel getFechaTxtprovisional) {
        this.fechaTxtprovisional = getFechaTxtprovisional;
    }

    public javax.swing.JComboBox<String> getBuscarComboBox() {
        return buscarComboBox;
    }

    public void setBuscarComboBox(javax.swing.JComboBox<String> buscarComboBox) {
        this.buscarComboBox = buscarComboBox;
    }

    public com.toedter.calendar.JDateChooser getDataChooserFecha() {
        return dataChooserFecha;
    }

    public void setDataChooserFecha(com.toedter.calendar.JDateChooser dataChooserFecha) {
        this.dataChooserFecha = dataChooserFecha;
    }

    public javax.swing.JComboBox<String> getHoraComboBox() {
        return horaComboBox;
    }

    public void setHoraComboBox(javax.swing.JComboBox<String> horaComboBox) {
        this.horaComboBox = horaComboBox;
    }
   

    public javax.swing.JButton getRegresarBtn() {
        return regresarBtn;
    }

    public void setRegresarBtn(javax.swing.JButton regresarBtn) {
        this.regresarBtn = regresarBtn;
    }

   

 
    
    public AdminCRUDFuncion() {
        initComponents();
    }
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
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        menuBar2 = new java.awt.MenuBar();
        menu3 = new java.awt.Menu();
        menu4 = new java.awt.Menu();
        menuBar3 = new java.awt.MenuBar();
        menu5 = new java.awt.Menu();
        menu6 = new java.awt.Menu();
        menuBar4 = new java.awt.MenuBar();
        menu7 = new java.awt.Menu();
        menu8 = new java.awt.Menu();
        menuBar5 = new java.awt.MenuBar();
        menu9 = new java.awt.Menu();
        menu10 = new java.awt.Menu();
        jFrame1 = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        aniadirUsuario8 = new javax.swing.JButton();
        aniadirUsuario9 = new javax.swing.JButton();
        aniadirUsuario10 = new javax.swing.JButton();
        aniadirUsuario11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regresarBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        aniadirFuncion = new javax.swing.JButton();
        modificarFuncion = new javax.swing.JButton();
        buscarFuncion = new javax.swing.JButton();
        eliminarFuncion = new javax.swing.JButton();
        horaComboBox = new javax.swing.JComboBox<>();
        buscarComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        dataChooserFecha = new com.toedter.calendar.JDateChooser();
        fechaTxtprovisional = new javax.swing.JLabel();
        comboBoxNombreObra = new javax.swing.JComboBox<>();

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

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Primer Actor Principal");

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Resumen");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        menu3.setLabel("File");
        menuBar2.add(menu3);

        menu4.setLabel("Edit");
        menuBar2.add(menu4);

        menu5.setLabel("File");
        menuBar3.add(menu5);

        menu6.setLabel("Edit");
        menuBar3.add(menu6);

        menu7.setLabel("File");
        menuBar4.add(menu7);

        menu8.setLabel("Edit");
        menuBar4.add(menu8);

        menu9.setLabel("File");
        menuBar5.add(menu9);

        menu10.setLabel("Edit");
        menuBar5.add(menu10);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        aniadirUsuario8.setBackground(new java.awt.Color(88, 91, 112));
        aniadirUsuario8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        aniadirUsuario8.setForeground(new java.awt.Color(255, 255, 255));
        aniadirUsuario8.setText("Añadir");
        aniadirUsuario8.setToolTipText("");
        aniadirUsuario8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirUsuario8ActionPerformed(evt);
            }
        });

        aniadirUsuario9.setBackground(new java.awt.Color(88, 91, 112));
        aniadirUsuario9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        aniadirUsuario9.setForeground(new java.awt.Color(255, 255, 255));
        aniadirUsuario9.setText("Modificar");
        aniadirUsuario9.setToolTipText("");
        aniadirUsuario9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirUsuario9ActionPerformed(evt);
            }
        });

        aniadirUsuario10.setBackground(new java.awt.Color(88, 91, 112));
        aniadirUsuario10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        aniadirUsuario10.setForeground(new java.awt.Color(255, 255, 255));
        aniadirUsuario10.setText("Buscar");
        aniadirUsuario10.setToolTipText("");
        aniadirUsuario10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirUsuario10ActionPerformed(evt);
            }
        });

        aniadirUsuario11.setBackground(new java.awt.Color(88, 91, 112));
        aniadirUsuario11.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        aniadirUsuario11.setForeground(new java.awt.Color(255, 255, 255));
        aniadirUsuario11.setText("Eliminar");
        aniadirUsuario11.setToolTipText("");
        aniadirUsuario11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirUsuario11ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 30, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(205, 214, 244));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADMINISTRADOR");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modificar Función");

        regresarBtn.setBackground(new java.awt.Color(88, 91, 112));
        regresarBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setText("Regresar");
        regresarBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha presentación");

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Hora presentación");

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Nombre de la obra");

        aniadirFuncion.setBackground(new java.awt.Color(88, 91, 112));
        aniadirFuncion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        aniadirFuncion.setForeground(new java.awt.Color(255, 255, 255));
        aniadirFuncion.setText("Añadir");
        aniadirFuncion.setToolTipText("");
        aniadirFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aniadirFuncionActionPerformed(evt);
            }
        });

        modificarFuncion.setBackground(new java.awt.Color(88, 91, 112));
        modificarFuncion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        modificarFuncion.setForeground(new java.awt.Color(255, 255, 255));
        modificarFuncion.setText("Modificar");
        modificarFuncion.setToolTipText("");
        modificarFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarFuncionActionPerformed(evt);
            }
        });

        buscarFuncion.setBackground(new java.awt.Color(88, 91, 112));
        buscarFuncion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        buscarFuncion.setForeground(new java.awt.Color(255, 255, 255));
        buscarFuncion.setText("Buscar");
        buscarFuncion.setToolTipText("");
        buscarFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarFuncionActionPerformed(evt);
            }
        });

        eliminarFuncion.setBackground(new java.awt.Color(88, 91, 112));
        eliminarFuncion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        eliminarFuncion.setForeground(new java.awt.Color(255, 255, 255));
        eliminarFuncion.setText("Eliminar");
        eliminarFuncion.setToolTipText("");
        eliminarFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFuncionActionPerformed(evt);
            }
        });

        horaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17:00", "20:00 pm" }));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID para buscar");

        fechaTxtprovisional.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboBoxNombreObra, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 39, Short.MAX_VALUE))
                            .addComponent(buscarComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dataChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(horaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(fechaTxtprovisional, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(aniadirFuncion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarFuncion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarFuncion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarFuncion)))
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(regresarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(buscarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxNombreObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataChooserFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(fechaTxtprovisional, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(horaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aniadirFuncion)
                    .addComponent(modificarFuncion)
                    .addComponent(buscarFuncion)
                    .addComponent(eliminarFuncion))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void aniadirUsuario8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirUsuario8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniadirUsuario8ActionPerformed

    private void aniadirUsuario9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirUsuario9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniadirUsuario9ActionPerformed

    private void aniadirUsuario10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirUsuario10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniadirUsuario10ActionPerformed

    private void aniadirUsuario11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirUsuario11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aniadirUsuario11ActionPerformed

    private void aniadirFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aniadirFuncionActionPerformed
        
    }//GEN-LAST:event_aniadirFuncionActionPerformed

    private void modificarFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarFuncionActionPerformed

    private void buscarFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarFuncionActionPerformed

    private void eliminarFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarFuncionActionPerformed

    public void setAniadirFuncion(JButton aniadirFuncion) {
        this.aniadirFuncion = aniadirFuncion;
    }

    public void setBuscarFuncion(JButton buscarFuncion) {
        this.buscarFuncion = buscarFuncion;
    }

    public void setEliminarFuncion(JButton eliminarFuncion) {
        this.eliminarFuncion = eliminarFuncion;
    }

    public void setModificarFuncion(JButton modificarFuncion) {
        this.modificarFuncion = modificarFuncion;
    }

    public JButton getAniadirFuncion() {
        return aniadirFuncion;
    }

    public JButton getBuscarFuncion() {
        return buscarFuncion;
    }

    public JButton getEliminarFuncion() {
        return eliminarFuncion;
    }
    public JButton getModificarFuncion() {
        return modificarFuncion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCRUDFuncion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton aniadirFuncion;
    public javax.swing.JButton aniadirUsuario10;
    public javax.swing.JButton aniadirUsuario11;
    public javax.swing.JButton aniadirUsuario8;
    public javax.swing.JButton aniadirUsuario9;
    public javax.swing.JComboBox<String> buscarComboBox;
    public javax.swing.JButton buscarFuncion;
    public javax.swing.JComboBox<String> comboBoxNombreObra;
    public com.toedter.calendar.JDateChooser dataChooserFecha;
    public javax.swing.JButton eliminarFuncion;
    public javax.swing.JLabel fechaTxtprovisional;
    public javax.swing.JComboBox<String> horaComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField8;
    private java.awt.Menu menu1;
    private java.awt.Menu menu10;
    private java.awt.Menu menu2;
    private java.awt.Menu menu3;
    private java.awt.Menu menu4;
    private java.awt.Menu menu5;
    private java.awt.Menu menu6;
    private java.awt.Menu menu7;
    private java.awt.Menu menu8;
    private java.awt.Menu menu9;
    private java.awt.MenuBar menuBar1;
    private java.awt.MenuBar menuBar2;
    private java.awt.MenuBar menuBar3;
    private java.awt.MenuBar menuBar4;
    private java.awt.MenuBar menuBar5;
    public javax.swing.JButton modificarFuncion;
    public javax.swing.JButton regresarBtn;
    // End of variables declaration//GEN-END:variables
}
