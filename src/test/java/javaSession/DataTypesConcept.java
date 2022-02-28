package javaSession;

public class DataTypesConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Primitive data type

		// Under primitive data type again there wil be two types
		// a. Numerical type
		// Character : char

		// b. Integral type
		// Integer: byte, short, int, long
		// Floating-points : float, double

		// 2. Non-Primitive data types are like:
		// String, Array, Interface, Classes

		//1. byte Data types
		//byte data type range is -128 to 127
		// 1 byte = 8 bits
		
		byte a = 10;
		System.out.println("The byte value is:"+a);
		
		 // 2. short
		// size : 2 bytes = 16 bits
		// range : -32768 to 32767
		 
		short s = 1234;
		System.out.println("The short value is:"+s);
		
		
		// 3. int
		// size: 4 bytes = 32 bits
		// range: -2147483648 to 2147483648
		
		int i = 23450;
		System.out.println("The value of integer is:"+i);
		
		// 4. long
		// size: 8 bytes: 64 bits
		// range is: -9223372036854775 to 923372036854775
		
		long l = 2245327;
		System.out.println("The value of long is:"+ l);
		
		// 5. float
		//size: 4 bytes = 32 bits
		//range : after . (upto seven decimal digits)
		float f1 = 12.33f; 
		System.out.println("The value of float is:"+ f1);
		
		// 6. double
		//size: 8 bytes = 64 bits
		//range : after . (upto 16 decimal digits)  
		double d = 23.5667778;
		System.out.println("The value of double is:"+ d);
		
		// 7. char:
		//size: 2 bytes = 16 bits
		//range: 'a-z' and '0-9'
		char c = 'e';
		System.out.println("The value of char is:" + c);
		
		// 8. boolean
		
		boolean b = true;
		System.out.println("The boolean value is: "+ b);
				
		

        
	}

}
