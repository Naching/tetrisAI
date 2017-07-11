package tetrisAI;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TetrisListener implements KeyListener{
	TetrisBoard target;
	TetrisListener(TetrisBoard board){
		target=board;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}

	
}
