/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.autobazar.GUI;

import java.time.Instant;
import java.util.Date;
import sk.upjs.ics.autobazar.InzeratFactory;
import sk.upjs.ics.autobazar.InzeratOsobne;
import sk.upjs.ics.autobazar.InzeratOsobneDao;

/**
 *
 * @author PC
 */
public class PridatOsobneForm extends javax.swing.JDialog {
    private Long idP = null;
    
    private InzeratOsobneDao inzeratDao = InzeratFactory.INSTANCE.getInzeratOsobneDao();
    
    /**
     * Creates new form PridatInzeratForm
     */
    public PridatOsobneForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public PridatOsobneForm(java.awt.Frame parent, boolean modal,Long idP) {
        super(parent, modal);
        initComponents();
        this.idP=idP;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spatButton = new javax.swing.JButton();
        okButton = new javax.swing.JButton();
        znackaTextField = new javax.swing.JTextField();
        znackaLabel = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        modelLabel = new javax.swing.JLabel();
        rocnikTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        objemTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kmTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        palivoTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        prevodovkaTextField = new javax.swing.JTextField();
        prevodovkaLabel = new javax.swing.JLabel();
        vykonTextField = new javax.swing.JTextField();
        vykonLabel = new javax.swing.JLabel();
        cenaTextField = new javax.swing.JTextField();
        cenaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        spatButton.setText("Spat");
        spatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spatButtonActionPerformed(evt);
            }
        });

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        znackaLabel.setText("Znacka:");

        modelLabel.setText("Model:");

        jLabel1.setText("Rocnik:");

        jLabel2.setText("Objem:");

        jLabel3.setText("Km:");

        jLabel4.setText("Palivo:");

        prevodovkaLabel.setText("Prevodovka:");

        vykonLabel.setText("Vykon:");

        cenaLabel.setText("Cena:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(znackaLabel)
                    .addComponent(modelLabel)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(palivoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(kmTextField)
                    .addComponent(objemTextField)
                    .addComponent(rocnikTextField)
                    .addComponent(modelTextField)
                    .addComponent(znackaTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vykonLabel)
                    .addComponent(prevodovkaLabel)
                    .addComponent(cenaLabel))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cenaTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addComponent(vykonTextField, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(prevodovkaTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(znackaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(znackaLabel)
                    .addComponent(prevodovkaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prevodovkaLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelLabel)
                    .addComponent(vykonTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vykonLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rocnikTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(objemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cenaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cenaLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(palivoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spatButton)
                    .addComponent(okButton))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spatButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_spatButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        InzeratOsobne i = new InzeratOsobne();
        Long value = null;
        i.setZnacka(znackaTextField.getText());
        i.setModel(modelTextField.getText());
        i.setRocnik(rocnikTextField.getText());
        value = Long.parseLong(objemTextField.getText());
        i.setObjem(value);
        value = Long.parseLong(kmTextField.getText());
        i.setKm(value);
        i.setPalivo(palivoTextField.getText());
        i.setPrevodovka(prevodovkaTextField.getText());
        value = Long.parseLong(vykonTextField.getText());
        i.setVykon(value);
        value = Long.parseLong(cenaTextField.getText());
        i.setCena(value);
        i.setDatumPridania(Date.from(Instant.now()));
        i.setIdP(idP);

        inzeratDao.pridat(i);
        setVisible(false);

    }//GEN-LAST:event_okButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PridatOsobneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatOsobneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatOsobneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatOsobneForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatOsobneForm dialog = new PridatOsobneForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cenaLabel;
    private javax.swing.JTextField cenaTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField kmTextField;
    private javax.swing.JLabel modelLabel;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextField objemTextField;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField palivoTextField;
    private javax.swing.JLabel prevodovkaLabel;
    private javax.swing.JTextField prevodovkaTextField;
    private javax.swing.JTextField rocnikTextField;
    private javax.swing.JButton spatButton;
    private javax.swing.JLabel vykonLabel;
    private javax.swing.JTextField vykonTextField;
    private javax.swing.JLabel znackaLabel;
    private javax.swing.JTextField znackaTextField;
    // End of variables declaration//GEN-END:variables
}