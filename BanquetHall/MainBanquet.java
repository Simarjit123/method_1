import java.util.Scanner;

public class MainBanquet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banquet obj = new Banquet();
//base booking cost
		System.out.print("Enter base booking cost:");
		obj.setBaseBookingCost(sc.nextDouble());

		if (obj.getBaseBookingCost() > 0) {
			// food cost
			System.out.print("Enter Food cost:");
			obj.setFoodCost(sc.nextDouble());

			if (obj.getFoodCost() > 0) {
				// beverage cost
				System.out.print("Enter beverage cost:");
				obj.setBeverageCost(sc.nextDouble());
				if (obj.getBeverageCost() > 0) {
					// tip cost

					System.out.println("Please enter amount of tip: ");
					obj.setTipCost(sc.nextInt());

					if (obj.getTipCost() > 0) {

						// Total base cost
						double totalBaseCost = obj.calculateBaseCost(obj.baseBookingCost, obj.foodCost,
								obj.beverageCost, obj.tipCost);
						System.out.println("Total Base cost is:" + totalBaseCost);

						// total Tax
						/*
						 * double totalTax = obj.calculateTax(totalBaseCost);
						 * System.out.println("Total tax is:" + totalTax);
						 */
						// no of guest negative scenario
						System.out.print("Enter the total no. of Guests:");
						int noOfGuests = sc.nextInt();

						if (noOfGuests != 0) {
							// Calculate service cess

							/*
							 * double serviceCess = obj.calculateCess(noOfGuests, totalBaseCost);
							 * System.out.println("service cess is:" + serviceCess);
							 */
						} else {
							System.out.println("minimum guests allowed are :10");
						}
					} else {
						System.out.println("tip cost should be more than zero");
					}
				} else {
					System.out.println("beverage cost can't be zero");
				}
			} else {
				System.out.println("food cost can't be zero");
			}
		} else {
			System.out.println("base cost can't be zero");
		}
		System.out.println("Total cost is:"+obj.calculateTheTotalCost(0));
	}
}