public class Distance {

    /*
    Jackson Kelley
    AP Computer Science A
    Period 1
    10/22/2018
    Distance Project
     */

    //this is the method containing the distance formula, into which two coordinate points (4 doubles) can be passed into
    //this calculates the first leg of the trip
    public static double distance (double x1, double y1, double x2, double y2) {
        //this is the sum of the X values, squared
        double xDiff = Math.pow((x1-x2), 2);
        //this is the sum of the Y values, squared
        double yDiff = Math.pow((y1-y2), 2);
        //this is the sum of the two previous answers
        double xAndY = xDiff + yDiff;
        //this is the square root of the previous answer, which gives the final answer for the distance
        double distanceAnswer = Math.sqrt(xAndY);
        //here we return the distance answer obtained.
        return distanceAnswer;
    }

    //this method calculates the distance between the second and third points, and then adds the first distance to calculate the total distance traveled in the first two legs.
    public static double distance2 (double x1, double y1, double x2, double y2, double x3, double y3) {
        //this is the calling of the first method
        double firstLeg = distance(x1, y1, x2, y2);
        double xDiff2 = Math.pow((x3-x2), 2);
        double yDiff2 = Math.pow((y3-y2), 2);
        double XAndY2 = xDiff2 + yDiff2;
        double distanceAnswer2 = Math.sqrt(XAndY2);
        //here we add the first leg's distance and the second leg of the trip's distance and return that value
        return distanceAnswer2 + firstLeg;
    }

    //this method calculates the distance between the first and third points, and then adds the previous two distances, getting the total distance of the entire trip.
    public static double distance3 (double x1, double y1, double x2, double y2, double x3, double y3) {
        //this is the calling of the second method
        double firstAndSecondLeg = distance2(x1, y1, x2, y2, x3, y3);
        double xDiff3 = Math.pow((x1-x3), 2);
        double yDiff3 = Math.pow((y1-y3), 2);
        double XAndY3 = xDiff3 + yDiff3;
        double distanceAnswer3 = Math.sqrt(XAndY3);
        //here we add the third leg's distance to the sum of the two previous legs, and return that value
        return firstAndSecondLeg + distanceAnswer3;
    }


    public static void main(String args[]) {

        //this is the total distance of the entire trip
        double answer = (distance3(16.0, 10.0, 4.0, 28.0, 10, 3));
        //here we print out the total distance traveled
        System.out.println(answer);

    }
}
