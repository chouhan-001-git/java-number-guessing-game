import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100.");

        while (guess != secretNumber) {
            System.out.println("Enter your guess: ");

            if(!scanner.hasNextInt()){
                System.out.println("Invalid input! Enter an Integer.");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();

            if(guess < 1 || guess > 100){
                System.out.println("Enter a number between 1 and 100.");
                continue;
            }

            attempts++;

            if(guess < secretNumber){
                System.out.println("Too low! Try again.");
            }else if(guess > secretNumber){
                System.out.println("Too high! Try again.");
            }else {
                System.out.println("Correct! You won.");
                System.out.println("Total Attempts: " + attempts);
            }
        }
        scanner.close();
    }
}
