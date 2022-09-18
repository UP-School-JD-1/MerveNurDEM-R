package part2.section3.hm5;

public class Test {

	public static void main(String[] args) {
		ClothProduct cloth = new ClothProduct("Y8585AZFN747", "Dress", 1299.99, 39.99, "woman", "L");
		cloth.getDepot();
		System.out.println(cloth.toString());
		cloth.purchase();
		cloth.getPlace();

		UsedProduct cellPhone = new UsedProduct("Used cell phone", 7599.99, false);
		cellPhone.getDepot();
		cellPhone.isSold();
		cellPhone.getPlace();
		cellPhone.isSold();
		cellPhone.isSold = true;

		ConsultingService consulting = new ConsultingService("Service consulting", "C7486TSYN654", 6599, 89);
		consulting.consulting();
		consulting.purchase();

		Gift gift = new Gift("Y7486AZPN654", "Socks");
		gift.getDepot();
		gift.getPlace();
		gift.specialDay(cloth);

	}

}