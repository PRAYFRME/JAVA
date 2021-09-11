import java.util.Scanner;

class SampleReadInput{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = input.nextLine(); //Note 1

		System.out.println("Enter your age: ");
		int age = input.nextInt();

		System.out.println("Enter your CGPA: ");
		double cgpa = input.nextDouble();

		input.nextLine(); //Note 2 

		System.out.println("Enter your Depertment: ");
		String depertment = input.nextLine();

		System.out.printf("Your name: %s\n", name);
		System.out.printf("Your age: %d\n", age);
		System.out.printf("Your CGPA: %f\n", cgpa);
		System.out.printf("Your Department: %s\n", depertment);
	}
}


/*NOTE 1:"input.next();" just ekta word INPUT nite pare. Like "BASHBAGAN".
Kintu name I mean String ta jodi "ROJAY DHORSE" hoy nite parbe na.
Ei khetre "input.nextLine();" ekta full STRING read korte pare like
"Ola Bibi" */

/*NOTE 2: Reading enter from buffer.Amra cgpa er por jei "Enter" ta dei shei ENTER ta read kore.