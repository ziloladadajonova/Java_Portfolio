package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private static JPanel panel;
    private static JFrame frame;
    private static JLabel label;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JTextField userText;
    private static JButton button;
    private static JLabel success;

   


    public static void main(String[] args) {
        panel = new JPanel();

        frame = new JFrame();
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        label = new JLabel("User");
        label.setBounds(10, 20,80,25);
        panel.add(label);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 80,80,25);
        panel.add (passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,80,165,25);
        panel.add(passwordText);

        userText = new JTextField();
        userText.setBounds(100,20, 165,25);
        panel.add(userText);

        button = new JButton("Login");
        button.setBounds(10 ,120, 80, 25);
        button.addActionListener(new Main());

        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 160,300,25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if (user.equals("Zilola") && password.equals("qwerty")){

            success.setText("Login successful!");
        }

    }
}
