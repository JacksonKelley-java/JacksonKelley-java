public class SixDays {

    /*
   *****************************
 * Jackson Kelley
 * AP CS A
 * Period 1
 * 9/12/18
 * Project #1-SixDaysOfXmas
 * *****************************
     */

    public static void partridge(){
        System.out.println("a partridge in a pear tree.\n");
    }
    public static void turtleDoves(){
        System.out.println("two turtle doves, and");
        partridge();
    }
    public static void frenchHens(){
        System.out.println("three French hens,");
        turtleDoves();
    }
    public static void callingBirds(){
        System.out.println("four calling birds,");
        frenchHens();
    }
    public static void goldenRings(){
        System.out.println("five golden rings,");
        callingBirds();
    }
    public static void geeseALaying(){
        System.out.println("six geese-a-laying,");
        goldenRings();
    }

    public static void dayOne(){
        System.out.println("On the first day of \"Xmas\", my true love sent to me");
        partridge();
    }
    public static void dayTwo(){
        System.out.println("On the second day of \"Xmas\", my true love sent to me");
        turtleDoves();
    }
    public static void dayThree(){
        System.out.println("On the third day of \"Xmas\", my true love sent to me");
        frenchHens();
    }
    public static void dayFour() {
        System.out.println("On the fourth day of \"Xmas\", my true love sent to me");
        callingBirds();
    }
    public static void dayFive(){
        System.out.println("On the fifth day of \"Xmas\", my true love sent to me");
        goldenRings();
    }
    public static void daySix(){
        System.out.println("On the sixth day of \"Xmas\", my true love sent to me");
        geeseALaying();
    }

    public static void main(String[] args){
        dayOne();
        dayTwo();
        dayThree();
        dayFour();
        dayFive();
        daySix();
    }
}
