package de.feu.ps.faculty.tests;

import de.feu.ps.faculty.FacultyHelper;

public class FacultyTestMain {

	public static void main(String[] args) {
		testFacultyZero();
		testPositive1();
	}

	static void testFacultyZero() {
		FacultyHelper helper = new FacultyHelper();
		int faculty = helper.faculty(0);
		if (faculty != 1)
			System.out.println("Als Ergebnis von 0! wurde 1 erwartet,"
					+ " aber das Ergebnis ist " + faculty + ".");
	}

	static void testPositive1() {
		FacultyHelper helper = new FacultyHelper();
		int faculty = helper.faculty(1);
		if (faculty != 1)
			System.out.println("Als Ergebnis von 1! wurde 1 erwartet,"
					+ " aber das Ergebnis ist " + faculty + ".");
	}
}
