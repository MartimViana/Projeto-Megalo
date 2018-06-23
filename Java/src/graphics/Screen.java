package graphics;
import org.lwjgl.*;
public class Screen {
	private int weight, height;
	private String name;
	public Screen(String name, int weight, int height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		
		try {
			Display.setDisplayMode(weight, height);
		}
	}
}
