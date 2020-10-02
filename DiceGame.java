/*
 * Author:      Youssef NAFAA
 * College:     Cambrian
 * Date   :     September 20/2020
 * Last Update: October   02/2020
 * Program:     Class DiceGame.java 
 * This class will test the class Dice.java 
 * At the end we roll up 5 dices of six sides and see how many rolls 
 * it takes to get a yahtzee (all 5 sides have the same number)
 */

public class DiceGame {

	public static void main(String[] args) {
		
		// Creation of # sized dices using # constructors
		
		/* Dice 6 this one we can get it by creating 
		 * an object with a constructor without a parameter
		 * it's by default 
		 */
				
		Dice dice6 = new Dice();
		System.out.println("Name of the Dice: "+dice6.getDiceType());
		System.out.println("Number of Sides of "+dice6.getDiceType()+": "+dice6.getNumSides());
		System.out.println("The Side Up of " +dice6.getDiceType()+" before Roll Up: "+dice6.getSideUp());
		dice6.roll();
		System.out.println("The Side Up of "+dice6.getDiceType()+" after  Roll Up: "+dice6.getSideUp());
		dice6.setDiceUp(3);
		System.out.println("The Side Up of "+dice6.getDiceType()+" after set up of SideUp "+dice6.getSideUp());
		

		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();
		// Dice 8
		Dice dice8 = new Dice(8);
		System.out.println("Name of the Dice: "+dice8.getDiceType());
		System.out.println("Number of Sides of "+dice8.getDiceType()+": "+dice8.getNumSides());
		System.out.println("The Side Up of " +dice8.getDiceType()+" before Roll Up: "+dice8.getSideUp());
		dice8.roll();
		System.out.println("The Side Up of "+dice8.getDiceType()+" after  Roll Up: "+dice8.getSideUp());
		dice8.setDiceUp(3);
		System.out.println("The Side Up of "+dice8.getDiceType()+" after set up of SideUp "+dice8.getSideUp());
		
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();
		// Dice 20
		Dice dice20 = new Dice(20, "{d20}");
		System.out.println("Name of the Dice: "+dice20.getDiceType());
		System.out.println("Number of Sides of "+dice20.getDiceType()+": "+dice20.getNumSides());
		System.out.println("The Side Up of " +dice20.getDiceType()+" before Roll Up: "+dice20.getSideUp());
		dice20.roll();
		System.out.println("The Side Up of "+dice20.getDiceType()+" after  Roll Up: "+dice20.getSideUp());
		dice20.setDiceUp(20);
		System.out.println("The Side Up of "+dice20.getDiceType()+" after set up of SideUp "+dice20.getSideUp());
		
		
		// rolling up 5 dices of 6 faces and get how many rolls we roll up 
		// until getting a yahtzee
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();
		
		Dice dice1 = new Dice(6);
		Dice dice2 = new Dice(6);
		Dice dice3 = new Dice(6);
		Dice dice4 = new Dice(6);
		Dice dice5 = new Dice(6);
		
		int trys = 0;
		int result;
		do {
			System.out.print(" - ");
			dice1.roll();
			System.out.print(dice1.getSideUp()+" - ");	
			dice2.roll();
			System.out.print(dice2.getSideUp()+" - ");
			dice3.roll();
			System.out.print(dice3.getSideUp()+" - ");
			dice4.roll();
			System.out.print(dice4.getSideUp()+" - ");
			dice5.roll();
			System.out.print(dice5.getSideUp()+" - ");
			System.out.println();
			System.out.println(" - - - - - - - - - - - ");
			result = dice1.getSideUp();
			trys++;
			
		}while(!(dice1.getSideUp() == result && dice2.getSideUp() == result 
			  && dice3.getSideUp() == result && dice4.getSideUp() == result 
			  && dice5.getSideUp() == result));
		System.out.println();
		System.out.println("Number of Rolls that took to get a Yahtzee is: "+trys);
	}
}
