////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 07 - Twisty
//Professor Chen
//October 14, 2015
//Section 111
//User inputs a length and width and throught the use of loops a design is printed
import java.util.Scanner; //import scanner
public class Twisty { //create class
    
//  add main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); //create scanner
        
        //Introduce length and width variables
        int length = 0; 
        int width = 0;

        //a switch to decide if you want to ask again
        boolean acceptable = false;
        boolean acceptable2 = false;
        
        System.out.println("NOTE: I was only able to get it to work flawlessly with odd widths and odd lengths. Was sick and missed TA hours due to this.");
//INPUT # 1
        //loop until you get acceptable input (i.e. if it's a integer)
        System.out.print("Input your desired length: ");
        while( !acceptable ){
        //check if the input is a integer.
            if (myScanner.hasNextInt() ){
            //if so, store it.
                length = myScanner.nextInt();
                if(length<=80 && length>=0) {
                    acceptable = true;
                }
                else{
                    System.out.println("   ERROR: Length must be between 0 and 80");
                    System.out.print("Input your desired length: ");
                }
            }
            else{
            //if not, trash it.  This does not assign the output of 
            //next() to anything. The output is just discarded.
                System.out.println("   ERROR: Need a int");
                System.out.print("Input your desired length: ");
                myScanner.next();
            }
        }  

//INPUT # 2
        //loop until you get acceptable input (i.e. if it's a integer)
        System.out.print("Input your desired width: ");
        while( !acceptable2 ){
        //check if the input is a integer.
            if (myScanner.hasNextInt() ){
            //if so, store it.
                width = myScanner.nextInt();
                if(width<=80 && width<=length && width>=0) {
                    acceptable2 = true;
                }
                else{
                    System.out.println("   ERROR: Width must be between 0 and 80 and not larger than length");
                    System.out.print("Input your desired width: ");
                }
            }
            else{
            //if not, trash it.  This does not assign the output of 
            //next() to anything. The output is just discarded.
                System.out.println("   ERROR: Need a int");
                System.out.print("Input your desired width: ");
                myScanner.next();
            }
        }  

//Introduce variables n, a, b
        int n =0;
        String a = "";
        String b = "";
        
        
        for(int i = 0; i < width; i++) { //outer loop to control number of lines

            for(int j = 0; j < length; j++) { //inner loop to control contents of lines
                //if n is even, use certain characters, if odd use others
                if (n%2==0){
                    a = "#";
                    b = "/";
                }
                else {
                    a = "\\";
                    b="#";
                }
                //If statements to decide which characters are printed where
                 if(i==j%width) {
                    System.out.print(a);
                } 
                //Else if statement so that if two parameters are correct only one character printed
                 else if(i==width-(j%width)-1) {
                    System.out.print(b);
                }

                else{
                    System.out.print(" ");  //fill in all other spots with aterisk
                }
                
                n++;
            } //close inner loop
            System.out.println(" "); //Go to the next line each time the loop runs
            
        }  //close outer loop
        
    }
}             
