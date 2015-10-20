////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 08 - String Analysis
//Professor Chen
//October 20, 2015
//Section 111
//Get a string input and display whether all (or specified amount of) characters are letters in the alphabet

import java.util.Scanner; //import scanner
public class StringAnalysis { //create class
    
    public static boolean stringAnalyze(String fullString) { //method for analyzing all of the string
       //initialize blank variables
       char b = fullString.charAt(0);
       int fals = 0;
       int tru = 0;
       int inputLength = fullString.length(); //gets the length of the inputted string
       //Loop to check if the string has any non-letter characters using counter vars
       for(int i=0; i<inputLength;i++) {
            b = fullString.charAt(i);
            if(Character.isLetter(b) == false) {
                fals++;
            }
            else{
                tru++;
            }
        }
        //if/else statement to return appropriate boolean values based on whether any non-letters were detected
        if(fals!=0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    //method for analyzing only a specific amount of characters in string...same as above method with different var names, different parameters, and different counter limit in loop
    public static boolean stringAnalyze(String fullString, int num) {
       char c = fullString.charAt(0);
       int fals1 = 0;
       int tru1 = 0;
       for(int i=0; i<num;i++) {
            c = fullString.charAt(i);
            if(Character.isLetter(c) == false) {
                fals1++;
            }
            else{
                tru1++;
            }
        }
        if(fals1!=0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) { //main method
        Scanner myScanner = new Scanner(System.in); //create scanner
        //initialize variables
        boolean result = false;
        int numLetters = 0;
        int checkDigit = 0;
        //Begin to get input from the user
        System.out.print("Enter a string: ");
        String inputString = myScanner.next();
        System.out.print("Examine all characters? (yes or no): ");
        String examineAll = myScanner.next();
        //loop to check if the input is either yes or no and accepts integer input if answer is no
        while(checkDigit==0) {
            if(examineAll.equals("yes")) {
                result = stringAnalyze(inputString);
                checkDigit++;
            }
            else if(examineAll.equals("no")) {
                while(numLetters==0) {
                    System.out.print("How many letters?: ");
                    if(myScanner.hasNextInt()) {
                        numLetters = myScanner.nextInt();
                        if(numLetters>inputString.length()) {
                            result = stringAnalyze(inputString);
                        }
                        else {
                            result = stringAnalyze(inputString,numLetters);
                        }
                    }
                    else {
                        System.out.println("Error: Enter an integer greater than 0. ");
                        myScanner.next();
                    }
                }
                checkDigit++;
            }
            else {
                System.out.print("Error: Enter yes or no. ");
                examineAll = myScanner.next();
            }
        }
        
        //Outputs the results after the appropriate method is called with the appropriate parameters
        
        if(result == true && examineAll.equals("yes")) {
            System.out.println("The string '"+inputString+"' contains all letters.");
        }
        if(result == false && examineAll.equals("yes")){
            System.out.println("The string '"+inputString+"' does not contain all letters.");
        }
        if(result == true && examineAll.equals("no")) {
            System.out.println("The string '"+inputString+"' contains all letters for the characters examined.");
        }
        if(result == false && examineAll.equals("no")) {
            System.out.println("The string '"+inputString+"' does not contain all letters for the characters examined.");
        }
    
    
    }//close main method
} //close class