package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


     //TODO: Uncomment and complete the getGradeLevel method here:
    public void getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits >= 90) {
            System.out.println(this.name + " is a Senior. They have " + this.numberOfCredits + " credits.");
        } else if (this.numberOfCredits >= 60) {
            System.out.println(this.name + " is a Junior. They have " + this.numberOfCredits + " credits.");
        } else if (this.numberOfCredits >= 30) {
            System.out.println(this.name + " is a Sophomore They have " + this.numberOfCredits + " credits.");
        } else if (this.numberOfCredits <= 29) {
            System.out.println(this.name + " is a Freshman. They have " + this.numberOfCredits + " credits.");
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = this.gpa * this.numberOfCredits;
        double qualityScore = grade * courseCredits;
        totalQualityScore = totalQualityScore + qualityScore;
        this.numberOfCredits = this.numberOfCredits + courseCredits;
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentId);
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student Sam = new Student("Sam", 1);
        Sam.addGrade(3, 4.00);
        System.out.println(Sam.getGpa());
        Sam.addGrade(4, 3.00);
        System.out.println(Sam.getGpa());
        Sam.addGrade(3, 3.50);
        System.out.println(Sam.getGpa());

    }
}
