
public class Banquet {
	double baseBookingCost;
	double foodCost;
	double beverageCost;
	double foodTax;
	double beveragTax;
	double tipCost;
	double totalBaseCost;
	double totalTax;
	double serviceCess;
	int noOfGuests;

	Banquet() {
	}

	double calculateBaseCost(double baseBookingCost, double foodCost, double beverageCost, double tipCost) {
		this.baseBookingCost = baseBookingCost;
		this.foodCost = foodCost;
		this.beverageCost = beverageCost;
		this.tipCost = tipCost;
		totalBaseCost = baseBookingCost + foodCost + beverageCost + tipCost;
		return totalBaseCost;
	}

	double calculateTax(double calculateBaseCost) {
		totalTax = totalBaseCost * 0.05;
		return totalTax;

	}

	double calculateCess(int noOfGuests, double totalBaseCost) {
		double cessPercent = 0;
		if (noOfGuests <= 40) {
			cessPercent = 0.04 * totalBaseCost;
		} else if (noOfGuests > 40 && noOfGuests <= 80) {
			cessPercent = 0.08 * totalBaseCost;
		} else if (noOfGuests > 80 && noOfGuests <= 150) {
			cessPercent = 0.10 * totalBaseCost;
		} else {
			cessPercent = 0.125 * totalBaseCost;
		}
		return cessPercent;
	}

	double calculateTheTotalCost(double totalBaseCost, double totalTax, double cessPercent) {
		double totalCost = totalBaseCost + totalTax + cessPercent;
		return totalCost;

	}
}
