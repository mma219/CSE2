import java.util.Scanner; //import scanner


public class testitest{
	
	/* public static int sum(int firstNum, int secondNum) {
		int total = 0;
		for(int x = firstNum;x<=secondNum;x++) {
			total+=x;
		}
		return total;
	}
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		int firstNum =0;
		int secondNum=0;
		System.out.print("Enter first num: ");
		firstNum = myScanner.nextInt();
		while(firstNum>secondNum) {
			System.out.print("Enter second num: ");
			secondNum = myScanner.nextInt();		
		}
		System.out.println(sum(firstNum,secondNum));
		
	} */
	public static void main(String[] args) {
		int i =10;
		while(true) {
			System.out.println("i: " +i--);
			if(i<0) {break;}
		}
	}
}
