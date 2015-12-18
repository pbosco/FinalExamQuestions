package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");

		Student stu2 = new Student("Peyton", "Frederick", "Bosco", dBirthDate, "216 Labrador Lane", "302-893-6666", "pbosco@udel.edu","MIS");
		
		Student stu3 = new Student("Dawson", "Anthony", "Bosco", dBirthDate, "216 Labrador Lane", "302-893-6667", "dbosco@udel.edu","MIS");
		
		Student stu4 = new Student("Rod", "John", "Bradbury", dBirthDate, "220 Labrador Lane", "302-893-6382", "bradr@udel.edu","MIS");
		
		Student stu5 = new Student("Matt", "Joe", "Lesyk", dBirthDate, "230 Labrador Lane", "302-893-0000", "mlesyk@udel.edu","MIS");

		
		HashMap map = new HashMap();
		map.put(stuID, stu1);
		map.put(stuID, stu2);
		map.put(stuID, stu3);
		map.put(stuID, stu4);
		map.put(stuID, stu5);
		
		assertTrue(map.size() == 5);


		assertTrue(1==1);
	}

}
