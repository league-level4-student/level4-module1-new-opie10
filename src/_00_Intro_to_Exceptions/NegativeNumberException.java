package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	
	
	public static void scaryPopup() {
		JOptionPane.showMessageDialog(null, "Your Computer is about to die. Panic");
		
	}
	public static void testPositive(int i) throws NegativeNumberException {
		if (i<0) {
			throw new NegativeNumberException();
		}
	}
	public static void main(String[] args) {
		try {
			testPositive(1);
		} catch (NegativeNumberException e) {
			e.printStackTrace();
			scaryPopup();
		}
			finally {
			JOptionPane.showMessageDialog(null, "All fixed go on with your life");
		}
	}
}
