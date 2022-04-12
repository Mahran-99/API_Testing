package API;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.JSONObject;

import com.sun.net.httpserver.HttpServer;
public class APIconnection {
	
	static StringBuffer response = new StringBuffer();
	static Caching cache = new Caching();
public static void main(String[] args) throws IOException {
	     try {
	    	 ArrayList<String> file = new ArrayList<String>();
	    	 ArrayList<String> data = new ArrayList<String>();
	    	 System.out.println("Enter Country Name: ");
	 		 Scanner countryName = new Scanner(System.in);
	 		 String country =countryName.next();
	 		 file = cache.Read_From_File();
	 		 data = cache.search(file, country);
	 		 if(data!=null) {
	 			System.out.println("Retriving Data from Cashe...");
	 			System.out.println("CountryName: " + data.get(0));
	 			System.out.println("Region: " + data.get(1));
	 			System.out.println("alpha2Code: " + data.get(2));
	 			System.out.println("Area: " + data.get(3));
	 		 }
	 		 else {
	 		 System.out.println("Data Not Found in Cache, Using API....");
	 		 APIconnection.call_me(country);
	 		 String Str=getresponse();
		     String jsonn=Str.substring(1, Str.length()-1);
		     System.out.println(jsonn);
	 		 org.json.JSONObject js=new org.json.JSONObject(jsonn);
		     String name = (String)js.get("name");
		     String region = (String)js.get("region");
		     String alpha = (String)js.get("alpha2Code");
		     String area = String.valueOf(js.get("area"));
		     cache.Write_In_File(name, region, alpha, area);
	 		 }
	        } catch (Exception e) {
	         e.printStackTrace();
	       }
	     
	     HttpServer server = HttpServer.create(new InetSocketAddress(8005), 0);
			server.createContext("/test", new Handler());
			server.setExecutor(null); // creates a default executor
			server.start();
}
	     
public static void call_me(String country) throws Exception {
	    String f="https://restcountries.eu/rest/v2/name/";
	    String spec =f+country+ "?fields=name;region;area;alpha2Code";
	     URL obj = new URL(spec);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	     // optional default is GET
	     con.setRequestMethod("GET");
	     //add request header
	     con.setRequestProperty("User-Agent", "Mozilla/5.0");
	     int responseCode = con.getResponseCode();
	     System.out.println("\nSending 'GET' request to URL : " + spec);
	     System.out.println("Response Code : " + responseCode);
	     BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     while ((inputLine = in.readLine()) != null) {
	     	response.append(inputLine);
	     }
	     in.close();
	     //print in String
	    // System.out.println(response.toString());
}
	
	public static String getresponse() {
		 return response.toString();
	   }
	
}