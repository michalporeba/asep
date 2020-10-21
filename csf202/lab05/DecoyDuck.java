public class DecoyDuck extends Duck{

	public DecoyDuck() {
		super(new FlyNoWay(), new MuteQuack());
	}

	public void display()
	{
		System.out.println("Display: I only look like a duck!");
	}
}
