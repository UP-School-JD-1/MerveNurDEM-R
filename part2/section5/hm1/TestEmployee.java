package part2.section5.hm1;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Demir", 95, "Production");
		e1.printInfo();
		try {
			System.out.println("Salary: " + e1.calculateSalary());
		} catch (SalaryPaidOnBankException e) {
			e.getMessage();
			processSalaryPaidOnBankException(e);
		}
		e1.work();

		System.out.println();

		Manager m1 = new Manager(5, "Merve", 8, "Production", "Production");
		m1.printInfo();
		try {
			System.out.println("Salary: " + m1.calculateSalary());
		} catch (SalaryPaidOnBankException e) {
			e.getMessage();
			processSalaryPaidOnBankException(e);
		}
		m1.work();

		System.out.println();

		Director d1 = new Director(2, "Ridvan", 6, "Management", "Management", 9000);
		d1.printInfo();

		try {
			System.out.println("Salary: " + d1.calculateSalary());
		} catch (SalaryPaidOnBankException e) {

			e.getMessage();
			processSalaryPaidOnBankException(e);
		}
		d1.work();

	}

	private static void processSalaryPaidOnBankException(SalaryPaidOnBankException ex) {
		System.err.println(ex.getMessage());
	}
}