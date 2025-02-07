/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oopproject;

import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class RegisterScreen extends javax.swing.JFrame {

    int day;
    String month;
    int year;

    /**
     * Creates new form RegisterScreen
     */
    public RegisterScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterScreen = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        UserNameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        EmailField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        RegisterBottun = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        LogIn_Button = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        monthsBox = new javax.swing.JComboBox<>();
        yearBox = new javax.swing.JComboBox<>();
        daysBox = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 520));

        RegisterScreen.setBackground(new java.awt.Color(255, 255, 255));
        RegisterScreen.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("First name :");
        RegisterScreen.add(jLabel11);
        jLabel11.setBounds(330, 90, 70, 16);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Last Name :");
        RegisterScreen.add(jLabel12);
        jLabel12.setBounds(330, 130, 70, 16);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("UserNameField :");
        RegisterScreen.add(jLabel13);
        jLabel13.setBounds(330, 170, 90, 16);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Date Of Birth :");
        RegisterScreen.add(jLabel14);
        jLabel14.setBounds(330, 220, 80, 16);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Email :");
        RegisterScreen.add(jLabel15);
        jLabel15.setBounds(330, 260, 50, 16);

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Password :");
        RegisterScreen.add(jLabel16);
        jLabel16.setBounds(330, 300, 80, 16);

        FirstNameField.setBackground(new java.awt.Color(255, 255, 255));
        FirstNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(FirstNameField);
        FirstNameField.setBounds(450, 90, 169, 26);

        LastNameField.setBackground(new java.awt.Color(255, 255, 255));
        LastNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(LastNameField);
        LastNameField.setBounds(450, 130, 168, 26);

        UserNameField.setBackground(new java.awt.Color(255, 255, 255));
        UserNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(UserNameField);
        UserNameField.setBounds(450, 170, 169, 26);

        PasswordField.setBackground(new java.awt.Color(255, 255, 255));
        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(PasswordField);
        PasswordField.setBounds(450, 300, 169, 26);

        EmailField.setBackground(new java.awt.Color(255, 255, 255));
        EmailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(EmailField);
        EmailField.setBounds(450, 260, 169, 26);

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Register Frame");
        RegisterScreen.add(jLabel17);
        jLabel17.setBounds(387, 19, 190, 33);

        RegisterBottun.setBackground(new java.awt.Color(153, 153, 255));
        RegisterBottun.setForeground(new java.awt.Color(0, 0, 0));
        RegisterBottun.setText("Register");
        RegisterBottun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBottunActionPerformed(evt);
            }
        });
        RegisterScreen.add(RegisterBottun);
        RegisterBottun.setBounds(365, 408, 256, 23);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Already have account ?");
        RegisterScreen.add(jLabel18);
        jLabel18.setBounds(430, 450, 150, 16);

        LogIn_Button.setBackground(new java.awt.Color(255, 255, 255));
        LogIn_Button.setForeground(new java.awt.Color(0, 0, 0));
        LogIn_Button.setText("Log in");
        LogIn_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn_ButtonActionPerformed(evt);
            }
        });
        RegisterScreen.add(LogIn_Button);
        LogIn_Button.setBounds(360, 470, 256, 23);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Confirm Password :");
        RegisterScreen.add(jLabel19);
        jLabel19.setBounds(330, 340, 120, 16);

        ConfirmPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        RegisterScreen.add(ConfirmPasswordField);
        ConfirmPasswordField.setBounds(450, 340, 169, 22);

        monthsBox.setBackground(new java.awt.Color(255, 255, 255));
        monthsBox.setForeground(new java.awt.Color(0, 0, 0));
        monthsBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        monthsBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthsBoxItemStateChanged(evt);
            }
        });
        RegisterScreen.add(monthsBox);
        monthsBox.setBounds(500, 220, 80, 22);

        yearBox.setBackground(new java.awt.Color(255, 255, 255));
        yearBox.setForeground(new java.awt.Color(0, 0, 0));
        yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971" }));
        yearBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                yearBoxItemStateChanged(evt);
            }
        });
        RegisterScreen.add(yearBox);
        yearBox.setBounds(590, 220, 60, 22);

        daysBox.setBackground(new java.awt.Color(255, 255, 255));
        daysBox.setForeground(new java.awt.Color(0, 0, 0));
        daysBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        daysBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                daysBoxItemStateChanged(evt);
            }
        });
        RegisterScreen.add(daysBox);
        daysBox.setBounds(450, 220, 40, 22);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/pxfuel.jpg"))); // NOI18N
        RegisterScreen.add(jLabel20);
        jLabel20.setBounds(0, -30, 910, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RegisterScreen, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(914, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBottunActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_RegisterBottunActionPerformed
        String firstName = FirstNameField.getText();
        String lastName = LastNameField.getText();
        String email = EmailField.getText();
        String registrationUsername = UserNameField.getText();
        String registrationPassword = new String(PasswordField.getPassword());
        String confirmPassword = new String(ConfirmPasswordField.getPassword());
        // Validate input
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || registrationUsername.isEmpty()
                || registrationPassword.isEmpty()) {
            JOptionPane.showMessageDialog(RegisterScreen, "Please fill in all fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validate input
        if ( !EmailField.getText().contains("@") || !EmailField.getText().contains(".com")) {
            JOptionPane.showMessageDialog(RegisterScreen, "Please Enter the Email Correctly","Email Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (registrationPassword.length() < 6) {
            JOptionPane.showMessageDialog(RegisterScreen, "Password must be more than 6.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validate name starts with an uppercase letter
        if (!Character.isUpperCase(firstName.charAt(0)) || !Character.isUpperCase(lastName.charAt(0))) {
            JOptionPane.showMessageDialog(RegisterScreen, "Name must start with an uppercase letter.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Validate password and confirm password match
        if (!registrationPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(RegisterScreen, "Passwords do not match.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        daysBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                daysBoxItemStateChanged(evt);
            }
        });
        monthsBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                monthsBoxItemStateChanged(evt);

            }
        });
        yearBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                yearBoxItemStateChanged(evt);

            }
        });
        // Validate input (you can customize these conditions)
        if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || registrationUsername.isEmpty()
                || registrationPassword.isEmpty()) {
            JOptionPane.showMessageDialog(RegisterScreen, "Please fill in all fields.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        user u = new user();
        u.setFirst_name(firstName);
        u.setSecond_name(lastName);
        u.setEmail(email);
        u.setPassword(registrationPassword);
        u.setUser_name(registrationUsername);
        u.setDay(day);
        u.setMonth(month);
        u.setYear(year);
        JOptionPane.showMessageDialog(RegisterScreen, "Registration successful!");
        FileManeger m = new FileManeger();
        m.JSONserializing(u);
        // user last= m.CheckingSign();
        File Folder = m.CreateFolder(user.usersList.getLast());

        this.setVisible(false);
        new LogIn_Screen().setVisible(true);
    }// GEN-LAST:event_RegisterBottunActionPerformed

    private void LogIn_ButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_LogIn_ButtonActionPerformed
        this.setVisible(false);
        new LogIn_Screen().setVisible(true);
    }// GEN-LAST:event_LogIn_ButtonActionPerformed

    private void daysBoxItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_daysBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object selectedItem = daysBox.getSelectedItem();
            int days = Integer.parseInt(selectedItem.toString());
            this.day = days;
        }
    }// GEN-LAST:event_daysBoxItemStateChanged

    private void monthsBoxItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_monthsBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object selectedItem = monthsBox.getSelectedItem();
            String month = selectedItem.toString();
            this.month = month;
        }
    }// GEN-LAST:event_monthsBoxItemStateChanged

    private void yearBoxItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_yearBoxItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object selectedItem = yearBox.getSelectedItem();
            int years = Integer.parseInt(selectedItem.toString());
            this.year = years;
        }
    }// GEN-LAST:event_yearBoxItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JButton LogIn_Button;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton RegisterBottun;
    private javax.swing.JPanel RegisterScreen;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JComboBox<String> daysBox;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JComboBox<String> monthsBox;
    private javax.swing.JComboBox<String> yearBox;
    // End of variables declaration//GEN-END:variables
}
