import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The controller for all views.
 */
public class Controller implements ActionListener {
	private BirdCounter birdCounter;
	private TextView textView1;
	private FancyButtonView fancyButtonView1;
	private BirdView birdView;
	
	/**
	 * Construct a new controller for our bird counting system. 
	 */
	public Controller() {
		this.birdCounter = new BirdCounter();
		this.textView1 = new TextView(this);
		this.fancyButtonView1 = new FancyButtonView(this);
		this.birdView = new BirdView(this);
	}
	
	/**
	 * Get the model.
	 * @return The bird counter model.
	 */
	public BirdCounter getBirdCounter() {
		return this.birdCounter;
	}

	/**
	 * Gets called when buttons are clicked.
	 * @param e The action event that generated this method call.
	 * e will have set an appropriate string in its ActionCommand which action should happen.
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("INC_BLUETITS")) {
			this.birdCounter.incBluetits();
		} else if (e.getActionCommand().equals("INC_PIGEONS")) {
			this.birdCounter.incPigeons();
		} else if (e.getActionCommand().equals("INC_ROBINS")) {
			this.birdCounter.incRobins();
		} else if (e.getActionCommand().equals("INC_SPARROWS")) {
			this.birdCounter.incSparrows();
		} else if (e.getActionCommand().equals("INC_DUCKS")) {
			this.birdCounter.incDucks();
		} else {
			throw new UnsupportedOperationException("The command " + e.getActionCommand() + " was not recognised");
		}
	}
}
