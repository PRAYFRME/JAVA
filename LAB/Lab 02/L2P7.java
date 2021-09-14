import java.io.*;
import java.util.*;
import java.lang.*;

class L2P7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the center of a circle (p , q) : ");
		int p = input.nextInt();
		int q = input.nextInt();

		System.out.print("Enter the redius of a circle (r) : ");
		int r = input.nextInt();

		System.out.print("Enter a point of a circle (x , y) : ");
		double x = input.nextDouble();
		double y = input.nextDouble();

		double distance = Math.sqrt(Math.pow((x - p),2) + Math.pow((y - q),2));

		if(distance < r){
			System.out.println("\nPoint ("+x + " , " +y +") is inside the circle centered at ("+p + " , " +q+") with radius " +r +".");
		}

		else if(distance > r){
			System.out.println("\nPoint ("+x + " , " +y +") is outside the circle centered at ("+p + " , " +q+") with radius " +r +".");
		}

		else if(distance == r){
			System.out.println("\nPoint ("+x + " , " +y +") is on the circle centered at ("+p + " , " +q+") with radius " +r +".");
		}		
	}
}