package javaassigment01;

import java.util.Scanner;

class manager extends company{
	double salary;

	void manageremployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the salary of the employee");
		 salary = sc.nextDouble();
	}		
}