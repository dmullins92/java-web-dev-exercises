package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        do {
            System.out.println("Please input the value of your radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("Please enter a valid radius.");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);
        input.close();
        double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is: " + areaOfCircle);
    }
}
