import java.io.*;
import java.lang.*;
import java.util.*;

class L1P9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes: ");

		int minutes = input.nextInt();

		int years = (minutes/ 60 / 24 ) / 365;
		int days = (minutes/ 60 / 24 ) % 365;

		System.out.println(+minutes + " minutes is approximately " +years +" years and " +days +" days");

	}
}