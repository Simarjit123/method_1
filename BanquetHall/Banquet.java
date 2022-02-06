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

	public Banquet() {

	}

	double calculateBaseCost(double baseBookingCost, double foodCost, double beverageCost, double tipCost) {
		this.baseBookingCost = baseBookingCost;
		this.foodCost = foodCost;
		this.beverageCost = beverageCost;
		this.tipCost = tipCost;
		totalBaseCost = baseBookingCost + foodCost + beverageCost + tipCost;
		return totalBaseCost;
	}

	public void setBaseBookingCost(double baseBookingCost) {
		this.baseBookingCost = baseBookingCost;
	}

	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}

	public void setBeverageCost(double bevarageCost) {
		this.beverageCost = bevarageCost;
	}

	public void setTipCost(double tipCost) {
		this.tipCost = tipCost;
	}

	public double getBaseBookingCost() {
		return baseBookingCost;
	}

	public double getFoodCost() {
		return foodCost;
	}

	public double getBeverageCost() {
		return beverageCost;
	}

	public double getTipCost() {
		return tipCost;
	}

	private double calculateTax(double calculateBaseCost) {
		totalTax = totalBaseCost * 0.05;
		return totalTax;

	}

	private double calculateCess(int noOfGuests, double totalBaseCost) {
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

	/*
	 * double calculateTheTotalCost(double calculatetotalcost) {
	 * 
	 * calculatetotalcost = totalBaseCost + totalTax + serviceCess; return
	 * calculatetotalcost;
	 * 
	 * }
	 */

	double calculateTheTotalCost(double totalBaseCost, double totalTax, double cessPercent) {
		totalTax = calculateTax(totalBaseCost);
		serviceCess = calculateCess(noOfGuests, totalBaseCost);
		double totalCost = totalBaseCost + totalTax + cessPercent;
		return totalCost;

	}

}