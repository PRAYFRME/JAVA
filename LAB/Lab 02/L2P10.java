import java.io.*;
import java.lang.*;
import java.util.Scanner;
import javax.swing.*;
class L2P10
{
	public static void main(String[] args)
	{
		int a,b,c=0,d=0,i,j;
		int str[]=new int[10];
		int str1[]=new int[10];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter numbers with the limit of 10: ");
		for(i=0;i<str.length;i++)
		{
			str[i]=input.nextInt();
		}
		for(i=0;i<str.length;i++)
		{
			for(j=0;j<=i;j++)
			{
				if(str[i]==str[j])
				{
					c=c+1;
				}
			}
			if(c==1)
			{
				str1[d]=str[i];
				d=d+1;
			}
			c=0;
		}
		System.out.print("Distinct numbers: ");
		for(i=0;i<d;i++)
		{
			System.out.print(str1[i]+" ");
		}
		System.out.println("");
	}
}