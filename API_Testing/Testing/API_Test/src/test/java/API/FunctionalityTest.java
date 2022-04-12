package API;

import org.junit.Assert;
import org.junit.Test;

public class FunctionalityTest {
	
	StaticTest func = new StaticTest();

	@Test
	public void allFunc() {
		Assert.assertNotNull(func.CountryName());
		Assert.assertNotNull(func.Region());
		Assert.assertNotNull(func.Area());
		Assert.assertNotNull(func.Alpha2Code());
	}
	
	@Test
	public void allFuncfail() {
		Assert.assertNull(func.CountryName());
		Assert.assertNull(func.Region());
		Assert.assertNull(func.Area());
		Assert.assertNull(func.Alpha2Code());
	}
	
	@Test
	public void mostFuncfail() {
		Assert.assertNotNull(func.CountryName());
		Assert.assertNull(func.Region());
		Assert.assertNull(func.Area());
		Assert.assertNull(func.Alpha2Code());
	}

}
