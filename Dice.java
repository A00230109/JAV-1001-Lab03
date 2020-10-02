/*
 * Author:      Youssef NAFAA
 * College:     Cambrian
 * Date   :     September 20/2020
 * Last Update: October   02/2020
 * Program:     Class Dice.java 
 * This class contains properties, constructors, getters and setters and a method that 
 * will roll a certain dice randomly to get the dice up number 
 */


import java.util.Random;

public class Dice {
	
	// properties of the class Dice
	private String diceType;
	private int numSides;
	private int sideUp;
	
	/* Constructor without parameters
	 * this constructor by default gives us a dice with 6 faces
	 * and a sideup randomly
	 */
	
	public Dice() {
		this.diceType = "d{6}";
		this.numSides = 6;
		this.sideUp = getRandomFor(6);
	}
	
	// Constructor with one parameter
	public Dice(int numSides) {
		// we can't have a dice that have number of sides < 3 or > 100
		if(numSides < 3 || numSides > 100)
			return;
		this.numSides = numSides;
		this.diceType = "d{"+numSides+"}";
		this.sideUp = getRandomFor(numSides);		
	}
	
	// Constructor with two parameters
	public Dice(int numSides, String diceType) {
		// we can't have a dice that have number of sides < 3 or > 100
		if(numSides < 3 || numSides > 100)
			return;
		this.numSides = numSides;
		this.diceType = diceType;
		this.sideUp = getRandomFor(numSides);	
	}
	
	// Accessors
	// Access the name
	public String getDiceType() {
		return this.diceType;
	}
	
	// Access the number of sides of the dice
	public int getNumSides() {
		return this.numSides;
	}
	
	// Access the Up of the dice
	public int getSideUp() {
		return this.sideUp;
	}
	
	// Mutators
	// Set a name for the dice
	public void setDiceType(String diceType) {
		this.diceType = diceType;
	}
	// Set number of sides for the dice
	public void setNumSides(int numSides) {
		this.numSides = numSides;
		this.diceType = "d{"+numSides+"}";
	}
	
	// Set a certain number for the up of the dice
	public void setDiceUp(int sideUp) {
		if(sideUp > numSides || sideUp <= 0 )
			return;
		this.sideUp = sideUp;
	}
	
	/* This method will return a random number
	 * between 1 and the number given as parameter
	 */
	private int getRandomFor(int number) {
		Random random = new Random();
		int resultRandom =(int)(random.nextInt(numSides)+1);
		return resultRandom;
	}
	// Method roll that will show a sideup of a dice randomly
	public void roll() {
		this.sideUp = getRandomFor(this.numSides);		
	}	
}
