package Cat;
//Cat Classes

import pet.Pet;

public class Cat extends Pet{
	private int catSpaceNumber;

	//Public Constructor Dog

public Cat(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue, int catSpaceNumber) {
	//Calling Class from Pets
	super(petName, petName, catSpaceNumber, catSpaceNumber, catSpaceNumber, catSpaceNumber, amountDue);
	this.catSpaceNumber = catSpaceNumber;	
}
//-----------------------------------------
public int getCatSpaceNumber() {
	return catSpaceNumber;
}
public void setCatSpaceNumber(int catSpaceNumber) {
	this.catSpaceNumber = catSpaceNumber;
}
}
