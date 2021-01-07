package exercises;
import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her" +
                " sister on the bank, and of having nothing to do: once or twice she had peeped" +
                " into the book her sister was reading, but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String lowerAlice = alice.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a term to search for: ");
        String searchTerm = input.nextLine();
        if (lowerAlice.contains(searchTerm.toLowerCase())) {
            System.out.println("The index of your search is: " + lowerAlice.indexOf(searchTerm.toLowerCase()) + " and it's length is: " + searchTerm.length());
            String newAlice = alice.replace(searchTerm, "");
            System.out.println(newAlice);
        } else System.out.println("The string does not contain your search term.");
        input.close();
    }
}
