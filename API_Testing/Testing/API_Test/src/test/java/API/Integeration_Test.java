package API;

import static org.junit.Assert.*;
import java.awt.List;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class Integeration_Test {

	Caching cachee = new Caching();
	
	  @Test
	  public void test1() throws FileNotFoundException {
		    ArrayList<String> data = new ArrayList<String>();
		    ArrayList<String> values = new ArrayList<String>();
		    data = cachee.Read_From_File();
	        values.add("Egypt");
	        values.add("Africa");
	        values.add("EG");
	        values.add("1002450.0");
	        //verify that the add method was called with argument 'some string'
	        assertEquals(values,cachee.search(data, "Egypt"));
	  }
	  
	 //connection Test 
	 @Test
	 public void intTest1() throws Exception {
			APIconnection.call_me("Egypt");
		}
	
}
