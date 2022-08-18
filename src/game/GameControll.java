package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import graphic.Gui;

public class GameControll implements KeyListener{
	
	public static boolean doupleOut=true;
	
	public static Direction dir = Direction.left;
	
	
	public static JButton btnW;
	public static JButton btnA;
	public static JButton btnS;
	public static JButton btnD;
	
	public GameControll() {
		
		btnW = new JButton("w");
		btnW.setBounds(460, 30, 50, 30);
		btnW.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				//PlayArea.arr.add(new Body());
				if(dir != Direction.down && doupleOut==true) {		
					dir=Direction.up;
					doupleOut=false;
				}
				Gui.frame.requestFocus();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnS = new JButton("S");
		btnS.setBounds(460, 70, 50, 30);
		btnS.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {

				if(dir != Direction.up && doupleOut==true) {
					dir=Direction.down;
					doupleOut=false;
				}
				Gui.frame.requestFocus();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnA = new JButton("A");
		btnA.setBounds(400, 70, 50, 30);
		btnA.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(dir != Direction.right && doupleOut==true) {
					dir=Direction.left;
					doupleOut=false;
				}
				Gui.frame.requestFocus();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		btnD = new JButton("D");
		btnD.setBounds(520, 70, 50, 30);
		btnD.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(dir != Direction.left && doupleOut==true) {
					dir=Direction.right;
					doupleOut=false;
				}
				Gui.frame.requestFocus();
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		switch(e.getKeyCode()) {
		
		case KeyEvent.VK_UP:
			if(dir != Direction.down && doupleOut==true) {		
				dir=Direction.up;
				doupleOut=false;
			}
			break;
			
		case KeyEvent.VK_DOWN:
			if(dir != Direction.up && doupleOut==true) {
				dir=Direction.down;
				doupleOut=false;
			}
			break;
			
		case KeyEvent.VK_RIGHT:
			if(dir != Direction.left && doupleOut==true) {
				dir=Direction.right;
				doupleOut=false;
			}
			break;
			
		case KeyEvent.VK_LEFT:
			if(dir != Direction.right && doupleOut==true) {
				dir=Direction.left;
				doupleOut=false;
			}
			break;
			
			
			
			
		case KeyEvent.VK_W:
			if(dir != Direction.down && doupleOut==true) {		
				dir=Direction.up;
				doupleOut=false;
			}
			break;
			
		case KeyEvent.VK_S:
			if(dir != Direction.up && doupleOut==true) {
				dir=Direction.down;
				doupleOut=false;
			}
			break;
			
		case KeyEvent.VK_D:
			if(dir != Direction.left && doupleOut==true) {
				dir=Direction.right;
				doupleOut=false;
			}
			break;
			
		case KeyEvent.VK_A:
			if(dir != Direction.right && doupleOut==true) {
				dir=Direction.left;
				doupleOut=false;
			}
			break;
		
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
