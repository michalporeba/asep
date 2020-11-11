import javax.naming.OperationNotSupportedException;

public abstract class Graphic {
    public abstract void draw();
    public void add(Graphic g) throws Exception {
        throw new OperationNotSupportedException();
    }
    public void remove(Graphic g) throws Exception {
        throw new OperationNotSupportedException();
    }
    public Graphic getChild(int index) throws Exception {
        throw new OperationNotSupportedException();
    }
}
