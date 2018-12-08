import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/*
Jackson kelley
Mrs. Transue
AP CS A
Roll Dice Project
12/8/18
 */

public class RollDice {
    public static int DICENUM = 1;
    public static void main(String[] args) {
        String playAgain;

        System.out.println("Would you like to play? y/n");

        Scanner userInput = new Scanner(System.in);
        playAgain = userInput.next();

        while(playAgain.equals("y")) {

            for (int i = 0; i < DICENUM; i++) {
                printDice();
            }
            drawLine();

            //here to the end of the while loop is ending the while loop
            System.out.println("Play again? y/n");

            playAgain = userInput.next();

            }
        }


    //def dice
    public static String[][] defDice() {

        String dice[][]= new String[5][6];

        String topAndBottom[] = {" ------- "," ------- "," ------- "," ------- "," ------- "," ------- "};
        String topMiddle[] = {"|       |", "| *     |","| *     |","| *   * |","| *   * |","| *   * |"};
        String middleSection[] = {"|   *   |","|       |","|   *   |","|       |","|   *   |","| *   * |"};
        String bottomMiddle[] = {"|       |","|     * |","|     * |","| *   * |","| *   * |","| *   * |"};

        dice[0] = topAndBottom;
        dice[1] = topMiddle;
        dice[2] = middleSection;
        dice[3] = bottomMiddle;
        dice[4] = topAndBottom;

        return (dice);

    }

    //printdice
    public static void printDice() {
        String dice[][] = defDice();
        int roll = rollDice();
        System.out.println(roll);
        for(int i = 0; i < 5; i++) {
            System.out.println(dice[i][roll-1]);
        }
    }

    //roll dice
    public static int rollDice() {
        Random rollDie = new Random();
        int result = rollDie.nextInt (6) +1;
        return result;

    }

    //draw line, wihch prints and returns
    public static void drawLine() {
        System.out.println("------------");
    }
}
