////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//Lab 03 - Check
//Professor Chen
//September 11, 2015
//Section 111
//Purpose of this program is to allow a user to enter a bill total, to be able to add a tip, and split the cost among "n" people

//Import the Java scanner
import java.util.Scanner;

//  define a class
public class Check {

//  add main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner ( System.in ); //call the Scanner constructor
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //message asking for cost of check
        double checkCost = myScanner.nextDouble(); //accept the user input of the check cost
        
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); //message asking for tip percent
        double tipPercent = myScanner.nextDouble(); //accepts user input of tip percent
        tipPercent /= 100; //divides the tip percentage by 100 
        
        System.out.print("Enter the number of people who went out to dinner: "); //message asking for number of people paying the check
        int numPeople = myScanner.nextInt(); //accept the input of the next integer entered
        
        double totalCost; //declare variable for the total cost
        double costPerPerson; //declare variable for the cost per person
        int dollars, //variable for the number of dollars (integer) the bill is
            dimes, pennies; //variables for digits (still integers) that are to the right of the decimal point for cost
            
        totalCost = checkCost * (1+tipPercent); //declares total cost as the cost of check + the tip
        costPerPerson = totalCost/numPeople; //divides that total cost with tip by the number of people
        dollars=(int)costPerPerson; //variable for the number of dollars(integer) that each person owes
        dimes=(int)(costPerPerson*10) % 10; //variable for the remainder when the per person cost is multiplied by 10 and divided by 10
        pennies=(int)(costPerPerson*100) % 10; //variable for the remainder when the per person cost is multiplied by 100 and divided by 10
        System.out.println("Each person in the group owes $"+dollars+'.'+dimes+pennies); //message displaying how much $ each person owes
        
        
        
    } //end of main method
} //end of class