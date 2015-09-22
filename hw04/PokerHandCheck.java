////////////////////////////////////////////////////////////////////////////////
//Matthew Addessi
//HW 04 - Poker Hand Check
//Professor Chen
//September 22, 2015
//Section 111
//Picks 5 random cards and prints what type of hand it is (pair, high hand, three of a kind, etc.)


public class PokerHandCheck { //create main class
    public static void main(String[] args) { //create main method
    
    int cardNum = (int)((Math.random()*52)+1); //generate random number btwn 1-52 5 times
    int cardNum2 = (int)((Math.random()*52)+1);
    int cardNum3 = (int)((Math.random()*52)+1);
    int cardNum4 = (int)((Math.random()*52)+1);
    int cardNum5 = (int)((Math.random()*52)+1);
    
//Create suit and identity variables 
         String suit="";
         String identity="";
         
         String suit2="";
         String identity2="";
         
         String suit3="";
         String identity3="";
         
         String suit4="";
         String identity4="";
         
         String suit5="";
         String identity5="";         
         
//If statements to assign the suit to the card depending on the card #
         if(cardNum>=1 && cardNum<=13) {
            suit = "Diamonds";
          }
         if(cardNum2>=1 && cardNum2<=13) {
            suit2 = "Diamonds";
          }
         if(cardNum3>=1 && cardNum3<=13) {
            suit3 = "Diamonds";
          }
         if(cardNum4>=1 && cardNum4<=13) {
            suit4 = "Diamonds";
          }
         if(cardNum5>=1 && cardNum5<=13) {
            suit5 = "Diamonds";
          }       
          
         if(cardNum>13 && cardNum<=26){
            suit = "Clubs";
          }
         if(cardNum2>13 && cardNum2<=26){
            suit2 = "Clubs";
          }
         if(cardNum3>13 && cardNum3<=26){
            suit3 = "Clubs";
          }
         if(cardNum4>13 && cardNum4<=26){
            suit4 = "Clubs";
          }
         if(cardNum5>13 && cardNum5<=26){
            suit5 = "Clubs";
          }
                             
         if(cardNum>26&&cardNum<=39) {
             suit="Hearts";
         }
         if(cardNum2>26&&cardNum2<=39) {
             suit2="Hearts";
         }
         if(cardNum3>26&&cardNum3<=39) {
             suit3="Hearts";
         }
         if(cardNum4>26&&cardNum4<=39) {
             suit4="Hearts";
         }
         if(cardNum5>26&&cardNum5<=39) {
             suit5="Hearts";
         }
         
         if(cardNum>39&&cardNum<=52) {
             suit="Spades";
         }
         if(cardNum2>39&&cardNum2<=52) {
             suit2="Spades";
         }
         if(cardNum3>39&&cardNum3<=52) {
             suit3="Spades";
         }
         if(cardNum4>39&&cardNum4<=52) {
             suit4="Spades";
         }
         if(cardNum5>39&&cardNum5<=52) {
             suit5="Spades";
         }         
         
         int cardNumModulus = cardNum%13;
         int cardNumModulus2 = cardNum2%13;
         int cardNumModulus3 = cardNum3%13;
         int cardNumModulus4 = cardNum4%13;
         int cardNumModulus5 = cardNum5%13;
         
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
        
        switch(cardNumModulus2){
                case 1:
                identity2="Ace";
                    break;
                    
                case 2:
                identity2="2";
                    break; 
                    
                case 3:
                identity2="3";
                    break;                     
                    
                case 4:
                identity2="4";
                    break;                     
                    
                case 5:
                identity2="5";
                    break;  
                    
                case 6:
                identity2="6";
                    break;                                 
                    
                case 7:
                identity2="7";
                    break;                                 
                    
                case 8:
                identity2="8";
                    break;  
                    
                case 9:
                identity2="9";
                    break;                                 
                    
                case 10:
                identity2="10";
                    break;    
                    
                case 11:
                identity2="Jack";
                    break;   
                    
                case 12:
                identity2="Queen";
                    break; 
                    
                case 0:
                identity2="King";
                    break;                     
                                 
                default:
                identity2="error";
                    break;
        }      
        switch(cardNumModulus3){
                case 1:
                identity3="Ace";
                    break;
                    
                case 2:
                identity3="2";
                    break; 
                    
                case 3:
                identity3="3";
                    break;                     
                    
                case 4:
                identity3="4";
                    break;                     
                    
                case 5:
                identity3="5";
                    break;  
                    
                case 6:
                identity3="6";
                    break;                                 
                    
                case 7:
                identity3="7";
                    break;                                 
                    
                case 8:
                identity3="8";
                    break;  
                    
                case 9:
                identity3="9";
                    break;                                 
                    
                case 10:
                identity3="10";
                    break;    
                    
                case 11:
                identity3="Jack";
                    break;   
                    
                case 12:
                identity3="Queen";
                    break; 
                    
                case 0:
                identity3="King";
                    break;                     
                                 
                default:
                identity3="error";
                    break;
        }
        switch(cardNumModulus4){
                case 1:
                identity4="Ace";
                    break;
                    
                case 2:
                identity4="2";
                    break; 
                    
                case 3:
                identity4="3";
                    break;                     
                    
                case 4:
                identity4="4";
                    break;                     
                    
                case 5:
                identity4="5";
                    break;  
                    
                case 6:
                identity4="6";
                    break;                                 
                    
                case 7:
                identity4="7";
                    break;                                 
                    
                case 8:
                identity4="8";
                    break;  
                    
                case 9:
                identity4="9";
                    break;                                 
                    
                case 10:
                identity4="10";
                    break;    
                    
                case 11:
                identity4="Jack";
                    break;   
                    
                case 12:
                identity4="Queen";
                    break; 
                    
                case 0:
                identity4="King";
                    break;                     
                                 
                default:
                identity4="error";
                    break;
        }
        switch(cardNumModulus5){
                case 1:
                identity5="Ace";
                    break;
                    
                case 2:
                identity5="2";
                    break; 
                    
                case 3:
                identity5="3";
                    break;                     
                    
                case 4:
                identity5="4";
                    break;                     
                    
                case 5:
                identity5="5";
                    break;  
                    
                case 6:
                identity5="6";
                    break;                                 
                    
                case 7:
                identity5="7";
                    break;                                 
                    
                case 8:
                identity5="8";
                    break;  
                    
                case 9:
                identity5="9";
                    break;                                 
                    
                case 10:
                identity5="10";
                    break;    
                    
                case 11:
                identity5="Jack";
                    break;   
                    
                case 12:
                identity5="Queen";
                    break; 
                    
                case 0:
                identity5="King";
                    break;                     
                                 
                default:
                identity5="error";
                    break;
        }
        System.out.println("You picked the "+identity+" of "+suit); //print out the identity and suit of the card
        System.out.println("You picked the "+identity2+" of "+suit2); //print out the identity and suit of card2
        System.out.println("You picked the "+identity3+" of "+suit3); //print out the identity and suit of card3
        System.out.println("You picked the "+identity4+" of "+suit4); //print out the identity and suit of card4
        System.out.println("You picked the "+identity5+" of "+suit5); //print out the identity and suit of card5

//Creates variable "equalss" and adds to it depending on which condition is true
int equalss = 0;

//Pairs
        if(identity.equals(identity2)) {
        equalss++;
            }
        if(identity.equals(identity3)) {
        equalss++;
        }
        if(identity.equals(identity4)) {
        equalss++;
        }
        if(identity.equals(identity5)) {
        equalss++;
        }
        

        if(identity2.equals(identity3)) {
        equalss++;
        }
        if(identity2.equals(identity4)) {
        equalss++;
        }
        if(identity2.equals(identity5)) {
        equalss++;
        }
        
        if(identity3.equals(identity4)) {
        equalss++;
        }
        if(identity3.equals(identity5)) {
        equalss++;
        }    
        
        if(identity4.equals(identity5)) {
        equalss++;
        }   
        

        //Three of a kind
        if(identity.equals(identity2) && identity2.equals(identity3)) {
        equalss+=3;
        } 
        if(identity.equals(identity2) && identity2.equals(identity4)) {
        equalss+=3;
        }         
        if(identity.equals(identity2) && identity2.equals(identity5)) {
        equalss+=3;
        }   
        if(identity.equals(identity3) && identity3.equals(identity4)) {
        equalss+=3;
        }         
        if(identity2.equals(identity3) && identity3.equals(identity4)) {
        equalss+=3;
        }      
        if(identity2.equals(identity4) && identity4.equals(identity5)) {
        equalss+=3;
        }         
        if(identity3.equals(identity2) && identity2.equals(identity5)) {
        equalss+=3;
        }         
        if(identity5.equals(identity4) && identity4.equals(identity)) {
        equalss+=3;
        }     
        if(identity5.equals(identity3) && identity3.equals(identity)) {
        equalss+=3;
        }         
        String hand ="";

//Assigns certain values of "equalss" to strings assigned to variable "hand"
switch(equalss){
    
                case 0:
                hand="High Card Hand!";
                    break; 
                case 1:
                hand="Pair!";
                    break;
                
                case 2:
                hand="Two Pair!";
                    break;
                
                case 6:
                hand="Three of a Kind!";
                    break;
                    
                case 7:
                hand = "Three of a Kind and a Pair!";
                    break;
                    
                case 18:
                hand = "Four of a Kind!";
                    break;
                    
                default:
                identity5="error";
                    break;
        }    
        
        
//Prints out what type of hand the player has
System.out.println("You have a "+hand);        
    }
}