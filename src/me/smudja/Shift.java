package me.smudja;

public class Shift {
	
	private Meal meal;
	private Person person;
	private ShiftID shiftid;
	
	public Shift(Meal meal, Person person, ShiftID shiftid) {
		this.meal = meal;
		this.person = person;
		this.shiftid = shiftid;
	}
	
	public Meal getMeal() {
		return meal;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public ShiftID getShiftID() {
		return shiftid;
	}
}
