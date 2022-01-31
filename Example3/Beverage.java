
public class Beverage {
	public static void main(String[] args) {
		Example obj1 = new Example("Tea", "large");
		System.out.println("Type of beverage is: " + obj1.type);
		System.out.println("Size of beverage is:" + obj1.size);

		Example obj2 = new Example("Coffee", "Small");
		System.out.println("Type of beverage is: " + obj2.type);
		System.out.println("Size of beverage is:" + obj2.size);

		Example obj3 = new Example("Icetea", "Medium");
		System.out.println("Type of beverage is: " + obj3.type);
		System.out.println("Size of beverage is:" + obj3.size);

		Example obj4 = new Example("Coke");
		System.out.println("Type of beverage is:" + obj4.type);
	}
}
