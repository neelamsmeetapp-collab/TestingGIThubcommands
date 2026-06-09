package javaassigment01;

// without scann class no user input package javaassigment01;

public class Inheritancechildclass extends Inheritanceparentclassone {

    void rollno() {
        System.out.println("The Roll number of the  student is 15");
    }

    public static void main(String[] args) {

        Inheritancechildclass obj = new Inheritancechildclass();

        obj.schoolname();
        obj.schoolbranchname();
        obj.rollno();
    }
}