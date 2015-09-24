package Order;

public class Lunch {
	Dessert dessert = new Dessert();
	MainCourse mainCourse = new MainCourse();
	
	public String getMainCourse(){
		
		return mainCourse.make();
	}
	
	public String getDessert(){
		
		return dessert.make();
	}

}
