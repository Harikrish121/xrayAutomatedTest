package jira.panasa_Art;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AppTest {

	int num = 20;
	int secNum = 20;
	String expected = "Hari";
	String actual = "Hari";

	@BeforeEach
	public void setUp() {
		System.out.println("class Started");
	}

	@Test
	public void addNumEquals() {

		Assertions.assertEquals(num, secNum);
	}

	@Test
	public void assertEquals() {
		Assertions.assertEquals(expected, actual, "Strings should be equal");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("Class Ended");
	}
}
