package Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow(){
        setVisible(true);
        setLocation(650, 400);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1, 2));

        JButton btn1 = new JButton("Выход");
        ActionListener closeListener = new CloseActionListener();
        btn1.addActionListener(closeListener);
        panel.add(btn1);

        JButton btn2 = new JButton("Кнопка2");
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);
    }
}
