package jira.panasa_Art;

import org.junit.Assert;
import org.junit.Before;

public class AppTest {

	int num = 10;
	int secNum = 20;

	@Before
	public void setUp() {
		System.out.println("class Started");
	}

	@org.junit.Test
	public void addNumEquals() {
		Assert.assertEquals("as expected", num, 10);
	}

	@org.junit.Test
	public void assertEquals() {
		Assert.assertEquals("as expected", secNum, 20);
	}
}
