package API;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class Testcase {
	
	StaticTest result = new StaticTest();
	
	@Test
	public void CountryNameNotNull() {
		Assert.assertNotNull(result.CountryName());
	}
	
	@Test
    public void AreaNotZero() {
		
		Assert.assertEquals(-1.0,result.Area(),1.0);	
	}
	
	@Test
    public void AreaEqualZero() {
		Assert.assertEquals(0.0,result.Area(),1.0);	
	}
	
	@Test
    public void AreaGreaterThanZero() {
		Assert.assertEquals(1000.0,result.Area(),1.0);
	}
	
	@Test
    public void AreaEqual() {
    	Assert.assertEquals(1002450.0,result.Area(),1.0);	
	}
	
	@Test
	public void AreaNotNull() {
		Assert.assertNotNull(result.Area());
	}
	
	@Test
	public void Region_Success() {
		Assert.assertEquals("Africa",result.Region());
	}
	
	@Test
	public void Region_Fail() {
		//If the returned result is different than Africa test fails 
		Assert.assertEquals("Africa",result.Region());
	}
	
	@Test
	public void RegionNotNull() {
		Assert.assertNotNull(result.Region());
	}
	
	@Test
	public void Alpha2Code_Success() {
		Assert.assertEquals("EG",result.Alpha2Code());
	}
	
	@Test
	public void Alpha2Code_Fail() {
		//If the returned result is different than EG test fails
		Assert.assertEquals("EG",result.Alpha2Code());
	}
	
	@Test
	public void Alpha2CodeNotNull() {
		Assert.assertNotNull(result.Alpha2Code());
	}
	
}
