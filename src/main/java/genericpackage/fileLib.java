package genericpackage;

import java.io.FileInputStream;
import java.util.Properties;

public class fileLib {

	public String getPropertydata(String key)
	{
		try {
		FileInputStream fis=new FileInputStream("./data/testcase.properties");
		Properties p=new Properties();
		p.load(fis);
	    String data = p.getProperty(key);
          return data;
		}
		catch(Exception e){
		 e.getMessage();
		}
		return key;
	}

}
