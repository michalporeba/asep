import java.util.Observable;

/**
 * The model. This records the current count of bird sightings.
 *  Each bird count can only be incremented and read.
 *  All counts can be simultaneously reset.
 *  
 *  This is an observable object. It will notify all observers when it is changed.
 */
public class BirdCounter extends Observable {
	private int bluetits;
	private int pigeons;
	private int robins;
	private int sparrows;
	private int mistakes;
	private int ducks;
	private Bird currentBird;
	private Bird[] birds = new Bird[] {
		new Bird("Bluetit", "Bluetit.jpg"),
		new Bird("Duck", "duck.jpg"),
		new Bird("Pigeon", "Pigeon.jpg")
	};
	
	public BirdCounter() {
		changeBird();
		resetCounts();
	}
	
	public void resetCounts() {
		bluetits = 0;
		robins = 0;
		pigeons = 0;
		sparrows = 0;
		mistakes = 0;
		ducks = 0;
		setChanged();
		notifyObservers();
	}
	
	public void incBluetits() {
		if (currentBird.getName().equals("Bluetit")) {
			bluetits++;
		} else {
			mistakes++;
		}
		changeBird();
		setChanged();
		notifyObservers();
	}
	
	public void incDucks() {
		if (currentBird.getName().equals("Duck")) {
			ducks++;
		} else {
			mistakes++;
		}
		changeBird();
		setChanged();
		notifyObservers();
	}

	public void incPigeons() {
		if (currentBird.getName().equals("Pigeon")) {
			pigeons++;
		} else {
			mistakes++;
		}
		changeBird();
		setChanged();
		notifyObservers();
	}
	
	public void incRobins() {
		if (currentBird.getName().equals("Robin")) {
			robins++;
		} else {
			mistakes++;
		}
		changeBird();
		setChanged();
		notifyObservers();
	}
	
	public void incSparrows() {
		if (currentBird.getName().equals("Sparrow")) {
			sparrows++;
		} else {
			mistakes++;
		}
		changeBird();
		setChanged();
		notifyObservers();
	}
	
	public int getMistakes() {
		return mistakes;
	}

	public int getBluetits() {
		return bluetits;
	}

	public int getDucks() {
		return ducks;
	}

	public int getPigeons() {
		return pigeons;
	}
	
	public int getRobins() {
		return robins;
	}
	
	public int getSparrows() {
		return sparrows;
	}

	public int getErrors() {
		return mistakes;
	}

	public String getBirdFileName() {
		return currentBird.getFileName();
	}

	private Bird nextBird() {
		int i = (int)(Math.random()*birds.length);
		return birds[i];
	}

	private void changeBird() {
		currentBird = nextBird();
		System.out.println("Current bird is: " + currentBird.getName());
	}

	public class Bird {
		private String name;
		private String fileName;

		public Bird(String name, String fileName) {
			this.name = name;
			this.fileName = fileName;
		}

		public String getName() {
			return name;
		}

		public String getFileName() {
			return fileName;
		}
	}
}
