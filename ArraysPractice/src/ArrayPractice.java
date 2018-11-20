import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {
        //Exercise 1
        int[] arrayOfNumbers = new int[8];
        //Exercise 2a
        arrayOfNumbers[0] = 1;
        arrayOfNumbers[1] = 2;
        arrayOfNumbers[2] = 3;
        arrayOfNumbers[3] = 4;
        arrayOfNumbers[4] = 5;
        arrayOfNumbers[5] = 6;
        arrayOfNumbers[6] = 7;
        arrayOfNumbers[7] = 8;
        //Exercise 2b
        int[] arrayOfNumbers2 = {1, 2, 3, 4 , 5, 6, 7, 8};
        //Exercise 2c
        for (int i = 0; i <= 5; i++) {
            arrayOfNumbers2[1] = i;
        }
        //Exercise 2d
        Scanner inputArray = new Scanner(System.in);
        for (int i = 0; i <4; i++) {
            arrayOfNumbers2[i] = inputArray.nextInt();
        }
        //Exercise 2e
        int[] arrayOfNumbers3 = {-4, 19, 3, 20, 72, 58};
        //Exercise 3a
            System.out.println(arrayOfNumbers[(arrayOfNumbers.length-1)]);
        //Exercise 3b
        



    }
}