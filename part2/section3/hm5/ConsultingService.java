package part2.section3.hm5;

public class ConsultingService extends Product implements Priceable {

	public ConsultingService(String description, String sku, double price, double tax) {
		super(description, sku, price, tax);

	}

	public void consulting() {
		System.out.println(super.getDescription() + " provided.\n");
	}

	@Override
	public void purchase() {
		System.out.println(super.getDescription() + " cost is " + super.getPrice() + " ₺\n\n");
	}

}
