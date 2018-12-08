import java.util.Arrays;

public class ArrayWorksheet2 {
    //exercise 1a
    14, 6, 2200, 98;
    //1b
    11, 4, 99, 2, 44, 0, 0, 0;
    //1c
    3, 3, 0, 0, 6, 9, 0, -18;

    //1d
    int[] array = {4, 5, 6, 7, 2, 10, 9, 4};
    int max = array[0];
    for (int i = 0;i , array.length; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }
    System.out.println("max is " + max);

    //1e
    int[] anotherArray = {10, -2, 4, -4, 9, -5, 19, -7, 39, -1};
    double avg = 0;
    double sum = 0
    for(int i = 0; i < anotherArray.length; i++) {
        sum += anotherArray[i];
    }
    sum / (anotherArray/2) = avg;
    return avg;


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
    int[] quatro = {27, 15, 11, 15, 27};
    quatro[0] = int common;
    for (int i = 0; i < quatro.length; i++) {
        if (quatro[i] = common) {
            common++;
        }
        if (quatro[i] != common) {
            int lessCommon = 0;
            lessCommon ++;
        }
        if (common>lessCommon) {
            return common;
        } else {
            return lessCommon;
        }
    }



}
