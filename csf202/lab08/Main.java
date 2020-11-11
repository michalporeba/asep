public class Main {
    public static void main(String args[]) throws Exception {
        var picture = new Picture();
        picture.add(new Line());
        picture.add(new Circle());
        picture.add(new Rectangle());

        picture.draw();
        System.out.println();

        var minipicture = new Picture();
        minipicture.add(new Line());
        picture.add(minipicture);

        picture.draw();
        System.out.println();
        
        picture.remove(minipicture);

        picture.draw();
        System.out.println();
    }
}
