////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//Lab 02 - Cyclometer
//Professor Chen
//September 4, 2015
//Section 111
//The purpose of this program is to use the given information on the time that two cycling trips took, the number of wheel revolutions in the trips,
    //and the diameter of the bike wheel in order to calculate information on distance of the trips and the total time of the trips in minutes.


//  define a class
public class Cyclometer{
    
//  add main method
    public static void main(String[] args) {
    
    int secsTrip1=480; //number of seconds that trip 1 took 
    int secsTrip2=3220; //number of seconds that trip 2 took
    int countsTrip1=1561; //number of wheel revolutions on the bike during trip 1
    int countsTrip2=9037; //number of wheel revolutions on the bike during trip 2
    
    double wheelDiameter=27.0, //diameter of the wheel on the bike
    PI = 3.14159, //giving a value for pi so that we can use it in the calculations
    feetPerMile=5280, //universal number of feet per mile
    inchesPerFoot=12, //universal number of inches in a foot
    secondsPerMinute=60; //universal number of seconds in a minute 
    double distanceTrip1, distanceTrip2,totalDistance; //defining three variables; distance of trip1, trip2, and the total distance
    
    System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) +" minutes and had "
        + countsTrip1+" counts."); //prints how long trip 1 was (in time) and the number of wheel revolutions
        
    System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2
        +" counts."); //prints how long trip 2 was (in time) and the number of wheel revolutions
        
    distanceTrip1=countsTrip1*wheelDiameter*PI; //calculates the distance of trip 1 using revolutions, wheel size, and pi
    distanceTrip1/=inchesPerFoot*feetPerMile; //converts the previously calculated distance from feet to miles
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //calculates the distance of trip 2 using revolutions, wheel diameter, and pi and converts it to miles
    totalDistance = distanceTrip1+distanceTrip2; //Adds up the distance of trip 1 and trip 2 to get a total
    
    System.out.println("Trip 1 was " +distanceTrip1+" miles"); //prints the distance of trip 1 in miles
    System.out.println("Trip 2 was " +distanceTrip2+" miles"); //prints the distance of trip 2 in miles
    System.out.println("The total distance was "+totalDistance+" miles"); //prints the total distance of the two trips
    



    }
}