import java.io.*;
import java.lang.*;
import java.util.*;

class AverageTemparature{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Temparature of last 10 days: ");

		double[] temparature = new double[10];

		for(int i = 0; i < temparature.length; i++){
			temparature[i] = input.nextDouble();
		}

		double sum = 0;

		for(int i = 0; i < temparature.length; i++){
			sum += temparature[i];
		}

		double avarage = sum / temparature.length;

		System.out.println("Average Temparature of last 10 days: " +avarage);

		for(int i = 0; i < temparature.length; i++){
			if(temparature[i] < avarage){
				System.out.println("The Temparature was below avarage: " +(i+1));
			}
		}
	}
}