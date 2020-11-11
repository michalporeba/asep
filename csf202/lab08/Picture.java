import java.util.ArrayList;
import java.util.List;

public class Picture extends Graphic {
    private final List<Graphic> children = new ArrayList<Graphic>();

    public void draw() {
        System.out.print("<");
        for(var g : children) {
            g.draw();
        }
        System.out.print(">");
    }

    @Override
    public void add(Graphic g) throws Exception { 
        children.add(g);
    }

    @Override
    public void remove(Graphic g) throws Exception {
        children.remove(g);
    }

    @Override
    public Graphic getChild(int index) throws Exception { 
        return children.get(index);
    }
}
