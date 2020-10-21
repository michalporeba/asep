public class RubberDuck extends Duck{

	public RubberDuck() {
		super(new FlyNoWay(), new Squeak());
	}
	
	public void display()
	{
		System.out.println("Display: I look like a majestic yellow plastic duck.");
	}
}
