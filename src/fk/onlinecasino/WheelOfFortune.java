package fk.onlinecasino;
import java.util.Random;

class WheelOfFortune {
private Random random;

	// Constructor to initialize WheelOfFortune object
	public WheelOfFortune() {
		random = new Random();
	}

	// Method to simulate spinning the wheel and determining outcome
	public boolean spin() {
		return random.nextBoolean(); // Returns true for win, false for lose
	}	
}


