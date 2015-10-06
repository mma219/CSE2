////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 06 - CheckDigit
//Professor Chen
//October 6, 2015
//Section 111
//Get an input of an ISBN number and verify if it is valid or not


import java.util.Scanner; //import scanner
public class CheckDigit { //add main class
    public static void main(String[] args) { //add main method
        Scanner myScanner = new Scanner(System.in); //create scanner
        
        //Prompt for barcode and use scanner to accept input
        System.out.print("Please enter a 10 digit barcode: ");
        long input = myScanner.nextLong();
        
        //Use a loop to make sure user enters correct length of barcode (10 digits)
        while(input<100000000 || input >9.999999999E9) {
            System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
            input = myScanner.nextLong();
        }
        
        //Extract the check digit as well as initialize variables for upcoming loop
        int checkDigit = (int)(input%10);
        int sumDigits = 0;
        int n = 10;
        int i = 1000000000;
        //Use while loop to add the sums of each digit multiplied by n
        while (n>1) {
            sumDigits += (int)(((input/i)%10)*n);
            i/=10;
            n--;
        }
        
        //If remainder of (sum/11) is equal to the check digit, tell user the ISBN is valid
        if((checkDigit) == (sumDigits%11)) {
            System.out.println("This is a valid ISBN");
        }
        //If above parameter is not true, it must be an invalid ISBM
        else {
            System.out.println("This is NOT a valid ISBN. Check digit should be " + (sumDigits%11)+".");
        }
        
    }
}