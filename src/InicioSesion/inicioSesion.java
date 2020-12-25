package InicioSesion;

import javax.swing.JOptionPane;

public class inicioSesion extends javax.swing.JFrame {
    public inicioSesion() {
        initComponents();
        setLocationRelativeTo(null);
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
        botonIngresar = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelDeInicio.setBackground(new java.awt.Color(255, 255, 255));

        panelLogo.setBackground(new java.awt.Color(0, 51, 102));

        iconoTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoTorneo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoLogin.png"))); // NOI18N

        etiquetaTorneo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        etiquetaTorneo.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaTorneo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTorneo.setText("LIGA DE FUTBOL");

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

        cajaID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cajaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIDActionPerformed(evt);
            }
        });

        etiquetaContrasena.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        etiquetaContrasena.setForeground(new java.awt.Color(102, 102, 102));
        etiquetaContrasena.setText("Contraseña");

        cajaContrasena.setToolTipText("");
        cajaContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        cajaContrasena.setName(""); // NOI18N

        botonIngresar.setBackground(new java.awt.Color(0, 51, 102));
        botonIngresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        botonIngresar.setText("Ingresar");
        botonIngresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonIngresar.setBorderPainted(false);
        botonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        botonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        botonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/close.png"))); // NOI18N
        botonCerrar.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        botonCerrar.setFocusable(false);
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDeInicioLayout = new javax.swing.GroupLayout(panelDeInicio);
        panelDeInicio.setLayout(panelDeInicioLayout);
        panelDeInicioLayout.setHorizontalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeInicioLayout.createSequentialGroup()
                .addComponent(panelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDeInicioLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaContrasena)
                            .addComponent(etiquetaIngreseID)
                            .addComponent(cajaID)
                            .addComponent(cajaContrasena)
                            .addComponent(botonIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDeInicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panelDeInicioLayout.setVerticalGroup(
            panelDeInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelDeInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(etiquetaPanel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(etiquetaIngreseID)
                .addGap(18, 18, 18)
                .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(etiquetaContrasena)
                .addGap(18, 18, 18)
                .addComponent(cajaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDeInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cajaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIDActionPerformed
        // codigos por agregar
    }//GEN-LAST:event_cajaIDActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        String usuarioCorrecto = "admin";
        String contrasenaCorrecta = "proyecto";
        if(usuarioCorrecto.equals(cajaID.getText())){
            String contrasena ="";
            for(int i = 0 ; i < cajaContrasena.getPassword().length; i++)
                contrasena += cajaContrasena.getPassword()[i];
            if(contrasenaCorrecta.equals(contrasena))
                JOptionPane.showMessageDialog(null, "Bienvenido");
            else
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null, "Usuario Desconocido", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_botonIngresarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JPasswordField cajaContrasena;
    private javax.swing.JTextField cajaID;
    private javax.swing.JLabel etiquetaBienvenida;
    private javax.swing.JLabel etiquetaContrasena;
    private javax.swing.JLabel etiquetaIngreseID;
    private javax.swing.JLabel etiquetaPanel;
    private javax.swing.JLabel etiquetaTorneo;
    private javax.swing.JLabel iconoTorneo;
    private javax.swing.JPanel panelDeInicio;
    private javax.swing.JPanel panelLogo;
    // End of variables declaration//GEN-END:variables

}
