import java.io.*;
import java.util.*;
import java.lang.*;

public class L2P4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int best = 0; 
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        int[] array = new int[numberOfStudents];
        
        System.out.print("Enter " + numberOfStudents + " scores: ");
        
        for(int i = 0; i < numberOfStudents; i++){
            array[i] = input.nextInt();
        } //Loop I ends
        
        for(int j = 0; j < numberOfStudents; j++){
            if(array[j] > best ){
                best = array[j];
            }
        } //Loop J ends
        
        for(int j = 0; j < numberOfStudents; j++){
            if(array[j] >= (best - 10)){
                System.out.println("Student " + j + " score is " +array[j] +" and grade is A");
            }
            
            else if(array[j] >= (best - 20)){
                System.out.println("Student " + j + " score is " +array[j] +" and grade is B");
            }
            
            else if(array[j] >= (best - 30)){
                System.out.println("Student " + j + " score is " +array[j] +" and grade is C");
            }
            
            else if(array[j] >= (best - 40)){
                System.out.println("Student " + j + " score is " +array[j] +" and grade is D");
            }
            
            else{
                System.out.println("Student " + j + " score is " +array[j] +" and grade is F");
            }
        }//Loop for displaying result ends
        
    }//Method Ends
}//class Ends 
