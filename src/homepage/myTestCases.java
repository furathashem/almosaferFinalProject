package homepage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases {
	WebDriver driver=new ChromeDriver();
	String AlmosaferURL="http://global.almosafer.com/en";
	String ExpectedDefaultLanguage="en";
	
	
	@BeforeTest
	public void mySetUp()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(AlmosaferURL);	
	driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary")).click();
	}
	@Test(priority = 1)
	public void CheckTheDefultLanguageIsEnglish() 
	{
	String ActualLanguage=driver.findElement(By.tagName("html")).getAttribute("lang");
		Assert.assertEquals(ActualLanguage,ExpectedDefaultLanguage);
	}
	@Test(priority = 2)
	public void CheckdefultCurrency() {
		String ExpectedCurrency="SAR";
		WebElement Currency=driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']"));
		Currency.getText();
		String ActualCurrency=Currency.getText();
		Assert.assertEquals(ActualCurrency, ExpectedCurrency);
		
	}
	@Test(priority = 3)
	public void checkContantNumber()
	{
		String ExpectedContantNumber="+966554400000";
	WebElement Number=	driver.findElement(By.tagName("strong"));
	String ActualContantNumber=Number.getText();
	Assert.assertEquals(ActualContantNumber,ExpectedContantNumber);
	}
	@Test(priority = 4)
	public void CheckQitafLogo() {
		boolean ExpectedResult=true;
	WebElement TheFooter=driver.findElement(By.tagName("footer"));
//	//boolean ActualResultForThelogo=	TheFooter.findElement(By.cssSelector(".sc-bdVaJa.bxRSiR.sc-ekulBa.eYboXF")).isDisplayed();
//		WebElement thediv=driver.findElement(By.cssSelector(".sc-fihHvN.eYrDjb"));
//		WebElement thelogo=thediv.findElement(By.cssSelector(".sc-bdVaJa.bxRSiR.sc-ekulBa.eYboXF"));
WebElement logo=TheFooter.findElement(By.cssSelector(".sc-fihHvN.eYrDjb")).findElement(By.cssSelector(".sc-bdVaJa.bxRSiR.sc-ekulBa.eYboXF"));
boolean ActualresultForTheLogo= logo.isDisplayed();
Assert.assertEquals(ActualresultForTheLogo, ExpectedResult);
		
	}

}
