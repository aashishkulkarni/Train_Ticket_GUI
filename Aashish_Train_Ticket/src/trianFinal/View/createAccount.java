package trianFinal.View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Aashish Kulkarni
 */
public class createAccount extends JFrame {

    public createAccount() {

        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        colourPanel1 = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        signUpText = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        age = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        username = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        password = new javax.swing.JLabel();
        signUpAccountCreate = new javax.swing.JButton();
        returnSignInButton = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        colourPanel1.setBackground(new java.awt.Color(204, 204, 255));

        nameTextField.setText(" ");

        name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Name: ");

        signUpText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        signUpText.setForeground(new java.awt.Color(0, 0, 0));
        signUpText.setText("Sign Up");
        signUpText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ageTextField.setText(" ");
        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        age.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        age.setForeground(new java.awt.Color(0, 0, 0));
        age.setText("Age:");

        emailTextField.setText(" ");
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        emailID.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        emailID.setForeground(new java.awt.Color(0, 0, 0));
        emailID.setText("Email ID:");

        usernameTextField.setText(" ");
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 0, 0));
        username.setText("Username:");

        password.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 0, 0));
        password.setText(" Password:");

        signUpAccountCreate.setText("Create Account");

        signUpAccountCreate.addActionListener(new java.awt.event.ActionListener() {

            DBManager db = new DBManager();

            public void actionPerformed(java.awt.event.ActionEvent evt) {

                signUpAccountCreateActionPerformed(evt);

                int intAge = Integer.parseInt(ageTextField.getText().trim());

                boolean b1 = db.registerUser(usernameTextField.getText().trim(), passwordTextField.getText(), nameTextField.getText(), intAge, emailTextField.getText());
                if (b1) {       //implementing registerUser function from DBManager.java

                    System.out.println("User has been registered! ");  //User has been registered in database
                } else {

                    System.out.println("User already exists ... ");
                }

            }

        });

        returnSignInButton.setText("Go back to Sign-In page");
        returnSignInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnSignInButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout colourPanel1Layout = new javax.swing.GroupLayout(colourPanel1);
        colourPanel1.setLayout(colourPanel1Layout);
        colourPanel1Layout.setHorizontalGroup(
                colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(colourPanel1Layout.createSequentialGroup()
                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(colourPanel1Layout.createSequentialGroup()
                                                .addGap(181, 181, 181)
                                                .addComponent(signUpText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(colourPanel1Layout.createSequentialGroup()
                                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(colourPanel1Layout.createSequentialGroup()
                                                                .addGap(101, 101, 101)
                                                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(name)
                                                                        .addComponent(age)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colourPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(emailID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING))))
                                                .addGap(18, 18, 18)
                                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(ageTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                                                .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING))))
                                        .addGroup(colourPanel1Layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(returnSignInButton)
                                                        .addComponent(signUpAccountCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(127, Short.MAX_VALUE))
        );
        colourPanel1Layout.setVerticalGroup(
                colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(colourPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(signUpText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name))
                                .addGap(31, 31, 31)
                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailID))
                                .addGap(33, 33, 33)
                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(username))
                                .addGap(33, 33, 33)
                                .addGroup(colourPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(password))
                                .addGap(56, 56, 56)
                                .addComponent(signUpAccountCreate)
                                .addGap(30, 30, 30)
                                .addComponent(returnSignInButton)
                                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(colourPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(colourPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void signUpAccountCreateActionPerformed(java.awt.event.ActionEvent evt) {       //ensures all fields are filled in properly

        if (usernameTextField.getText().trim().isEmpty() || passwordTextField.getText().isEmpty() || nameTextField.getText().isEmpty() || emailTextField.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, " Please enter the values missing in the empty fields .. ");

        } else if (this.emailTextField.getText().isEmpty()) {

            JOptionPane.showMessageDialog(null, " Please enter your EmailID ");

        } else if (!this.ageTextField.getText().matches("[0-9]{1,3}")) {

            JOptionPane.showMessageDialog(null, " Please enter a valid age");

        } else if (!this.emailTextField.getText().trim().matches("^(.+)@(.+)$")) {

            JOptionPane.showMessageDialog(null, " Invalid Email ID! Please enter a valid EmailID ");

        } else {
            JFrame f1 = new instructionForm();
            f1.setVisible(true);            // opens instructionForm.java
            this.setVisible(false);         //closes this form
        }

    }

    private void returnSignInButtonActionPerformed(java.awt.event.ActionEvent evt) {

        JFrame f1 = new signIn();
        f1.setVisible(true);        //opens signIn.java
        this.setVisible(false);     //closes this form

    }

    private javax.swing.JLabel age;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JPanel colourPanel1;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton returnSignInButton;
    private javax.swing.JButton signUpAccountCreate;
    private javax.swing.JLabel signUpText;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernameTextField;

    public JTextField getAgeTextField() {
        return ageTextField;
    }

    public void setAgeTextField(JTextField ageTextField) {
        this.ageTextField = ageTextField;
    }

    public JTextField getEmailTextField() {
        return emailTextField;
    }

    public void setEmailTextField(JTextField emailTextField) {
        this.emailTextField = emailTextField;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public void setNameTextField(JTextField nameTextField) {
        this.nameTextField = nameTextField;
    }

}
