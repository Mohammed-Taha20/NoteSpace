/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopproject;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class loginScreen extends JFrame {

    static Scanner input = new Scanner(System.in);
    private ArrayList<user> a = new ArrayList<>();
    private javax.swing.JButton LogIn_Button;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JTextField EmailField;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JButton RegisterBottun;
    private javax.swing.JTextField UserNameField;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel RegisterScreen;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;

    public loginScreen() {

        LogInScreen();
    }

    private boolean isValidUser(String username, String password) {
        // Check credentials against the stored users
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getUser_name().equals(username) && a.get(i).getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void showRegistrationScreen() {
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        RegisterBottun = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        LogIn_Button = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 580));
        RegisterScreen.setBackground(new java.awt.Color(255, 255, 255));
        RegisterScreen.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("First name :");
        RegisterScreen.add(jLabel11);
        jLabel11.setBounds(346, 96, 61, 16);

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Last Name :");
        RegisterScreen.add(jLabel12);
        jLabel12.setBounds(350, 140, 62, 16);

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("UserName :");
        RegisterScreen.add(jLabel13);
        jLabel13.setBounds(323, 184, 86, 16);

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Date Of Birth :");
        RegisterScreen.add(jLabel14);
        jLabel14.setBounds(334, 236, 75, 16);

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Email :");
        RegisterScreen.add(jLabel15);
        jLabel15.setBounds(387, 280, 35, 16);

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Password :");
        RegisterScreen.add(jLabel16);
        jLabel16.setBounds(366, 330, 56, 16);

        FirstNameField.setBackground(new java.awt.Color(255, 255, 255));
        FirstNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(FirstNameField);
        FirstNameField.setBounds(447, 93, 170, 26);

        LastNameField.setBackground(new java.awt.Color(255, 255, 255));
        LastNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(LastNameField);
        LastNameField.setBounds(452, 137, 169, 26);

        UserNameField.setBackground(new java.awt.Color(255, 255, 255));
        UserNameField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(UserNameField);
        UserNameField.setBounds(452, 181, 169, 26);

        PasswordField.setBackground(new java.awt.Color(255, 255, 255));
        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(PasswordField);
        PasswordField.setBounds(452, 324, 169, 26);

        EmailField.setBackground(new java.awt.Color(255, 255, 255));
        EmailField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RegisterScreen.add(EmailField);
        EmailField.setBounds(452, 280, 169, 26);

        jList1.setBackground(new java.awt.Color(255, 255, 255));
        jList1.setForeground(new java.awt.Color(0, 0, 0));
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane3.setViewportView(jList1);

        RegisterScreen.add(jScrollPane3);
        jScrollPane3.setBounds(452, 236, 36, 26);

        jList2.setBackground(new java.awt.Color(255, 255, 255));
        jList2.setForeground(new java.awt.Color(0, 0, 0));
        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane4.setViewportView(jList2);

        RegisterScreen.add(jScrollPane4);
        jScrollPane4.setBounds(494, 236, 81, 24);

        jList3.setBackground(new java.awt.Color(255, 255, 255));
        jList3.setForeground(new java.awt.Color(0, 0, 0));
        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {"2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971"};

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane5.setViewportView(jList3);

        RegisterScreen.add(jScrollPane5);
        jScrollPane5.setBounds(581, 236, 48, 24);

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Register Frame");
        RegisterScreen.add(jLabel17);
        jLabel17.setBounds(387, 19, 175, 33);

        RegisterBottun.setBackground(new java.awt.Color(153, 153, 255));
        RegisterBottun.setForeground(new java.awt.Color(0, 0, 0));
        RegisterBottun.setText("Register");
        RegisterBottun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                String firstName = FirstNameField.getText();
                String lastName = LastNameField.getText();
                String email = EmailField.getText();
                String registrationUsername = UserNameField.getText();
                String registrationPassword = new String(PasswordField.getPassword());

                // Validate input (you can customize these conditions)
                if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || registrationUsername.isEmpty() || registrationPassword.isEmpty()) {
                    JOptionPane.showMessageDialog(RegisterScreen, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                user u = new user();
                u.setFirst_name(firstName);
                u.setSecond_name(lastName);
                u.setEmail(email);
                u.setPassword(registrationPassword);
                u.setUser_name(registrationUsername);

                a.add(u);

                JOptionPane.showMessageDialog(RegisterScreen, "Registration successful!");
                RegisterScreen.setVisible(false);
                LogInScreen();
            }
        });

        RegisterScreen.add(RegisterBottun);
        RegisterBottun.setBounds(365, 408, 256, 23);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Already have account ?");
        RegisterScreen.add(jLabel18);
        jLabel18.setBounds(430, 477, 150, 16);

        LogIn_Button.setBackground(new java.awt.Color(255, 255, 255));
        LogIn_Button.setForeground(new java.awt.Color(0, 0, 0));
        LogIn_Button.setText("Log in");
        LogIn_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RegisterScreen.setVisible(false);
                LogInScreen();

            }

        });
        RegisterScreen.add(LogIn_Button);
        LogIn_Button.setBounds(361, 499, 256, 23);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Confirm Password :");
        RegisterScreen.add(jLabel19);
        jLabel19.setBounds(319, 371, 102, 16);

        ConfirmPasswordField.setBackground(new java.awt.Color(255, 255, 255));
        RegisterScreen.add(ConfirmPasswordField);
        ConfirmPasswordField.setBounds(452, 368, 169, 22);

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\OneDrive - Al Azhar University\\Desktop\\3386851.jpg")); // NOI18N
        jLabel20.setText("jLabel10");
        RegisterScreen.add(jLabel20);
        jLabel20.setBounds(0, 0, 920, 540);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RegisterScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RegisterScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        RegisterScreen.setVisible(true);
    }

    private void showtextScreen() {

    }

    private void LogInScreen() {
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        LogIn_Button = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTextArea jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 500));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oopproject/note-taking (2).png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(98, 23, 128, 128);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Welcome To");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(34, 196, 134, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Our Pad");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(138, 1192, 115, 32);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Your Pad_App");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(128, 245, 148, 32);

        jLabel7.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Log In Frame");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 50, 290, 43);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Username :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(420, 220, 80, 20);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Password :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(420, 260, 80, 20);

        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("if you dont have an account ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(300, 420, 160, 16);

        RegisterButton.setBackground(new java.awt.Color(204, 204, 204));
        RegisterButton.setForeground(new java.awt.Color(0, 0, 0));
        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jPanel1.setVisible(false);
                showRegistrationScreen();
            }
        });
        jPanel1.add(RegisterButton);
        RegisterButton.setBounds(460, 420, 120, 23);

        UsernameField.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(UsernameField);
        UsernameField.setBounds(500, 220, 250, 22);

        PasswordField.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.add(PasswordField);
        PasswordField.setBounds(500, 260, 250, 22);

        LogIn_Button.setBackground(new java.awt.Color(204, 204, 204));
        LogIn_Button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LogIn_Button.setForeground(new java.awt.Color(0, 0, 0));
        LogIn_Button.setText("Log In");
        LogIn_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = UsernameField.getText();
                String password = new String(PasswordField.getPassword());

                // Check credentials (Replace this with your authentication logic)
                if (isValidUser(username, password)) {
                    JOptionPane.showMessageDialog(loginScreen.this, "Login successful!");
//                    showtextScreen();

                } else {
                    JOptionPane.showMessageDialog(loginScreen.this, "Invalid username or password.");
                    int choice = JOptionPane.showConfirmDialog(null,
                            "Do you want to create an account?", "Choose one", JOptionPane.YES_NO_OPTION);

                    if (choice == JOptionPane.YES_OPTION) {
                        jPanel1.setVisible(false);
                        showRegistrationScreen();

                    }

                }
            }
        });
        jPanel1.add(LogIn_Button);
        LogIn_Button.setBounds(580, 340, 90, 27);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 1178, 234, 8);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(42, 234, 234, 5);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\pxfuel (1).jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(300, -10, 610, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();            // 

        setVisible(true);
    }
}
