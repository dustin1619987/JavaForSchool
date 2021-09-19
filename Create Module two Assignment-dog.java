//Public Constructor Dog

public Dog(String petType, String petName, int petAge, int dogSpaces, int catSpaces, int daysStay, double amountDue,int dogSpaceNumber, int dogWeight, boolean grooming) {
	//Calling Class from Pets
	super(petName, petName, dogWeight, dogWeight, dogWeight, dogWeight, amountDue);
	this.dogSpaceNumber = dogSpaceNumber;
	this.dogWeight = dogWeight;
	this.grooming = grooming;
}
//Gets and Sets
//-----------------------------------------
public int getDogSpaceNumber() {
	return dogSpaceNumber;
}
public void setDogSpaceNumber(int dogSpaceNumber) {
	this.dogSpaceNumber = dogSpaceNumber;
}
//-----------------------------------------
public int getDogWeight() {
	return dogWeight;
}
public void setDogWeight(int dogWeight) {
	this.dogWeight = dogWeight;
}
//-----------------------------------------
public boolean getGrooming() {
	return grooming;
}
public void setGrooming(boolean grooming) {
	this.grooming = grooming;
}
}
