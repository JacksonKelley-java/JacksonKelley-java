/*
***********************
Jackson Kelley
AP CS A
Mrs. Transue
November 17, 2018
Rock, Paper, Scissors!
***********************
 */

//import the necessary stuff!
import java.util.Scanner;
import java.util.Random;

//Open class!
public class RockPaperScissors {

    //declaring variables used both in Main and in my methods
    public static String user = " ";
    public static String computer = " ";
    public static int computerScore = 0;
    public static int userScore = 0;

    //here begins the main
    public static void main(String[] args) {

        //creates scanner
        Scanner userInput = new Scanner(System.in);
        //prompt ask their name
        System.out.println("What is your name?");
        String userName = userInput.nextLine();
        //initializes the variable that lets you play multiple times.
        int keepPlaying = 1;
        while (keepPlaying == 1) {
            //initializes more variables
            int userChoice = 0;
            int computerChoice = 0;


            //prompt how many rounds?
            System.out.println(userName + ", how many rounds would you like to play? Please choose 3 or 5.");
            int numberOfRounds = userInput.nextInt();

            //disclaimer explaining what beats what
            System.out.println("Remember, Rock beats Scissors, Paper beats Rock, and Scissors beats Paper!");
            //this is showing that when someone has over half of the total rounds (2/3 or 3/5), then that game is over.
            while (userScore < (numberOfRounds / 2 + 0.5) && computerScore < (numberOfRounds / 2 + 0.5)) {
                System.out.println("Let's play! Please type either 0, 1, or 2. 0 means rock, 1 means scissors, 2 means paper.");
                //what the user picks
                userChoice = userInput.nextInt();
                if (userChoice == 0) {
                    user = "rock";
                } else if (userChoice == 1) {
                    user = "scissors";
                } else if (userChoice == 2) {
                    user = "paper";
                } else {
                    System.out.println("Wrong input, don't be a dummy!");
                    continue;
                }
                //what the computer selects (randomly).
                Random r = new Random();
                computerChoice = r.nextInt(2);
                if (computerChoice == 0) {
                    computer = "rock";
                } else if (computerChoice == 1) {
                    computer = "scissors";
                } else {
                    computer = "paper";
                }
                //call the checkWinner method on the values chosen
                checkWinner(computer, user);
            }
            //After the game ends, this asks the user if they want to play again.
            System.out.println("Do you want to play again? If so, please type 1.");
            keepPlaying = userInput.nextInt();

        }
        //If they are done, this thanks them for playing.
        System.out.println("Thanks for playing!");
    }

    //this method tests who wins each round, including each of the possible different combonations.
        public static void checkWinner (String computer, String user) {
            if (computer.equals(user)){
                //This is if the user and the computer get the same input.
                System.out.println("Tie, no points given. Computer: " + computerScore + ". User: " + userScore);
            } else if (computer.equals("rock") && user.equals("scissors")){
                //Computer's rock beats user's scissors!
                System.out.println("Computer: Rock. User: Scissors. Computer wins. One point added to the computer's score.");
                computerScore++;
                System.out.println("Computer: " + computerScore + ". User: " + userScore);
            } else if (computer.equals("rock") && user.equals("paper")){
                //User's paper beats computer's rock!
                System.out.println("Computer: Rock. User: Paper. User wins. One point added to the user's score.");
                userScore++;
                System.out.println("Computer: " + computerScore + ". User: " + userScore);
            } else if (computer.equals("scissors") && user.equals("rock")){
                //User's rock beats computer's scissors!
                System.out.println("Computer: Scissors. User: Rock. User wins. One point added to the user's score.");
                userScore++;
                System.out.println("Computer: " + computerScore + ". User: " + userScore);
            } else if (computer.equals("scissors") && user.equals("paper")){
                //Computer's scissors beats user's paper!
                System.out.println("Computer: Scissors. User: Paper. Computer wins. One point added to the computer's score.");
                computerScore++;
                System.out.println("Computer: " + computerScore + ". User: " + userScore);
            } else if (computer.equals("paper") && user.equals("rock")){
                //Computer's paper beats user's rock!
                System.out.println("Computer: Paper. User: Rock. Computer wins. One point added to the computer's score.");
                computerScore++;
                System.out.println("Computer: " + computerScore + ". User: " + userScore);
            } else if (computer.equals("paper") && user.equals("scissors")){
                //User's scissors beat computer's paper!
                System.out.println("Computer: Paper. User: Scissors. User wins. One point added to the user's score.");
                userScore++;
                System.out.println("Computer: " + computerScore + ". User: " + userScore);
            } else {
                //If they mess up.
                System.out.println("Invalid input. No score added.");
            }
        }


}