import java.io.*;
import java.lang.*;
import java.util.*;

class L1P3{
	public static void main(String[] args){
		double radius = 5.5;

		double perimeter = 2 * 3.1416 * radius;
		double area = 3.1416 * Math.pow(radius, 2);

		System.out.println("Perimeter is: " +perimeter + " & " + "Area is: " +area);
	}
}