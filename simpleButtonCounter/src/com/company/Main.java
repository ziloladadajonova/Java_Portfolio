package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    int count = 0;

    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public Main()
    {
            frame = new JFrame();

            button = new JButton("Click me");
            button.addActionListener((ActionListener) this);

            label = new JLabel("Number of clicks: 0");

            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
            panel.setLayout(new GridLayout(0,1));
            panel.add(button);
            panel.add(label);

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("MY GUI");
            frame.pack();
            frame.setVisible(true);




    }
    public static void main(String[] args) {
    new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    count++;
    label.setText("Number of clicks: " + count);
    }
}
