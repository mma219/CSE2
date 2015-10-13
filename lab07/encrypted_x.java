
import java.util.Scanner;
public class encrypted_x {
    
//  add main method
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int input = 0;

        //a switch to decide if you want to ask again
        boolean acceptable = false;

        //loop until you get acceptable input (i.e. if it's a double)
        System.out.print("Input int between 0 and 100: ");
        while( !acceptable ){
        //check if the input is a double.
            if (myScanner.hasNextInt() ){
            //if so, store it.
                input = myScanner.nextInt();
                if(input<=100 && input>=0) {
                    acceptable = true;
                }
                else{
                    System.out.println("   ERROR: Out of bounds");
                    System.out.print("Input your int: ");
                }
            }
            else{
            //if not, trash it.  This does not assign the output of 
            //next() to anything. The output is just discarded.
                System.out.println("   ERROR: Need a int");
                System.out.print("Input your int: ");
                myScanner.next();
            }
        }  
        
        for(int i = 0; i < input; i++) { //outer loop to control number of lines
            
            for(int j = 0; j < input; j++) { //inner loop to control contents of lines
                
                if(i==j){  //add appropriate spaces to create half of the "X"
                    System.out.print(" ");
                }
                else if(i==(input-j-1)){ //add appropriate spaces to create second half of the "X"
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");  //fill in all other spots with aterisk
                }
            }
            System.out.println(" "); //Go to the next line each time the loop runs
        } 
        
    }
}