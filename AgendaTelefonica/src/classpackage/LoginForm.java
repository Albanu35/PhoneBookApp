package classpackage;

import static classpackage.MainForm.lblReclama;
import static classpackage.MainForm.poza;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {
    static String cod = "1234"; // Codul de inregistrare in aplicatie
    static ImageIcon poza = new ImageIcon("..\\AgendaTelefonica\\src\\Resources\\ceas0.jpg");
    DefaultListModel model = new DefaultListModel();
    List<Contact> listaContacte = new ArrayList<>();
    Agenda agenda = new Agenda(listaContacte);
    // Metoda de rulare a reclamelor
    public void rulareReclame() {
        while (true) {
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTelefonica\\src\\Resources\\ceas1.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTelefonica\\src\\Resources\\ceas2.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTelefonica\\src\\Resources\\ceas3.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTelefonica\\src\\Resources\\ceas5.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTelefonica\\src\\Resources\\ceas6.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTelefonica\\src\\Resources\\ceas7.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTelefonica\\src\\Resources\\ceas8.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Thread.sleep(2000);
                poza = new ImageIcon("..\\AgendaTelefonica\\src\\Resources\\ceas9.jpg");
                lblReclama.setIcon(poza);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
     
    public LoginForm() {
        initComponents();
        lblReclama.setIcon(poza);
    }

     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginScreenPanel = new javax.swing.JPanel();
        lblCodInregistrare = new javax.swing.JLabel();
        tfdCodInregistrare = new javax.swing.JTextField();
        lblNumeProiect = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblReclama = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        LoginScreenPanel.setBackground(new java.awt.Color(153, 153, 153));
        LoginScreenPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 0), 2, true), "User Login Screen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20), new java.awt.Color(255, 255, 0))); // NOI18N

        lblCodInregistrare.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblCodInregistrare.setText("Codul de Inregistrare:");

        tfdCodInregistrare.setBackground(new java.awt.Color(255, 255, 153));
        tfdCodInregistrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfdCodInregistrareActionPerformed(evt);
            }
        });

        lblNumeProiect.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumeProiect.setText("Alexandr Ciobanu PhoneBook app - Java 05 Mar - 2019");

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 0, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblReclama.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblReclamaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout LoginScreenPanelLayout = new javax.swing.GroupLayout(LoginScreenPanel);
        LoginScreenPanel.setLayout(LoginScreenPanelLayout);
        LoginScreenPanelLayout.setHorizontalGroup(
            LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginScreenPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReclama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                        .addComponent(lblCodInregistrare, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(tfdCodInregistrare, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(169, 169, 169))
            .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(lblNumeProiect, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginScreenPanelLayout.setVerticalGroup(
            LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginScreenPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(LoginScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodInregistrare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdCodInregistrare, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblReclama, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(lblNumeProiect, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Butonul de 
    private void tfdCodInregistrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfdCodInregistrareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfdCodInregistrareActionPerformed

// Butonul de logare a codului de inregistrare
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String user = tfdCodInregistrare.getText();
        if (user.equals(cod)){
            MainForm mf = new MainForm();
            mf.setVisible(true);
            this.dispose();
        }
        else{
            JOptionPane.showMessageDialog(this, "Codul este incorect!!!");
            tfdCodInregistrare.getText();
             }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void lblReclamaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblReclamaAncestorAdded
        lblReclama.setVisible(true);;
    }//GEN-LAST:event_lblReclamaAncestorAdded

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginScreenPanel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblCodInregistrare;
    private javax.swing.JLabel lblNumeProiect;
    private javax.swing.JLabel lblReclama;
    private javax.swing.JTextField tfdCodInregistrare;
    // End of variables declaration//GEN-END:variables
}
