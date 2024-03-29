package fk.onlinecasino;
import java.util.Random;

public class Roulette  {
private Random random;

	// Constructor to initialize Roulette object
	public Roulette() {
		random = new Random();
	}

	// Method to simulate betting on Roulette and determining outcome
	public boolean bet() {
		return random.nextBoolean(); // Returns true for win, false for lose
	}
}
