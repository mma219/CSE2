import java.util.Scanner;
public class test{
    public static void main(String[] args) {
             Scanner scan=new Scanner(System.in);
	int bit1, bit2, bit3, digits;
	System.out.print("Enter a one, two, or three bit binary number ");
	digits=scan.nextInt();
	bit1 = digits%10;
	bit2 = digits/10%10;
	bit3 = digits/100;
             if(digits<0 || bit1>1 || bit2>1 || bit3>1){
                   System.err.println("Bad int entered");
 	      return;
	}
	System.out.println("The binary value is " + (4*bit3+2*bit2+bit1));
      }
}
