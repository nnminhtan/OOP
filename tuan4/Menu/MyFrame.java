import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import OOP.tuan4.*;

public class MyFrame implements ActionListener{
	DSHH ds = new DSHH();
	JFrame frame;
	JButton button1, button2, button3, button4 , button5 , button6, button7;

	public MyFrame() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(new BorderLayout(10,10));
		frame.setVisible(true);
		// frame.setFont(new Font("Itim", Font.PLAIN, 20));
		
	//label
		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		label1.setVisible(true);
		label2.setVisible(true);

		label1.setText("Welcome to \"Hang Hoa\" managing!");
		label1.setFont(new Font("Itim", Font.PLAIN, 20));
		label1.setBounds(0, 0, 200, 100);
		
		label2.setText("Choose a action!");
		label2.setFont(new Font("Itim", Font.PLAIN, 20));
		label2.setBounds(0, 0, 200, 100);
		label2.setLocation(0, 250);

	//panel
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.decode("#957DAD"));
		// panel1.setBackground(Color.gray);
		frame.add(panel1,BorderLayout.NORTH);
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.decode("#957DAD"));
		frame.add(panel2,BorderLayout.WEST);
		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.decode("#957DAD"));
		frame.add(panel3,BorderLayout.CENTER);
		panel3.setLayout(new GridLayout(7,1,0,10));
		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.decode("#957DAD"));
		frame.add(panel4,BorderLayout.EAST);
		
		//B28DFF C5A3FF D5AAFF ECD4FF
	//buttons
		button1 = new JButton();
		button1.setBounds(100, 100, 200, 50);
		button1.addActionListener(this);
		button1.setText("Add a \"Hang Hoa\"");
		button1.setFont(new Font("Itim", Font.PLAIN, 20));
		// button1.setBackground(Color.decode("#957DAD"));

		button2 = new JButton();
		button2.setBounds(100, 150, 200, 50);
		button2.addActionListener(this);
		button2.setText("Output \"Hang Hoa\"");
		button2.setFont(new Font("Itim", Font.PLAIN, 20));
		// button2.setBackground(Color.decode("#957DAD"));

		button3 = new JButton();
		button3.setBounds(100, 200, 200, 50);
		button3.addActionListener(this);
		button3.setText("Find a \"Hang Hoa\"");
		button3.setFont(new Font("Itim", Font.PLAIN, 20));
		// button3.setBackground(Color.decode("#957DAD"));

		button4 = new JButton();
		button4.setBounds(100, 250, 200, 50);
		button4.addActionListener(this);
		button4.setText("Delete a \"Hang Hoa\"");
		button4.setFont(new Font("Itim", Font.PLAIN, 20));
		// button4.setBackground(Color.decode("#957DAD"));

		button5 = new JButton();
		button5.setBounds(100, 300, 200, 50);
		button5.addActionListener(this);
		button5.setText("Update a \"Hang Hoa\"");
		button5.setFont(new Font("Itim", Font.PLAIN, 20));
		// button5.setBackground(Color.decode("#957DAD"));

		button6 = new JButton();
		button6.setBounds(100, 350, 200, 50);
		button6.addActionListener(this);
		button6.setText("Sort \"Hang Hoa\" list");
		button6.setFont(new Font("Itim", Font.PLAIN, 20));
		// button6.setBackground(Color.decode("#957DAD"));

		button7 = new JButton();
		button7.setBounds(100, 400, 200, 50);
		button7.addActionListener(this);
		button7.setText("Exit the menu!");
		button7.setFont(new Font("Itim", Font.PLAIN, 20));
		// button7.setBackground(Color.decode("#957DAD"));

	//setlocation
		label2.setLocation(0, 250);
		button1.setLocation(0, 0);
		button2.setLocation(0, 50);
		button3.setLocation(0, 100);
		button4.setLocation(0, 150);
		button5.setLocation(0, 200);
		button6.setLocation(0, 250);
		button7.setLocation(0, 300);
		
		



		panel1.add(label1);
		panel2.add(label2);
		panel3.add(button1);
		panel3.add(button2);
		panel3.add(button3);
		panel3.add(button4);
		panel3.add(button5);
		panel3.add(button6);
		panel3.add(button7);

		
		// JLabel label2 = new JLabel();
		// label2.setText("<html><h1>header1 text</h1></html>");
		// label2.setBounds(0, 20, 200, 50);
		// JLabel label3 = new JLabel();
		// label3.setText("<html><h2>header2 text</h2></html>");
		// label3.setBounds(0, 40, 200, 50);
		// JLabel label4 = new JLabel();
		// label4.setText("<html><h3>header3 text</h3></html>");
		// label4.setBounds(0, 60, 200, 50);
	
		// add(label1);
		// add(label2);
		// add(label3);
		// add(label4);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		if(e.getSource() == button1){
			ds.Daline();
			ds.AddaHangHoa();
			// label.setVisible(true);
		}
		if(e.getSource() == button2){
			ds.Daline();
			ds.OutputHangHoa();
		}
		if(e.getSource() == button3){
			ds.Daline();
			ds.TimKiemByMaHang();
		}
		if(e.getSource() == button4){
			ds.Daline();
			ds.OutputHangHoa();
			System.out.print("Chon ma hang ma ban muon xoa: ");
			String x = sc.next();
			// ds.Delete();
			ds.Delete(x);
			ds.OutputHangHoa();
		}
		if(e.getSource() == button5){
			ds.Daline();
			System.out.print("Chon ma hang ma ban muon cap nhat: ");
			String x = sc.next();
			ds.Update(x);
		}
		if(e.getSource() == button6){
			ds.Daline();
			ds.Sapxep();
			ds.OutputHangHoa();
		}
		if(e.getSource() == button7){
			ds.Daline();
			System.out.print("Exiting the menu now!");
			frame.dispose();
		}
	}
}