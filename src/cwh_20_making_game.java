 //this code for making game

import java.util.Random;
import java.util.Scanner;


public class cwh_20_making_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Stone");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Quit");

            int userChoice = scanner.nextInt();

            if (userChoice == 4) {
                System.out.println("Thanks for playing. Exiting the game!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                continue;
            }

            String[] choices = {"Stone", "Paper", "Scissors"};
            int computerChoice = random.nextInt(3) + 1;

            System.out.println("Your choice: " + choices[userChoice - 1]);
            System.out.println("Computer's choice: " + choices[computerChoice - 1]);

            int result = determineWinner(userChoice, computerChoice);
            if (result == 0) {
                System.out.println("It's a tie!");
            } else if (result == 1) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }

    private static int determineWinner(int userChoice, int computerChoice) {
        // Returns 0 for a tie, 1 for user win, and 2 for computer win
        if (userChoice == computerChoice) {
            return 0; // Tie
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            return 1; // User wins
        } else {
            return 2; // Computer wins
        }
    }
}