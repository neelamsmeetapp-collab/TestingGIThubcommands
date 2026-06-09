package javaassigment01;

import java.util.Scanner;

class multilevelinhertianace3diffentclasses extends manager{
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
	multilevelinhertianace3diffentclasses obj = new multilevelinhertianace3diffentclasses();
obj.employee();
obj.manageremployee();
obj.salary();

}
}


