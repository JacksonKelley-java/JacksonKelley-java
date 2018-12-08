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
        Arrays.toString(arrayOfNumbers2[arrayOfNumbers2.length/2]);
        //Exercise 3c
        Scanner inputArray = new Scanner(System.in);
        for (int i = 0; i <4; i++) {
            arrayOfNumbers2[i] = arrayOfNumbers2[i]-1;
        }
        //exercise 3d
        int[] even = new int[499];
        for (int i = 0; int i < even.length-1; i++) {
            int x =0;
            if (x % 2 = 0) {
                even[i]=x;
            } else {
                x++
            }
        }
        //exercise 3f
        int x = even[100];
        return x;
        //exercise 3g
        int y = even[278];
        return y;
        int z = even[456];
        return z;
        //exercise 3h
        int[] skrt = new int[10];
        for (int i = 0; i <skrt.length; i++) {
            skrt[i] = i-4;
        }
        //exercise 3i
        int [] word = new int[int length];
        for (int i = 0; i < word.length; i++) {
            word[i] = i - length;
        }


    }
}