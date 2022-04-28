/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

/**
 *
 * @author Simran
 */
public class WorkAreaCustomerLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form WorkAreaCustomerLoginJPanel
     */
    public WorkAreaCustomerLoginJPanel() {
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

        upperbannerjLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        WorkRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        NetworkComboBox = new javax.swing.JComboBox<>();
        MentalHealthPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PersonalCarePanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upperbannerjLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        upperbannerjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upperbannerjLabel.setText("Welcome to HealthifyMe");
        add(upperbannerjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 20, 690, 40));

        WorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status"
            }
        ));
        jScrollPane1.setViewportView(WorkRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 550, 120));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Select Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        NetworkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NetworkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NetworkComboBoxActionPerformed(evt);
            }
        });
        add(NetworkComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mental Health Services");

        javax.swing.GroupLayout MentalHealthPanelLayout = new javax.swing.GroupLayout(MentalHealthPanel);
        MentalHealthPanel.setLayout(MentalHealthPanelLayout);
        MentalHealthPanelLayout.setHorizontalGroup(
            MentalHealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MentalHealthPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        MentalHealthPanelLayout.setVerticalGroup(
            MentalHealthPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MentalHealthPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        add(MentalHealthPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 220, 160));

        javax.swing.GroupLayout PersonalCarePanelLayout = new javax.swing.GroupLayout(PersonalCarePanel);
        PersonalCarePanel.setLayout(PersonalCarePanelLayout);
        PersonalCarePanelLayout.setHorizontalGroup(
            PersonalCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        PersonalCarePanelLayout.setVerticalGroup(
            PersonalCarePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(PersonalCarePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void NetworkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NetworkComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NetworkComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MentalHealthPanel;
    private javax.swing.JComboBox<String> NetworkComboBox;
    private javax.swing.JPanel PersonalCarePanel;
    private javax.swing.JTable WorkRequestJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel upperbannerjLabel;
    // End of variables declaration//GEN-END:variables
}