package graphics;
import javax.swing.*;

/**
 * 
 * @author André Alves
 *
 */
public class Screen {
	private int height, width;
	private String name;
	private JFrame frame;
	public Screen(int height, int width, String name) {
		this.height = height;
		this.width = width;
		this.name = name;
		//JFrame creation
		try {
			this.frame = new JFrame(this.name);
		}
		catch(Exception e) {e.printStackTrace();}
		//Setting up the JFrame
		this.frame.setSize(width, height);
	}
	
	public void visible(boolean b) {
		this.frame.setVisible(b);
	}
	
}
