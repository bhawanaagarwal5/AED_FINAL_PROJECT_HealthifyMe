/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.RoleMeditationInstructor;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.MeditationOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.MeditationInstructorWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Simran
 */
public class WorkAreaMeditationInstructorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaMeditationInstructorJPanel
     */
    
    private JPanel userProcessContainer;
    private MeditationOrganization housecleanorganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    private Network sourceNetwork;
    private Network targetNetwork; 
    
    public WorkAreaMeditationInstructorJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Network sourceNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.housecleanorganization = (MeditationOrganization) organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = system;
        this.sourceNetwork = sourceNetwork;
        valueLabel.setText(organization.getName());
        populateRequestTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        declineJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        organizationLabel = new javax.swing.JLabel();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/house_cleaning.png"))); // NOI18N

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1800, 1800));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(180, 216, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 680, 120));

        declineJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        declineJButton.setText("DECLINE");
        declineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(declineJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, 180, 40));

        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignJButton.setText("ASSIGN TO ME");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 220, 40));
        jPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 158, 26));

        organizationLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        organizationLabel.setText("ORGANIZATION");
        jPanel1.add(organizationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, 230, 30));

        processJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        processJButton.setText("PROCESS");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 190, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/yogaa.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1630, 540));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 1800));
    }// </editor-fold>//GEN-END:initComponents

    private void declineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Declined");

        populateRequestTable();
    }//GEN-LAST:event_declineJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        request.setReceiver(userAccount);
        request.setStatus("Confirmed");

        populateRequestTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(this, "Please select at least one row");
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow,0);
        request.setReceiver(userAccount);
        request.setStatus("Processed");
        populateRequestTable();
    }//GEN-LAST:event_processJButtonActionPerformed
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : housecleanorganization.getWorkQueue().getWorkRequestList()){
            if(request instanceof MeditationInstructorWorkRequest){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            model.addRow(row);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton declineJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel organizationLabel;
    private javax.swing.JButton processJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
