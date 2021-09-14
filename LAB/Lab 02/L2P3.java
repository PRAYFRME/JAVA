import javax.swing.*;

public class L2P3{
    public static void main(String[] args) {
     
        int max, min, reminder;
        
        String first = JOptionPane.showInputDialog(null, "Enter First Integer", "Input First Integer", JOptionPane.QUESTION_MESSAGE);
        int firstNumber = Integer.parseInt(first);
        
        String second = JOptionPane.showInputDialog(null, "Enter SECOND Integer", "Input SECOND Integer", JOptionPane.QUESTION_MESSAGE);
        int secondNumber = Integer.parseInt(second);
        
        if(firstNumber >= secondNumber){
            max = firstNumber;
            min = secondNumber;
	    }

        else{
            max = secondNumber;
            min = firstNumber;
        }

        while(max % min != 0){

            reminder = max % min;
            max = min;
            min = reminder;
        }
                
        JOptionPane.showMessageDialog(null, "GCD is :  " +min, "RESULT OF GCD", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
