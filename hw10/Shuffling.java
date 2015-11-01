////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 10 - Shuffling
//Professor Chen
//November 1, 2015
//Section 111
//Creates and prints a deck of cards, a shuffled deck of cards, and a randomized hand of 5 cards


public class Shuffling{ //create main class
    public static String[] randomizeHand(String[] list) { //create method for randomized hand, array input and output
        int num1,num2,num3,num4,num5; //variable initialization
        
        //random number code block – creates 5 unique numbers between 0 and 51 and makes sure no two numbers are the same
        num1 = (int)(Math.random()*52);
        num2 = (int)(Math.random()*52);
        while(num2==num1){
            num2 = (int)(Math.random()*52);
        }
        num3 = (int)(Math.random()*52);
        while(num3==num2 || num3==num1){
            num3 = (int)(Math.random()*52);
        }
        num4 = (int)(Math.random()*52);
        while(num4==num3 || num4==num2 || num4==num1){
            num4 = (int)(Math.random()*52);
        }
        num5 = (int)(Math.random()*52);
        while(num5==num4 || num5==num3 || num5==num2 || num5==num1){
            num5 = (int)(Math.random()*52);
        }
        //end of random number code block

        
        String[] randHand = new String[5]; //creates new array with space for 5 items
        //Assigns each space of the array a card from the shuffled deck
        randHand[0] = list[num1];
        randHand[1] = list[num2];
        randHand[2] = list[num3];
        randHand[3] = list[num4];
        randHand[4] = list[num5];
        return randHand; //return the resulting array
    }
    public static void printArray(String[] list) { //method to print array; doesn't return anything, array input
        String printed = ""; //initalize "printed" variable
        for(int i=0;i<list.length;i++) { //loop to add each item of the array to a single string
            printed+=(list[i]+" ");
        }
        System.out.println(printed); //print the string
    }
    public static String[] shuffle(String[] list) { //shuffling method
        for (int i=0; i<list.length; i++) {	//find a random member to swap with
	        int target = (int) (list.length * Math.random() ); //picks random number between 0 and list.length
	        //swap the values
	        String temp = list[target];
	        list[target] = list[i];
	        list[i] = temp;
        }
        return list; //return shuffled deck, which will be printed with the printArray method
    }
    public static void main(String[] args) { //main method
	    //suits club, heart, spade or diamond
        String[] suitNames={"C","H","S","D"};   //suit names
        String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"}; //rank names
        String[] cards = new String[52]; //initialize array
        String[] hand = new String[5]; //initialize array
        for (int i=0; i<52; i++){ //loop to assign the ranks to the suits to get one of each card
            cards[i]=rankNames[i%13]+suitNames[i/13];
        }
        System.out.println("Original Cards:"); //print message to show that original cards are being printed
        printArray(cards); //print the cards in the array
        shuffle(cards); //shuffle the cards
        System.out.println("Shuffled Cards:"); //print message to show shuffled cards are being printed
        printArray(cards); //print shuffled cards
        hand = randomizeHand(cards); //assigns the return array of randomizeHand to the array "hand"
        System.out.println("Randomized Hand:"); //print message to show randomized hand is being printed
        printArray(hand); //print randomized hand
    }//close main method
} //close class
