import java.io.*;
import java.lang.*;
import java.util.*;

class L1P10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between 0 and 100: ");

		int number = input.nextInt();

		int firstNumber = number / 100;
		int middleNumber = (number / 10) % 10;
		int lastNumner = number %10;
		System.out.println("First Number: " + firstNumber + " & " +" Middle number: " +middleNumber +" Last number: " +lastNumner);

		int sum = firstNumber + middleNumber + lastNumner;
		System.out.println("The sum of the digits is " + sum);


		int c = number % 100;
		System.out.println("c: " +c);
		int d = (number % 100)/10;
		System.out.println("d: " +d);
	}
}