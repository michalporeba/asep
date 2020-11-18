import java.util.Observable;

/**
 * An item notifies observers when its name or price is changed.
 */
public class Item extends Observable {
	private String name;
	private double price;
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		notifyObservers();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		setChanged();
		notifyObservers();
	}
	
	public String toString() {
		return "Item [" + name + "]";
	}
}
