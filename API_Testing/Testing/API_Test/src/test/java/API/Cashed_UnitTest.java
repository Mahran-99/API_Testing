package API;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
@RunWith(MockitoJUnitRunner.class)
public class Cashed_UnitTest {

	StaticTest API = new StaticTest();
	Caching cache = new Caching();
	
	@Test
	public void test1() throws FileNotFoundException {
	assertNotNull(cache.Read_From_File());
		
	}
	
	@Mock
	APIconnection connection = new APIconnection();
	@Test
	public void VerifyTest() {      
	connection.getresponse();
    verify(connection).getresponse();
	 }   
	
	@Test
	public void test2() throws FileNotFoundException {
	assertNotNull(APIconnection.getresponse());	
	}
	
	@Mock
	Caching done = new Caching();
	@Test
	public void test3() throws IOException {
	done.Write_In_File("Egypt", "Africa", "EG", "1002450.0");
	verify(done).Write_In_File("Egypt", "Africa", "EG", "1002450.0");
	}

}
