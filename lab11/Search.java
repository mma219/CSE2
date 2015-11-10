import java.util.Scanner;
public class Search{
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
        int middle = (array2.length)/2;
        boolean searchFound = false;
        while(searchFound==false) {
            if(array2[middle]>=myInt) {
                middle=(middle)+(middle/2);
            }
            else if(array2[middle]<myInt) {
                middle=(middle)-(middle/2);
            }
            if(array2[middle]==myInt) {
                System.out.println("found"+array2[middle]+myInt);
                searchFound = true;
                
            }
        
        }
        
        
    }
}