package janela;
public class FormPrincipal extends javax.swing.JFrame {
    public FormPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        btnEnv = new javax.swing.JButton();
        btnSom = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnVol = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        txtR = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnArquivo = new javax.swing.JMenu();
        imNovaCalc = new javax.swing.JMenuItem();
        mnEditar = new javax.swing.JMenu();
        mnAjuda = new javax.swing.JMenu();
        mnSair = new javax.swing.JMenu();
        imSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Conhecendo o JFrame!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 20, 319, 40);

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });
        getContentPane().add(txtA);
        txtA.setBounds(65, 84, 132, 22);

        btnEnv.setText("Enviar");
        btnEnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnv);
        btnEnv.setBounds(77, 180, 72, 22);

        btnSom.setText("Somar");
        btnSom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomActionPerformed(evt);
            }
        });
        getContentPane().add(btnSom);
        btnSom.setBounds(167, 180, 72, 22);

        btnMul.setText("Multiplicar");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });
        getContentPane().add(btnMul);
        btnMul.setBounds(257, 180, 72, 22);

        btnVol.setText("Voltar");
        btnVol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolActionPerformed(evt);
            }
        });
        getContentPane().add(btnVol);
        btnVol.setBounds(77, 220, 72, 22);

        btnSub.setText("Subtrair");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        getContentPane().add(btnSub);
        btnSub.setBounds(167, 220, 72, 22);

        btnDiv.setText("Dividir");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });
        getContentPane().add(btnDiv);
        btnDiv.setBounds(257, 220, 72, 22);

        txtR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRActionPerformed(evt);
            }
        });
        getContentPane().add(txtR);
        txtR.setBounds(196, 140, 132, 22);

        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });
        getContentPane().add(txtB);
        txtB.setBounds(215, 84, 132, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Resultado:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(88, 136, 90, 25);

        mnArquivo.setText("Arquivo");

        imNovaCalc.setText("Nova Calculadora");
        imNovaCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imNovaCalcActionPerformed(evt);
            }
        });
        mnArquivo.add(imNovaCalc);

        jMenuBar1.add(mnArquivo);

        mnEditar.setText("Editar");
        jMenuBar1.add(mnEditar);

        mnAjuda.setText("Ajuda");
        jMenuBar1.add(mnAjuda);

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });

        imSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        imSair.setText("Sair");
        imSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSairActionPerformed(evt);
            }
        });
        mnSair.add(imSair);

        jMenuBar1.add(mnSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(444, 322));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void txtRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRActionPerformed

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBActionPerformed

    private void btnEnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvActionPerformed
        // TODO add your handling code here:
        txtB.setText(txtA.getText());
        txtA.setText("");
    }//GEN-LAST:event_btnEnvActionPerformed

    private void btnVolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolActionPerformed
        // TODO add your handling code here:
        txtA.setText(txtB.getText());
        txtB.setText("");
    }//GEN-LAST:event_btnVolActionPerformed

    private void btnSomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomActionPerformed
        // TODO add your handling code here:
        Double valor1 = Double.parseDouble(txtA.getText());
        Double valor2 = Double.parseDouble(txtB.getText());
        txtR.setText(String.valueOf(valor1+valor2));
    }//GEN-LAST:event_btnSomActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        Double valor1 = Double.parseDouble(txtA.getText());
        Double valor2 = Double.parseDouble(txtB.getText());
        txtR.setText(String.valueOf(valor1-valor2));
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        // TODO add your handling code here:
        Double valor1 = Double.parseDouble(txtA.getText());
        Double valor2 = Double.parseDouble(txtB.getText());
        txtR.setText(String.valueOf(valor1*valor2));
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // TODO add your handling code here:
        Double valor1 = Double.parseDouble(txtA.getText());
        Double valor2 = Double.parseDouble(txtB.getText());
        txtR.setText(String.valueOf(valor1/valor2));
    }//GEN-LAST:event_btnDivActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    private void imSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_imSairActionPerformed

    private void imNovaCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imNovaCalcActionPerformed
        // TODO add your handling code here:
        new FormCalculadora().setVisible(true);
    }//GEN-LAST:event_imNovaCalcActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnEnv;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnSom;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnVol;
    private javax.swing.JMenuItem imNovaCalc;
    private javax.swing.JMenuItem imSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnAjuda;
    private javax.swing.JMenu mnArquivo;
    private javax.swing.JMenu mnEditar;
    private javax.swing.JMenu mnSair;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtR;
    // End of variables declaration//GEN-END:variables
}
