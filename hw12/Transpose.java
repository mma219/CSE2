import java.util.Scanner;
import java.util.Arrays;
public class Transpose {
    public static int[][] randomMatrix(int height,int width) {
        int randNum;
        Scanner myScanner = new Scanner(System.in);
        int[][] randArray = new int[height][width];
        for(int row=0;row<randArray.length;row++) {
            for(int col=0; col<randArray[row].length;col++) {
                randNum = (int) (((Math.random()*20))-10);
                randArray[row][col]=randNum;
            }
        }
        return randArray;
    }
    public static int[][] printMatrix(int[][] randArray) {
        int width = randArray[0].length;
        int height = randArray.length;
        if(height==width) {
            System.out.println("WARNING: Matrix is not rectangular.");
        }
        for(int x=0;x<height;x++) {
            for(int y=0;y<width;y++) {
                if(randArray[x][y]>-1) {
                    System.out.print(" "+randArray[x][y]+" ");
                }
                else {
                    System.out.print(randArray[x][y]+" ");
                }
            }
            System.out.println();
        }
        return randArray;
    }
    public static int[][] transposeMatrix(int[][] randArray, int height, int width) {
        int[][] newMatrix = new int[width][height];
        for(int a = 0; a < width; a++) {
            for(int b = 0; b < height; b++) {
                newMatrix[a][b] = randArray[b][a];
            }
        }   
        return newMatrix;
    }
    public static void main(String[] args) {
        int height,width;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.print("Enter matrix width: ");
        width = myScanner.nextInt();
        System.out.print("Enter matrix height: ");
        height = myScanner.nextInt();
        System.out.println();
        
        int[][] randArray = randomMatrix(height,width);
        System.out.println("Printed Matrix:");
        printMatrix(randArray);
        System.out.println();
        System.out.println("Transposed Matrix:");
        int[][] tranMatrix = transposeMatrix(randArray,height,width);
        printMatrix(tranMatrix);
        System.out.println(Arrays.deepToString(randArray));
        System.out.println(Arrays.deepToString(tranMatrix));
    }
}