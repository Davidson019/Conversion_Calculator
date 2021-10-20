package com.company;

import javax.swing.*;

public class Main {
    public static void task() {
        // Creating an array of choices for the user to choose from
        String[] choices = { "Display Binary Format of a number", "Binary <=> Decimal Conversion", "Decimal <=> Hexadecimal Conversion", "Binary <=> Hexadecimal Conversion", "Addition of Binary numbers" };

        // Getting choice from the User
        int choice = JOptionPane.showOptionDialog( null, "What would you like to do?", "CONVERSION CALCULATOR", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, choices[0] );

        // Calling of Conversion methods based on users choice
        try{
            switch (choice) {
                case 0:
                    Convertor.binaryDisplay();
                    break;
                case 1:
                    Convertor.binaryDecimal();
                    break;
                case 2:
                    Convertor.decimalHex();
                    break;
                case 3:
                    Convertor.binaryHex();
                    break;
                case 4:
                    Convertor.addBinary();
                    break;
                default:
                    return;
            }
        }
        catch( Exception e ) {

        }
    }

    public static void progress() {
        int next = JOptionPane.showConfirmDialog( null, "Would you like to do any other thing?", "Conversion Calculator", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );

        if (next == JOptionPane.YES_OPTION) {
            task();
        } else {
            JOptionPane.showMessageDialog(null, "Alrighty.\n\nStay Safe!!!", "Conversion Calculator", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
	    // Welcome Message to the User
        JOptionPane.showMessageDialog(null, "Welcome!\nAs you've guessed, this a CONVERTOR Program I have written with java.\nOver the next few lines, I'd discuss briefly about the scope of function of my Convertor.", "CONVERSION CALCULATOR", JOptionPane.PLAIN_MESSAGE);

        // Description of how the program works
        JOptionPane.showMessageDialog(null, "Basically, This Convertor deals in:\n    \u2022 The Conversion between Binary & Decimal Numbers,\n    \u2022 The Conversion between Decimal & Hexadecimal Numbers,\n    \u2022 The Conversion between Binary & Hexadecimal Numbers,\n    \u2022 The Addition of two Binary Numbers,\n    \u2022 Also, the Display of any Number Base in Binary Format.", "CONVERSION CALCULATOR", JOptionPane.INFORMATION_MESSAGE);

        // Asking User for the Conversion action to be performed
        task();
    }
}