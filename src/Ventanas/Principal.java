package Ventanas;

import InicioSesion.InicioSesion;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        botonCerrar = new javax.swing.JButton();
        panelLogo = new javax.swing.JPanel();
        iconoTorneo = new javax.swing.JLabel();
        etiquetaTorneo = new javax.swing.JLabel();
        etiquetaBienvenida = new javax.swing.JLabel();
        botonMenuJugador = new javax.swing.JButton();
        etiquetaEncabezado = new javax.swing.JLabel();
        etiquetaMenuJugador = new javax.swing.JLabel();
        botonMenuClub = new javax.swing.JButton();
        etiquetaMenuClub = new javax.swing.JLabel();
        botonMenuEquipo = new javax.swing.JButton();
        etiquetaMenuEquipo = new javax.swing.JLabel();
        botonMenuTorneo = new javax.swing.JButton();
        etiquetaMenuTorneo = new javax.swing.JLabel();
        botonMenuArbitro = new javax.swing.JButton();
        etiquetaMenuArbitro = new javax.swing.JLabel();
        botonMinimizar = new javax.swing.JButton();
        botonSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(900, 450));

        botonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/botonCerrar.png"))); // NOI18N
        botonCerrar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonCerrar.setFocusable(false);
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        panelLogo.setBackground(new java.awt.Color(0, 51, 102));

        iconoTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoPrincipal.png"))); // NOI18N

        etiquetaTorneo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        etiquetaTorneo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTorneo.setText("LIGA DE FUTBOL");

        etiquetaBienvenida.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        etiquetaBienvenida.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaBienvenida.setText("Menú Principal");

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
                .addContainerGap(130, Short.MAX_VALUE))
        );

        botonMenuJugador.setBackground(new java.awt.Color(255, 255, 255));
        botonMenuJugador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoJugador.png"))); // NOI18N
        botonMenuJugador.setFocusable(false);
        botonMenuJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuJugadorActionPerformed(evt);
            }
        });

        etiquetaEncabezado.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        etiquetaEncabezado.setForeground(new java.awt.Color(255, 153, 0));
        etiquetaEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaEncabezado.setText("Sistema de Gestión de Torneos");

        etiquetaMenuJugador.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        etiquetaMenuJugador.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaMenuJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMenuJugador.setText("JUGADORES");

        botonMenuClub.setBackground(new java.awt.Color(255, 255, 255));
        botonMenuClub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoClub.png"))); // NOI18N
        botonMenuClub.setFocusable(false);
        botonMenuClub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuClubActionPerformed(evt);
            }
        });

        etiquetaMenuClub.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        etiquetaMenuClub.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaMenuClub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMenuClub.setText("CLUBES");

        botonMenuEquipo.setBackground(new java.awt.Color(255, 255, 255));
        botonMenuEquipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoEquipo.png"))); // NOI18N
        botonMenuEquipo.setFocusable(false);
        botonMenuEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuEquipoActionPerformed(evt);
            }
        });

        etiquetaMenuEquipo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        etiquetaMenuEquipo.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaMenuEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMenuEquipo.setText("EQUIPOS");

        botonMenuTorneo.setBackground(new java.awt.Color(255, 255, 255));
        botonMenuTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoTorneo.png"))); // NOI18N
        botonMenuTorneo.setFocusable(false);
        botonMenuTorneo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuTorneoActionPerformed(evt);
            }
        });

        etiquetaMenuTorneo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        etiquetaMenuTorneo.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaMenuTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMenuTorneo.setText("TORNEO");

        botonMenuArbitro.setBackground(new java.awt.Color(255, 255, 255));
        botonMenuArbitro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoArbitro.png"))); // NOI18N
        botonMenuArbitro.setFocusable(false);
        botonMenuArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuArbitroActionPerformed(evt);
            }
        });

        etiquetaMenuArbitro.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        etiquetaMenuArbitro.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaMenuArbitro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaMenuArbitro.setText("ARBITROS");

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

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(etiquetaEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMinimizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCerrar)
                        .addContainerGap())
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaMenuArbitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaMenuClub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonMenuClub, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMenuArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonMenuJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaMenuJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etiquetaMenuTorneo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonMenuTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etiquetaMenuEquipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonMenuEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(etiquetaEncabezado))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonCerrar)
                            .addComponent(botonMinimizar)
                            .addComponent(botonSesion))))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonMenuJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiquetaMenuJugador)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(botonMenuArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaMenuArbitro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonMenuClub, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(botonMenuEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(etiquetaMenuEquipo)
                                .addGap(13, 13, 13)
                                .addComponent(botonMenuTorneo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaMenuTorneo)
                    .addComponent(etiquetaMenuClub))
                .addContainerGap())
            .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonMenuJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuJugadorActionPerformed
        VentJugador pJugador = new VentJugador();
        pJugador.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuJugadorActionPerformed

    private void botonMenuClubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuClubActionPerformed
        VentClub pClub = new VentClub();
        pClub.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuClubActionPerformed

    private void botonMenuEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuEquipoActionPerformed
        VentEquipo pEquipo = new VentEquipo();
        pEquipo.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuEquipoActionPerformed

    private void botonMenuTorneoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuTorneoActionPerformed
        VentTorneo pTorneo = new VentTorneo();
        pTorneo.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonMenuTorneoActionPerformed

    private void botonMenuArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuArbitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMenuArbitroActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonMenuArbitro;
    private javax.swing.JButton botonMenuClub;
    private javax.swing.JButton botonMenuEquipo;
    private javax.swing.JButton botonMenuJugador;
    private javax.swing.JButton botonMenuTorneo;
    private javax.swing.JButton botonMinimizar;
    private javax.swing.JButton botonSesion;
    private javax.swing.JLabel etiquetaBienvenida;
    private javax.swing.JLabel etiquetaEncabezado;
    private javax.swing.JLabel etiquetaMenuArbitro;
    private javax.swing.JLabel etiquetaMenuClub;
    private javax.swing.JLabel etiquetaMenuEquipo;
    private javax.swing.JLabel etiquetaMenuJugador;
    private javax.swing.JLabel etiquetaMenuTorneo;
    private javax.swing.JLabel etiquetaTorneo;
    private javax.swing.JLabel iconoTorneo;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
