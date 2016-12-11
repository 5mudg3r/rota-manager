package me.smudja;

public class Meal {
	
	private String name;		// name of meal
	private String[] ingredients;	// ingredients of meal
	

	public Meal(String name) {
		this.name = name;
		ingredients = new String[]{};
	}
	
	public Meal(String name, String... ingredients) {
		this.name = name;
		this.ingredients = ingredients;
	}
	
	public static void main(String[] args) {
		Meal empty = new Meal("empty");
		Meal egg = new Meal("egg", "eggs");
		Meal steak_and_chips = new Meal("steak_and_chips", "steak", "chips");
		
		System.out.println(empty.name + " - ingredients:");
		for(String ingredient:empty.ingredients) {
			System.out.println(ingredient);
		}
		
		System.out.println(egg.name + " - ingredients:");
		for(String ingredient:egg.ingredients) {
			System.out.println(ingredient);
		}
		
		System.out.println(steak_and_chips.name + " - ingredients:");
		for(String ingredient:steak_and_chips.ingredients) {
			System.out.println(ingredient);
		}
		
		System.out.println(Person.LOUIS.getName() + " - " + Person.LOUIS.getNumber());
		System.out.println(Person.ANNICK.getName() + " - " + Person.ANNICK.getNumber());
	}
}
