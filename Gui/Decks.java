import java.util.*;
import java.io.*;

public class Decks {

    ArrayList<String> ccdeck = new ArrayList<String>();
    ArrayList<String> ccmodel = new ArrayList<String>();
    ArrayList<String> chancedeck = new ArrayList<String>();
    ArrayList<String> chancemodel = new ArrayList<String>();
    public int val;
    public boolean advance = false;
    
    
    public Decks() {
	ccdeck.add("Advance to Go. Collect 200");
	ccdeck.add("Bank error in your favor. Collect 75");
	ccdeck.add("Doctor's fees. Pay 50");
	ccdeck.add("Bank Tax. Pay 50");
	ccdeck.add("Tax Refunds. Collect 50");
	ccdeck.add("It is your birthday. Collect 40");
	ccdeck.add("Grand Opera Night. Collect 150");
	ccdeck.add("Income Tax refund.  Collect 20");
	ccdeck.add("Pay Hospital Fees. Pay 100");
	ccdeck.add("Pay School Fees. Pay 50");
	ccdeck.add("Receive Consultancy Fee. Collect 25");
	ccdeck.add("You are assessed for street repairs. Pay 200");
	ccdeck.add("You have won second prize in a beauty contest. Collect 10");
	ccdeck.add("You inherit money. Collect 100");
	ccdeck.add("Sold Stocks. Collect 50");
	ccdeck.add("Holiday Fund matures. Collect 100");
	ccmodel = ccdeck;
	chancedeck.add("Advance to Go. Collect 200");
	chancedeck.add("Advance token to the Railroad");
	chancedeck.add("You have won a crossword competition. Collect 150");
	chancedeck.add("Money on the floor. Collect 100");
	chancedeck.add("Bank pays you dividend. Collect 50");
	chancedeck.add("Lost Wallet. Collect 50");
	chancedeck.add("Found a ring. Collect 50");
	chancedeck.add("Bank debt. Pay 200");
	chancedeck.add("Make general repairs on all your property. Pay 100");
	chancedeck.add("Pay poor tax. Pay 15");
	chancedeck.add("Take a trip to Nearest Railroad. If you pass Go collect 200");
	chancedeck.add("Lost Dog Found. Collect 50");
	chancedeck.add("You have been elected chairman of the board. Pay 50");
	chancedeck.add("Your building loan matures. Collect 150");
	chancemodel = chancedeck;
    }
    
    
    public String pullOutChanceCard() {
	if (chancemodel.size() == 0) {
	    chancemodel = chancedeck;
	}
	int rand = (int) (chancedeck.size() * Math.random());
	String card = chancemodel.get(rand);
	chancedeck.remove(rand);
	if (card.substring(0,7).equals("Advance")) {
	    advance = true;
	}
	// finish the pay/collect
	return card;
    }

     public String pullOutCCCard() {
	 if (ccmodel.size() == 0) {
	     ccmodel = ccdeck;
	 }
	 int rand = (int) (ccdeck.size() * Math.random());
	 String card = ccmodel.get(rand);
	 ccdeck.remove(rand);
	 return card;
     }
    public static void main(String[] args) {
	Decks test = new Decks();
	System.out.println(test.pullOutChanceCard());
		
    }
}
