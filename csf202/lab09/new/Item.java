import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * An item notifies observers when its name or price is changed.
 */
public class Item {
	private String name;
	private double price;
	PropertyChangeSupport pcs = new PropertyChangeSupport(this);
	
	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void addObserver(PropertyChangeListener listener) {
		pcs.addPropertyChangeListener("price", listener);
	}
	public void removeObserver(PropertyChangeListener listener) {
		pcs.removePropertyChangeListener("price", listener);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		double old = this.price;
		this.price = price;
		pcs.firePropertyChange("price", old, price);
	}
	
	public String toString() {
		return "Item [" + name + "]";
	}
}
