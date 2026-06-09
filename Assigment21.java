package javaassigment01;

public class Assigment21 {
	
	void score(int score) {
		if(score>=0 && score<=100)
			System.out.println("Valid score");
		
			
	}
	
	void score(int score, int passingScore) {
		if(score>=passingScore) {
		System.out.println("The student is pass");
		}
		else 
			System.out.println("The student is fail");
	}
	
	void score(int score, int passingScore, boolean isBonus) {
		if(score>=passingScore && isBonus==true) {
			System.out.println("The student is excellent");
		}
			else
				System.out.println("The student is average");
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Assigment21 obj = new Assigment21();
	obj.score(55);
	obj.score(33, 33);
	obj.score(55,33, true);
	
}


	}
