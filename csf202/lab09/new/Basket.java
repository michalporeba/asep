import java.util.ArrayList;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * An basket keeps a list of items. It needs to be notified when item details change.
 */
public class Basket implements PropertyChangeListener {
	private ArrayList<Item>items;
	private double totalPrice; // This should ALWAYS be the sum of the prices of all items in the basket 
	
	public Basket() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		// We can't add this item if it is already in the basket
		if (!items.contains(item)) {
			items.add(item);
			totalPrice += item.getPrice();
			item.addObserver(this);
		}
	}
	
	public void removeItem(Item item) {
		if (items.contains(item)) {
			// We have this item, so we can remove it
			items.remove(item);
			totalPrice -= item.getPrice();
			item.removeObserver(this);
		}
	}
	
	public double getTotalPrice() {
		return totalPrice;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent e) {
		if (e.getPropertyName().equals("price"))
		{
			System.out.printf("Price of " + ((Item)e.getSource()).getName() + " has changed: %.2f -> %.2f%n", e.getOldValue(), e.getNewValue());
			double change = ((double)e.getNewValue()) - ((double)e.getOldValue());

			totalPrice += change;
		}
	}
}
