public class GettingLoopy{
    
//  add main method
    public static void main(String[] args) {
        
//STEP 1  
         System.out.println("Step 1:");
         int i=1; //variable used for first loop 
         int j=0; //variable used for second loop
     
         while(i>=1 && i<=7) {
               System.out.print(i);
               i++;
         }
        while(j>=0 && j<=5) {
            System.out.print("7");
            j++;
         }
        System.out.println(); //corrects formatting issue where numbers are printed oddly (ie "123456777777mma219@cse2:~/workspace")
        System.out.println();
//END OF STEP 1
    
//STEP 2
    
    //BEGINNING OF LOOP 1
        System.out.println("Step 2:");
        System.out.print("WHILE LOOP: ");
        int g=10;
        while(g>=10 && g<=100) {
            int h = 2;
            int numPrime = 0;
            while(h>=2 && h<g) {
                if((g%h)==0) {
                    numPrime++;
                }
                h++;
            }
            if(numPrime==0) {
                System.out.print(g+" ");
            }

            g++;
            numPrime=0;
            h=0;
        }
        System.out.println();
    //END OF LOOP 1
    
    
    //START OF LOOP 2
        System.out.print("FOR LOOP: ");
        for (int x = 10; x >= 10 && x <= 100; x++) {
        int numPrime2 = 0;
            for (g = 2; g >= 2 && g < x; g++) {
                if (x % g == 0) {
                numPrime2++;
                }
            }
            if(numPrime2==0) {
                System.out.print(x+" ");
            }
        }
        System.out.println();
    //END OF LOOP 2
    
    //START OF LOOP 3
    
        int t=10;
        System.out.print("DO WHILE LOOP: ");
        do {
            int z = 2;
            int numPrime = 0;
            while(z>=2 && z<t) {
                if((t%z)==0) {
                    numPrime++;
                }
                z++;
            }
            if(numPrime==0) {
                System.out.print(t+" ");
            }

            t++;
            numPrime=0;
            z=0;
        }
        while(t>=10 && t<=100);
        System.out.println();
        System.out.println();
    //END OF LOOP 3
//END OF STEP 2

//START OF STEP 3
        System.out.println("Step 3:");

        int randNum = (int) ((Math.random()*200)+1);
        for(int u=0; u<= randNum;u++) {
            System.out.print("ツ");  
        } 

        System.out.println();
//END OF STEP 3
    }
}