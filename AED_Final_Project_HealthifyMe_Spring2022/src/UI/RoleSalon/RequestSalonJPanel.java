/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.RoleSalon;

/**
 *
 * @author anky
 */
public class RequestSalonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestSalonJPanel
     */
    public RequestSalonJPanel() {
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

        backJButton = new javax.swing.JButton();
        enterprice = new javax.swing.JLabel();
        valuejLabel = new javax.swing.JLabel();
        messagejLabel = new javax.swing.JLabel();
        messagejTextField = new javax.swing.JTextField();
        RequetsjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setText("Back");
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        enterprice.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        enterprice.setText("Enterprise: ");
        add(enterprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        valuejLabel.setText("<value>");
        add(valuejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 50, -1));

        messagejLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        messagejLabel.setText("Message");
        add(messagejLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));
        add(messagejTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 130, -1));

        RequetsjButton.setBackground(new java.awt.Color(255, 255, 255));
        RequetsjButton.setFont(new java.awt.Font("Sitka Display", 1, 18)); // NOI18N
        RequetsjButton.setText("Request Appointment");
        RequetsjButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 204, 255), 5, true));
        add(RequetsjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/RoleSalon/beauiful.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 470));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RequetsjButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterprice;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel messagejLabel;
    private javax.swing.JTextField messagejTextField;
    private javax.swing.JLabel valuejLabel;
    // End of variables declaration//GEN-END:variables
}
