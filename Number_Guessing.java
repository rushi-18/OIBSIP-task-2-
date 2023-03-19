import java.util.Scanner;
import java.util.Random;

public class Number_Guessing {
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);
        String play = "yes";
        //System.out.println("Do you want to start the play");

        while(play.equals("yes")){

            Random rand = new Random();
            int randNum = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            while (guess != randNum) {
                System.out.println("Guessing a number between 1 & 100:");
                guess = reader.nextInt();
                tries++;

                if(guess == randNum){
                    System.out.println("Awesome! You Guessed the number Correctly");
                    System.out.println("It only took you " + tries + " guesses!");
                    System.out.println("Would you like to play again? yes or no");
                    play = reader.next().toLowerCase();
                }
                else if(guess > randNum){
                    System.out.println("Your guess is too high, try again");
                }
                else{
                    System.out.println("Your guess is too Low, try again");
                }
            }
        }
        reader.close();
    }
}
