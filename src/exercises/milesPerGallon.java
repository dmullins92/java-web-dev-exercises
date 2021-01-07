package exercises;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input how many miles you drove: ");
        Double miles = input.nextDouble();
        System.out.println("Please input how many gallons of gas you utilized: ");
        Double gallonsOfGas = input.nextDouble();
        input.close();
        Double milesPerGallon = miles / gallonsOfGas;
        System.out.println("Your MPG was: " + milesPerGallon);
    }
}
