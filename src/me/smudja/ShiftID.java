package me.smudja;

public enum ShiftID {
	MON_MORN(0),
	MON_LUNCH(1),
	MON_DINNER(2),
	TUE_MORN(3),
	TUE_LUNCH(4),
	TUE_DINNER(5),
	WED_MORN(6),
	WED_LUNCH(7),
	WED_DINNER(8),
	THURS_MORN(9),
	THURS_LUNCH(10),
	THURS_DINNER(11),
	FRI_MORN(12),
	FRI_LUNCH(13),
	FRI_DINNER(14),
	SAT_MORN(15),
	SAT_LUNCH(16),
	SAT_DINNER(17),
	SUN_MORN(18),
	SUN_LUNCH(19),
	SUN_DINNER(20);
	
	private int id;
	
	private ShiftID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
}
