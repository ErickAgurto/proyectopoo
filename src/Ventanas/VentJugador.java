package Ventanas;

import InicioSesion.InicioSesion;

public class VentJugador extends javax.swing.JFrame {

    public VentJugador() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelJugador = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        iconoJugador = new javax.swing.JLabel();
        etiquetaTorneo = new javax.swing.JLabel();
        etiquetaMenuJugador = new javax.swing.JLabel();
        scroolJugador = new javax.swing.JScrollPane();
        tablaJugador = new javax.swing.JTable();
        encabezadoJugador = new javax.swing.JLabel();
        botonAgregar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonRetroceder = new javax.swing.JButton();
        etiquetaAgregar = new javax.swing.JLabel();
        etiquetaEliminar = new javax.swing.JLabel();
        etiquetaRetroceder = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        botonMinimizar = new javax.swing.JButton();
        botonSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelJugador.setBackground(new java.awt.Color(255, 255, 255));

        panelLogo.setBackground(new java.awt.Color(0, 51, 102));

        iconoJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoJugador.png"))); // NOI18N

        etiquetaTorneo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        etiquetaTorneo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTorneo.setText("LIGA DE FÚTBOL");

        etiquetaMenuJugador.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        etiquetaMenuJugador.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaMenuJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMenuJugador.setText("Menú Jugador");

        javax.swing.GroupLayout panelLogoLayout = new javax.swing.GroupLayout(panelLogo);
        panelLogo.setLayout(panelLogoLayout);
        panelLogoLayout.setHorizontalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaTorneo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGroup(panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLogoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(etiquetaMenuJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelLogoLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(iconoJugador)
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLogoLayout.setVerticalGroup(
            panelLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(iconoJugador)
                .addGap(30, 30, 30)
                .addComponent(etiquetaMenuJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        tablaJugador.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tablaJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tablaJugador.setCellSelectionEnabled(true);
        scroolJugador.setViewportView(tablaJugador);

        encabezadoJugador.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        encabezadoJugador.setForeground(new java.awt.Color(255, 153, 0));
        encabezadoJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encabezadoJugador.setText("Registo de Jugadores");

        botonAgregar.setBackground(new java.awt.Color(255, 255, 255));
        botonAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoAgregar.png"))); // NOI18N
        botonAgregar.setToolTipText("");
        botonAgregar.setBorder(null);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(255, 255, 255));
        botonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoEliminar.png"))); // NOI18N
        botonEliminar.setToolTipText("");
        botonEliminar.setBorder(null);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonRetroceder.setBackground(new java.awt.Color(255, 255, 255));
        botonRetroceder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoRetroceder.png"))); // NOI18N
        botonRetroceder.setToolTipText("");
        botonRetroceder.setBorder(null);
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });

        etiquetaAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etiquetaAgregar.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaAgregar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaAgregar.setText("AGREGAR");

        etiquetaEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etiquetaEliminar.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaEliminar.setText("ELIMINAR");

        etiquetaRetroceder.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        etiquetaRetroceder.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaRetroceder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaRetroceder.setText("RETROCEDER");

        botonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botonCerrar.png"))); // NOI18N
        botonCerrar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonCerrar.setFocusable(false);
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        botonMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        botonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botonMinimzar.png"))); // NOI18N
        botonMinimizar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonMinimizar.setFocusable(false);
        botonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMinimizarActionPerformed(evt);
            }
        });

        botonSesion.setBackground(new java.awt.Color(255, 255, 255));
        botonSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botonSesion.png"))); // NOI18N
        botonSesion.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonSesion.setFocusable(false);
        botonSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelJugadorLayout = new javax.swing.GroupLayout(panelJugador);
        panelJugador.setLayout(panelJugadorLayout);
        panelJugadorLayout.setHorizontalGroup(
            panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugadorLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJugadorLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(encabezadoJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(scroolJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(panelJugadorLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaAgregar)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(120, 120, 120)
                        .addGroup(panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelJugadorLayout.createSequentialGroup()
                                .addComponent(etiquetaEliminar)
                                .addGap(109, 109, 109)
                                .addComponent(etiquetaRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(107, Short.MAX_VALUE))
                            .addGroup(panelJugadorLayout.createSequentialGroup()
                                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonRetroceder)
                                .addGap(119, 119, 119))))
                    .addGroup(panelJugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMinimizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCerrar)
                        .addContainerGap())))
        );
        panelJugadorLayout.setVerticalGroup(
            panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelJugadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCerrar)
                    .addComponent(botonMinimizar)
                    .addComponent(botonSesion))
                .addGroup(panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelJugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(encabezadoJugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scroolJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaAgregar)
                            .addGroup(panelJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etiquetaRetroceder)
                                .addComponent(etiquetaEliminar)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelJugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRetroceder, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        Principal pPrincipal = new Principal();
        pPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMinimizarActionPerformed
        this.setExtendedState(1);
    }//GEN-LAST:event_botonMinimizarActionPerformed

    private void botonSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSesionActionPerformed
        InicioSesion pInicio = new InicioSesion();
        pInicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonSesionActionPerformed

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
            java.util.logging.Logger.getLogger(VentJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentJugador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentJugador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonMinimizar;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JButton botonSesion;
    private javax.swing.JLabel encabezadoJugador;
    private javax.swing.JLabel etiquetaAgregar;
    private javax.swing.JLabel etiquetaEliminar;
    private javax.swing.JLabel etiquetaMenuJugador;
    private javax.swing.JLabel etiquetaRetroceder;
    private javax.swing.JLabel etiquetaTorneo;
    private javax.swing.JLabel iconoJugador;
    private javax.swing.JPanel panelJugador;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JScrollPane scroolJugador;
    private javax.swing.JTable tablaJugador;
    // End of variables declaration//GEN-END:variables
}
