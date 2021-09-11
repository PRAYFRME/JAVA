import java.io.*;
import java.lang.*;
import java.util.*;

class L1P8{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int number = input.nextInt();

		if((number % 2 == 0) ^ (number % 3 == 0)){
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
}