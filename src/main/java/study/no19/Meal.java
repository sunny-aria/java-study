/**
 * 
 */
package study.no19;

/**
 * Meal.java
 * @author sunny
 * 2017年3月24日上午8:30:07
 */
public enum Meal {
APPETIZER(Food.Appetizer.class),
MAINCOURSE(Food.MainCourse.class),
COFFEE(Food.Coffee.class);
	private Food[] values;
	private Meal(Class<? extends Food> kind){
		values =kind.getEnumConstants();
	}
	
	public interface Food{
		enum Appetizer implements Food{SALAD,SOUP,SPRING_ROLLS;}
		enum MainCourse implements Food{LASAGNE,BURRITO,PAD_THAI,LENTILS,HUMMOUS,VINDALOO;}
		enum Coffee implements Food{BLACK_COFFEE,DECAF_COFFEE,ESPRESSO,LATTE,CAPPUCCINO,TEA,HERB_TEA;}
	}
	
	public Food randomSelection(){
		return EnumUtils.random(values);
	}
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			for(Meal meal:Meal.values()){
				Food food = meal.randomSelection();
				System.out.println(food);
			}
			System.out.println("------");
		}
	}
}
