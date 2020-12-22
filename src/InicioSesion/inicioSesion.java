package InicioSesion;
public class inicioSesion extends javax.swing.JFrame {

    /** Creates new form inicioSesion */
    public inicioSesion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeInicio = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        iconoTorneo = new javax.swing.JLabel();
        etiquetaTorneo = new javax.swing.JLabel();
        etiquetaBienvenida = new javax.swing.JLabel();
        etiquetaPanel = new javax.swing.JLabel();
        etiquetaIngreseID = new javax.swing.JLabel();
        cajaID = new javax.swing.JTextField();
        etiquetaContrasena = new javax.swing.JLabel();
        cajaContrasena = new javax.swing.JPasswordField();
        botonIngreso = new javax.swing.JButton();
        botonRegistrarse = new javax.swing.JButton();
        etiquetaIngreseID1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelDeInicio.setBackground(new java.awt.Color(255, 255, 255));

        panelLogo.setBackground(new java.awt.Color(0, 51, 102));

        iconoTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/soccer-ball.png"))); // NOI18N

        etiquetaTorneo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        etiquetaTorneo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTorneo.setText("LIGA PERUANA DE FUTBOL");

        etiquetaBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        etiquetaBienvenida.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaBienvenida.setText("¡Bienvenidos!");

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaTorneo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGroup(panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiquetaBienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLogoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(iconoTorneo)
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(iconoTorneo)
                .addGap(30, 30, 30)
                .addComponent(etiquetaBienvenida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        etiquetaPanel.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        etiquetaPanel.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaPanel.setText("Sistema de Gestión de Torneos");

        etiquetaIngreseID.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        etiquetaIngreseID.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaIngreseID.setText("Ingrese ID");

        cajaID.setBackground(new java.awt.Color(255, 255, 255));
        cajaID.setText(" Ingrese su usuario");
        cajaID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cajaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIDActionPerformed(evt);
            }
        });

        etiquetaContrasena.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        etiquetaContrasena.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaContrasena.setText("Contraseña");

        cajaContrasena.setBackground(new java.awt.Color(255, 255, 255));
        cajaContrasena.setToolTipText("");
        cajaContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cajaContrasena.setName(""); // NOI18N

        botonIngreso.setBackground(new java.awt.Color(0, 51, 102));
        botonIngreso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonIngreso.setForeground(new java.awt.Color(255, 255, 255));
        botonIngreso.setText("Ingresar");
        botonIngreso.setBorder(null);
        botonIngreso.setBorderPainted(false);
        botonIngreso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botonRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        botonRegistrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/login.png"))); // NOI18N
        botonRegistrarse.setToolTipText("");
        botonRegistrarse.setBorder(null);
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        etiquetaIngreseID1.setBackground(new java.awt.Color(255, 255, 255));
        etiquetaIngreseID1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        etiquetaIngreseID1.setForeground(new java.awt.Color(153, 153, 153));
        etiquetaIngreseID1.setText("Regitrarse");

        javax.swing.GroupLayout panelDeInicioLayout = new javax.swing.GroupLayout(panelDeInicio);
        panelDeInicio.setLayout(panelDeInicioLayout);
        panelDeInicioLayout.setHorizontalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeInicioLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeInicioLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaIngreseID)
                            .addComponent(cajaID)
                            .addComponent(etiquetaContrasena)
                            .addComponent(etiquetaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addComponent(cajaContrasena)
                            .addComponent(botonIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeInicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(etiquetaIngreseID1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        panelDeInicioLayout.setVerticalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDeInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaIngreseID1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(etiquetaPanel)
                .addGap(37, 37, 37)
                .addComponent(etiquetaIngreseID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiquetaContrasena)
                .addGap(18, 18, 18)
                .addComponent(cajaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIDActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRegistrarseActionPerformed

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
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngreso;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JPasswordField cajaContrasena;
    private javax.swing.JTextField cajaID;
    private javax.swing.JLabel etiquetaBienvenida;
    private javax.swing.JLabel etiquetaContrasena;
    private javax.swing.JLabel etiquetaIngreseID;
    private javax.swing.JLabel etiquetaIngreseID1;
    private javax.swing.JLabel etiquetaPanel;
    private javax.swing.JLabel etiquetaTorneo;
    private javax.swing.JLabel iconoTorneo;
    private javax.swing.JPanel panelDeInicio;
    private javax.swing.JPanel panelLogo;
    // End of variables declaration//GEN-END:variables

}
