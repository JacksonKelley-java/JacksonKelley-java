public class Unit2Project_DrawRocket {

    //class constant will go here later

    //print the cone section
    public static void cone(){
        //number of rows of the row
        for (int rows = 0; rows < 5; rows++){
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
        for (int rows = 1; rows < 4; rows++){
            System.out.print("|");
           //this determines the number of times we repeat the code inside (there are two sections)
            for (int sections = 0; sections < 2; sections++){
                //this is the number of dots printed
                for (int dots = 3; dots > rows; dots--){
                    System.out.print(".");
                }
                //this is the number of forward slashes
                for (int slashes = 0; slashes < rows; slashes++){
                    System.out.print("/\\");
                }
                for (int dots = 3; dots > rows; dots--){
                    System.out.print(".");
                }

            }
            System.out.println("|");
        }

    }

    //print the bottom half of the body section of the rocket
    public static void bottomHalf(){
        //this determines the number of rows
        for (int rows = 1; rows < 4; rows ++) {
            System.out.print("|");
            //this determines the number of times we repeat the code inside (there are two sections in the example)
            for (int sections = 0; sections < 2; sections++) {
                //this is the number of dots printed
                for (int dots = 1; dots < rows; dots++) {
                    System.out.print(".");
                }
                for (int slashes = 4; slashes > rows; slashes--) {
                    System.out.print("\\/");
                }
                for (int dots = 1; dots < rows; dots++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }

    }



    //print the line in between sections
    public static void lineInBetweenSections(){
        System.out.print("+");
        for (int equalStar = 0; equalStar < 6; equalStar++){
            System.out.print("=*");
        }
        System.out.println("+");
    }





    //Main method
    public static void main(String[] args) {
     /*
     cone();
     lineInBetweenSections();

    topHalf();
    */
     bottomHalf();

    }



}
