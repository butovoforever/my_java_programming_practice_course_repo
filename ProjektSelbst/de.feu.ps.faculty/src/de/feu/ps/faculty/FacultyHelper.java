package de.feu.ps.faculty;

public class FacultyHelper {

	public int faculty(int n) {
		if (n == 0)
			return 1;
		else if (n > 0)
			return n * faculty(n - 1);
		else
			//return -1;
			throw new IllegalArgumentException("n! is undefined for n < 0.");
	}

	public int faculty2(int n) throws IllegalArgumentException {
		if (n == 0)
			return 1;
		else if (n > 0)
			return n * faculty(n - 1);
		else
			throw new IllegalArgumentException("n! is undefined for n < 0.");
	}

}
