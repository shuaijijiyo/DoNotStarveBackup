/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package autogenerated_code;

/**
 *
 * @author Chris
 */
public class SettingsPopup extends javax.swing.JDialog {

  /**
   * Creates new form SettingsPopup
   */
  public SettingsPopup(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
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

    saveDataTextField = new javax.swing.JTextField();
    browseButton = new javax.swing.JButton();
    autoDetectButton = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    okButton = new javax.swing.JButton();
    cancelButton = new javax.swing.JButton();
    spinner = new javax.swing.JSpinner();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel3 = new javax.swing.JLabel();
    jSeparator2 = new javax.swing.JSeparator();
    jLabel2 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(370, 338));
    setMinimumSize(new java.awt.Dimension(370, 338));
    getContentPane().setLayout(null);

    saveDataTextField.setText("C:\\");
      getContentPane().add(saveDataTextField);
      saveDataTextField.setBounds(6, 82, 345, 28);
      setResizable(false);
      browseButton.setText("Browse");
      browseButton.setMaximumSize(new java.awt.Dimension(90, 28));
      browseButton.setMinimumSize(new java.awt.Dimension(90, 28));
      browseButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          browseButtonMouseClicked(evt);
        }
      });
      getContentPane().add(browseButton);
      browseButton.setBounds(102, 116, 90, 28);

      autoDetectButton.setText("Auto Detect");
      autoDetectButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          autoDetectButtonMouseClicked(evt);
        }
      });
      getContentPane().add(autoDetectButton);
      autoDetectButton.setBounds(6, 116, 90, 28);

      jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
      jLabel1.setForeground(new java.awt.Color(255, 255, 255));
      jLabel1.setText("Settings");
      getContentPane().add(jLabel1);
      jLabel1.setBounds(10, 10, 100, 25);

      okButton.setText("OK");
      okButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          okButtonMouseClicked(evt);
        }
      });
      getContentPane().add(okButton);
      okButton.setBounds(211, 266, 67, 28);

      cancelButton.setText("Cancel");
      cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
          cancelButtonMouseClicked(evt);
        }
      });
      getContentPane().add(cancelButton);
      cancelButton.setBounds(284, 266, 67, 28);

      spinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
      getContentPane().add(spinner);
      spinner.setBounds(6, 198, 157, 28);
      getContentPane().add(jSeparator1);
      jSeparator1.setBounds(6, 41, 345, 10);

      jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
      jLabel3.setForeground(new java.awt.Color(255, 255, 255));
      jLabel3.setText("Save Data Location");
      getContentPane().add(jLabel3);
      jLabel3.setBounds(10, 60, 130, 20);
      getContentPane().add(jSeparator2);
      jSeparator2.setBounds(0, 250, 351, 10);

      jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
      jLabel2.setForeground(new java.awt.Color(255, 255, 255));
      jLabel2.setText("Number of Backups to keep");
      getContentPane().add(jLabel2);
      jLabel2.setBounds(6, 176, 200, 20);

      jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/popup_bg.png"))); // NOI18N
      getContentPane().add(jLabel4);
      jLabel4.setBounds(0, 0, 360, 300);

      pack();
    }// </editor-fold>//GEN-END:initComponents

  protected void autoDetectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autoDetectButtonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_autoDetectButtonMouseClicked

  protected void browseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseButtonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_browseButtonMouseClicked

  protected void okButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_okButtonMouseClicked

  protected void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_cancelButtonMouseClicked

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
      java.util.logging.Logger.getLogger(SettingsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(SettingsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(SettingsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(SettingsPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
        //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        SettingsPopup dialog = new SettingsPopup(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton autoDetectButton;
  private javax.swing.JButton browseButton;
  private javax.swing.JButton cancelButton;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JSeparator jSeparator2;
  private javax.swing.JButton okButton;
  private javax.swing.JTextField saveDataTextField;
  private javax.swing.JSpinner spinner;
  // End of variables declaration//GEN-END:variables
}