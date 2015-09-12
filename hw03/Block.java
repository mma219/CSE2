////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 03 - Block
//Professor Chen
//September 12, 2015
//Section 111
//Purpose of this program is to calculate the surface area and volume of a block with user-given dimensions



import java.util.Scanner; //import the scanner

public class Block { //create main class
    public static void main(String[] args) { //create main method
        Scanner myScanner = new Scanner ( System.in ); //call the Scanner constructor
        
        System.out.print("Enter the length of the block: "); //message asking for block length
        double blockLength = myScanner.nextDouble(); //scanner to store next integer entered as blockLength
        
        System.out.print("Enter the width of the block: "); //message asking for block width
        double blockWidth = myScanner.nextDouble(); //scanner to store next integer entered as blockWidth
        
        System.out.print("Enter the height of the block: "); //message asking for block height
        double blockHeight = myScanner.nextDouble(); //scanner to store next integer entered as blockHeight
        
        
        double blockVolume = blockLength*blockWidth*blockHeight;
        double blockSurfaceArea = 2*(blockLength*blockWidth) + 2*(blockLength*blockHeight) + 2*(blockWidth*blockHeight);
        
        System.out.println("The volume of the block of dimensions " +blockLength+" x "+blockWidth+" x "+blockHeight+" is "+blockVolume+".");
        System.out.println("The surface area of the block is "+blockSurfaceArea+".");
    
    }
}
