import java.io.*;
import java.lang.*;
import java.util.*;

class ReminderTest{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number : ");
		int number = input.nextInt();

		int reminder = number % 10;

		System.out.println("Reminder is " +reminder);
	}
}