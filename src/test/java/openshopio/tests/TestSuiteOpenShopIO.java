package openshopio.tests;

import java.net.MalformedURLException;

import org.junit.Test;

import openshopio.pages.PageBemVindo;
import openshopio.setup.SetUp;

public class TestSuiteOpenShopIO extends SetUp {		
	
	@Test
	public void PrimeiroTeste() throws MalformedURLException {										
		PageBemVindo pageBemVindo = new PageBemVindo(driver);
		pageBemVindo.clickButtonSkip();		
	}				
}
