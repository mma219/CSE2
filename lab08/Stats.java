
import java.util.Scanner; //import scanner

public class Stats { //create class
    
//  add main method
    public static double meanTest(double a, double b, double c, double d, double e) {
        return (a+b+c+d+e)/5;
    }
    
    public static double medianTest(double a, double b, double c, double d, double e) {
        return c;
    }
    
    public static void print(double mean,double median) {
        System.out.println("The mean is "+mean+" and the median is "+median+".");
    }
 
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //create scanner

        System.out.println("Enter 5 digits in INCREASING order: ");
        
        System.out.print("First Digit: ");
        double v = myScanner.nextDouble();
    
        System.out.print("Second Digit: ");
        double w = myScanner.nextDouble();
        while(w<v) {
            System.out.print("Digits must be entered in increasing order! Try again: ");
            w = myScanner.nextDouble();
        }
        
        System.out.print("Third Digit: ");
        double x = myScanner.nextDouble();
        while(x<w) {
            System.out.print("Digits must be entered in increasing order! Try again: ");
            x = myScanner.nextDouble();
        }
        
        System.out.print("Fourth Digit: ");
        double y = myScanner.nextDouble();
        while(y<x) {
            System.out.print("Digits must be entered in increasing order! Try again: ");
            y = myScanner.nextDouble();
        }
       
        System.out.print("Fifth Digit: ");
        double z = myScanner.nextDouble();
        while(z<y) {
            System.out.print("Digits must be entered in increasing order! Try again: ");
            z = myScanner.nextDouble();
        }
        
        double mean = meanTest(v,w,x,y,z);

        double median = medianTest(v,w,x,y,z);

        print(mean,median);

        
    }
}