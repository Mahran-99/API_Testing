package API;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Caching {

public ArrayList<String> Read_From_File() throws FileNotFoundException {
	File file = new File("CachedData.txt"); 
	Scanner read = new Scanner(file);
	ArrayList<String> list = new ArrayList<String>();
	while(read.hasNextLine()) {
		String data = read.nextLine();
		list.add(data);
	}
	return list;
}

public void Write_In_File(String name,String region,String alpha,String area) throws IOException {
	File f = new File("CachedData.txt");
	FileWriter h = new FileWriter(f, true);
	h.write(name);
	h.write("\n");
	h.write(region);
	h.write("\n");
	h.write(alpha);
	h.write("\n");
	h.write(area);;
	h.write("\n");
	h.close();
}

public ArrayList<String> search(ArrayList<String> list,String data) {
	ArrayList<String> values = new ArrayList<String>();
	for(int i = 0; i<list.size(); i++ ) {
		if(data.equalsIgnoreCase(list.get(i))) {
			System.out.println("Data Found in Cache.");
			values.add(list.get(i));
			values.add(list.get(i+1));
			values.add(list.get(i+2));
			values.add(list.get(i+3));
			return values;
		}
	}
	return null;
}

}
