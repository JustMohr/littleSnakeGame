package graphic;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

import game.Direction;
import game.GameControll;
import game.GameLogic;
import snake.Apple;
import snake.Body;
import snake.Head;

public class PlayArea extends JPanel {
	
	public static JPanel apple;
	
	int boxX = 40;
	int boxY = 40;
	
	int moveDirX=0;
	int moveDirY=0;
	
	int eatPoints=0;
	
	public static ArrayList<JPanel> arr= new ArrayList<>(); 
	
	public PlayArea() {
		
		apple = new Apple();
		
		arr.add(new Head());
		
		
		for(int i=0; i<arr.size(); i++)
			this.add(arr.get(i));
		this.add(apple);
	}
	
	public void moveing() {
		
		int randomPositionX =((int)(Math.random() * 10)) *boxX;
		int randomPositionY =((int)(Math.random() * 10)) *boxY;
		System.out.println(randomPositionX +"	"+randomPositionY);
		apple.setLocation(randomPositionX, randomPositionY);
		
		
		arr.get(0).setLocation(5*boxX, 5*boxY);
		
		while(true){
			
			switch(GameControll.dir) {
			
			case up:
				moveDirX=0;
				moveDirY=-boxY;
				break;
				
			case down:
				moveDirX=0;
				moveDirY=boxY;
				break;
				
			case left:
				moveDirX=-boxX;
				moveDirY=0;
				break;
				
			case right:
				moveDirX=boxX;
				moveDirY=0;
				break;
				
			}
			
			for(int i=arr.size()-1; i>0; i--) {
				
				arr.get(i).move(arr.get(i-1).getX(), arr.get(i-1).getY());
			}
			
			arr.get(0).setLocation(arr.get(0).getX()+moveDirX, arr.get(0).getY()+moveDirY);
				
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			GameControll.doupleOut=true;
			
			if(GameLogic.collision()) {
				arr.clear();
				System.out.println("collision");
				break;
			}
			
			if(GameLogic.eat()) {
				randomPositionX =((int)(Math.random() * 9)+1) *boxX;
				randomPositionY =((int)(Math.random() * 9)+1) *boxY;
				System.out.println(randomPositionX +"	"+randomPositionY);
				apple.setLocation(randomPositionX, randomPositionY);
				
				arr.add(new Body());
				
				eatPoints++;
				Gui.showText.setText(String.valueOf(eatPoints));
			}
			
			
			for(int i=0; i<arr.size(); i++)
				this.add(arr.get(i));
			this.add(apple);
		}
		
		this.removeAll();
		this.repaint();
		
		eatPoints=0;
		Gui.showText.setText(String.valueOf(eatPoints));
		
		GameControll.dir = Direction.left;
		
		apple = new Apple();
		
		arr.add(new Head());
		
		
		for(int i=0; i<arr.size(); i++)
			this.add(arr.get(i));
		this.add(apple);
		
		moveing();
		repaint();
		
	}

}
