////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 08 - String Analysis
//Professor Chen
//October 20, 2015
//Section 111
//Get input of shape and calculate area based on inputted dimensions
import java.util.Scanner; //import scanner
public class Area { //create class
    
//  add triangle method 
    public static double triangleArea(double a, double b) {
        return (a*b)/2;
    }
//  add rectangle method
    public static double rectangleArea(double a, double b) {
        return a*b;
    }
//  add circle method
    public static double circleArea(double a) {
        return 3.14159*(a*a);
    }
//  add input method
    public static void input(String testing) {
        //initialize variables
        int checkDigit = 0;
        double dimension1 = 0.0;
        double dimension2 = 0.0;
        String shapeName="";
        
        Scanner myScanner = new Scanner(System.in); //create scanner
        //get a shape name and make sure it's a good input (ie triangle rectangle or circle)
        //if input is bad it keeps asking by using a check digit
        if(testing.equals("inputShape")) {
            System.out.print("Enter a shape (triangle, rectangle, or circle): ");
            String a = myScanner.next();
            while (checkDigit==0) {
                if(a.equals("triangle")) {
                    shapeName = "triangle";
                    checkDigit++;
                }
                else if(a.equals("rectangle")) {
                    shapeName = "rectangle";
                    checkDigit++;
                }
                else if(a.equals("circle")) {
                    shapeName="circle";
                    checkDigit++;
                }
                else {
                    System.out.print("Wrong input. Try again: ");
                    a = myScanner.next();
                }
            }
            checkDigit = 0;
        }
        //gets base and height if shape is triangle or rectangle and makes sure input is double
        if(shapeName.equals("triangle") || shapeName.equals("rectangle")) {
            while(checkDigit==0) {
                System.out.print("Enter base of shape: ");
                //dimension1 = myScanner.nextDouble();
                if(myScanner.hasNextDouble()) {
                    dimension1 = myScanner.nextDouble();
                    checkDigit++;
                    while(checkDigit==1) {
                        System.out.print("Enter height of shape: ");
                        if(myScanner.hasNextDouble()) {
                            dimension2 = myScanner.nextDouble();
                            checkDigit++;
                        }
                        else {
                            System.out.print("Error: Double required. ");
                            myScanner.next();
                        }
                    }
                }
                else {
                    System.out.print("Error: Double required. ");
                    myScanner.next();
                }
            }
            checkDigit=0;
        }
        //gets radius if shape is circle and makes sure input is a double
        if(shapeName.equals("circle")) {
            while(checkDigit==0) {
                System.out.print("Enter radius of circle: ");
                if(myScanner.hasNextDouble()) {
                    dimension1 = myScanner.nextDouble();
                    checkDigit++;
                }
                else {
                    System.out.print("Error: Double required. ");
                    myScanner.next();
                }
            }
        }
        //calls the methods and prints their results to the terminal
        if(shapeName.equals("circle")) {
            System.out.println("The area of the "+shapeName+" is "+circleArea(dimension1)+" square units.");
        }
        if(shapeName.equals("rectangle")) {
            System.out.println("The area of the "+shapeName+" is "+rectangleArea(dimension1,dimension2)+" square units.");
        }
        if(shapeName.equals("triangle")) {
            System.out.println("The area of the "+shapeName+" is "+triangleArea(dimension1,dimension2)+" square units.");
        }
        
        
        
    }
 
    //main method used to call the input method since hw wants all input to be handled in the input method
    public static void main(String[] args) {
        String inputShape = "inputShape";
        //check input to make sure it's a shape
        input(inputShape);
        
        
    }
}