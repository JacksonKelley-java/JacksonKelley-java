import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

//this should be edited

public class RollDice {
    public static int DICENUM = 1;
    public static void main(String[] args) {
        String playAgain;
        //while loop begins

        defDice();

        System.out.println("Would you like to play? y/n");

        Scanner userInput = new Scanner(System.in);
        playAgain = userInput.next();

        while(playAgain.equals("y")) {

            System.out.println("Rolling die!");

            rollDice();

            drawLine();

            printDice();

            //here to the end of the while loop is ending the while loop
            System.out.println("Play again? y/n");

            playAgain = userInput.next();

            }
        }


    //def dice
    public static void defDice() {
        System.out.println("We are in defDice!");

        String dice[][]= new String[6][5];

        String topAndBottom = " ------- ";
        String blank ="|      |";
        String oneStar = "|   *   |";
        String twoStars ="| *   * |";
        String upperLeft = "| *     |";
        String bottomRight = "|     * |";

        for(int i = 0; i <= dice.length-1; i++){
            
        }
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
