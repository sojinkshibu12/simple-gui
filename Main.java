package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.desktop.QuitEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class gui implements ActionListener {

    JFrame j = new JFrame();
    JLabel l = new JLabel();
    JLabel s = new JLabel();
    JTextField g = new JTextField();
    JLabel n = new JLabel();

    JButton b = new JButton("Next");
    gui(){



        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setResizable(false);
        j.setSize(400,300);
        j.setTitle("login");
        j.setLayout(null);
        j.add(l);
        j.add(s);
        j.add(g);
        j.add(b);
        j.add(n);

        l.setText("login");
        l.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        l.setBounds(150,0,50,50);

        s.setText("password");
        s.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        s.setBounds(50,40,100,100);

        g.setBounds(150,75,200,40);
        g.setVisible(true);

        g.setFont(new Font("Comic Sans MS",Font.PLAIN,25));

        b.setBounds(130,200,100,50);
        b.addActionListener(this);

        n.setBounds(160 ,120,200,40);
        n.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
        n.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = g.getText();
        if (e.getSource() == b){
            if (s.equals("password")){
                    n.setText("Login Succesfull !!!");
            }
            else{
                n.setText("try again");
            }
        }
    }
}
public class Main {

    public static void main(String[] args) {
	    gui n = new gui();
    }
}
