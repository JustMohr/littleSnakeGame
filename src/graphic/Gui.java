package graphic;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import game.GameControll;


public class Gui extends JFrame{
	
	public static int width = 400;
	public static int height=400;
	
	public static JLabel showText ;
	
	public static JFrame frame;
	
	public Gui() {
		frame= new JFrame();
		frame.setSize(new Dimension(650, 450));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.setLayout(null);
		
		
		PlayArea playArea= new PlayArea();
		playArea.setBounds(0,0,width,height);
		
		playArea.setLayout(null);
		playArea.setBackground(Color.LIGHT_GRAY);
		
		
		showText = new JLabel("0", SwingConstants.CENTER);
		showText.setBounds(460, 120, 50, 30);
		frame.add(showText);
		
		frame.add(playArea);
		frame.setVisible(true);
	
		frame.addKeyListener(new GameControll());
		frame.add(GameControll.btnA);
		frame.add(GameControll.btnS);
		frame.add(GameControll.btnD);
		frame.add(GameControll.btnW);
		
		frame.setFocusable(true);
		
		playArea.moveing();

	}

}