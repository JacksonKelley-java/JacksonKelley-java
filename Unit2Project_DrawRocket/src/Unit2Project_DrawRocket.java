public class Unit2Project_DrawRocket {

    //class constant will go here
    public static final int SIZE = 8;

    //print the cone section
    public static void cone(){
        //number of rows of the row
        for (int rows = 0; rows < (SIZE - 2); rows++){
            //this prints the number of spaces before the front of the cone
            for (int spaces = 5; spaces > rows; spaces--){
                System.out.print(" ");
            }
            //this loop prints the forward slash, or the left side of the cone
            for (int forward = 0; forward <= rows; forward++){
                System.out.print("/");
            }
            //this loop prints the middle part of the cone
            for (int stars = 0; stars <= 1; stars++){
                System.out.print("*");
            }
            //this prints the backward slash, or the right side of the cone
            for (int backslash = 0; backslash <= rows; backslash++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }



    //print the top half of the body section of the rocket
    public static void topHalf(){
       //this determines the number of rows
        for (int rows = 0; rows < (SIZE/2 -1); rows++){
            System.out.print("|");
           //this determines the number of times we repeat the code inside (there are two sections)
            for (int sections = 0; sections < 2; sections++){
                //this is the number of dots printed
                for (int dots = 2; dots > rows; dots--){
                    System.out.print(".");
                }
                //this is the number of forward slashes
                for (int slashes = -1; slashes < rows; slashes++){
                    System.out.print("/\\");
                }
                for (int dots = 2; dots > rows; dots--){
                    System.out.print(".");
                }

            }
            System.out.println("|");
        }

    }

    //print the bottom half of the body section of the rocket
    public static void bottomHalf(){
        //this determines the number of rows
        for (int rows = 0; rows < (SIZE/2 - 1); rows ++) {
            System.out.print("|");
            //this determines the number of times we repeat the code inside (there are two sections in the example)
            for (int sections = 0; sections < 2; sections++) {
                //this is the number of dots printed
                for (int dots = 0; dots < rows; dots++) {
                    System.out.print(".");
                }
                for (int slashes = 3; slashes > rows; slashes--) {
                    System.out.print("\\/");
                }
                for (int dots = 0; dots < rows; dots++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }

    }



    //print the line in between sections
    public static void lineInBetweenSections(){
        System.out.print("+"); //this prints the "+" to open the line
        for (int equalStar = 0; equalStar < (SIZE - 2) ; equalStar++){
            System.out.print("=*");
        } //this prints the body of the line
        System.out.println("+"); //this prints the "+" to end the line
    }





    //Main method
    public static void main(String[] args) {

     cone();
     lineInBetweenSections();
     topHalf();
     bottomHalf();
     lineInBetweenSections();
     topHalf();
     bottomHalf();
     lineInBetweenSections();
     cone();

    }



}
