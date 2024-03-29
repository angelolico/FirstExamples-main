package fk.onlinecasino;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.print("Enter your initial balance: ");
        double initialBalance = scanner.nextDouble();

        Player player = new Player(playerName, initialBalance);
        WheelOfFortune wheel = new WheelOfFortune();
        Roulette roulette = new Roulette();

        boolean playAgain = true;

        while (playAgain) {
            // Display menu options
            System.out.println("\nChoose an option:");
            System.out.println("1. Check account balance");
            System.out.println("2. Play Wheel of Fortune");
            System.out.println("3. Play Roulette");
            System.out.println("4. Quit");

            // Prompt user to choose an option
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Your account balance is: " + player.getBalance());
                    break;
                case 2:
                    playWheelOfFortune(player, wheel, scanner);
                    break;
                case 3:
                    playRoulette(player, roulette, scanner);
                    break;
                case 4:
                    playAgain = false;
                    System.out.println("Thank you for playing!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }

        scanner.close();
    }

    private static void playWheelOfFortune(Player player, WheelOfFortune wheelOfFortune, Scanner scanner) {
        // Implement the logic to play Wheel of Fortune
        System.out.println(player.getName() + " starts playing Wheel of Fortune...");
        System.out.print("Enter your bid amount: ");
        double bidAmount = scanner.nextDouble();
        player.placeBet(bidAmount); // Player places a bet
        boolean wheelResult = wheelOfFortune.spin(); // Wheel of Fortune is spun
        if (wheelResult) {
            player.setBalance(player.getBalance() + bidAmount); // Player wins
            System.out.println("Congratulations! " + player.getName() + " wins.");
        } else {
            System.out.println("Sorry, " + player.getName() + " loses.");
        }
    }

    private static void playRoulette(Player player, Roulette roulette, Scanner scanner) {
        // Implement the logic to play Roulette
        System.out.println(player.getName() + " starts playing Roulette...");
        System.out.print("Enter your bid amount: ");
        double bidAmount = scanner.nextDouble();
        player.placeBet(bidAmount); // Player places a bet
        boolean rouletteResult = roulette.bet(); // Player makes a bet
        if (rouletteResult) {
            player.setBalance(player.getBalance() + bidAmount); // Player wins
            System.out.println("Congratulations! " + player.getName() + " wins.");
        } else {
            System.out.println("Sorry, " + player.getName() + " loses.");
        }
    }
}