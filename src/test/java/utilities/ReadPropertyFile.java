package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Java P\\Framework\\src\\test\\resources\\resources\\config.properties");
		Properties p = new Properties();
		p.load(fr);
		
		
	}

}
