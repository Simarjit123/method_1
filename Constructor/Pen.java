
public class Pen {
	String brand;
	double cost;
	String colour;

	Pen() {

	}

	Pen(String brand) {

		this.brand = brand;
	}

	Pen(String brand, double cost, String colour) {
		{
			this.brand = brand;
			this.cost = cost;
			this.colour = colour;
		}
	}

	String getBrand() {
		return brand;
	}

	double getCost() {
		return cost;
	}

	String getColour() {
		return colour;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	void setCost(double cost) {
		this.cost = cost;
	}

	void setColour(String colour) {
		this.colour = colour;
	}
}
