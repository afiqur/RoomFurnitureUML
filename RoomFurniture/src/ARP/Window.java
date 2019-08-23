package ARP;

public class Window implements Structure {

	private double opacity;
	private boolean isOpen;

	public Window(double opacity, boolean isOpen) {
		this.opacity = opacity;
		this.isOpen = isOpen;
	}

	public boolean loadBearing() {
		return true;
	}

	public void close() {
		System.out.println("Closed.");
	}

	public void open() {
		System.out.println("Opened.");
	}

	public boolean isOpen() {
		return true;
	}

	public void display() {
		System.out.println("Opacity if Window: " + opacity + " Condition of Window: " + isOpen);
	}

}


