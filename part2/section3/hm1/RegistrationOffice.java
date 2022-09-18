package part2.section3.hm1;

import java.util.Date;

public class RegistrationOffice {

	public Student getAStudent() {
		Student student = null;
		int a = (int) (5 * Math.random());

		switch (a) {
		case 0:
			student = new UndergraduateStudent(58467, "Murat", 2019, new Date(), "Sociology", "History");
			break;
		case 1:
			student = new VocationalStudent(55551, "Suleyman", 2010, new Date(), "Biology");
			break;
		case 2:
			student = new GraduateStudent(12345, "Hande", 2001, "Math Education", new Date(), "Doc. Dr. Cetinkaya ",
					"Number Theory");
			break;
		case 3:
			student = new MasterStudent(12459, "Seda", 2020, "Philosophy", new Date(), "Prof. Isler", "Human Acts");
			break;

		case 4:
			student = new PhdStudent(69547, "Caglar", 2005, new Date(), "Physics", "Doc. Dr Safure", "Electrics", true);
			break;
		}

		return student;

	}

	public void registerStudent(Student student) {

		if (student instanceof PhdStudent) {
			PhdStudent phdStudent = (PhdStudent) student;
			if (phdStudent.qualifyingExamTaken) {
				phdStudent.register();
				phdStudent.study();
				phdStudent.meetWithAdvisor();
				phdStudent.writeThesis();
				phdStudent.writePaper();

			} else {
				System.out.println("Registration is not completed for PHD student " + phdStudent.getName()
						+ " because  s/he couldn't complete the 'Qualifying Exam' successfully. ");
			}
		}

		else if (student instanceof MasterStudent) {
			MasterStudent masterStudent = (MasterStudent) student;
			masterStudent.register();
			masterStudent.study();
			masterStudent.meetWithAdvisor();
			masterStudent.writeThesis();

		} else if (student instanceof GraduateStudent) {
			GraduateStudent graduateStudent = (GraduateStudent) student;
			graduateStudent.register();
			graduateStudent.study();
			graduateStudent.meetWithAdvisor();
			graduateStudent.writeThesis();

		} else if (student instanceof UndergraduateStudent) {
			UndergraduateStudent underGraduate = (UndergraduateStudent) student;

			underGraduate.register();
			underGraduate.study();

		} else if (student instanceof VocationalStudent) {
			VocationalStudent vocationalStudent = (VocationalStudent) student;

			vocationalStudent.register();
			vocationalStudent.study();

		} else if (student instanceof Student) {
			student.register();
			student.study();

		}

	}
}