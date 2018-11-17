public class DrawBoxes {
    public static void main(String[] args) {
       /* System.out.println();
        System.out.println("Draw Boxes!");
        drawBox();
        drawBox();
        drawBox();
        System.out.println("Project Complete.");
        */
       drawBoxes(5, 6, '$');
    }
/*
    public static void drawBox(){
        System.out.println();
topAndBottom();
sides();
sides();
sides();
topAndBottom();
    }

    public static void topAndBottom(){
        System.out.println("+---------+");
    }
public static void sides(){
    System.out.println("|         |");
}

}
*/
/*
int height = 5;
int width = 5;
char characterToPrint = *
*/

public static void drawBoxes(int height, int width, char characterToPrint) {
    for (int i = 1; i <= height; i++) {
        for(int j = 1; j <= width; j++) {
            System.out.print(characterToPrint);
        }
    System.out.println();
    }

        }
}

