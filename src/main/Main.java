package main;

public class Main {
	public static void main(String[] args) {
		Item coke = new Item("drink", "coke", 1.50);
		coke.printItem();
		coke.setSize("large");
		coke.printItem();
		
		Item fries = new Item("Topping", "fries", 1.50);
		fries.printItem();
	}
}
