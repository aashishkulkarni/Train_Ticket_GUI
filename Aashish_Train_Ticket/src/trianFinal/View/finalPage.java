package trianFinal.View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import trianFinal.Model.Model;

/**
 *
 * @author Aashish Kulkarni
 */
public class finalPage extends javax.swing.JFrame {

    /**
     * Creates new form finalPage
     */
    public finalPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        finalPagePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        thankyouTextArea = new javax.swing.JTextArea();
        backButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        costLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        finalPagePanel.setBackground(new java.awt.Color(153, 153, 255));
        finalPagePanel.setForeground(new java.awt.Color(0, 0, 0));

        thankyouTextArea.setEditable(false);
        thankyouTextArea.setBackground(new java.awt.Color(153, 153, 255));
        thankyouTextArea.setColumns(20);
        thankyouTextArea.setFont(new java.awt.Font("Arial", 3, 26)); // NOI18N
        thankyouTextArea.setForeground(new java.awt.Color(51, 51, 51));
        thankyouTextArea.setRows(5);
        thankyouTextArea.setText("\nThank you for travelling with RailNetwork NZ!\nWe hope you have a safe journey!\n\nYour ticket has been sent to your email!");
        jScrollPane1.setViewportView(thankyouTextArea);

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        costLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        costLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout finalPagePanelLayout = new javax.swing.GroupLayout(finalPagePanel);
        finalPagePanel.setLayout(finalPagePanelLayout);
        finalPagePanelLayout.setHorizontalGroup(
            finalPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(finalPagePanelLayout.createSequentialGroup()
                .addGroup(finalPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(finalPagePanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(backButton)
                        .addGap(281, 281, 281)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(finalPagePanelLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(costLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(finalPagePanelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        finalPagePanelLayout.setVerticalGroup(
            finalPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, finalPagePanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(costLabel)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addGroup(finalPagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backButton)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(finalPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(finalPagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        JFrame frame = new additionalRequirementForm();
        frame.setVisible(true);     //opens additionalRequirementForm.java
        this.setVisible(false);


    }//GEN-LAST:event_backButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed

        this.setVisible(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  //exits the program

    }//GEN-LAST:event_exitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel costLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JPanel finalPagePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea thankyouTextArea;
    // End of variables declaration//GEN-END:variables
}
