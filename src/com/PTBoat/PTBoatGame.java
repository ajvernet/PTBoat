package com.PTBoat;

public class PTBoatGame 
{
	private PTBoat[] ptBoats = new PTBoat[6];
	private int numberOfBoats;
	private int guessNumber;
	
	public PTBoatGame()
	{
		
	}
	
	//add a boat to the array of PTBoats
	public void addBoat(String row, int column)
	{
		PTBoat boat = new PTBoat(row, column);
		ptBoats[numberOfBoats] = boat;
		numberOfBoats++;
	}
	
	
	//method to "attack" the suspected row/column location of a PTBoat
	public boolean guess(String row, int column)
	{
		guessNumber++;
		
		for(int i = 0; i < ptBoats.length; i++)
		{
			if(ptBoats[i].isHit(row, column))
			{
				System.out.println("Guess number " + guessNumber + " at row " +
						row + ", column " + column + " hit a PTBoat!");
				return true;
			}
		}
		
		System.out.println("Guess number " + guessNumber + " missed.");
		return false;
	}
	
	public static void main(String[] args) {
		 // Create a PTBoatGame instance
		
		PTBoatGame testGame = new PTBoatGame();

	    // Add 6 PTBoats
		for(int i = 0; i < 6; i++)
		{
			testGame.addBoat("A", i);
		}

	    //Try guesses
		
		testGame.guess("B", 1);
		testGame.guess("A", 4);
		testGame.guess("C", 6);
		testGame.guess("D", 4);
		testGame.guess("A", 2);
		testGame.guess("A", 1);
	}
}
