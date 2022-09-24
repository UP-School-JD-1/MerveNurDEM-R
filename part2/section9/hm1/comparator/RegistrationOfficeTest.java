package part2.section9.hm1.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import part2.section9.hm1.comparable.Student;

public class RegistrationOfficeTest {

	public static void main(String[] args) {
		List<Student> list_student = new ArrayList<Student>();

		list_student.add(new Student(1, "Merve ", 1985, new Date(), "Nurse"));
		list_student.add(new Student(17, "Nur ", 1977, new Date(), "Teacher"));
		list_student.add(new Student(2543, "Demir ", 1991, new Date(), "Engineer"));
		list_student.add(new Student(1789, "Okan ", 1965, new Date(), "Dentist"));

		Collections.sort(list_student);

		for (Student s : list_student) {
			System.out.println(s);
		}

	}

}