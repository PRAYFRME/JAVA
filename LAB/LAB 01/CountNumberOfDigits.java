import java.io.*;
import java.lang.*;
import java.util.*;

class CountNumberOfDigits{
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);

		int count = 0;

		System.out.print("Enter a number : ");
		long number = input.nextLong();

		while(number != 0){  
			number /= 10;
			count++; 
		}

		System.out.println("Number of Digits is " + count);
	}
}