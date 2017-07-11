package tetrisAI;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class TetrisBoard extends JComponent implements ActionListener{
	private enum Movements{
		RIGHT, LEFT, UP, DOWN
	}
	ArrayList<Movements> moveQueue;
	JFrame frame;
	int x, y;
	Timer t;
	public TetrisBoard(){
		this(300,600);
	}
	public TetrisBoard(int x, int y){
		this.x=x;
		this.y=y;
		moveQueue = new ArrayList<Movements>();
		frame = new JFrame("Tetris");
		frame.add(this);
		frame.pack();
		t = new Timer(20, this);
		frame.addKeyListener(new TetrisListener(this));
	}
	@Override
	public Dimension getPreferredSize(){
		return new Dimension(x,y);
	}
	public void setFrameVisible(boolean vis){
		frame.setVisible(vis);
	}
	public void leftPress(){
		moveQueue.add(Movements.LEFT);
	}
	public void rightPress(){
		moveQueue.add(Movements.RIGHT);
	}
	public void upPress(){
		moveQueue.add(Movements.UP);

	}
	public void downPress(){
		moveQueue.add(Movements.DOWN);
	}
	public void spacePress(){

	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		
	}
	
}
