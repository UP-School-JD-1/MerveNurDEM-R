package part2.section2.hm1;

public class RegistrationOfficeTest {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		Student student = registrationOffice.getAStudent();
		registrationOffice.registerStudent(student);
		System.out.println(student);

	}

}