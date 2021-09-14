import javax.swing.*;

public class L2P6{
    public static void main(String[] args) {

        
        String Exchange = JOptionPane.showInputDialog(null,"Enter the exchange rate from currecy in U.S. dollars to Bangladeshi Taka: ", "Exchange Rate", JOptionPane.QUESTION_MESSAGE);
        double exchange = Double.parseDouble(Exchange);
        
        String Choice = JOptionPane.showInputDialog(null,"Enter 0 to convert from USD to BDT\n\t or\n 1 to convert from BDT to USD", "Make a Choice", JOptionPane.QUESTION_MESSAGE);
        int choice = Integer.parseInt(Choice);
        
        if(choice == 0){
            String USD = JOptionPane.showInputDialog(null, "Enter the ammount of money in USD", "Input the ammount of money in USD", JOptionPane.QUESTION_MESSAGE );
            double usd = Double.parseDouble(USD);
            
            double BDT = (usd * exchange);
            
            JOptionPane.showMessageDialog(null, "BDT : " +BDT, "In Bangladeshi TK", JOptionPane.INFORMATION_MESSAGE);
        } //IF ends
        
        else if(choice == 1){
            String BDT = JOptionPane.showInputDialog(null, "Enter the ammount of money in BDT", "Input the ammount of money in BDT", JOptionPane.QUESTION_MESSAGE );
            double bdt = Double.parseDouble(BDT);
            
            double USD = (bdt / exchange);
            
            JOptionPane.showMessageDialog(null, "USD : " +USD, "In USD ", JOptionPane.INFORMATION_MESSAGE);
        }//Else if ends
        
        else{
            JOptionPane.showMessageDialog (null,  "You entered wrong number. Please try again", "Warning", JOptionPane.WARNING_MESSAGE);
        }//Else ends
        
    }//Method ends
    
}//Class ends
