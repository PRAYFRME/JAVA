import java.io.*;
import java.lang.*;
import java.util.*;

class L1P7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Celsius: ");
		double celsius = input.nextDouble();

		double fahrenheit = (9.0 / 5) * celsius + 32;

		System.out.println("Fahrenheit : " +fahrenheit);
	}
}