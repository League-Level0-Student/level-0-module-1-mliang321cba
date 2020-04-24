package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String input = JOptionPane.showInputDialog("What has 13 hearts but no other organs?");
		if(input.equalsIgnoreCase("A deck of cards")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The answer is a deck of cards.");
		}
		
		String input2 = JOptionPane.showInputDialog("What can be broken, even without picking it up or touching it?");
		if(input2.equalsIgnoreCase("A promise")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The answer is a promise.");
		}
		
		String input3 = JOptionPane.showInputDialog("What word becomes shorter when you add 2 letters to it?");
		if(input3.equalsIgnoreCase("short")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score = score + 1;
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect. The answer is \"short\".");
		}
		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score + ".");
		if(score==0) {
			JOptionPane.showMessageDialog(null, "You did not do very well.");
		}
		if(score==1) {
			JOptionPane.showMessageDialog(null, "Well, at least you got one riddle right.");
		}
		if(score==2) {
			JOptionPane.showMessageDialog(null, "You almost got all of them right!");
		}
		if(score==3) {
			JOptionPane.showMessageDialog(null, "You did great!");
		}
	}
}

