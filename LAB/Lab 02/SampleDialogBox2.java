import javax.swing.*;

class SampleDialogBox2{
	public static void main(String[] args){
		String name = JOptionPane.showMessageDialog(null, "ENTER YOUR NAME", "INPUT NAME", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "YOUR NAME IS" +name, "DISPLAY NAME", JOptionPane.INFORMATION_MESSAGE);

	}
}