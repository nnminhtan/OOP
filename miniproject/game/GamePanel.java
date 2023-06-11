package OOP.miniproject.game;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{

	static final int SCREEN_WIDTH = 1280;
	static final int SCREEN_HEIGHT = 720;
	static final int UNIT_SIZE = 50; //per box
	static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE);
	static int DELAY = 100;
	final int x[] = new int[GAME_UNITS]; //cordinates for bodyparts //[GAME_UNIT] to not let the body bigger than the game size 
	final int y[] = new int[GAME_UNITS]; //cordinates for bodyparts
	int bodyParts = 3; //initial body parts
	int applesEaten;
	int appleX; //X cordinate for spawning apples
	int appleY; //Y cordinate for spawning apples
	char direction = 'R'; //The snake begin by goin right 'U' 'D' 'L' 'R'
	boolean running = false;
	Timer timer;
	Random random;
	// JButton restartB;
	
	GamePanel(){ //constuctor
		random = new Random();
		//set size panel
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.gray);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter()); //track key movements
		startGame();
	}

	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(DELAY,this);
		timer.start();
	}

	public void gamePace(){
		//change delay of repaint speed
		if(timer.getDelay() > 10){
			System.out.println(timer.getDelay());
			// timer.setInitialDelay(DELAY);
			timer.setDelay(timer.getDelay() - 10);
			timer.restart();
		}
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}

	public void draw(Graphics g) {
		if(running) {
			//for the grids
			// for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {
			// 	g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
			// 	g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
			// }

			//set apple color
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE); //the apple circle 
			
			//body for the snek
			for(int i = 0; i< bodyParts;i++) {
				if(i == 0) {
					//head of the snek
					g.setColor(Color.green);
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
				else {
					// g.setColor(new Color(45,180,0)); //this is green
					//set randoms colors for body parts
					g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}			
			}
			g.setColor(Color.red);
			g.setFont(new Font("Itim", Font.BOLD, 40));
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: " + applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: " + applesEaten))/2, g.getFont().getSize());
		}
		else {
			gameOver(g);
		}
	}

	//paint apple
	public void newApple(){
		appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}

	public void move(){
		for(int i = bodyParts;i>0;i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		switch(direction) {
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		}
	}

	public void checkApple() {
		if((x[0] == appleX) && (y[0] == appleY)) {
			bodyParts++;
			applesEaten++;
			newApple();
			int i = applesEaten;
			// if(i == 5 || i == 10 || i == 15 || i == 20 || i == 25 || i == 30 || i == 35 || i == 40 || i == 45 || i == 50 || i == 55)
			//then exec the gamepace //which makes the game faster
			if( i % 5 == 0){
				gamePace();
			}
		}
	}

	public void checkCollisions() {
		//checks if head collides with body
		for(int i = bodyParts;i>0;i--) {
			if((x[0] == x[i]) && (y[0] == y[i])) {
				running = false;
			}
		}
		//check if head touches left border
		if(x[0] < 0) {
			running = false;
		}
		//check if head touches right border
		if(x[0] > SCREEN_WIDTH) {
			running = false;
		}
		//check if head touches top border
		if(y[0] < 0) {
			running = false;
		}
		//check if head touches bottom border
		if(y[0] > SCREEN_HEIGHT) {
			running = false;
		}
		
		if(!running) {
			timer.stop();
		}
	}

	public void gameOver(Graphics g) {
		//Score
		g.setColor(Color.red);
		g.setFont( new Font("Itim",Font.BOLD, 40));
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
		//Game Over text
		g.setColor(Color.red);
		g.setFont( new Font("Itim",Font.BOLD, 75));
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
		//restartB which is not working rn
		// restartB = new JButton();
		// restartB.setText("Restart");
		// restartB.setBounds(SCREEN_WIDTH/2, SCREEN_HEIGHT/2-100, 200, 50);
		// restartB.setFont(new Font("Itim", Font.BOLD, 20));
		// restartB.addActionListener(this);
		// add(restartB);
	}

	//paint the game
	@Override
	public void actionPerformed(ActionEvent e) {
		if(running) {
			move();
			checkApple();
			checkCollisions();
		}
		repaint();

		// if(e.getSource() == restartB){
		// 	startGame();
		// }
	}

	//keyboard listener
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if(direction != 'R') {
					direction = 'L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if(direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}
}