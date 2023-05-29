package TH.Frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mainframe{

	public static void main(String[] args) {

		// Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = 	places components in a row, sized at their preferred size. 
		//					If the horizontal space in the container is too small,
		//					the FlowLayout class uses the next available row.
		JLabel label = new JLabel();
		label.setText("Y u r gae ?");
		// label.setIcon(icon);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(100, 100, 75, 75);

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,10));
		
        
        JPanel titlepPanel = new JPanel();
        titlepPanel.setBackground(Color.gray);
		titlepPanel.setBounds(0, 250, 100, 100);
		titlepPanel.setLayout(new BorderLayout(100,100));
        titlepPanel.add(label);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(500,250));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());

		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
        frame.setLayout(null);
        frame.setSize(700, 700);
        frame.setVisible(true);
        frame.add(titlepPanel);
        frame.add(panel);
	}
}