import java.util.Scanner;
public class Search{
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
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int []array1 = new int[5000];
        int []array2 = new int[5000];
        int randNum;
        for(int i=0;i<5000;i++) {
            randNum = (int)((Math.random()*100000));
            array1[i] = randNum;
        }
        int min = array1[0];
        int max = array1[0];
        for(int n=0;n<5000;n++) {
            if(array1[n]<min) {
                min = array1[n];
            }
            if(array1[n]>max) {
                max = array1[n];
            }
        }
        
        for(int x=0;x<5000;x++) {

            array2[x] = (int)((Math.random()*(95000+x)));
            if(x>0) {
                while(array2[(x-1)]>=array2[x]) {
                    array2[x] = (int)((Math.random()*(95000+x)));
                }
            }
        }

        int min2 = array2[0];
        int max2 = array2[0];
        for(int n=0;n<5000;n++) {
            if(array2[n]<min2) {
                min2 = array2[n];
            }
            if(array2[n]>max2) {
                max2 = array2[n];
            }
        }
        System.out.println("The maximum of array1 is: "+max);
        System.out.println("The minimum of array1 is: "+min);
        System.out.println("The maximum of array2 is: "+max2);
        System.out.println("The minimum of array2 is: "+min2);
        
        System.out.print("Enter an int: ");
        int myInt;
        if(myScanner.hasNextInt()) {
            myInt = myScanner.nextInt();
        }
        else {
            return;
        }
        if(myInt<0) {
            return;
        }
        binarySearch(array2,myInt);
        
        
    }
}