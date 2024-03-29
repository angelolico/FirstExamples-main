package fk.onlinecasino;

public class WheelOfFortuneUseCase {
    public static void main(String[] args) {
    	
        // Create a player named "Bob" with a balance of $500
        Player player = new Player("Bob", 500);

        // Create a game wheel
        WheelOfFortune wheel = new WheelOfFortune();

        // Play until the player goes bankrupt
        while (player.getBalance() > 0) {
            // The player places a bet of $50
            player.placeBet(50);

            // The player spins the game wheel
            wheel.spin();

            // Simulate win or loss
            double result = Math.random(); // Simulate a random win/loss

            if (result < 0.5) {
                // The player loses
                System.out.println("Bad luck! " + player.getName() + " lost the round.");
            } else {
                // The player wins
                double winnings = 2 * 50; // Winnings are twice the bet amount
                player.setBalance(player.getBalance() + winnings);
                System.out.println("Congratulations! " + player.getName() + " won $" + winnings);
            }

            // Print the player's current balance
            System.out.println(player.getName() + "'s current balance: $" + player.getBalance());
            System.out.println();

            // Pause briefly to simulate a real gaming experience
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // When the player goes bankrupt
        System.out.println("Game over! " + player.getName() + " went bankrupt.");
    }
}

