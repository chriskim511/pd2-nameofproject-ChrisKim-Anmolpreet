pd2-nameofproject-ChrisKim-Anmolpreet
=====================================
Group Members: Chris Kim and Anmolpreet Kandola, period 2
Description: Traditional Monopoly, using advanced data structures that we have learned over the past months in class
Instructions: No additional libraries necessary. Make sure the Gui folder contains all Java files and class files and the board.pde file. Gui.pde file is there, but is irrelevant and can me ignored (serves no purpose). Basically you open the board.pde file. Make sure you navigate the tabs to the board.pde file itself.
Ctrl + R to run. 
The board should open up. 
Click Start to start your turn which also rolls your dice and moves you, then the Check button to see if you are on a Jail/Community Chest/Chance space and the proper actions will occur (no text will indicate this, but it is done). 
Next you can click on the Buy property, which will check if it's buyable. If so, the money will automatically be deducted from your bank, and you will have the property added to your list of properties owned. 
You could also click sell property (will automatically remove the property and then add the money to your account if the action is possible in that you do in fact own the property). 
Then you click the End button, and player 2's turn is started, and they automatically move. 
Then they click Check and you repeat until someone loses.
NOTE: PRICES/RENT (In order) of EACH PROPERTY SPACE IN THE GAME (TO BE USED FOR STRATEGY) and letters are irrelevant:
      d = new Property("Canal St", 100, 5, "w");
	d = new Property("Sunset Blvd", 120, 7,"y");
	d = new Property("Times Square", 120, 7, "y");
	d = new Property("Grand Central", 140, 9, "y");
	d = new Property("City Hall", 140, 9, "y");
	d = new Property("Rock Blvd", 160, 11, "b");
	d = new Property("Box Av", 160, 11, "w");
	d = new Property("CS St", 160, 11, "b");
	d = new Property("Bio Blvd", 180, 13, "b");
	d = new Property("Calc Av", 180, 13, "b");
	d = new Property("Mouse Pad", 220, 15, "w");
	d = new Property("Laptop Condo", 240, 17, "r");
	d = new Property("Silicon Valley", 260, 19, "r");
	d = new Property("New Haven", 260, 19, "r");
	d = new Property("Broadway", 220, 15, "w");
	d = new Property("Lefferts", 280, 21, "m");
	d = new Property("Liberty Av", 300, 23, "m");
	d = new Property("Chambers St", 320, 25, "m");
    USE THE TEXT EDITOR BOX (THE PROCESSING ONE, THE BOTTOM BOX IN THE PROCESSING TEXT EDITOR) FOR INFORMATION ON LOCATION AND MONEY YOU HAVE. CHECK IT AFTER EVERY BUTTON YOU PRESS. 
What works, what doesn't: We encountered a problem at the very last minute, when we thought we were finally finished with the project. It involved the use of the while loop in processing and the mouseClicked for Monopoly. Because of this, Player 1 goes on a seemingless journey by himself while player 2 lags behind, simply because we are unable to stop the loop from continuing. 
Data structures, algorithms used: For the most part, we used a combination of linked lists and Arraylists for this project. We used the linked list to store the information of the Board itself, while the Arraylists were used for smaller things like Properties and Decks. We found out just how awesome Nodes really are, as they are able to store a lot of information while providing easy access. Although we were unsuccessful in our final product due to last minute frustrations over processing, we thoroughly enjoyed exploring the ways in which we could tackle the project and the fact that there were so many ways to tackle such a problem. 
