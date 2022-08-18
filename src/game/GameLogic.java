package game;

import graphic.Gui;
import graphic.PlayArea;

public class GameLogic {
	
	static int headX;
	static int headY;

	public static void main(String[] args) {
		
		new Gui();

	}
	
	public static boolean eat() {	
		headX = PlayArea.arr.get(0).getX();
		headY = PlayArea.arr.get(0).getY();
		if(PlayArea.apple.getX() == headX && PlayArea.apple.getY() == headY) {
			return true;
		}
		
		return false;
	}
	
	public static boolean collision() {
		headX = PlayArea.arr.get(0).getX();
		headY = PlayArea.arr.get(0).getY();
		
		for(int i=1; i<PlayArea.arr.size(); i++) {
			
			if(PlayArea.arr.get(i).getX()==headX && PlayArea.arr.get(i).getY()==headY)
				return true;
		}
		
		if((headX <=0 || headX>=400) || (headY <0 || headY>=400))
			return true;
		
		return false;
	}

}
