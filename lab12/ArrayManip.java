
public class ArrayManip {
    public static int[][] raggedArray() {
        int randNum = (int)((Math.random()*11)+10);
        int[][] myArray = new int[randNum][];
        for(int i =0;i<myArray.length;i++) {
            randNum = (int)((Math.random()*11)+10);
            myArray[i] = new int[randNum];
            for(int n =0;n<myArray[i].length;n++) {
                randNum = (int) (((Math.random()*2000))-1000);
                myArray[i][n]= randNum;
            }
        }
        return myArray;
    }
    public static int[] findSmallest(int[][] myArray) {
        int smallest =myArray[0].length;
        for(int i=1;i<myArray.length;i++) {
            if(myArray[i].length<smallest) {
                smallest=i;
            }
        }
        int length = myArray[smallest].length;
        int[] newArray = new int[length];
        for(int i=0;i<length;i++) {
            newArray[i] = myArray[smallest][i];
        }
        
        return newArray;
    }
    public static int[] findLargest(int[][]myArray) {
        int largestMember=-1001;
        int largestArray=myArray[0].length;
        for(int i=0;i<myArray.length;i++) {
 
            for(int n=0;n<myArray[i].length;n++) {
                if(myArray[i][n]>largestMember) {
                    largestMember=myArray[i][n];
                    largestArray = i;
                }
            }
        }
        int length = myArray[largestArray].length;
        int[] newArray = new int[length];
        for(int x=0;x<length;x++) {
            newArray[x] = myArray[largestArray][x];
        }
        System.out.println("The largest member of any array is "+largestMember+".");
        System.out.println();
        return newArray;
    }
    public static void printArray(int[] myArray) {
        for(int i=0;i<myArray.length;i++) {
                if(myArray[i]>-1 && myArray[i]<10) {
                    System.out.print("   "+myArray[i]+" ");
                }
                else if(myArray[i]>9 && myArray[i]<100) {
                    System.out.print("  "+myArray[i]+" ");
                }
                else if(myArray[i]>99){
                    System.out.print(" "+myArray[i]+" ");
                }
                else if(myArray[i]<0 && myArray[i]>-10) {
                    System.out.print("  "+myArray[i]+" ");
                }
                else if(myArray[i]<-10 && myArray[i]>-100) {
                    System.out.print(" "+myArray[i]+ " ");
                }
                else if(myArray[i]<-99) {
                    System.out.print(myArray[i]+" ");
                }
        }
        System.out.println();
    }
    public static void printArray(int[][] myArray) {
        for(int x=0;x<myArray.length;x++) {
            for(int y=0;y<myArray[x].length;y++) {
                if(myArray[x][y]>-1 && myArray[x][y]<10) {
                    System.out.print("   "+myArray[x][y]+" ");
                }
                else if(myArray[x][y]>9 && myArray[x][y]<100) {
                    System.out.print("  "+myArray[x][y]+" ");
                }
                else if(myArray[x][y]>99){
                    System.out.print(" "+myArray[x][y]+" ");
                }
                else if(myArray[x][y]<0 && myArray[x][y]>-10) {
                    System.out.print("  "+myArray[x][y]+" ");
                }
                else if(myArray[x][y]<-10 && myArray[x][y]>-100) {
                    System.out.print(" "+myArray[x][y]+ " ");
                }
                else if(myArray[x][y]<-99) {
                    System.out.print(myArray[x][y]+" ");
                }
            }
            System.out.println();
        }
    }
    public static int[] mostEven(int[][] myArray) {
        int numEven=0;
        int numEvenMost=0;
        int withMost =0;
        for(int i=0;i<myArray.length;i++) {
            for(int n=0;n<myArray[i].length;n++) {
                if((myArray[i][n])%2==0){
                    numEven++;
                }
            }
            if(numEven>numEvenMost) {
                numEvenMost=numEven;
                withMost=i;
            }
            numEven=0;
        }
        int length = myArray[withMost].length;
        int[] newArray = new int[length];
        for(int x=0;x<length;x++) {
            newArray[x] = myArray[withMost][x];
        }
        return newArray;
        
    }

    public static void main(String[] args) {
        int[][] myArray = raggedArray();
        System.out.println("Printed array:");
        printArray(myArray);
        int[] smallest = findSmallest(myArray);
        System.out.println();
        System.out.println("Printed smallest member array:");
        printArray(smallest);
        System.out.println();
        int[] largeArray=findLargest(myArray);
        System.out.println("Member array that contains largest member:");
        printArray(largeArray);
        System.out.println();
        int[] mostEvenArray = mostEven(myArray);
        System.out.println("Member array with most even members:");
        printArray(mostEvenArray);
    }
}