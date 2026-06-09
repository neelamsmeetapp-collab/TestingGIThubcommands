package javaassigment01;

import java.util.Scanner;

public class inheritparentclassthrougscanclassone extends Inheritanceparentclassone{
	
String name;
int age;
int rollno;
	
	void studentname() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name of the student");
		name =sc.nextLine();
		System.out.println("Enter the age of the student");
		age =sc.nextInt();
		System.out.println("Enter the rollno of the student");
		rollno =sc.nextInt();
	    sc.close(); 
	}
	
	

	public static void main(String[] args) {
		inheritparentclassthrougscanclassone obj = new inheritparentclassthrougscanclassone();
		obj.studentname();
		obj.schoolname();
		obj.schoolbranchname();
		
	}

}
