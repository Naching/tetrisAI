package tetrisAI;

import java.awt.Dimension;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;



public class TetrisBoard extends JComponent{
	JFrame frame;
	int x, y;
	Timer t;
	public TetrisBoard(){
		this(300,600);
	}
	public TetrisBoard(int x, int y){
		this.x=x;
		this.y=y;
		frame = new JFrame("Tetris");
		frame.add(this);
		frame.pack();
		frame.addKeyListener(new TetrisListener(this));
	}
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(x,y);
	}
	public void setVisible(boolean vis){
		frame.setVisible(vis);
	}
	public void leftPress(){
		
	}
	public void rightPress(){
		
	}
	public void upPress(){
		
	}
	public void downPress(){
		
	}
	public void spacePress(){
		
	}
	
}
