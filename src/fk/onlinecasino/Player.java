package fk.onlinecasino;

//Player class represents a player in the casino
class Player {
 private String name;
 private double balance;

 // Constructor to initialize player with name and initial balance
 	public Player(String name, double balance) {
 		this.name = name;
 		this.balance = balance;
 	}

 	// Getter method for player's name
 	public String getName() {
 		return name;
 	}

 	// Getter method for player's balance
 	public double getBalance() {
 		return balance;
 	}

 	// Setter method to update player's balance
 	public void setBalance(double balance) {
 		this.balance = balance;
 	}

 	// Method for placing a bet
 	public void placeBet(double amount) {
 		if (amount <= balance) {
 			balance -= amount;
 			System.out.println(name + " placed a bet of " + amount);
 		} else {
 			System.out.println("Insufficient balance for " + name + " to place a bet.");
 			System.exit(0); // Terminate the program
 		}
 	}
}