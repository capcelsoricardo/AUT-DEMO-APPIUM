package openshopio.tests;

import java.net.MalformedURLException;

import org.testng.annotations.Test;
import openshopio.pages.PageBemVindo;
import openshopio.setup.SetUp;

public class SegundoTeste extends SetUp {
	
	@Test
	public void PrimeiroTeste() throws MalformedURLException {										
		PageBemVindo pageBemVindo = new PageBemVindo(driver);
		pageBemVindo.ClickButtonOk();		
	}		
	
	
}
