package javaassigment01;

import java.util.Scanner;

//public class Multilevelassigmentone33 {
//employee //manager// hr
	
	
	class company {
		String name;
		int age;
		int companyid;
		String gender;
		void employee() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr the name of the employee");
			 name = sc.next();
			System.out.println("Enetr the age of the employee");
			age = sc.nextInt();
			System.out.println("Enetr the companyid of the employee");
			companyid = sc.nextInt();
			System.out.println("Enetr the gender of the employee");
			gender = sc.next();
						}
	}
	class manager extends company{
		double salary;
	
		void manageremployee() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr the salary of the employee");
			 salary = sc.nextDouble();
		}		
}
	class Multilevelassigmentone33 extends manager{
		double finalsalary;
		double bonus;
		
	
		void salary() {
			 double bonus = 5000;
		   
			Scanner sc = new Scanner(System.in);
			System.out.println("Enetr the bonus of the employee");
			bonus = sc.nextDouble();
		     double finalsalary = salary + bonus;
			
		
			System.out.println("Final calculates salry is  employee is : " +finalsalary);
			
		}
	

public static void main(String[] args) {
	Multilevelassigmentone33 obj = new Multilevelassigmentone33();
	obj.employee();
	obj.manageremployee();
	obj.salary();
	
}
	}
	
	
