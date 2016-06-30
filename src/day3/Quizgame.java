package day3;

import javax.swing.JOptionPane;

public class Quizgame {
	public static void main(String[] args) {
		String Keemstar = JOptionPane.showInputDialog("How much hate does the rat gnome get?");
		if (Keemstar.equalsIgnoreCase("A lot")) {
			speak("Correct");

		} else {
			for (int i = 0; i < 10; i++) {

				speak("Kill Yourself");
		}
		
		}

		String Leafy = JOptionPane.showInputDialog("Is leafy our lord and savior");
		if (Leafy.equalsIgnoreCase("Yes")) {
			speak("Correct!");
		} else {
			speak("Go away Keemstar lover");
		}
		String LoL = JOptionPane.showInputDialog("Is Trinity Force a good item on Ryze"); {
			if(LoL.equalsIgnoreCase("No"))
			{
				speak("You actually play the game!");
			}else
			{
				speak("Wow you obviously never played the game before!");
	}


	}
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}