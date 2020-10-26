public abstract class Duck{
	
	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;

	protected Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
		this.flyBehaviour = flyBehaviour;
		this.quackBehaviour = quackBehaviour;
	}

	// Default fly method 
	public void fly()
	{
		if (null!=flyBehaviour)
			flyBehaviour.fly();
	}

	public void quack()
	{
		if (null!=quackBehaviour)
			quackBehaviour.quack();
	}


	public abstract void display();
}
