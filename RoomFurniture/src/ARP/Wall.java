package ARP;
import java.awt.Color;

public class Wall implements Structure {

	private Color insideColor;
	private Color outsideColor;

	public Wall(Color insideColor, Color outsideColor) {
		this.insideColor = insideColor;
		this.outsideColor = outsideColor;
	}

	public boolean loadBearing() {
		return false;
	}

	public void display() {
		System.out.println("Inside color of Wall: " + insideColor + " Outside color of Wall: " + outsideColor);
	}
}


