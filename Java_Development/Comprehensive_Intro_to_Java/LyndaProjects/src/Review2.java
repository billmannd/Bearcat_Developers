import java.io.BufferedReader;
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException; 

public class Review2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader file = new FileReader("Untitled 1");
		BufferedReader reader = new BufferedReader(file);
		
		String data;
		
		while ((data = reader.readLine()) != null) {
			System.out.println(data);
		}
		reader.close();
	}
	

}
