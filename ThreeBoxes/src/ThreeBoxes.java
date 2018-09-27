public class ThreeBoxes {

    //class constants up here
    public static final int ROWS = 3;
    public static final int COLUMNS = 2;


    //methods here
    public static void splat () {
        for (int i = 1; i <= ROWS; i ++) {
            for (int j = 1; j <= COLUMNS; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void dolla () {
        for (int i = 1; i <= ROWS; i ++) {
            for (int j = 1; j <= COLUMNS; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
    }


    public static void pound () {
        for (int i = 1; i <= ROWS; i ++) {
            for (int j = 1; j <= COLUMNS; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }


    //main here
    public static void main(String[] args){
        splat();
        dolla();
        pound();
    }
}
