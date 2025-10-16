package main;

public class Main {
	public static void main(String[] args) {		
//		MealOrder meal = new MealOrder();
//		meal.addBurgerToppings("BACON", "CHEESE", "MAYO");
//		meal.setDrinkSize("LARGE");
//		meal.printItemizedList();
		
		MealOrder anotherMeal = new MealOrder("turkey", "guaraná", "chili");
		anotherMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
		anotherMeal.setDrinkSize("SMALL");
		anotherMeal.printItemizedList();
		
//		MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
//		deluxeMeal.addBurgerToppings("AVOCADO", "BACON", "LETTUCE", "CHEESE", "MAYO");
//		deluxeMeal.setDrinkSize("SMALL");
//		deluxeMeal.printItemizedList();
	}
}
