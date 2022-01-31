
public class PenMainClass {

	public static void main(String[] args) {
		Pen obj1 = new Pen();
		obj1.setBrand("cello");
		obj1.setCost(10.0);
		obj1.setColour("blue");
		System.out.println("Brand name is:" + obj1.brand);
		System.out.println("Pen cost is:" + obj1.cost);
		System.out.println("pen colour is:" + obj1.colour);

		Pen obj2 = new Pen("Reynolds", 5.5, "black");
		System.out.println("Pen brand is:" + obj2.brand);
		System.out.println("Pen cost:" + obj2.cost);
		System.out.println("Pen colour is:" + obj2.colour);

		Pen obj3 = new Pen("addgel", 9.5, "pink");
		System.out.println("New pen brand is:" + obj3.brand);
		System.out.println("New pen cost is:" + obj3.cost);
		System.out.println("New pen colour is:" + obj3.colour);
	}

}
