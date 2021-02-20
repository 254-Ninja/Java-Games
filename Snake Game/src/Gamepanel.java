import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Gamepanel extends JPanel implements Runnable{
	
	
	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 500, HEIGHT = 500;
	

	public Gamepanel() {
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
				
	}
	
	public void start() {		
		
	}
	public void stop() {
		
	}
	public void tick() {
		
	}
	public void point(Graphics g) {
		
		for (int i = 0; i < WIDTH / 10; i++) {
            g.drawLine(i * 10, 0, i * 10, HEIGHT);
        }
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
