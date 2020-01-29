package remote;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Wed Jan 29 09:20:20 IRST 2020
 */



public class MainPage extends JFrame {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public MainPage() {
        initComponents();
    }
    public void initial(){
        label1.setText("Hi "+username+" ;)");
    }

    private void button1ActionPerformed(ActionEvent e) {
        ChangePassword changePassword = new ChangePassword();
        changePassword.setUsername(username);
        changePassword.setVisible(true);
    }

    private void button2ActionPerformed(ActionEvent e) {
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - sina
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("change password");
        button1.addActionListener(e -> button1ActionPerformed(e));

        //---- label1 ----
        label1.setText("hi");

        //---- button2 ----
        button2.setText("Back");
        button2.addActionListener(e -> button2ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(94, 94, 94)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 303, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(111, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(39, 39, 39)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addGap(42, 42, 42))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - sina
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
