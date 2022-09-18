package part2.section2.hm1;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);


	}

	@Override
	public void study() {
	
		System.out.println(getName() +  " who vocational student studies in the department of " + major );
	}
	@Override
	public void register() {
	
		System.out.println(getName() +  " who vocational student has been registered." );
	
	}

	@Override
	public String toString() {
		
		return super.toString();
	}

	

}