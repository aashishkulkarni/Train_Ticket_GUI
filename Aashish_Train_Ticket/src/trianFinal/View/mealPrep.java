package trianFinal.View;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aashish Kulkarni
 */
public class mealPrep extends javax.swing.JFrame {

    /**
     * Creates new form mealPrep
     */
    public mealPrep() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        FoodandBevTitle = new javax.swing.JLabel();
        drinkText = new javax.swing.JLabel();
        drinkComboBox = new javax.swing.JComboBox<>();
        foodItemText = new javax.swing.JLabel();
        foodItemComboBox = new javax.swing.JComboBox<>();
        nextButton = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jToggleButton1.setText("jToggleButton1");

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        FoodandBevTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FoodandBevTitle.setForeground(new java.awt.Color(0, 0, 0));
        FoodandBevTitle.setText(" Food and Beverages");
        FoodandBevTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        drinkText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        drinkText.setForeground(new java.awt.Color(0, 0, 0));
        drinkText.setText("Drink:");

        drinkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option","Lemonade", "Coffee", "Tea", "Pepsi" }));
        drinkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkComboBoxActionPerformed(evt);
            }
        });

        foodItemText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        foodItemText.setForeground(new java.awt.Color(0, 0, 0));
        foodItemText.setText("Food Item: ");

        foodItemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Option", "Cheese Pizza", "Pasta", "Garlic Bread" }));
        foodItemComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodItemComboBoxActionPerformed(evt);
            }
        });

        nextButton.setText("Next >");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        backbutton.setText("< Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(drinkText, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(foodItemText)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(foodItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(drinkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(FoodandBevTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(backbutton)))
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(82, 82, 82))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(FoodandBevTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drinkText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drinkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(foodItemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(foodItemText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(backbutton))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed

        JFrame f1 = new passengerInfo();
        f1.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_backbuttonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
                                                                                //ensures options are properly selected by the usert 
        if (drinkComboBox.getSelectedItem().equals("Select Option")) {

            JOptionPane.showMessageDialog(null, " Please select your drink ");

        } else if (foodItemComboBox.getSelectedItem().equals("Select Option")) {

            JOptionPane.showMessageDialog(null, " Please select your food item ");

        } else {

            JFrame frame = new additionalRequirementForm();

            frame.setVisible(true);
            this.setVisible(false);

        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void drinkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drinkComboBoxActionPerformed

    private void foodItemComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodItemComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodItemComboBoxActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FoodandBevTitle;
    private javax.swing.JButton backbutton;
    private javax.swing.JComboBox<String> drinkComboBox;
    private javax.swing.JLabel drinkText;
    private javax.swing.JComboBox<String> foodItemComboBox;
    private javax.swing.JLabel foodItemText;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
