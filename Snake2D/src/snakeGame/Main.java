package snakeGame;

import java.awt.Color;

import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Snake Game");
		f.setBounds(10, 10, 905, 700);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gamePanel = new GamePanel();
		gamePanel.setBackground(Color.DARK_GRAY);
		f.add(gamePanel);

		f.setVisible(true);
	}
}
