package part1.section8.hm3;

public class PointTest {
	public static void main(String[] args) {
		Point point = new Point(9, 18);
		Point point2 = new Point(7, 11);

		point.totalDistance();
		point.totalDistanceSecond(point2.m, point2.n);
		point.clone(5, 3);
		point2.move(2, 5);

		Point point3 = new Point(8, 7);
		point3.printInfo();

		Point point4 = new Point(2);
		point4.printInfo();

		Point point5 = new Point();
		point5.printInfo();
	}

}
