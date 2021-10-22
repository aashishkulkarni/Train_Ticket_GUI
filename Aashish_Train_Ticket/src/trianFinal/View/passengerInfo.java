package trianFinal.View;

import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Aashish Kulkarni
 */
public class passengerInfo extends javax.swing.JFrame {

    /**
     * Creates new form passengerInfo
     */
    public passengerInfo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        passengerDetailForm = new javax.swing.JPanel();
        nameText = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ageText = new javax.swing.JLabel();
        genderText = new javax.swing.JLabel();
        genderComboBox = new javax.swing.JComboBox<>();
        phoneText = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        emailText = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        passengerDetailsText = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        medicalPanel = new javax.swing.JPanel();
        medicalTitle = new javax.swing.JLabel();
        quesText1 = new javax.swing.JLabel();
        quesText2 = new javax.swing.JLabel();
        quesText3 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        passengerDetailForm.setBackground(new java.awt.Color(153, 153, 255));

        nameText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameText.setForeground(new java.awt.Color(0, 0, 0));
        nameText.setText("Name:");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        ageText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ageText.setForeground(new java.awt.Color(0, 0, 0));
        ageText.setText("Age:");

        genderText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        genderText.setForeground(new java.awt.Color(0, 0, 0));
        genderText.setText("Gender:");

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));

        phoneText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        phoneText.setForeground(new java.awt.Color(0, 0, 0));
        phoneText.setText("Phone Number:");

        phoneTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTextFieldActionPerformed(evt);
            }
        });

        emailText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailText.setForeground(new java.awt.Color(0, 0, 0));
        emailText.setText("Email ID:");

        passengerDetailsText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        passengerDetailsText.setForeground(new java.awt.Color(0, 0, 0));
        passengerDetailsText.setText("    Passenger Details");
        passengerDetailsText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout passengerDetailFormLayout = new javax.swing.GroupLayout(passengerDetailForm);
        passengerDetailForm.setLayout(passengerDetailFormLayout);
        passengerDetailFormLayout.setHorizontalGroup(
            passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passengerDetailFormLayout.createSequentialGroup()
                .addGroup(passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passengerDetailFormLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(passengerDetailFormLayout.createSequentialGroup()
                                .addComponent(nameText)
                                .addGap(159, 159, 159))
                            .addGroup(passengerDetailFormLayout.createSequentialGroup()
                                .addGroup(passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(phoneText)
                                    .addComponent(genderText)
                                    .addComponent(emailText)
                                    .addComponent(ageText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(phoneTextField)
                                    .addComponent(genderComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(ageTextField)))))
                    .addGroup(passengerDetailFormLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(passengerDetailsText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        passengerDetailFormLayout.setVerticalGroup(
            passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passengerDetailFormLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(passengerDetailsText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneText))
                .addGap(31, 31, 31)
                .addGroup(passengerDetailFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        medicalPanel.setBackground(new java.awt.Color(153, 153, 255));
        medicalPanel.setForeground(new java.awt.Color(0, 0, 0));

        medicalTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        medicalTitle.setForeground(new java.awt.Color(0, 0, 0));
        medicalTitle.setText(" Medical Details");
        medicalTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        quesText1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        quesText1.setForeground(new java.awt.Color(0, 0, 0));
        quesText1.setText("Are you fully vaccinated for COVID-19? (yes/no) : ");

        quesText2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        quesText2.setForeground(new java.awt.Color(0, 0, 0));
        quesText2.setText("Were you ever in the managed isolation facility in the last 6 months in New Zealand? (yes/no) : ");

        quesText3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        quesText3.setForeground(new java.awt.Color(0, 0, 0));
        quesText3.setText("Have you ever tested COVID positive in the past? (yes/no) : ");

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next >");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        jRadioButton1.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton1.setText(" Yes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton2.setText("No");

        jRadioButton3.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton3.setText("Yes");

        jRadioButton4.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton4.setText("No");

        jRadioButton5.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton5.setText("Yes");

        jRadioButton6.setForeground(new java.awt.Color(0, 0, 0));
        jRadioButton6.setText("No");

        javax.swing.GroupLayout medicalPanelLayout = new javax.swing.GroupLayout(medicalPanel);
        medicalPanel.setLayout(medicalPanelLayout);
        medicalPanelLayout.setHorizontalGroup(
            medicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalPanelLayout.createSequentialGroup()
                .addGroup(medicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medicalPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(medicalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(medicalPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(medicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(medicalPanelLayout.createSequentialGroup()
                                .addComponent(quesText2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4))
                            .addGroup(medicalPanelLayout.createSequentialGroup()
                                .addComponent(quesText1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2))
                            .addGroup(medicalPanelLayout.createSequentialGroup()
                                .addComponent(quesText3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton6)))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(medicalPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(28, 28, 28))
        );
        medicalPanelLayout.setVerticalGroup(
            medicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medicalPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(medicalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(medicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quesText1)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(41, 41, 41)
                .addGroup(medicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quesText2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(43, 43, 43)
                .addGroup(medicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quesText3)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(medicalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(nextButton))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(medicalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passengerDetailForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passengerDetailForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(medicalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed

        JFrame f1 = new mealPrep();                             //ensuring user enters proper values

        if (this.nameTextField.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, " Please enter your name ");

        } else if (!this.ageTextField.getText().matches("[0-9]{1,3}")) {

            JOptionPane.showMessageDialog(null, " Please enter a valid age");

        } else if (!this.phoneTextField.getText().matches("[0-9]{6,10}")) {

            JOptionPane.showMessageDialog(null, " Please enter a valid phone number");

        }  
        else if (this.genderComboBox.getSelectedItem().equals("Select")) {

            JOptionPane.showMessageDialog(null, " Please select your gender ");

        } else if (this.phoneTextField.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, " Please enter your phone number ");

        } else if (this.emailTextField.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, " Please enter your EmailID ");

        } else if (!this.emailTextField.getText().matches("^(.+)@(.+)$")) {

            JOptionPane.showMessageDialog(null, " Invalid Email ID! Please enter a valid EmailID ");

        } else {

            f1.setVisible(true);
            this.setVisible(false);

        }


    }//GEN-LAST:event_nextButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        JFrame f1 = new bookTrainWorking();
        f1.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_backButtonActionPerformed

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed

        

    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void phoneTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTextFieldActionPerformed

    }//GEN-LAST:event_phoneTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

  
    
    
    public JTextField getAgeTextField() {
        return ageTextField;
    }

    public void setAgeTextField(JTextField ageTextField) {
        this.ageTextField = ageTextField;
    }

    public JComboBox<String> getGenderComboBox() {
        return genderComboBox;
    }

    public void setGenderComboBox(JComboBox<String> genderComboBox) {
        this.genderComboBox = genderComboBox;
    }
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageText;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel emailText;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel genderText;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JPanel medicalPanel;
    private javax.swing.JLabel medicalTitle;
    private javax.swing.JLabel nameText;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel passengerDetailForm;
    private javax.swing.JLabel passengerDetailsText;
    private javax.swing.JLabel phoneText;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel quesText1;
    private javax.swing.JLabel quesText2;
    private javax.swing.JLabel quesText3;
    // End of variables declaration//GEN-END:variables
}
