package OOP.miniproject.game;

import javax.swing.JFrame;

public class GameFrame extends JFrame{
	//constructor
    GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);//set the window to the middle of the screen
	}
}
