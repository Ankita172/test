package GetProduct;

import java.io.IOException;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.hybridframework.Actions.ProductCatogoriesKids;
import com.hybridframework.testbase.CommonMethods;



public class Test1 extends ProductCatogoriesKids{

	
	@BeforeTest
	public static void setup() throws IOException {
		openBrowser("chrome", CommonMethods.getConfigProperty("URL"));
		maximize();
	}
	
	@Test
	public static void getlink () {
		
		GetModuleName();
		
	}
	
}
