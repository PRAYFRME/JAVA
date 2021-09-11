import java.io.*;
import java.lang.*;
import java.util.*;

class L1P10_WhileLoop{
	public static void main(String[] args){
		Scanner input =  new Scanner(System.in);

		int sum = 0, reminder;

		System.out.print("Enter a number : ");
		int number = input.nextInt();

		int temp = number; // jei number ta input nilam oita "temp" ey rakhlam.

		while(temp != 0){   // eikhane "temp" zero na hole loop ta cholbe.
			reminder = temp % 10; // amra reminder that's mean last digit ta pai.
			sum += reminder; // ager "sum" er shathe "reminder" ta add kore dei.
			temp = temp / 10; //new temp
		}

		System.out.println("Sum is " +sum);
	}
}