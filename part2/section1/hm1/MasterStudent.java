package part2.section1.hm1;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, String major, Date dob, String advisor, String thesis) {
		super(no, name, year, major, dob, advisor, thesis);

	}

	@Override
	public void study() {

		super.study();
	}

	@Override
	public void register() {

		super.register();
	}

	@Override
	public void writeThesis() {

		System.out.println(getName() + " that master student is writing thesis  about " + getThesis());
	}

	@Override
	public void meetWithAdvisor() {

		System.out
				.println(getName() + " that master student meets once in a week with advisor who is  " + getAdvisor());
	}
}
