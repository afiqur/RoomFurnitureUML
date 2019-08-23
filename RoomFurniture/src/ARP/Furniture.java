package ARP;
import java.awt.Color;

public class Furniture {
	private double height;
	private double width;
	private Color color;

	public Furniture(double height, double width, Color color) {
		this.height = height;
		this.width = width;
		this.color = color;
	}

	public void getType() {
		System.out.println(
				"Height of Furniture: " + height + " Width of Furniture: " + width + " Furniture Color: " + color);
	}

}


