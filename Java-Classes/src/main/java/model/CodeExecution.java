package model;

import model.enums.Faculty;
import model.enums.Group;
import model.enums.Year;

import java.util.Scanner;

public class CodeExecution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student(1, "Arman", "Armanov", "Armanovich", "1/01/1985", "Java Street, 15", "+7 701 777 7777", Faculty.PSYCHOLOGY.getFacultyName(), Year.FIRST.getYearNumber(), Group.A.getGroupName());
        Student student2 = new Student(2, "Armando", "Armandez", "Fernandez", "2/01/1985", "Java Street, 11", "+7 702 777 7777", Faculty.FILM.getFacultyName(), Year.SECOND.getYearNumber(), Group.B.getGroupName());
        Student student3 = new Student(3, "Andrey", "Andreyev", "Andreyevich", "3/01/1985", "Java Street, 14", "+7 747 777 7777", Faculty.IT.getFacultyName(), Year.THIRD.getYearNumber(), Group.C.getGroupName());
        Student student4 = new Student(4, "Andrew", "McAndrew", "Anderson", "4/01/1985", "Java Street, 10", "+7 777 777 7777", Faculty.FINANCE.getFacultyName(), Year.FOURTH.getYearNumber(), Group.A.getGroupName());
        Student[] students = {student1, student2, student3, student4};

        System.out.println("Please, type student's name or faculty below:");
        System.out.println("(Hint: available faculties are Psychology, Computer Science, Film Production and Finance)");
        String input = scanner.nextLine();
        studentSearch(students, input);
    }

    public static Student searchByName(Student[] students, String name) {
        for (Student studentInfo : students) {
            if (studentInfo.firstName.equals(name)) {
                return studentInfo;
            }
        }
        return null;
    }

    public static Student searchByFaculty(Student[] students, String faculty) {
        for (Student facultyName : students) {
            if (facultyName.getFaculty().equals(faculty)) {
                return facultyName;
            }
        }
        return null;
    }

    public static void studentSearch(Student[] students, String input) {
        if (searchByName(students, input) != null) {
            System.out.println("Here is " + input + "'s full info:");
            System.out.println(searchByName(students, input));
        } else if (searchByFaculty(students, input) != null) {
            System.out.println("Students that study " + input + ":");
            System.out.println(searchByFaculty(students, input));
        } else {
            System.out.println("Sorry, " + input + " is not in our database!");
        }
    }
}
