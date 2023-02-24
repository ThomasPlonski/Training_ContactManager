import java.util.Scanner;

public class GuessTheNumberGame {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100 +1);
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");

        Scanner scanner = new Scanner(System.in);
        for (int i =10 ; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left.");

            int guess = scanner.nextInt();
            System.out.println("Your guess was: " + guess);

            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + " guess.");
            } else if (randomNumber > guess) {
                System.out.println("It's larger than " + guess + " guess.");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.printf("YOU WIN - the number is -> " + randomNumber);
        } else {
            System.out.printf("GAME OVER - you loose - you didn't make it to guess!");
            System.out.printf("The number was : " + randomNumber);
        }


    }

}
