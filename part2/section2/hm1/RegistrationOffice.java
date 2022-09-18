package part2.section2.hm1;

import java.util.Date;

public class RegistrationOffice {

	public Student getAStudent() {
		Student student = null;
		int a = (int) (5 * Math.random());

		switch (a) {
		case 0:
			student = new UndergraduateStudent(1995, "Merve Nur", 2022, new Date(), "Electrical and Electronics Engineering", "Electromagnetic");
			break;
		case 1:
			student = new VocationalStudent(87, "Ali", 2021, new Date() , "Biology");
			break;
		case 2:
			student = new GraduateStudent(45871, "Demir", 2019, "Chemistry", new Date(), "Doc. Dr. Nacaroglu ",
					"Number Theory");
			break;
		case 3:
			student = new MasterStudent(874, "Rıdvan", 2020, "Control and Circuit Analysis", new Date(), "Doc. Dr. Keskin", "Circuits");
			break;

		case 4:
			student = new PhdStudent(74125, "Lale", 2018, new Date(), "Physics", "Doc. Dr. Watsuji ", "Electronics", true);
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