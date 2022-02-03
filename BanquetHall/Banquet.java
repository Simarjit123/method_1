
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
		this.beveragTax = beverageCost;
		this.tipCost = tipCost;
		totalBaseCost = baseBookingCost + foodCost + beverageCost + tipCost;
		return totalBaseCost;
	}

	double calculateTax(double calculateBaseCost) {
		totalTax = totalBaseCost * 0.05;
		return totalTax;

	}

	boolean guestNoVerify(int noOfGuests) {
		if (noOfGuests > 400) {
			return true;
		}
		return false;
	}

	double calculateCess(int noOfGuests, double totalBaseCost) {
		double cessPercent = 0;
		if (noOfGuests <= 40) {
			cessPercent = 0.4 * totalBaseCost;
		} else if (noOfGuests <= 80) {
			cessPercent = 0.8 * totalBaseCost;
		} else if (noOfGuests <= 150) {
			cessPercent = 0.1 * totalBaseCost;
		} else if (noOfGuests > 150) {
			cessPercent = 0.125 * totalBaseCost;
		}
		return cessPercent;
	}

	double calculateTheTotalCost(double totalBaseCost, double totalTax, double cessPercent) {
		double totalCost = totalBaseCost + totalTax + cessPercent;
		return totalCost;

	}
}
