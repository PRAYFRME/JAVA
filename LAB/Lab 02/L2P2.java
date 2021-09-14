import java.io.*;
import java.lang.*;
import java.util.*;

class L2P2{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int i, positive = 0, negative = 0;
		double total = 0, average;

		System.out.println("Enput 10 Integers: ");

		for(i = 1; i <= 10; i++){
			
			int integer = input.nextInt();


			if(integer > 0){
				positive++;
			}

			else if(integer < 0){
				negative++;
			}

			else if(integer == 0){
				break;
			}

			total += integer;
		}

		average = (total / (i - 1));

		System.out.println("Positive numbers: " +positive);
		System.out.println("Negative numbers: " +negative);
		System.out.println("Total: "+total);
		System.out.println("Average: "+average);
	}
}