package genericpackage;

import java.io.FileInputStream;

import java.util.Properties;

public class FileUtility {

	public String getProprtyKeyValue(String key ) throws Throwable {
		
		FileInputStream fis=new FileInputStream("./data/testcase.properties");
		Properties p=new Properties();
		p.load(fis);
		 String data = p.getProperty(key);
		return data;
		
	}
	
}
