////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 12 - Transpose
//Professor Chen
//November 16, 2015
//Section 111
//Create a row-major rectangular array and fill with random integers, then transpose the array but keep it in row-major format. Should print the same thing but the arrays will be in different format.

import java.util.Scanner; //import the scanner
public class Transpose { //create the main class
    public static int[][] randomMatrix(int height,int width) { //method to create the initial array
        int randNum; //initialize
        int[][] randArray = new int[height][width]; //create array
        for(int row=0;row<randArray.length;row++) { //loop used to fill the array
            for(int col=0; col<randArray[row].length;col++) {
                randNum = (int) (((Math.random()*20))-10); //random value between -10 and 10
                randArray[row][col]=randNum; //assign random value to each member
            }
        }
        return randArray; //return the array
    }

    public static void printMatrix(int[][] randArray,int z) { //create method to print the array
        int width = randArray[0].length; //get the width of the array
        int height = randArray.length; //get the height of the array
        int compareRect; //compare variable to check if rectangular
        

        if(z==1) { //if z=1 do this method of printing
            for(int x=0;x<randArray.length;x++) { //loop to print out each variable in a row-major format
                for(int y=0;y<randArray[x].length;y++) {
                    compareRect = randArray[x].length;
                    if(compareRect!=width) {
                        System.out.println("WARNING: NOT RECTANGULAR!"); //message if not rectangular (aka message if array is jagged)
                    }
                    if(randArray[x][y]>-1) { //if value is non-negative, add an extra space in front of array value
                        System.out.print(" "+randArray[x][y]+" ");
                    }
                    else { //if negative, no space in front of array value
                        System.out.print(randArray[x][y]+" ");
                    }
                }
                System.out.println(); //empty line at the end
            }
        }
        if(z==2) { //second method of printing after the transposition
            for(int a=0;a<width;a++) { //backward method of printing the first array so that it stays in row-major format, should print as the same array as first
                for(int b=0;b<randArray.length;b++) { //inner loop to print out individual values
                    compareRect = randArray.length; //assign compareRect a value to check rectangularity
                    if(height!=compareRect) {
                        System.out.println("WARNING: NOT RECTANGULAR!"); //print warning if not rectangular
                    }
                    if(randArray[b][a]>-1) { //same as before with positive (non-negative) #'s'
                        System.out.print(" "+randArray[b][a]+" ");
                    }
                    else {
                        System.out.print(randArray[b][a]+" ");
                    }
                }
                System.out.println();
            }
        }
        System.out.println();
        
    }
    public static int[][] transposeMatrix(int[][] randArray, int height, int width) { //method for transposition
        int[][] newMatrix = new int[width][height]; //instead of new int[height][width] you make it backwards
        for(int a = 0; a < width; a++) { //loop to assign [a][b]'s values to [b][a]
            for(int b = 0; b < height; b++) {
                newMatrix[a][b] = randArray[b][a];
            }
        }   
        return newMatrix; //return the new matrix
    }
    public static void main(String[] args) { //main method
        int height,width; //initialization
        Scanner myScanner = new Scanner(System.in); //new scanner
        
        System.out.print("Enter matrix width: "); //enter the width
        width = myScanner.nextInt(); //take the next int and store as width
        System.out.print("Enter matrix height: "); //enter height
        height = myScanner.nextInt(); //take the next int and store as height
        System.out.println();
        
        int[][] randArray = randomMatrix(height,width); //store new array as the result of running the randomMatrix method
        System.out.println("Printed Matrix:");
        printMatrix(randArray,1); //print the matrix using print option 1
        System.out.println("Transposed Matrix:"); 
        int[][] tranMatrix = transposeMatrix(randArray,height,width); //store a transformed matrix as tranMatrix using the transposeMatrix method
        printMatrix(tranMatrix,2); //print the new transposed matrix
        System.out.println("Array was transposed from an array of "+height+" member arrays each containing "+width+" numbers to an array of "+width+" member arrays each containing "+height+" numbers."); //message describing the transpose of the matrix
    } //close main method
} //close class