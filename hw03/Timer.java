////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 03 - Timer
//Professor Chen
//September 12, 2015
//Section 111
//Purpose of this program is to get the current time from user and time of dinner, and to tell then how much time there is until dinner



import java.util.Scanner; //import the scanner

public class Timer { //create main class
    public static void main(String[] args) { //create main method
        Scanner myScanner = new Scanner ( System.in ); //call the Scanner constructor
        
        System.out.print("Current time (i.e 1530 = 3:30pm): "); //message asking for current time
        double currentTime = myScanner.nextInt(); //scanner to store next integer entered as currentTime
        
        System.out.print("Dinner time: "); //message asking for dinner time
        double dinnerTime = myScanner.nextInt(); //scanner to store next integer as dinnerTime


        double currentMinutes = currentTime%100; //get the remainder of dividing currentTime by 100, results in minutes after the hour
        double dinnerMinutes = dinnerTime%100; //get the remainder of dividing dinnerTime by 100, results in minutes after the hour
        
        int differenceTime = (int) ((dinnerTime-currentTime)/100); //subtracts currentTime from dinnerTime and divides by 100 to get HOURS till dinner
        
        double subtractMinutes = (double)(dinnerMinutes-currentMinutes); //subtracts the minutes after hour of currentTime from minutes after hour of dinnerTime 
      
        if(subtractMinutes<0) { //if statement so that if subractMinutes is less than 0 it finds the remainder when it is divided by 60, multiplied by -1 to get a positive #, and subtracted from 60 
            System.out.println(differenceTime+" hours and " + (int)((60-(subtractMinutes%60)*-1)) +" minutes.");
        } //close the if statement
        
        else{ //if subtractMinutes is greater than 0, then it doesn't need any extra calculations so it is just tacked on after the # of hours
            System.out.println(differenceTime+" hours and " + (int)subtractMinutes +" minutes.");
        } //close the else statement

        
        
        
    } //close the method
} //close the class