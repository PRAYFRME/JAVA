import java.io.*;
import java.util.*;
import java.lang.*;

class L2P8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean isPalindrome = true; //Note 1

		System.out.print("Enter a Word: ");
		String word = input.nextLine();

		for(int i = 0, j = word.length() - 1; i < j; i++, j--){ //Note 2
			if (word.charAt(i) != word.charAt(j)){ //Note 3
				isPalindrome = false; //Note 4
				break; //Note 5
			} //loop er vitorer if ends

		} // loop ends

			if(isPalindrome){ //Note 6
				System.out.println("The word is a Palindrome");
			} //if ends

			else{
				System.out.println("The word is a not Palindrome");
			} // else if ends


	}// method ends
} // class ends



/*Note 1: Eikhane "isPalindrome" name ey ekta "Flag(boolean variable)" nei, 
jeitake "TRUE" hishebe "Initialize" kori */

/*Note 2: Ei line ta onek important.Mainly "Semicolon (;)" er jonno.
"LOOP" er vitore amra koyta "Semicolon" use kori?
"Loop" er moddhe "Semicolon(;)" amra 2ta use kori.
Jehetu eikhane 2 tar beshi Semicolon(;) use korte parbo na tai amra
SAME TYPE ER KAJ GULOKE "COMMA(,)" DIYE LIKHSI.*/

/*Note 3: Eikhane amra PROTHOM word ta LAST word tar shathe OMIL(Mismatch)
kina oita check kortechi. Jodi Loop tay takao tobe dekhba "i++" onnodike "J--"
eg: RADAR. To RADAR er khetre ki korbe 1st word tar shathe Last word ta compare korbe.*/

/*Note 4: Eikhane ki korbe boloto? Er ager line ey jodi kono omil(Mismatch) pay,
tobe "FLAG"(Bolean variable, Flag o bola hoy) ta ke "False" baniye dibe.*/

/*Note 5: 1 ta omil(Mismatch) pelei to r "Palindrome" thakteche na.Jodi mismatch hoy,
r Palindrome na e hoy, tobe amr to baki word gula ar check korar dorkar nai one by one tai na?
ei karone "BREAK" use korsi. Eita na dileo program kaj korbe. But LOGIC perfect or code 
perfect bolo r jai bolo "BREAK STATEMENT" ta important eikhane.

/* Note 6:Amader "isPalindrome" Flag ta "TRUE" chilona prothome? Kintu
loop ey OMIL ache kina check kore Flag ta ke "False" banano hoiche.
to eikhane Loop er moddhe jodi kono mismatch na pay, tobe "isPalindrome" to TRUE e thakbe,
mismatch paile false. To eikhane jodi "isPalindrome" TRUE e thake tobe WORD TA PALINDROME.
Jodi LOOP ey giye FALSE hoye jay tobe PALINDROME na.*/

/* EXTRA NOTE: Ei code tay "isPalindrome" Flag ta use korai hoiche PRINT deyar kaj korar
jonno. Jodi flag use na kortam, r Loop er moddhei Print deyar kaj ta kortam tobe, 
Ekta ekta word check korto r print diye dito mil pelei. Kintu amra to age full
word ta check korbo then, Palindrome kina seita print dibo. Ei karonei FLAG ta use kora hoiche.*/