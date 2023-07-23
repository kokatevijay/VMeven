package NaukariUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class UtilityClass
{
	public String getDatafromPropertyFile(String key) throws IOException
	{
		Properties prop = new Properties();
		FileInputStream myfile = new FileInputStream("D:\\Eclips\\ProgramFiles\\TRAINGNG\\Interview_src\\Naukari.properties");
		prop.load(myfile);
		String Value = prop.getProperty(key);
		return Value;
	}
}