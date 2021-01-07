package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] testArray = {1, 1, 2, 3, 5, 8};
        for (int num : testArray) {
            if (num%2 == 1) {
//                System.out.println(num);
            }
        }
        String testString = "I would not, could not, in a box." +
                " I would not, could not with a fox." +
                " I will not eat them in a house." +
                " I will not eat them with a mouse.";
        String[] testStringArray = testString.split("\\.");
        System.out.println(Arrays.toString(testStringArray));
    }
}
