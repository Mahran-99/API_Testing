package API;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	StaticTest allResults = new StaticTest();
	
/*	@Test
	public void intTest() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Africa", allResults.Region());
		Assert.assertEquals(1002450.0, allResults.Area(),1.0);
		Assert.assertEquals("EG", allResults.Alpha2Code());
	}
	
	@Test
	public void AreaRegion() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Africa", allResults.Region());
		Assert.assertEquals(1002450.0, allResults.Area(),1.0);
	}
	
	@Test
	public void AreaAlpha2Code() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals(1002450.0, allResults.Area(),1.0);
		Assert.assertEquals("EG", allResults.Alpha2Code());
	}
	
	@Test
	public void RegionAlpha2Code() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Africa", allResults.Region());
		Assert.assertEquals("EG", allResults.Alpha2Code());
	}
	
	@Test
	public void intTestFail() {
		Assert.assertEquals("Finland", allResults.CountryName());
		Assert.assertEquals("Africa", allResults.Region());
		Assert.assertEquals(1002450.0, allResults.Area(),1.0);
		Assert.assertEquals("EG", allResults.Alpha2Code());
	}
	
	@Test
	public void RegionFail() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Europe", allResults.Region());
		Assert.assertEquals(1002450.0, allResults.Area(),1.0);
		Assert.assertEquals("EG", allResults.Alpha2Code());
	}
	
	@Test
	public void AreaFail() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Africa", allResults.Region());
		Assert.assertEquals(1012450.0, allResults.Area(),1.0);
		Assert.assertEquals("EG", allResults.Alpha2Code());
	}
	
	@Test
	public void Alpha2CodeFail() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Africa", allResults.Region());
		Assert.assertEquals(1002450.0, allResults.Area(),1.0);
		Assert.assertEquals("EGY", allResults.Alpha2Code());
	}
	
	@Test
	public void RegionAreaFail() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Europe", allResults.Region());
		Assert.assertEquals(1002450.0, allResults.Area(),1.0);
	}
	
	@Test
	public void AreaRegionFail() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Africa", allResults.Region());
		Assert.assertEquals(1012450.0, allResults.Area(),1.0);
	}
	
	@Test
	public void AreaAlpha2CodeFail() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals(1012450.0, allResults.Area(),1.0);
		Assert.assertEquals("EG", allResults.Alpha2Code());
	}
	
	@Test
	public void Alpha2CodeAreaFail() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals(1002450.0, allResults.Area(),1.0);
		Assert.assertEquals("EGY", allResults.Alpha2Code());
	}
	
	@Test
	public void RegionAlpha2CodeFail() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Europe", allResults.Region());
		Assert.assertEquals("EG", allResults.Alpha2Code());
	}
	
	@Test
	public void Alpha2CodeRegionFail() {
		Assert.assertEquals("Egypt", allResults.CountryName());
		Assert.assertEquals("Africa", allResults.Region());
		Assert.assertEquals("EGY", allResults.Alpha2Code());
	}
	*/
	
	@Test
	public void intTest1() throws Exception {
		APIconnection.call_me("Egypt");
	}
	
	//connection Test
	@Test
	public void intTest2() throws Exception {
		APIconnection.call_me("Egypt");
		Assert.assertEquals("Egypt", allResults.CountryName());
	}
	
	
}