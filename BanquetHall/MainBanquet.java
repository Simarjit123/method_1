import java.util.Scanner;

public class MainBanquet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banquet obj = new Banquet();
		// input values using scanner
		System.out.println("Enter base cost");
		obj.baseBookingCost = sc.nextDouble();
		System.out.println("Enter food cost:");
		obj.foodCost = sc.nextDouble();
		System.out.println("Enter beverage cost:");
		obj.beverageCost = sc.nextDouble();
		System.out.println("Enter tip cost:");
		obj.tipCost = sc.nextDouble();
		// Total base cost
		double totalBaseCost = obj.calculateBaseCost(obj.baseBookingCost, obj.foodCost, obj.beverageCost, obj.tipCost);
		System.out.println("Total Base cost is:" + totalBaseCost);
		// total Tax
		double totalTax = obj.calculateTax(totalBaseCost);
		System.out.println("Total tax is:" + totalTax);
		// No of guest Input
		System.out.print("Enter the total no. of Guests:");
		int noOfGuests = sc.nextInt();

		if (obj.guestNoVerify(noOfGuests)) {

			System.out.println("maximum capacity is 400,please try again");
		}
		// Calculate service cess
		double serviceCess = obj.calculateCess(noOfGuests, totalBaseCost);
		System.out.println("service cess is:" + serviceCess);
//calculate total cost
		double totalCost = obj.calculateTheTotalCost(totalBaseCost, totalTax, serviceCess);
		System.out.println("Total cost is:" + totalCost);
	}
}
