package Order;

public class OrderMain {

	public static void main(String[] args) {
		
		Drink drink = new Drink();
		String outDrinkIceCubes = drink.getIceCubes();
		System.out.println("Ice Cubes = " + outDrinkIceCubes);
		
		String outDrinkLemon = drink.getLemon();
		System.out.println("Lemon = " + outDrinkLemon);
		
		String outDrinkIceCubesPlusLemon = drink.getIceCubesPlusLemon();
		System.out.println("Ice Cubes plus Lemon = " + outDrinkIceCubesPlusLemon);
		
		Lunch lunch = new Lunch();
		String outLunchMainCourse = lunch.getMainCourse();
		System.out.println("Main Course = " + outLunchMainCourse);
		
		String outLunchDessert = lunch.getDessert();
		System.out.println("Dessert = " + outLunchDessert);

	}

}
