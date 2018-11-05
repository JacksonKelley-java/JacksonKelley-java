public class WhatQuadrant {

public static void main(String[] args) {
    String returnAnswer = quadrant(-0.0, -4.2);
    System.out.println(returnAnswer);
}

public static String quadrant(double x, double y) {
    String returnAnswer = "0";
    if (x > 0) {
        if (y > 0) {
            returnAnswer = "This is in Quadrant 1.";
        }
        else if (y < 0) {
            returnAnswer = "This is in Qudrant 4.";
        }
        else if (y == 0) {
            returnAnswer = "This is on the X-Axis.";
        }
    }
    else if (x < 0) {
        if (y > 0) {
            returnAnswer = "This is in Quadrant 2.";
        }
        else if (y < 0) {
            returnAnswer = "This is in Qudrant 3.";
        }
        else if (y == 0) {
            returnAnswer = "This is on the X-Axis.";
        }
    }
    else if (x == 0) {
        returnAnswer = "This is on the Y-Axis.";
    }
    return returnAnswer;
}



}
