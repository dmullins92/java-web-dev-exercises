package exercises;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(23);
        numbers.add(64);
        numbers.add(37);
        numbers.add(78);
        numbers.add(12);
        numbers.add(13);
        numbers.add(89);
        numbers.add(3);
        System.out.println(ArrayListPractice.sumNumbers(numbers));
        ArrayList<String> strings = new ArrayList<>();
        strings.add("coup");
        strings.add("kerfuffle");
        strings.add("assign");
        strings.add("brain");
        strings.add("eat");
        strings.add("ate");
        strings.add("drink");
        strings.add("dive");
        strings.add("distinguished");
        strings.add("dimension");
        String input = "I would not, could not, in a box. " +
                "I would not, could not with a fox. " +
                "I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        ArrayList<String> stringsSentence = new ArrayList<>(Arrays.asList(input.split(" ")));
        ArrayListPractice.checkStringLength(strings);
    }

    public static int sumNumbers(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i : arrayList) {
            sum += i;
        }
        return sum;
    }
    public static void checkStringLength(@NotNull ArrayList<String> arrayList) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the length to search for: ");
        int searchTerm = input.nextInt();

        for (String i : arrayList) {
            if (i.length() == searchTerm) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
