import java.io.*;
import java.lang.*;
import java.util.*;

class L1P6{
	public static void main(String[] args){
	Scanner input =  new Scanner(System.in);

	System.out.print("Enter KM: ");
	double km = input.nextDouble();

	System.out.print("Enter Minutes: ");
	double minutes = input.nextDouble();

	System.out.print("Enter Seconds: ");
	double seconds = input.nextDouble();


	double distance = km / 1.6;
	double time = ((minutes * 60) + seconds)/3600;

	double average = distance/time;

	System.out.println("Average: " +average);

	}
}