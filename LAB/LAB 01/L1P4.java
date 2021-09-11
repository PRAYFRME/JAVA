import java.io.*;
import java.lang.*;
import java.util.*;

class L1P4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Radius: ");

		double radius = input.nextDouble();

		double perimeter = 2 * 3.1416 * radius;
		double area = 3.1416 * Math.pow(radius, 2);

		System.out.println("Perimeter is: " +perimeter + " & " + "Area is: " +area);
	}
}