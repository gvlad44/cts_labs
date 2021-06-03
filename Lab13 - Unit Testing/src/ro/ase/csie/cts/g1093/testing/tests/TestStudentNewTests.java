package ro.ase.csie.cts.g1093.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.g1093.testing.exception.WringGradeException;
import ro.ase.csie.cts.g1093.testing.exception.WrongAgeException;
import ro.ase.csie.cts.g1093.testing.models.Student;

public class TestStudentNewTests {

	// test fixture
	static Student student;
	static ArrayList<Integer> grades;
	static String initialName;
	static int initialAge;
	static int initialNoOfGrades;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		initialName = "John Doe";
		initialAge = Student.MIN_AGE + 1;
		initialNoOfGrades = 3;
		grades = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < initialNoOfGrades; i++) {
			grades.add(random.nextInt(Student.MAX_GRADE) + 1);
		}

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(initialName, initialAge, grades);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = WrongAgeException.class)
	public void testSetAgeRange() throws WrongAgeException {
		int newAge = Integer.MAX_VALUE;
		student.setAge(newAge);
	}

	@Test(expected = WrongAgeException.class)
	public void testSetAgeRangeBigValue() throws WrongAgeException {
		int newAge = 200;
		student.setAge(newAge);
	}

	@Test
	public void testSetAgeBoundaryLowLimit() throws WrongAgeException {
		int newAge = Student.MIN_AGE;
		student.setAge(newAge);
		assertEquals("Boundary low limit failed", newAge, student.getAge());
	}

	@Test
	public void testSetAgeBoundaryUpperLimit() throws WrongAgeException {
		int newAge = Student.MAX_AGE;
		student.setAge(newAge);
		assertEquals("Boundary upper limit failed", newAge, student.getAge());
	}

	@Test
	public void testSetGradesRefferenceDeepCopy() throws WringGradeException {
		int[] grades = new int[] { 9, 9, 10 };
		ArrayList<Integer> refGrades = new ArrayList<>();
		for(int grade: grades) {
			refGrades.add(grade);
		}
		
		student.setGrades(refGrades);

		refGrades.set(0, 5);

		int[] studentGrades = new int[student.getNoGrades()];
		for (int i = 0; i < student.getNoGrades(); i++) {
			studentGrades[i] = student.getGrade(i);
		}
		
		assertArrayEquals("We do shallow copy", grades, studentGrades);

	}

}
