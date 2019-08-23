package ARP;
import java.awt.Color;

public class Room implements Drawable {

	private int x;
	private int y;
	private double height;
	private double width;
	Structure structure;
	Furniture furniture;

	public Room(int x, int y, double height, double width) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public void remove() {
		System.out.println("Removing.");
	}

	public void done() {
		System.out.println("Done.");
	}

	public void redraw() {
		System.out.println("Redrawing.");
	}

	public void hide() {
		System.out.println("Hiding.");
	}

	public void display() {
		System.out.println(
				"Value of X: " + x + " Value of Y: " + y + " Height of Room: " + height + " Width of Room: " + width);
	}

	public static void main(String[] args) {

		Room room = new Room(5, 6, 8.5, 9.5);
		room.display();
		room.redraw();
		room.done();
		room.remove();
		room.hide();

		Couch couch = new Couch(2.2, 3.3, Color.ORANGE, "Foam", "Wood");
		couch.display();
		couch.numSeats();

		Window window = new Window(6.0, true);
		window.display();
		window.loadBearing();
		window.close();
		window.open();
		window.isOpen();

		Wall wall = new Wall(Color.BLUE, Color.GRAY);
		wall.display();
		wall.loadBearing();
	}

}

