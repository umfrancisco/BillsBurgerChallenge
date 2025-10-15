package main;

public class Main {
	public static void main(String[] args) {		
		MealOrder meal = new MealOrder();
		meal.addBurgerToppings("BACON", "CHEESE", "MAYO");
		meal.setDrinkSize("LARGE");
		meal.printItemizedList();
		
		System.out.println("*".repeat(30));
		
		MealOrder anotherMeal = new MealOrder("turkey", "guaraná", "chili");
		anotherMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
		anotherMeal.setDrinkSize("SMALL");
		anotherMeal.printItemizedList();
	}
}
