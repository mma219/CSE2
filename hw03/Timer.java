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

        int numMinutesCurrent = ((int) ((currentTime)/100)*60) + (int) (currentTime%100); //convert the current time to number of minutes in the day
        int numMinutesDinner = ((int) ((dinnerTime)/100)*60) + (int) (dinnerTime%100); //convert the time of dinner to number of minutes in the day
        
        int minutesDifference = (int) numMinutesDinner-numMinutesCurrent; //subtract the minutes of the day currently from the minutes of the day at dinnertime

        int numHoursUntil = (int) (minutesDifference/60); //calculate the number of hours until dinner given minutes
        int minutesAfterHour = (int) (minutesDifference%60); //calculate the number of minutes after the hour until dinner
        
        System.out.println("You have " + numHoursUntil + " hours and "+minutesAfterHour+" minutes until dinner." ); //print hours and minutes until dinner

    } //close the method
} //close the class