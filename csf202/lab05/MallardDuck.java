public class MallardDuck extends Duck{

	public MallardDuck() {
		super(new FlyWithWings(), new Quack());
	}
	public void display()
	{
		System.out.println("Display: I look like a lovely Mallard Duck");
	}
}
