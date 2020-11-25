import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;

public class BirdView extends JFrame implements Observer {
    private BirdCounter birdCounter;
    private ImageIcon icon;
    private JLabel label;

    public BirdView(Controller controller) {
        birdCounter = controller.getBirdCounter();
        birdCounter.addObserver(this);    

        this.setTitle("Bird Counter - Bird Viewer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(200, 200);
        this.setLocation(200, 2500);

        try {
            BufferedImage img = ImageIO.read(new File("../" + birdCounter.getBirdFileName()));
            icon = new ImageIcon(img);
            label = new JLabel();
            label.setIcon(icon);
            this.add(label);
        } catch (Exception ex) {

        }
        this.setVisible(true);
    }

    public void update(Observable o, Object arg) {
        try {
            BufferedImage img = ImageIO.read(new File("../" + birdCounter.getBirdFileName()));
            icon = new ImageIcon(img);
            label.setIcon(icon);
        } catch (Exception ex) {
            System.out.println("Unable to change picture to " + birdCounter.getBirdFileName());
        }
    }
}
