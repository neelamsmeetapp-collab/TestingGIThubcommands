package javaassigment01;

import java.util.Scanner;

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