import java.util.*;


public class Account {
    public int money;
    public int pos;
    public ArrayList<String> properties = new ArrayList<String>();
    // Need to make property holder (arraylist?) for properites, which each player starts out with none
    public Account() {
	money = 200; 
	pos = 0;
    /* This will be the account of each player, containing the information
       of the properties and money of a specific player */
    }
    public int getPos() {
	return pos;
    }
    public void buy(Property x) {
	money -= x.getValue();
    }
    public Boolean purchasable(Property x) {
	if (x.
	return x.getValue() <= money;
    }
    
    public void modifyPost(int x) {
	pos = x;
    }
    public int roll() {
	return (int) (Math.random() * 6) + 1;
    }
}
