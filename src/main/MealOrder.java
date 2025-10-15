package main;

public class MealOrder {
	private Burger burger;
	private Item drink;
	private Item side;
	
	public MealOrder() {
		this("regular", "coke", "fries");
	}
	
	public MealOrder(String burgerType, String drinkType, String sideType) {
		this.burger = new Burger(burgerType, 4.0);
		this.drink = new Item("drink", drinkType, 1.00);
		this.side = new Item("side", sideType, 1.50);
	}
	
	public double getTotalPrice() {
		return burger.getAdjustedPrice() +
				drink.getAdjustedPrice() +
				side.getAdjustedPrice();
	}
	
	public void printItemizedList() {
		burger.printItem();
		drink.printItem();
		side.printItem();
		System.out.println("-".repeat(30));
		Item.printItem("TOTAL PRICE", getTotalPrice());
	}
}
