import java.io.*;
import java.lang.*;
import java.util.*;

class L2P9{
	public static void main(String[] args) {
		int value = 0, position_H = 0, position_S = 0;

		int[] numbers = new int[100];

		for(int i = 0; i < numbers.length; i++){
			numbers[i] = (int)(Math.random()*100);
			System.out.println(numbers[i]);
		}

		for(int i = 0; i < numbers.length; i++){
			if(value < numbers[i]){
				value = numbers[i];
				position_H = i;
			}
		}

		int positionForHighestValue = position_H + 1;

		System.out.println("Highest value: " +value + " & the position is: "+positionForHighestValue);

		for(int i = 0; i < numbers.length; i++){
			if(value > numbers[i]){
				value = numbers[i];
				position_S = i;
			}
		}

		int positionForSmallestValue = position_S + 1;

		System.out.println("Smalles value: " +value + " & the position is: "+positionForSmallestValue);

	}
}
