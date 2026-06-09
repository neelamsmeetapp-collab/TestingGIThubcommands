

//  Write a java program that takes user input using ScannerStudent name:age:marks of 3 subjects : sub1,sub2,sub3Now calculate the total marks a


package javaassigment01;
import java.util.Scanner;

public class assigment24childclass extends assigment24parentclass {


	  public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter marks of English: ");
	        int english = sc.nextInt();

	        System.out.print("Enter marks of Hindi: ");
	        int hindi = sc.nextInt();

	        System.out.print("Enter marks of Maths: ");
	        int maths = sc.nextInt();

	        // Create object
	        assigment24childclass obj = new assigment24childclass();

	        // Call parent method
	        obj.calculateTotal(english, hindi, maths);
	        
	    }
	}