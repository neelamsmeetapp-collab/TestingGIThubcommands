package javaassigment01;

import java.util.Scanner;

public class assigment25childclass extends assignment25parentclass{
    public static void main(String[] args) {

	Scanner sc = new Scanner (System.in);
	 System.out.println("Enter first number: ");
     double a = sc.nextDouble();
	System.out.println("Enter the first number");
	double b = sc.nextDouble();
	System.out.println("Enter the first number");
	double c = sc.nextDouble();
	System.out.println("Enter the first number");
	double power = sc.nextDouble();
	assigment25childclass obj1 = new assigment25childclass();
	obj1.operations(a, b);

	
}
}
