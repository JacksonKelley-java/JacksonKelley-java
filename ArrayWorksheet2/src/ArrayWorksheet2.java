import java.util.*;

public class ArrayWorksheet2 {
    //exercise 1a





    //Exercise 2a
    int[] numbers = new int[int length];
    int length = 5;
    int[] numbers = int numbers[length*2];
    //2b
    copyOfRange(numbers[], 0, 4);
    //2c
    for(int i = 0; i < numbers.length; i ++) {
        numbers[i] = 42;
    }
    //3
    public static int range (int[] list) {
        int max = list[0];
        int min = list[0];
        for(int i = 0; i < list.length; i++) {
            int x = list[i];
            if (x > max) {
                max = x;
            } else if (x < min) {
                min = x;
            }
        }
        return (max-min + 1);
    }

    //4
    

}
