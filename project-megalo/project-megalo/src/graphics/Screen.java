package graphics;
import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import org.lwjgl.opengl.Display;
/**
 * 
 * @author Andre Alves
 *
 */
public class Screen {
	private int height, width;
	private String name;
	private JFrame frame;
	private List<Panel> panel;
	public Screen(int height, int width, String name) {
		this.height = height;
		this.width = width;
		this.name = name;
		this.panel = new ArrayList<Panel>();
		//JFrame creation
		try {
			this.frame = new JFrame(this.name);
                        Display.setDisplayMode(new DisplayMode(width, height));
                        Display.create();
		}
		catch(Exception e) {e.printStackTrace();}
		//Setting up the JFrame
		this.frame.setSize(width, height);
	}
	
	public void visible(boolean b) {
		this.frame.setVisible(b);
	}
	
}
