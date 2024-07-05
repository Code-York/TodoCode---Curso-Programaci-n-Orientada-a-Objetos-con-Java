package AgendaElectronica.gui;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

        String dni[] = new String[10];
        String nombre[] = new String[10];
        String apellidos[] = new String[10];
        String fNac[] = new String[10];
        String telefono[] = new String[10];
        String direccion[] = new String[10];

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgendaElectronciajPanel = new javax.swing.JPanel();
        AgendaElectronica = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        DNILabel = new javax.swing.JLabel();
        DNITextField = new javax.swing.JTextField();
        NombreLabel = new javax.swing.JLabel();
        NombreTextField = new javax.swing.JTextField();
        ApellidosLabel = new javax.swing.JLabel();
        ApellidosTextField = new javax.swing.JTextField();
        DireccionLabel = new javax.swing.JLabel();
        DireccionTextField = new javax.swing.JTextField();
        TelefonoLabel = new javax.swing.JLabel();
        TelefonoTextField = new javax.swing.JTextField();
        FNacLabel = new javax.swing.JLabel();
        FNacTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        BtnGrabar = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        BtnAdelante = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtIndice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgendaElectronica.setFont(new java.awt.Font("sansserif", 3, 36)); // NOI18N
        AgendaElectronica.setText("Agenda Electrónica");

        DNILabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DNILabel.setText("DNI          ");

        DNITextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DNITextFieldActionPerformed(evt);
            }
        });

        NombreLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        NombreLabel.setText("Nombre   ");

        NombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTextFieldActionPerformed(evt);
            }
        });

        ApellidosLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ApellidosLabel.setText("Apellidos ");

        ApellidosTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosTextFieldActionPerformed(evt);
            }
        });

        DireccionLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        DireccionLabel.setText("Direccion");

        DireccionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionTextFieldActionPerformed(evt);
            }
        });

        TelefonoLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        TelefonoLabel.setText("Telefono   ");

        TelefonoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoTextFieldActionPerformed(evt);
            }
        });

        FNacLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FNacLabel.setText("F. Nac ");

        FNacTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNacTextFieldActionPerformed(evt);
            }
        });

        BtnGrabar.setText("Grabar");
        BtnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGrabarActionPerformed(evt);
            }
        });

        BtnAtras.setText("< <");
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        BtnAdelante.setText("> >");
        BtnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdelanteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Indice:");

        TxtIndice.setEditable(false);
        TxtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtIndice.setText("0");
        TxtIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIndiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AgendaElectronciajPanelLayout = new javax.swing.GroupLayout(AgendaElectronciajPanel);
        AgendaElectronciajPanel.setLayout(AgendaElectronciajPanelLayout);
        AgendaElectronciajPanelLayout.setHorizontalGroup(
            AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendaElectronciajPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgendaElectronciajPanelLayout.createSequentialGroup()
                        .addComponent(ApellidosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AgendaElectronciajPanelLayout.createSequentialGroup()
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DNILabel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(NombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DNITextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgendaElectronciajPanelLayout.createSequentialGroup()
                        .addComponent(FNacLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FNacTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgendaElectronciajPanelLayout.createSequentialGroup()
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DireccionLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(AgendaElectronciajPanelLayout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addComponent(AgendaElectronica)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AgendaElectronciajPanelLayout.createSequentialGroup()
                .addContainerGap(295, Short.MAX_VALUE)
                .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnGrabar, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(TxtIndice))
                .addGap(18, 18, 18)
                .addComponent(BtnAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(303, 303, 303))
        );
        AgendaElectronciajPanelLayout.setVerticalGroup(
            AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgendaElectronciajPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(AgendaElectronica)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgendaElectronciajPanelLayout.createSequentialGroup()
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DNILabel)
                            .addComponent(DNITextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreLabel)
                            .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ApellidosLabel)
                            .addComponent(ApellidosTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(AgendaElectronciajPanelLayout.createSequentialGroup()
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DireccionLabel)
                            .addComponent(DireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefonoLabel)
                            .addComponent(TelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FNacLabel)
                            .addComponent(FNacTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnAdelante, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgendaElectronciajPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AgendaElectronciajPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AgendaElectronciajPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DNITextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DNITextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DNITextFieldActionPerformed

    private void NombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreTextFieldActionPerformed

    private void ApellidosTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosTextFieldActionPerformed

    private void DireccionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionTextFieldActionPerformed

    private void TelefonoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonoTextFieldActionPerformed

    private void FNacTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNacTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNacTextFieldActionPerformed

    private void BtnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGrabarActionPerformed

        String indice = TxtIndice.getText();
        int indi = Integer.parseInt(indice);

        dni[indi] = DNITextField.getText();
        nombre[indi] = NombreTextField.getText();
        apellidos[indi] = ApellidosTextField.getText();
        fNac[indi] = FNacTextField.getText();
        telefono[indi] = TelefonoTextField.getText();
        direccion[indi] = TelefonoTextField.getText();
        
        JOptionPane.showMessageDialog(null, "Datos Guardados");

    }//GEN-LAST:event_BtnGrabarActionPerformed

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        
        String indice = TxtIndice.getText();
        int indi = Integer.parseInt(indice);
        
        if (indi > 0) {
            indi--;
            indice = String.valueOf(indi);
            TxtIndice.setText(indice);
            
            DNITextField.setText(dni[indi]);
            NombreTextField.setText(nombre[indi]);
            ApellidosTextField.setText(apellidos[indi]);
            FNacTextField.setText(fNac[indi]);
            TelefonoTextField.setText(telefono[indi]);
            DireccionTextField.setText(direccion[indi]);            
        }          
         
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void BtnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdelanteActionPerformed

        String indice = TxtIndice.getText();
        int indi = Integer.parseInt(indice);
        
        if (indi < 9) {
            indi++;
            indice = String.valueOf(indi);
            TxtIndice.setText(indice);
            
            DNITextField.setText(dni[indi]);
            NombreTextField.setText(nombre[indi]);
            ApellidosTextField.setText(apellidos[indi]);
            FNacTextField.setText(fNac[indi]);
            TelefonoTextField.setText(telefono[indi]);
            DireccionTextField.setText(direccion[indi]);            
        }

    }//GEN-LAST:event_BtnAdelanteActionPerformed

    private void TxtIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIndiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIndiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgendaElectronciajPanel;
    private javax.swing.JLabel AgendaElectronica;
    private javax.swing.JLabel ApellidosLabel;
    private javax.swing.JTextField ApellidosTextField;
    private javax.swing.JButton BtnAdelante;
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnGrabar;
    private javax.swing.JLabel DNILabel;
    private javax.swing.JTextField DNITextField;
    private javax.swing.JLabel DireccionLabel;
    private javax.swing.JTextField DireccionTextField;
    private javax.swing.JLabel FNacLabel;
    private javax.swing.JTextField FNacTextField;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JLabel TelefonoLabel;
    private javax.swing.JTextField TelefonoTextField;
    private javax.swing.JTextField TxtIndice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
