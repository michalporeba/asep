import java.awt.FlowLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

/**
 * The view for a fancy view of the model.
 */
public class FancyButtonView extends JFrame implements Observer {
	private BirdCounter birdCounter;
	
	private JButton bluetitsButton;
	private JButton pigeonsButton;
	private JButton robinsButton;
	private JButton sparrowsButton;
	private JButton ducksButton;
	private JButton errorsButton;
	
	/**
	 * Create the fancy button view.
	 * @param textController We need the controller so we can register the callbacks on various button clicks.
	 */
	public FancyButtonView(Controller controller) {
		this.birdCounter = controller.getBirdCounter();
		this.birdCounter.addObserver(this);
		
		this.setTitle("Bird Counter - Fancy Button View");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setLocation(200,2750);
		
		ImageIcon bluetitIcon = new ImageIcon("../Bluetit.jpg");
		String bluetitsLabel = Integer.toString(birdCounter.getBluetits());
		bluetitsButton = new JButton(bluetitsLabel, bluetitIcon);
		bluetitsButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		bluetitsButton.setHorizontalTextPosition(SwingConstants.CENTER);
		bluetitsButton.setActionCommand("INC_BLUETITS");
		bluetitsButton.addActionListener(controller);
		this.add(bluetitsButton);

		ImageIcon pigeonIcon = new ImageIcon("../Pigeon.jpg");
		String pigeonsLabel = Integer.toString(birdCounter.getPigeons());
		pigeonsButton = new JButton(pigeonsLabel, pigeonIcon);
		pigeonsButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		pigeonsButton.setHorizontalTextPosition(SwingConstants.CENTER);
		pigeonsButton.setActionCommand("INC_PIGEONS");
		pigeonsButton.addActionListener(controller);
		this.add(pigeonsButton);
		
		ImageIcon robinIcon = new ImageIcon("../Robin.jpg");
		String robinsLabel = Integer.toString(birdCounter.getRobins());
		robinsButton = new JButton(robinsLabel, robinIcon);
		robinsButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		robinsButton.setHorizontalTextPosition(SwingConstants.CENTER);
		robinsButton.setActionCommand("INC_ROBINS");
		robinsButton.addActionListener(controller);
		this.add(robinsButton);
		
		ImageIcon sparrowIcon = new ImageIcon("../Sparrow.jpg");
		String sparrowLabel = Integer.toString(birdCounter.getSparrows());
		sparrowsButton = new JButton(sparrowLabel, sparrowIcon);
		sparrowsButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		sparrowsButton.setHorizontalTextPosition(SwingConstants.CENTER);
		sparrowsButton.setActionCommand("INC_SPARROWS");
		sparrowsButton.addActionListener(controller);
		this.add(sparrowsButton);
		
		ImageIcon duckIcon = new ImageIcon("../duck.jpg");
		String duckLabel = Integer.toString(birdCounter.getDucks());
		ducksButton = new JButton(duckLabel, duckIcon);
		ducksButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		ducksButton.setHorizontalTextPosition(SwingConstants.CENTER);
		ducksButton.setActionCommand("INC_DUCKS");
		ducksButton.addActionListener(controller);
		this.add(ducksButton);
		
		ImageIcon errorIcon = new ImageIcon("../Error.png");
		String errorLabel = Integer.toString(birdCounter.getErrors());
		errorsButton = new JButton(errorLabel, errorIcon);
		errorsButton.setVerticalTextPosition(SwingConstants.BOTTOM);
		errorsButton.setHorizontalTextPosition(SwingConstants.CENTER);
		errorsButton.setActionCommand("INC_DUCKS");
		errorsButton.addActionListener(controller);
		this.add(errorsButton);

		this.pack();
		this.setVisible(true);
	}
	
	/**
	 * This method will get called when the bird counter changes (observer pattern).
	  @param o The BirdCounter model that changed. As we only observe one BirdCounter we know that our instance variable birdCounter caused this.
	  @param arg Not used.
	 */
	public void update(Observable o, Object arg) {
		bluetitsButton.setText(Integer.toString(birdCounter.getBluetits()));
		pigeonsButton.setText(Integer.toString(birdCounter.getPigeons()));
		robinsButton.setText(Integer.toString(birdCounter.getRobins()));
		sparrowsButton.setText(Integer.toString(birdCounter.getSparrows()));
		ducksButton.setText(Integer.toString(birdCounter.getDucks()));
		errorsButton.setText(Integer.toString(birdCounter.getErrors()));
	}
}
