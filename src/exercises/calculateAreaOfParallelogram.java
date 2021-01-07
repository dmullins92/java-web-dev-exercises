package exercises;
import java.util.Scanner;

public class CalculateAreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter width: ");
        Integer width = input.nextInt();
        System.out.println("Please enter length: ");
        Integer length = input.nextInt();
        input.close();
        int area = width*length;
        System.out.println("The area of your parallelogram is: " + area + "cm");
    }
}
