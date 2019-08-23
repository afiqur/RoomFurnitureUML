package ARP;
import java.awt.Color;

public class Couch extends Furniture {
	private String type;
	private String material;

	public Couch(double height, double width, Color color, String type, String material) {
		super(height, width, color);
		this.type = type;
		this.material = material;
	}

	public int numSeats() {
		return 0;
	}

	public void display() {
		super.getType();
		System.out.println("Type of Couch: " + type + " Material of Couch: " + material);
	}
}

