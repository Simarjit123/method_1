import java.util.Scanner;

public class Main123 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Description obj = new Description(1234567890);

		System.out.println(" Phone no is     :  " + obj.getPhone());

		System.out.println("Do you want to update phone number?");
		String changeInfo = sc.next();
		if (changeInfo.equals("yes")) {
			System.out.println("Enter phone number");

			 long phNo = sc.nextLong();
			obj.setPhone(phNo);

			System.out.println("Phone number updated to  : " + obj.getPhone());
	
		} else
			System.out.println("you are not authorized to update phone number");
	}
		

		

}