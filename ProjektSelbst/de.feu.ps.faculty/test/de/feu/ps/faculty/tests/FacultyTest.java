package de.feu.ps.faculty.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import de.feu.ps.faculty.FacultyHelper;

public class FacultyTest {

	private FacultyHelper helper;

	@Before
	public void buildFixture() {
		helper = new FacultyHelper();
	}

	@Test
	public void testFacultyZero() {
		int faculty = helper.faculty(0);
		Assert.assertEquals(1, faculty);
	}

	@Test
	public void testPositive1() {
		int faculty = helper.faculty(1);
		Assert.assertEquals(1, faculty);
	}

	/*@Test*/
	@Ignore
	public void testPositive2() {
		int faculty = helper.faculty(3);
		Assert.assertEquals(6, faculty);
	}

	/*@Test*/
	@Test(expected = IllegalArgumentException.class)
	public void testNegative1() {
		int faculty = helper.faculty(-1);
		Assert.assertEquals(-1, faculty);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegative1OnFaculty2() {
		helper.faculty2(-1);
	}

}
