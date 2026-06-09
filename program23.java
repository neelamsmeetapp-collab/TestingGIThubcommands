
//method overloading constructor overloading
//Constructor Overloading → same class name, different parameters
//Method Overloading → same method name, different parameters
//Both are examples of compile-time polymorphism


package javaassigment01;

public class program23 {
	program23(){
		
	}
	
	
	program23(int a){
		System.out.println("This is constructor , having the same class name but calling the int data vairble");
	}
	
	
	program23(int a, double b){
		System.out.println("This is constructor , having the same class name but calling the int and double  data vairble");
	}
void method() {
	System.out.println("This is method overloading , having the two same names methods non parametarzed");
}
void method(String email) {
	System.out.println("This is method overloading , having the two same names methods parametarzed, printing the email");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		program23 obj = new program23(10);
		program23 obj1 = new program23(10,56.7);
		
		obj.method();
		obj1.method("neelam@gmail.com");
	}

}
