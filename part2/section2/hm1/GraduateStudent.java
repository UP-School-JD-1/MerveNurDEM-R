package part2.section2.hm1;

import java.util.Date;

public class GraduateStudent extends Student {

	String advisor;
	String thesis;

	public GraduateStudent(int no, String name, int year, String major, Date dob, String advisor, String thesis) {
		super(no, name, year, dob, major);
		this.advisor = advisor;
		this.thesis = thesis;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}

	@Override
	public void study() {

		System.out.println(getName() + " who graduted student studies in the department of " + major);
	}

	@Override
	public void register() {

		System.out.println(getName() + " who graduted student has been registered.");

	}

	public void meetWithAdvisor() {
		System.out.println(
				getName() + " that graduate student meets once in a week with advisor who is  " + getAdvisor());
	}

	public void writeThesis() {
		System.out.println(getName() + " that graduate student is writing thesis  about " + getThesis());
	}

}