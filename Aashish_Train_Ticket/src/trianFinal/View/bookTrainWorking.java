package trianFinal.View;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Aashish Kulkarni
 *
 *
 */
public class bookTrainWorking extends javax.swing.JFrame {

    public bookTrainWorking() {
        initComponents();
    }

    public String toCity;
    public String fromCity;
    public String monthValue;
    public String dateValue;
    public String timeValue;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fromLabel = new javax.swing.JLabel();
        toLabel = new javax.swing.JLabel();
        toComboBox = new javax.swing.JComboBox<>();
        monthLabel = new javax.swing.JLabel();
        monthComboBox = new javax.swing.JComboBox<>();
        dayLabel = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox<>();
        fromComboBox = new javax.swing.JComboBox<>();
        nextButton = new javax.swing.JButton();
        timeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Book Train");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(64, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
        );

        fromLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        fromLabel.setForeground(new java.awt.Color(0, 0, 0));
        fromLabel.setText("From:");

        toLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        toLabel.setForeground(new java.awt.Color(0, 0, 0));
        toLabel.setText("To:");

        toComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select City", "Auckland", "Wellington", "Tauranga", "Hamilton"}));
        toComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toComboBoxActionPerformed(evt);
            }
        });

        //passValue = toComboBox.getModel();
        monthLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        monthLabel.setForeground(new java.awt.Color(0, 0, 0));
        monthLabel.setText("Month:");

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
        monthComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthComboBoxActionPerformed(evt);
            }
        });

        dayLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dayLabel.setForeground(new java.awt.Color(0, 0, 0));
        dayLabel.setText("Day:");

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select Date", "2nd", "10th", "17th", "22nd"}));
        dayComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayComboBoxActionPerformed(evt);
            }
        });

        fromComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select City", "Auckland", "Wellington", "Tauranga", "Hamilton"}));
        fromComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromComboBoxActionPerformed(evt);
            }
        });

        nextButton.setText("Next >");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Select Time", "9:00 AM", "11:30 AM", "3:00 PM", "6:30 PM", "9:00 PM"}));
        timeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Time:");

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(296, 296, 296)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel2)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                        .addGap(73, 73, 73)
                                                                                        .addComponent(fromLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(18, 18, 18))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                        .addContainerGap()
                                                                                        .addComponent(toLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(30, 30, 30)))
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(backButton, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(toComboBox, 0, 137, Short.MAX_VALUE)
                                                                                        .addComponent(fromComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                        .addGap(153, 153, 153)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(monthLabel)
                                                                                .addComponent(dayLabel))))
                                                        .addGap(27, 27, 27)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(timeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(monthComboBox, 0, 137, Short.MAX_VALUE)
                                                                .addComponent(dayComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fromLabel)
                                        .addComponent(monthLabel)
                                        .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fromComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(toLabel)
                                        .addComponent(toComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dayLabel))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(timeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nextButton)
                                        .addComponent(backButton))
                                .addGap(26, 26, 26))
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
    }// </editor-fold>                        

    public JComboBox<String> getFromComboBox() {
        return fromComboBox;
    }

    public void setFromComboBox(JComboBox<String> fromComboBox) {
        this.fromComboBox = fromComboBox;
    }

    public JComboBox<String> getToComboBox() {
        return toComboBox;
    }

    public void setToComboBox(JComboBox<String> toComboBox) {
        this.toComboBox = toComboBox;
    }

    private void toComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

        String selectedValue = toComboBox.getSelectedItem().toString();

        toCity = selectedValue;                         // item selected by user is stored here

    }

    private void fromComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

        String selectedValue = fromComboBox.getSelectedItem().toString();
        fromCity = selectedValue;                                                // item selected by user is stored here
    }

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {
                                                                                    // ensuring correct options are selected by the user
        if (toComboBox.getSelectedItem().equals("Select City") || fromComboBox.getSelectedItem().equals("Select City")) {

            JOptionPane.showMessageDialog(null, " Please select appropriate cities ");

        } else if (fromCity.equals(toCity)) {

            JOptionPane.showMessageDialog(null, " Please select different cities ");

        } else if (monthComboBox.getSelectedItem().equals("Select Month")) {

            JOptionPane.showMessageDialog(null, " Please select month ");

        } else if (dayComboBox.getSelectedItem().equals("Select Date")) {

            JOptionPane.showMessageDialog(null, " Please select date ");

        } else if (timeComboBox.getSelectedItem().equals("Select Time")) {

            JOptionPane.showMessageDialog(null, " Please select time ");

        } else {
            JFrame pass = new passengerInfo();
            pass.setVisible(true);          //opening passengerInfo.java
            this.setVisible(false);         // closing this frame
        }
    }

    private void dayComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void timeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void monthComboBoxActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {

        JFrame signIn = new instructionForm();
        signIn.setVisible(true);
        this.setVisible(false);

    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> dayComboBox;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JComboBox<String> fromComboBox;
    private javax.swing.JComboBox<String> timeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> monthComboBox;
    private javax.swing.JLabel monthLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JComboBox<String> toComboBox;
    private javax.swing.JLabel toLabel;
    // End of variables declaration                   
}
