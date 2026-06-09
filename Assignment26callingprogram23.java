package javaassigment01;

import java.util.Scanner;

public class Assignment26callingprogram23 extends program23{
	public static void main(String[] args) {
	Assignment26callingprogram23 obj = new Assignment26callingprogram23();

	
    // Calling methods from parent
    obj.method();
    obj.method("neelam@gmail.com");

    // Calling parameterized constructors separately
    program23 obj1 = new program23(10);
    program23 obj2 = new program23(10, 20.5);
}
}

