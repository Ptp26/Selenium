import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadandWrite {
	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream iputstream = new FileInputStream("A:\\Softwares\\Eclipse Projects\\ReadFile\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(iputstream);
		System.out.println((properties.getProperty("browser")));
		System.out.println((properties.getProperty("url")));
		FileOutputStream outputstream = new FileOutputStream("A:\\Softwares\\Eclipse Projects\\ReadFile\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("testdata","6585255");
		properties.store(outputstream, "This is customer data from TCS");
	}
	
	
}
