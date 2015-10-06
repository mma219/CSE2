////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 06 - BarGraph
//Professor Chen
//October 6, 2015
//Section 111
//Get an input of expenses for a week and use those numbers to display them on a graph as well 
  //as calculate avg daily expenses and future predicted expenses.

import java.util.Scanner; //import the scanner

public class BarGraph { //define class
    public static void main(String[] args) { //add main method
    
        //Initialize day of week variables
        double monday, tuesday, wednesday, thursday, friday, saturday, sunday;
        Scanner myScanner = new Scanner ( System.in ); //call the Scanner constructor
        
        //Prompt for daily expenses, use loops to reject invalid input
        System.out.println("Enter expenses for each day (i.e. 30.42)");
        
        System.out.print("Monday:    $");
        monday = myScanner.nextDouble();
        while(monday<0) {
            System.out.print("Please enter a positive number! Try again: $");
            monday = myScanner.nextDouble();
        }
        System.out.print("Tuesday:   $");
        tuesday = myScanner.nextDouble();
        while(tuesday<0) {
            System.out.print("Please enter a positive number! Try again: $");
            tuesday = myScanner.nextDouble();
        }
        
        System.out.print("Wednesday: $");
        wednesday = myScanner.nextDouble();
        while(wednesday<0) {
            System.out.print("Please enter a positive number! Try again: $");
            wednesday = myScanner.nextDouble();
        }
        
        System.out.print("Thursday:  $");
        thursday = myScanner.nextDouble();
        while(thursday<0) {
            System.out.print("Please enter a positive number! Try again: $");
            thursday = myScanner.nextDouble();
        }
        
        System.out.print("Friday:    $");
        friday = myScanner.nextDouble();
        while(friday<0) {
            System.out.print("Please enter a positive number! Try again: $");
            friday = myScanner.nextDouble();
        }
        
        System.out.print("Saturday:  $");
        saturday = myScanner.nextDouble();
        while(saturday<0) {
            System.out.print("Please enter a positive number! Try again: $");
            saturday = myScanner.nextDouble();
        }
        
        System.out.print("Sunday:    $");
        sunday = myScanner.nextDouble();
        while(sunday<0) {
            System.out.print("Please enter a positive number! Try again: $");
            sunday = myScanner.nextDouble();
        }
        //Visual graphics using ASCII for the graph
        System.out.println("–––––––––––––––––––––––––––Expenses–––––––––––––––––––––––––––");
        System.out.println("              05   10   15   20   25   30   35   40   45   50");
        System.out.println("Day            |    |    |    |    |    |    |    |    |    | ");
        
        //Round expenses to nearest integer for graph; create new rounded variables
        int mondayRound = (int) Math.round(monday);
        int tuesdayRound = (int) Math.round(tuesday);
        int wednesdayRound = (int) Math.round(wednesday);
        int thursdayRound = (int) Math.round(thursday);
        int fridayRound = (int) Math.round(friday);
        int saturdayRound = (int) Math.round(saturday);
        int sundayRound = (int) Math.round(sunday);
        
        //Use loops to print a "*" for each dollar spent each day of the week
        System.out.print("Monday:    ");
        for(int u=0; u< mondayRound;u++) {
            System.out.print("*");  
        }
            System.out.println();
              
        System.out.print("Tuesday:   ");
        for(int u=0; u< tuesdayRound;u++) {
            System.out.print("*");  
        }
            System.out.println();
                
        System.out.print("Wednesday: ");
        for(int u=0; u< wednesdayRound;u++) {
            System.out.print("*");  
        }
            System.out.println();
                
        System.out.print("Thursday:  ");
        for(int u=0; u< thursdayRound;u++) {
            System.out.print("*");  
        }
            System.out.println();
               
        System.out.print("Friday:    ");
        for(int u=0; u< fridayRound;u++) {
            System.out.print("*");  
        }
            System.out.println();
                
        System.out.print("Saturday:  ");
        for(int u=0; u< saturdayRound;u++) {
            System.out.print("*");  
        }
        System.out.println();
        System.out.print("Sunday:    ");

        for(int u=0; u< sundayRound;u++) {
            System.out.print("*");  
        }
            System.out.println();
        
        System.out.println("––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––––");
        
        //Calculate week expenses from each input
        double weekExpenses = monday+tuesday+wednesday+thursday+friday+saturday+sunday;

        //Create variables for upcoming loop
        double expenses = 0;
        double fluctuation = 0;
        int randNum = 0;
        
        //Loop to generate 52 unique fluctuations in spending, totaling to a year
        for(int x=0; x<52; x++) {
            randNum = (int) ((Math.random()*40)+1);
            if(randNum>0 && randNum <= 20) {
                randNum*=-1;
                randNum+=100;
                fluctuation = (double) randNum/100;
            }
            else{
                randNum+=80;
                fluctuation = (double) randNum/100;
            }
            expenses += (weekExpenses*fluctuation);
            randNum = 0;

        }
        
        //Rounded expenses represents the avaerage daily expenses and round to 2 decimals
        double roundedExpenses =  ((int)((weekExpenses/7)*100))/((double)100.0); 
        
        //Multiply expenses generated in loop x 4 years and round to 2 decimals
        double fourYearExpenses = (int) (expenses*4*100)/(double)(100.0);
        
        //Print results of avg daily expenses and estimated expenditure
        System.out.println("Your average daily expenses are: $ "+roundedExpenses);
        System.out.println("Estimated expenditure for 4 years: $ "+fourYearExpenses);

        
        
    }   
}