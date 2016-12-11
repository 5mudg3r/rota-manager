package me.smudja;

public enum ShiftManager {
	
	INSTANCE;
	
	private Shift[] shifts = new Shift[21];
	
	public Shift[] getShifts() {
		return shifts;
	}
	
	public void add(Shift shift) {
		shifts[shift.getShiftID().getID()] = shift;
	}
}
