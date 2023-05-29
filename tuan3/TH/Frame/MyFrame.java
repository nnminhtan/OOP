package TH.Frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;


    MyFrame(){

        label = new JLabel();
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(200, 100, 100, 50);
        button.addActionListener(this);
        // button.addActionListener(e -> System.out.println("lmao"));//the same
        button.setText("Yes");
        button.setFocusable(false);//no border on text
        button.setFont(new Font("Itim", Font.BOLD , 25));
        button.setForeground(Color.blue);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource() == button){
            System.out.println("yes?");
            label.setVisible(true);
        }
    }

}
