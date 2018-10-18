public class MathStuff {

    public static int addTwoIntegers(int x1, int x2) {
        int sum = x1 + x2;
        return sum;
    }

    public static int minOfThree (int x, int y, int z) {
        int minimum = Math.min( Math.min (x, y), z);
        return minimum;
    }

    public static double complicated (double a, double b, double c) {
        double min = Math.min( Math.min (a, b), c);
        double max = Math.max( Math.max (a, b), c);
        double big = max + min;
        double ans = Math.sqrt(big);
        return ans;
    }

    public static void main(String args[]) {
        int answer = addTwoIntegers(4, 3);
        System.out.println(answer);
        int minimum = minOfThree(4, 3, 5);
        System.out.println(minimum);
        double complexAnswer = complicated(1.3, 4.0, 6.4);
        System.out.println(complexAnswer);
    }

}
