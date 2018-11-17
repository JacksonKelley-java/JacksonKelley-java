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
    public static void partridge(){ //gift received on the first day
        System.out.println("a partridge in a pear tree.\n");
    }
    public static void turtleDoves(){ //gifts received on the second day
        System.out.println("two turtle doves, and");
        partridge();
    }
    public static void frenchHens(){ //gifts received on the third day
        System.out.println("three French hens,");
        turtleDoves();
    }
    public static void callingBirds(){ //gifts received on the fourth day
        System.out.println("four calling birds,");
        frenchHens();
    }
    public static void goldenRings(){ //gifts received on the fifth day
        System.out.println("five golden rings,");
        callingBirds();
    }
    public static void geeseALaying(){ //gifts received on the sixth day
        System.out.println("six geese-a-laying,");
        goldenRings();
    }

    //first day and corresponding gifts.
    public static void dayOne(){
        System.out.println("On the first day of \"Xmas\", my true love sent to me");
        partridge();
    }
    //second day and corresponding gifts.
    public static void dayTwo(){
        System.out.println("On the second day of \"Xmas\", my true love sent to me");
        turtleDoves();
    }
    //third day and corresponding gifts.
    public static void dayThree(){
        System.out.println("On the third day of \"Xmas\", my true love sent to me");
        frenchHens();
    }
    //fourth day and corresponding gifts.
    public static void dayFour() {
        System.out.println("On the fourth day of \"Xmas\", my true love sent to me");
        callingBirds();
    }
    //fifth day and corresponding gifts.
    public static void dayFive(){
        System.out.println("On the fifth day of \"Xmas\", my true love sent to me");
        goldenRings();
    }
    //sixth day and gifts recieved that day.
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
