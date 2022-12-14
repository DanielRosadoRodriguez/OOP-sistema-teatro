/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author David
 */
public class VistaResumen extends javax.swing.JFrame {

    public javax.swing.JTextField getAsientosTxtField() {
        return asientosTxtField;
    }

    public void setAsientosTxtField(javax.swing.JTextField asientosTxtField) {
        this.asientosTxtField = asientosTxtField;
    }

    public javax.swing.JButton getConfirmarBtn() {
        return confirmarBtn;
    }

    public void setConfirmarBtn(javax.swing.JButton confirmarBtn) {
        this.confirmarBtn = confirmarBtn;
    }

    public javax.swing.JTextField getFuncionTxtField() {
        return funcionTxtField;
    }

    public void setFuncionTxtField(javax.swing.JTextField funcionTxtField) {
        this.funcionTxtField = funcionTxtField;
    }

    public javax.swing.JTextField getHorarioTxtField() {
        return horarioTxtField;
    }

    public void setHorarioTxtField(javax.swing.JTextField horarioTxtField) {
        this.horarioTxtField = horarioTxtField;
    }

    public javax.swing.JButton getRegresarBtn1() {
        return regresarBtn1;
    }

    public void setRegresarBtn1(javax.swing.JButton regresarBtn1) {
        this.regresarBtn1 = regresarBtn1;
    }

    public javax.swing.JTextField getTotalTxtField() {
        return totalTxtField;
    }

    public void setTotalTxtField(javax.swing.JTextField totalTxtField) {
        this.totalTxtField = totalTxtField;
    }

    /**
     * Creates new form VistaResumen
     */
    public VistaResumen() {
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

        jLabel2 = new javax.swing.JLabel();
        Funcion2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        confirmarBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Funcion = new javax.swing.JLabel();
        Funcion1 = new javax.swing.JLabel();
        Funcion3 = new javax.swing.JLabel();
        Funcion4 = new javax.swing.JLabel();
        funcionTxtField = new javax.swing.JTextField();
        horarioTxtField = new javax.swing.JTextField();
        asientosTxtField = new javax.swing.JTextField();
        totalTxtField = new javax.swing.JTextField();
        regresarBtn1 = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(205, 214, 244));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EMPLEADO");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        Funcion2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        Funcion2.setForeground(new java.awt.Color(30, 30, 46));
        Funcion2.setText("Funci??n");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 30, 46));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(205, 214, 244));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("RESUMEN");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        confirmarBtn.setBackground(new java.awt.Color(88, 91, 112));
        confirmarBtn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        confirmarBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmarBtn.setText("Confirmar");
        confirmarBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        confirmarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(205, 214, 255));

        Funcion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        Funcion.setForeground(new java.awt.Color(30, 30, 46));
        Funcion.setText("Asientos");

        Funcion1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        Funcion1.setForeground(new java.awt.Color(30, 30, 46));
        Funcion1.setText("Funci??n");

        Funcion3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        Funcion3.setForeground(new java.awt.Color(30, 30, 46));
        Funcion3.setText("Horario");

        Funcion4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        Funcion4.setForeground(new java.awt.Color(30, 30, 46));
        Funcion4.setText("Total");

        funcionTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionTxtFieldActionPerformed(evt);
            }
        });

        asientosTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asientosTxtFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Funcion1)
                    .addComponent(Funcion3)
                    .addComponent(Funcion)
                    .addComponent(Funcion4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(asientosTxtField)
                    .addComponent(horarioTxtField)
                    .addComponent(funcionTxtField))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Funcion1)
                    .addComponent(funcionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Funcion3)
                    .addComponent(horarioTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Funcion)
                    .addComponent(asientosTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Funcion4)
                    .addComponent(totalTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        regresarBtn1.setBackground(new java.awt.Color(88, 91, 112));
        regresarBtn1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        regresarBtn1.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn1.setText("Regresar");
        regresarBtn1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        regresarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(confirmarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(regresarBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirmarBtn)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(regresarBtn1)
                    .addContainerGap(244, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarBtnActionPerformed

    private void funcionTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcionTxtFieldActionPerformed

    private void asientosTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asientosTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asientosTxtFieldActionPerformed

    private void regresarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regresarBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaResumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Funcion;
    private javax.swing.JLabel Funcion1;
    private javax.swing.JLabel Funcion2;
    private javax.swing.JLabel Funcion3;
    private javax.swing.JLabel Funcion4;
    public javax.swing.JTextField asientosTxtField;
    public javax.swing.JButton confirmarBtn;
    public javax.swing.JTextField funcionTxtField;
    public javax.swing.JTextField horarioTxtField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton regresarBtn1;
    public javax.swing.JTextField totalTxtField;
    // End of variables declaration//GEN-END:variables
}
