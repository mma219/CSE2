
//  define a class
public class Arithmetic{
    
//  add main method
    public static void main(String[] args) {
        
//  create variables
    int nSocks = 3; //number of socks
    double sockCost$ = 2.58; //cost per sock
    double totalSockCost$ = nSocks*sockCost$; //total pre-tax cost of all socks
    
    int nGlasses = 6; //number of glasses
    double glassCost$ = 2.29; //cost per glass
    double totalGlassCost$ = nGlasses*glassCost$; //total pre-tax cost of all glasses
    
    int nEnevelopes = 1; //number of enevelopes
    double envelopesCost$ = 3.25; //cost per box of envelopes
    double totalEnvelopesCost$ = nEnevelopes*envelopesCost$; //total pre-tax cost of all boxes of envelopes

    double taxPercent=.06; //sales tax in PA
    
    double salestaxSocks = totalSockCost$*taxPercent; //total sales tax for socks
    double salestaxSocksRounded =  ((int)(salestaxSocks*100))/((double)100.0); //total sales tax for socks, made to have two decimals at most
    
    double salestaxGlasses = totalGlassCost$*taxPercent; //total sales tax for glasses
    double salestaxGlassesRounded =  ((int)(salestaxGlasses*100))/((double)100.0); //total sales tax for glasses, made to have two decimals at most

    
    double salestaxEnvelopes = totalEnvelopesCost$*taxPercent; //total sales tax for envelopes
    double salestaxEnvelopesRounded =  ((int)(salestaxEnvelopes*100))/((double)100.0); //total sales tax for envelopes, made to have two decimals at most
    
    double salestaxTotal = salestaxSocks+salestaxGlasses+salestaxEnvelopes; //total sales tax for all purchases
    double salestaxTotalRounded =  ((int)(salestaxTotal*100))/((double)100.0); //total sales tax for all purchases, made to have two decimals at most

    double totalCostItems = (totalSockCost$+totalGlassCost$+totalEnvelopesCost$); //total pre-tax cost of all items
    double absoluteTotal = (totalCostItems + salestaxTotalRounded); //total cost of all items including tax

    
    System.out.println("Item: Socks"); //prints the item name
    System.out.println("Number of Pairs of Socks: " + nSocks); //prints the number of socks
    System.out.println("Cost per Pair of Socks: $" + sockCost$); //prints cost per sock
    System.out.println("Total Pre-Tax Cost of Socks: $" + totalSockCost$); //prints pre-tax cost of socks
    System.out.println("Sales Tax for Socks: $" + salestaxSocksRounded); //prints total sales tax for socks
    
    System.out.println(""); //line break
    
    System.out.println("Item: Drinking Glasses"); //prints the item name
    System.out.println("Number of Glasses: " + nGlasses); //prints number of glasses
    System.out.println("Cost per Glass: $" + glassCost$); //prints cost per glass
    System.out.println("Total Pre-Tax Cost of Glasses: $" + totalGlassCost$); //prints pre-tax cost of glasses
    System.out.println("Sales Tax for Glasses: $" + salestaxGlassesRounded); //prints sales tax for glasses
    
    System.out.println(""); //line break
    
    System.out.println("Item: Boxes of Envelopes"); //prints item name
    System.out.println("Number of Boxes of Envelopes: " + nEnevelopes); //prints number of boxes of envelopes
    System.out.println("Cost per Box of Envelopes: $" + envelopesCost$); //prints cost per box of evelopes
    System.out.println("Total Pre-Tax Cost of Boxes of Envelopes: $" + totalEnvelopesCost$); //prints total pre-tax cost of envelopes
    System.out.println("Sales Tax for Boxes of Envelopes: $" + salestaxEnvelopesRounded); //prints sales tax for envelopes
    
    System.out.println(""); //line break
    
    System.out.println("Total Cost of Purchases (pre-tax): $" + totalCostItems); //prints total cost of purchases before tax
    System.out.println("Total Sales Tax: $" + salestaxTotalRounded); //prints total sales tax for all purchases
    System.out.println("Total Cost of Purchases (including tax): $" + absoluteTotal); //prints total cost of purchases including tax
    
    

    } //closes method
} //closes the class