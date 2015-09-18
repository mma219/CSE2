////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//Lab 04 - Card Generator
//Professor Chen
//September 18, 2015
//Section 111
//Picks a random "card" from a deck and prints out the suit and identity of the card


public class CardGenerator { //create main class
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
    
//A bunch of switches  to define the identity of the card (ie the first card of each suit is the ace, 2nd is 2,etc.)
        switch(cardNum){
                case 1:
                case 14:
                case 27:
                case 40:
                identity="Ace";
                    break;
                    
                case 2:
                case 15:
                case 28:
                case 41:
                identity="2";
                    break; 
                    
                case 3:
                case 16:
                case 29:
                case 42:
                identity="3";
                    break;                     
                    
                case 4:
                case 17:
                case 30:
                case 43:
                identity="4";
                    break;                     
                    
                case 5:
                case 18:
                case 31:
                case 44:
                identity="5";
                    break;  
                    
                case 6:
                case 19:
                case 32:
                case 45:
                identity="6";
                    break;                                 
                    
                case 7:
                case 20:
                case 33:
                case 46:
                identity="7";
                    break;                                 
                    
                case 8:
                case 21:
                case 34:
                case 47:
                identity="8";
                    break;  
                    
                case 9:
                case 22:
                case 35:
                case 48:
                identity="9";
                    break;                                 
                    
                case 10:
                case 23:
                case 36:
                case 49:
                identity="10";
                    break;    
                    
                case 11:
                case 24:
                case 37:
                case 50:
                identity="Jack";
                    break;   
                    
                case 12:
                case 25:
                case 38:
                case 51:
                identity="Queen";
                    break; 
                    
                case 13:
                case 26:
                case 39:
                case 52:
                identity="King";
                    break;                     
                                    
                                                     
                default:
                identity="error";
                    break;
        }
        
        System.out.println("You picked the "+identity+" of "+suit); //print out the identity and suit of the card


    
    }
}