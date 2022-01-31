
public class PersonalMain {

	public static void main(String[] args) {
		// single parameter
		PersonalDetails obj1 = new PersonalDetails(44);
		System.out.println("person age is:" + obj1.age);
		// two parameters
		PersonalDetails obj2 = new PersonalDetails(22, 5);
		System.out.println("person age is:" + obj2.age);
		System.out.println("person height is:" + obj2.height);
		// three parameters
		PersonalDetails obj3 = new PersonalDetails(22, 9, 60);
		System.out.println("person age is:" + obj3.age);
		System.out.println("person height is:" + obj3.height);
		System.out.println("person weight is:" + obj3.weight);
	}
}
