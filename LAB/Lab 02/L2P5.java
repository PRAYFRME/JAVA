import java.io.*;
import java.lang.*;
import java.util.Scanner;
import javax.swing.*;
class L2P5
{
	public static void main(String[] args)
	{
		int l=0,p,j,k,temp;
		int numbers[] = new int [100];
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the integers between 1 to 100: ");
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i] = input.nextInt();
			if(numbers[i]==0)
			{
				break;
			}
		}

		for(j=0;j<numbers.length;j++)
		{
			for(k=j+1;k<numbers.length;k++)
			{
				if(numbers[j]>numbers[k])
				{
					temp=numbers[j];
					numbers[j]=numbers[k];
					numbers[k]=temp;
					
				}

			}
			
		}

		for(j=1;j<numbers.length;j++)
		{
			
			l=0;
			for(k=1;k<numbers.length;k++)
			{
				
				if(numbers[j]==numbers[k])
				{
					l=l+1;
					
				}

			}
			if(numbers[j]==0 || numbers[j]==numbers[j-1])
				{
					continue;
				}
				System.out.println(numbers[j]+" "+"occurs"+ " "+l+" "+"times");
		}

	}
}