////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//Lab 10 - Midterm Arrays
//Professor Chen
//October 30, 2015
//Section 111
//Create two arrays and fill them with randomized midterm grades for each student, then print them

import java.util.Scanner; //import scanner

public class MidtermArray { //create class
    public static void main(String args[]) { //create main method
        Scanner myScanner = new Scanner(System.in); //create scanner
        int numStudents = (int)((Math.random()*6)+5); //create random number for size of arrays
        String []students = new String[numStudents]; //new array for student names
        System.out.println("Enter "+numStudents+" student names: "); //asks user to enter student names
       
        for(int i=0;i<numStudents;i++) { //loop to get input from user for each array value
            System.out.print("Student "+(i+1)+" name: ");
            students[i] = myScanner.next();
        }
        
        int []midterm = new int[numStudents]; //new integer array for midterm grades
        
        for(int n=0;n<numStudents;n++) { //loop to fill midterm grade array with random values from 0-100
            midterm[n] = (int)((Math.random()*101));
        }
        System.out.println(); //spacing
        
        System.out.println("Here are the midterm grades of the "+numStudents+" students above: "); //loop to print out each student's midterm grade
        for(int x=0;x<numStudents;x++) {
            String name = students[x];
            int grade = midterm[x];
            System.out.println(name+" : "+grade);
        }
        
        
    } //close the method
} //close the class