package me.smudja;

public enum Person {
	LOUIS("Louis", "07936522428"),
	RICHARD("Richard", "07708229321"),
	ANNICK("Annick", "07709662650");
	
	private String name;
	private String number;
	
	private Person(String name, String number) {
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
}
