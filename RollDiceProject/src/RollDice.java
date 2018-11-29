import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class RollDice {
    public static int DICENUM = 1;
    public static void main(String[] args) {
        String playAgain = "y";
        //while loop begins

        defDice();

        Scanner userInput = new Scanner(System.in);

        while(playAgain.equals("y")) {

            System.out.println("Rolling die!");

            rollDice();

            drawLine();

            //here to the end of the while loop is ending the while loop
            System.out.println("Play again? y/n");
            userInput = playAgain;
            if (playAgain = "n") {
                System.out.println("Thanks for playing!");
            }
            if ((playAgain != "y") && (playAgain != "n")) {
                System.out.println("That input was not valid. Thanks for playing!");
            }
        }


        }
    //def dice
    public static void defDice() {
        System.out.println("We are in defDice!");
    }

    //printdice
    public static void printDice() {
        System.out.println("We are in printDice!");
    }

    //roll dice
    public static void rollDice() {
        System.out.println("We are in rollDice!");
    }

    //draw line, wihch prints and returns
    public static void drawLine() {
        System.out.println("We are in drawLine!");
    }
}
