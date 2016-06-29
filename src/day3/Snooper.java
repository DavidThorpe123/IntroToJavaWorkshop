package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	String Bank = JOptionPane.showInputDialog("What is your bank deatils");
	String LoL = JOptionPane.showInputDialog("Who do you main?");
	String Steam = JOptionPane.showInputDialog("Give me your password!");
	String Code = JOptionPane.showInputDialog("Do you like coding?");
	JOptionPane.showMessageDialog(null,"I learned that your bank details are " + Bank);
	JOptionPane.showMessageDialog(null,"I learned that you main " + LoL );
	JOptionPane.showMessageDialog(null, "Thanks now I can grab all your items using the password " + Steam );
	JOptionPane.showMessageDialog(null,"So do I!");
}
}
