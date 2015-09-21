////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//Lab 04 - Card Generator
//Professor Chen
//September 18, 2015
//Section 111
//Picks a random "card" from a deck and prints out the suit and identity of the card


public class PokerHandCheck { //create main class
    public static void main(String[] args) { //create main method
    
    
    int cardNum = (int)((Math.random()*52)+1); //generate random number btwn 1-52
    
    
//Create suit and identity variables 
         String suit="";
         String identity="";

    
//If statements to assign the suit to the card depending on the card #
         if(cardNum>=1 && cardNum<=13) {
            suit = "Diamonds";
          }
    
         if(cardNum>13 && cardNum<=26){
            suit = "Clubs";
          }
         if(cardNum>26&&cardNum<=39) {
             suit="Hearts";
         }
         if(cardNum>39&&cardNum<=52) {
             suit="Spades";
         }
         
         int cardNumModulus = cardNum%13;
         
//A bunch of switches  to define the identity of the card (ie the first card of each suit is the ace, 2nd is 2,etc.)
        switch(cardNumModulus){
                case 1:
                identity="Ace";
                    break;
                    
                case 2:
                identity="2";
                    break; 
                    
                case 3:
                identity="3";
                    break;                     
                    
                case 4:
                identity="4";
                    break;                     
                    
                case 5:
                identity="5";
                    break;  
                    
                case 6:
                identity="6";
                    break;                                 
                    
                case 7:
                identity="7";
                    break;                                 
                    
                case 8:
                identity="8";
                    break;  
                    
                case 9:
                identity="9";
                    break;                                 
                    
                case 10:
                identity="10";
                    break;    
                    
                case 11:
                identity="Jack";
                    break;   
                    
                case 12:
                identity="Queen";
                    break; 
                    
                case 0:
                identity="King";
                    break;                     
                                    
                default:
                identity="error";
                    break;
        }
        
        System.out.println("You picked the "+identity+" of "+suit); //print out the identity and suit of the card

    
    }
}