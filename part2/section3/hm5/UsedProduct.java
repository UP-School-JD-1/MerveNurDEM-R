package part2.section3.hm5;

public class UsedProduct implements Locatable, Priceable {

	String description;
	double price;
	public boolean isSold = false;

	public UsedProduct(String description, double price, boolean isSold) {

		this.description = description;
		this.price = price;
		this.isSold = isSold;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void purchase() {
		System.out.println(description + " product is sell.\n");

	}

	@Override
	public void getDepot() {
		System.out.println("This " + getDescription() + " product is in stock.\n");

	}

	@Override
	public void getPlace() {
		System.out.println("This " + getDescription() + " product has been placed.\n");

	}

	public boolean isSold() {

		if (!isSold) {
			isSold = true;
			System.out.println("This used product " + getDescription() + " is available to sell.\n");
		} else {
			System.out.println("Product sold for " + price + " ₺\n\n");
		}

		return isSold;
	}

}