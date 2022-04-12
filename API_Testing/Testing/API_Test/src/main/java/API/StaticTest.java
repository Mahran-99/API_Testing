package API;

import org.json.JSONObject;
import java.io.InputStreamReader;

public class StaticTest {
	
	static JSONObject myResponse = new JSONObject("{\"name\":\"Egypt\",\"topLevelDomain\":[\".eg\"],\"alpha2Code\""
       		+ ":\"EG\",\"alpha3Code\":\"EGY\",\"callingCodes\":[\"20\"],\"capital\":\"Cairo\",\"altSpellings\""
      		+ ":[\"EG\",\"Arab Republic of Egypt\"],\"region\":\"Africa\",\"subregion\":\"Northern Africa\",\""
      		+ "population\":91290000,\"latlng\":[27.0,30.0],\"demonym\":\"Egyptian\",\"area\":1002450.0,\"gini"
      		+ "\":30.8,\"timezones\":[\"UTC+02:00\"],\"borders\":[\"PAL\",\"LBY\",\"SDN\"],\"nativeName\":\"Ù…ØµØ±â€Ž\""
      		+ ",\"numericCode\":\"818\",\"currencies\":[{\"code\":\"EGP\",\"name\":\"Egyptian pound\",\"symbol\":\"Â£\"}],"
      		+ "\"languages\":[{\"iso639_1\":\"ar\",\"iso639_2\":\"ara\",\"name\":\"Arabic\",\"nativeName\":\"Ø§Ù„Ø¹Ø±Ø¨ÙŠØ©\"}]"
      		+ ",\"translations\":{\"de\":\"Ã„gypten\",\"es\":\"Egipto\",\"fr\":\"Ã‰gypte\",\"ja\":\"ã‚¨ã‚¸ãƒ—ãƒˆ\",\"it\":\"Egitto\",\"br\":"
      		+ "\"Egito\",\"pt\":\"Egipto\",\"nl\":\"Egypte\",\"hr\":\"Egipat\",\"fa\":\"Ù…ØµØ±\"},"
      		+ "\"flag\":\"https://restcountries.eu/data/egy.svg\",\"regionalBlocs\":"
      		+ "[{\"acronym\":\"AU\",\"name\":\"African Union\",\"otherAcronyms\":[],"
      		+ "\"otherNames\":[\"Ø§Ù„Ø§ØªØ­Ø§Ø¯ Ø§Ù„Ø£Ù�Ø±ÙŠÙ‚ÙŠ\",\"Union africaine\",\"UniÃ£o Africana\",\"UniÃ³n Africana\","
      		+ "\"Umoja wa Afrika\"]},{\"acronym\":\"AL\",\"name\":\"Arab League\",\"otherAcronyms\":[],"
      		+ "\"otherNames\":[\"Ø¬Ø§Ù…Ø¹Ø© Ø§Ù„Ø¯ÙˆÙ„ Ø§Ù„Ø¹Ø±Ø¨ÙŠØ©\",\"JÄ�miÊ»at ad-Duwal al-Ê»ArabÄ«yah\",\"League of Arab States\"]}]"
      		+ ",\"cioc\":\"EGY\"}");
	
	public static void main(String[] args) {
	 
	     System.out.println("result after Reading JSON Response");
	     System.out.println("Country Name- "+myResponse.getString("name"));
	     System.out.println("Region- "+myResponse.getString("region"));
	     System.out.println("Area- "+myResponse.getDouble("area"));
	     System.out.println("Alpha2Code- "+myResponse.getString("alpha2Code"));

	}
	
	public String CountryName() {
		return myResponse.getString("name");
	}
	
	public String Region() {
		return myResponse.getString("region");
	}

	public String Alpha2Code() {
		return myResponse.getString("alpha2Code");
	}
	
	public double Area() {
		return myResponse.getDouble("area");
	}
	
}