package NameGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sum extends JFrame {
    private JLabel label1 = new JLabel("Число 1:");
    private JTextField field1 = new JTextField(10);
    private JLabel label2 = new JLabel("Число 2:");
    private JTextField field2 = new JTextField(10);
    private JLabel label3 = new JLabel("Сумма:");
    private JTextField result = new JTextField(10);
    private JButton go = new JButton("Сложить");

    public Sum() {
        super("Сумма 2 чисел");
        this.setBounds(100, 100, 250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,2));

        container.add(label1);
        container.add(field1);
        container.add(label2);
        container.add(field2);
        container.add(label3);
        container.add(result);
        container.add(go);

        go.addActionListener(new Sum.ButtonEvent());

    }
    class ButtonEvent implements ActionListener{
        public void actionPerformed (ActionEvent e) {
            Integer summa = Integer.parseInt(field1.getText()) + Integer.parseInt(field2.getText());
            result.setText(summa.toString());
            setLocationRelativeTo(null);
        }
    }
}

