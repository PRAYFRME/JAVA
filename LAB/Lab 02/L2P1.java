import javax.swing.*;

public class L2P1 {
    public static void main(String[] args) {

        String A = JOptionPane.showInputDialog(null, "Enter the value of A", "Quadratic Equation", JOptionPane.QUESTION_MESSAGE);
        int a = Integer.parseInt(A);
        
        String B = JOptionPane.showInputDialog(null, "Enter the value of B", "Quadratic Equation", JOptionPane.QUESTION_MESSAGE);
        int b = Integer.parseInt(B);
        
        String C = JOptionPane.showInputDialog(null, "Enter the value of C", "Quadratic Equation", JOptionPane.QUESTION_MESSAGE);
        int c = Integer.parseInt(C);
        
        double d = (Math.pow(b, 2) - (4 * a * c)); //integer nile prblem kore keno??
        
        double r1 = (-b + Math.pow(d, 0.5))/(2 * a);
        double r2 = (-b - Math.pow(d, 0.5))/(2 * a);
        double root_for_d_zero = (- b / 2 * a); 
        
        if(d > 0){
            JOptionPane.showMessageDialog(null, "First Root is: " +r1 + "\n" + "Second Root is: " +r2,"RESULTS", JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (d == 0){
            JOptionPane.showMessageDialog(null, "The Root is: " +root_for_d_zero,"RESULT", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "The equation has no real root", "Result", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
