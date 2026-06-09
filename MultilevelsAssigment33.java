package javaassigment01;

import java.util.Scanner;

// Grandparent class
class Student {
    String name;
    int age;
    int rollno;

    void studentData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name:");
        name = sc.nextLine();

        System.out.println("Enter the age:");
        age = sc.nextInt();

        System.out.println("Enter the roll no:");
        rollno = sc.nextInt();
    }
}

// Parent class
class MarksCalculator extends Student {
    int sub1, sub2, sub3;

    void calculator() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks in English:");
        sub1 = sc.nextInt();

        System.out.println("Enter marks in Hindi:");
        sub2 = sc.nextInt();

        System.out.println("Enter marks in Maths:");
        sub3 = sc.nextInt();
    }
}

// Child class (Main class)
public class MultilevelsAssigment33 extends MarksCalculator {

    void average() {
        int total = sub1 + sub2 + sub3;
        double avg = total / 3.0;

        System.out.println("\n----- RESULT -----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollno);

        System.out.println("English: " + sub1);
        System.out.println("Hindi: " + sub2);
        System.out.println("Maths: " + sub3);

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        MultilevelsAssigment33 obj = new MultilevelsAssigment33();

        obj.studentData();
        obj.calculator();
        obj.average();
    }
}