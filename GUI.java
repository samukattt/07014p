package NameGUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
    private JButton button = new JButton("Нажми");
    private JTextField input = new JTextField("",20);
    private JLabel label = new JLabel("Как тебя зовут?");
    private JRadioButton r1 = new JRadioButton("муж");
    private JRadioButton r2 = new JRadioButton("жен");
    private JCheckBox check = new JCheckBox("Проверка", false);

    public GUI () {
        super("Привет, незнакомец!");
        this.setBounds(300, 300, 550, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        container.add(label);
        container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        container.add(r1);
        r1.setSelected(true);
        container.add(r2);
        container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String hello = "";
            hello += ("Привет, " + input.getText() + "!" + "\n");
            hello += (r1.isSelected() ? "Ты классный!" : "Ты классная!" + "\n");
            hello += "Проверка " + ((check.isSelected()) ? "пройдена" : "не пройдена");
            JOptionPane.showMessageDialog(null, hello, "Выход", JOptionPane.PLAIN_MESSAGE );
            setLocationRelativeTo(null);
        }
    }
}
