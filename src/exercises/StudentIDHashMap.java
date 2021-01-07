package exercises;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class StudentIDHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        do {
            System.out.println("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.println("ID: ");
                Integer newID = input.nextInt();
                students.put(newID, newStudent);
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        System.out.println("\nClass roster: \n");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }

    }
}
