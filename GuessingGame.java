import java.util.Random;
import java.util.Scanner;
class GuessingGame{
    public static void main(String[]args){
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100)+1;
        Scanner scan = new Scanner(System.in);
        int attempts = 0;
        System.out.println("Welcome to the number guessing game");
        System.out.println("guessing the number between 1 and 100");
        while(true){
            System.out.print("Enter your guess:");
            int userGuess = scan.nextInt();
            if(userGuess<1||userGuess>100){
                System.out.println("Invalid guess.Please enter anumber between 1 and 100");
                continue;
            }
            attempts++;
            if(userGuess == numberToGuess){
                System.out.println("You guessed the number in" +attempts+"attempts");
                break;
            }
                else if(userGuess<numberToGuess){
                    System.out.println("Higher!");
                }
                else {
                    System.out.println("Lower!");
            }
        }
        scan.close();
        System.out.println("playing");
    }
}