////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 11 - CSE2Linear
//Professor Chen
//November 10, 2015
//Section 111
//User enters final grades and then can search for entered grades

import java.util.Scanner; //import the scanner
public class CSE2Linear { //create the main class
    public static void printArray(int[] grades,String first) { //method to print array; doesn't return anything, array input
        String printed = first+ "in CSE2: "; //initalize "printed" variable
        for(int i=0;i<grades.length;i++) { //loop to add each item of the array to a single string
            printed+=(grades[i]+" ");
        }
        System.out.println(printed); //print the string
    }
    
    public static int[] shuffle(int[] grades) { //shuffling method
        for (int i=0; i<grades.length; i++) {	//find a random number to swap with
	        int target = (int) (grades.length * Math.random() ); //picks random number between 0 and grades.length
	        //swap the values
	        int temp = grades[target];
	        grades[target] = grades[i];
	        grades[i] = temp;
        }
        return grades; //return shuffled deck, which will be printed with the printArray method
    }
    
    public static void binarySearch(int[] list, int key) { //create the method which takes an array and integer as input, and returns nothing
        int low=0; //initalize low for binary search
        int iterations = 0; //initialize iteration counter
        boolean found = false; //boolean to see if number was found 
        int high = list.length - 1; //create the high of the binary search
        while(high>=low) { //loop to keep running until low > high
            iterations++; //count iterations
            int mid = (low+high)/2; //average of low and high = mid
            if(key < list[mid]) { //if key is less than the item in the array, make the high one less than the mid
                high = mid-1;
            }
            else if(key == list[mid]) { //if the key is equal to the array item, change "found" to true, and exit the loop
                found = true;
                high = low-1;
            }
            else { //if key > item in the array, make the low one more than the mid
                low = mid + 1;
            }
        } //close the loop
        if(found==true) { //message if key found in the array
            System.out.println(key+" was found after "+iterations+" iterations.");
        }
        else{ //message if key not found in array
            System.out.println(key+" was not found after "+iterations+" iterations.");
        }
    } //close the method
    
    public static void linearSearch(int[] finalGrades,int searchTerm) { //create linear search method
        int iterations = 0; //initalize counter var
        boolean found=false; //determines whether it was found
        for(int i=0;i<15;i++) { //loop that runs up to 15 times
            iterations++; //counts the number of iterations
            if(finalGrades[i] == searchTerm) { //if statement to print if the number found
                found=true;
                System.out.println(searchTerm+" was found with "+(i+1)+" iterations.");
                break; //break the loop if found
            }
        }
        if(found==false) { //if not found, print that it wasn't found + # of iterations
            System.out.println(searchTerm+" was not found with "+iterations+" iterations.");
        }
        
    }
    
    public static void main(String args[]) { //main method
        Scanner myScanner = new Scanner(System.in); //initialize the Scanner
        int[] finalGrades = new int[15]; //create integer array that holds 15 items
        boolean acceptable = false; //logical operator for upcoming loops
        for(int i=0;i<15;i++) { //loop to run 15 times for each variable in the array
            while( !acceptable ){ //while false, keep running
                System.out.print("Entry "+(i+1)+": "); //Print entry number
                if(myScanner.hasNextInt()) { //if scanner picks up an int keep going
                    finalGrades[i] = myScanner.nextInt(); //assign the int to finalgrades[i]
                    if(finalGrades[i]>=0 && finalGrades[i]<=100) { //decides if accceptable
                        if(i==0) {
                            acceptable=true;
                        }
                        if(i>0 && (finalGrades[i]>=finalGrades[i-1])) { //decides if acceptable
                            acceptable=true;
                        }
                    }
                    if(finalGrades[i]<0 || finalGrades[i]>100) { //error message for out of bounds
                        System.out.print("ERROR: Must be within bounds of 0-100. ");
                    }
                    if((i>0)&&(finalGrades[i]<finalGrades[i-1])) { //error message for not being in increasing order
                        System.out.print("ERROR: Must be greater than or equal to the previous entry. ");
                    }
                }
                else{ //if no integer picked up by scanner, throw a error for not being an integer
                    System.out.print("ERROR: Must be an integer. ");
                    myScanner.next();
                }
            }
            acceptable=false; //for each "i" in the loop, make acceptable=false at the end of each loop
        }

        printArray(finalGrades,"Grades "); //run the method to print the array
        System.out.print("Enter a grade to search for: "); //message asking for input for search
        int searchTerm = myScanner.nextInt(); //receive input for search
        binarySearch(finalGrades,searchTerm); //run method to search the array
        shuffle(finalGrades); //run method to shuffle array
        printArray(finalGrades,"Shuffled grades "); //run method to print the array
        System.out.print("Enter a grade to search for: "); //message asking for input for search
        searchTerm = myScanner.nextInt(); //receive input for search
        linearSearch(finalGrades,searchTerm); //run method again to search array
    } //close the main method
} //close the class