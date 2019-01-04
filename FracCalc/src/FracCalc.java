import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input? To begin, type Start.");
        String input = userInput.next();

        while ((!input.equals("quit"))) {
            System.out.println("Enter 3 words of input. Enter quit to exit.");
            Scanner threeTokens = new Scanner(System.in);
            System.out.println(threeTokens.next());
            System.out.println(threeTokens.next());
            System.out.println(threeTokens.next());
            System.out.println("Play Again?");
            input = userInput.next();
            if (input.equals("quit")) {
                System.out.println("Thanks for coming, but the program has finished.");
            }


        }
    }
}