import javax.swing.*;

class BMI{
	public static void main(String[] args) {
		String Weight = JoptionPane.showInputDialog(null, "Enter Weight in KG", "Input Weight", JOptionPane.QUESTION_MESSAGE);
		double weight = Double.parseDouble(Weight);

		String Height = JoptionPane.showInputDialog(null, "Enter Height in METERS", "Input Weight", JOptionPane.QUESTION_MESSAGE);
		double height = Double.parseDouble(Height);

		double bmi = weight / Math.pow(height, 2);

		JOptionPane.showMessageDialog(null, "BMI IS : " +bmi, "RESULT",JOptionPane.INFORMATION_MESSAGE);
	}
}