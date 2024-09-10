package homepage;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class myTestCases extends Parameters {
	

	@BeforeTest
	public void mySetUp() {
		GeneralSetup();
		driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary")).click();
	}

	@Test(priority = 1)
	public void CheckTheDefultLanguageIsEnglish() {
		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		Assert.assertEquals(ActualLanguage, ExpectedDefaultLanguage);
	}

	@Test(priority = 2)
	public void CheckdefultCurrency() {
		
		String ActualCurrency  = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']")).getText();
		Assert.assertEquals(ActualCurrency, ExpectedCurrency);

	}

	@Test(priority = 3)
	public void checkContantNumber() {
		String ActualContantNumber = driver.findElement(By.tagName("strong")).getText();
		Assert.assertEquals(ActualContantNumber, ExpectedContantNumber);
	}

	@Test(priority = 4)
	public void CheckQitafLogo() {
		WebElement TheFooter = driver.findElement(By.tagName("footer"));
//	//boolean ActualResultForThelogo=	TheFooter.findElement(By.cssSelector(".sc-bdVaJa.bxRSiR.sc-ekulBa.eYboXF")).isDisplayed();
//		WebElement thediv=driver.findElement(By.cssSelector(".sc-fihHvN.eYrDjb"));
//		WebElement thelogo=thediv.findElement(By.cssSelector(".sc-bdVaJa.bxRSiR.sc-ekulBa.eYboXF"));
		WebElement logo = TheFooter.findElement(By.cssSelector(".sc-fihHvN.eYrDjb"))
				.findElement(By.cssSelector(".sc-bdVaJa.bxRSiR.sc-ekulBa.eYboXF"));
		boolean ActualresultForTheLogo = logo.isDisplayed();
		Assert.assertEquals(ActualresultForTheLogo, ExpectedResult);

	}

	@Test(priority = 5)
	public void TestHotelTabIsNotSelected() {
		String actualvalue = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels")).getAttribute("aria-selected");
		Assert.assertEquals(actualvalue, expectedvalue);
	}

	@Test(priority = 6)
	public void CheckDepatureDate() {
		List<WebElement> depatureandarrivaldates = driver.findElements(By.className("LiroG"));
//	WebElement arrivaldates=driver.findElement(By.xpath("//span[normalize-space()='09']"));
		String ActualDepatureDate = depatureandarrivaldates.get(0).getText();
		String ActualReturnDate = depatureandarrivaldates.get(1).getText();
		int ActualDepatureDateAsInt = Integer.parseInt(ActualDepatureDate);
		int ActualReturnDateAsInt = Integer.parseInt(ActualReturnDate);
//System.out.println(ActualReturnDateAsInt);
		Assert.assertEquals(ActualDepatureDateAsInt, tomorrow);
		Assert.assertEquals(ActualReturnDateAsInt, TheDayAfterTomorrow);
	}

	@Test(priority = 7)
	public void RandomlyChangeTheLanguage() {
	RandomSelectTheLanguageofthewebsite();
	}
	@Test(priority = 8)
	public void FillHotelTab()
	{
		WebElement HotelTab=driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		HotelTab.click();
		String websiteurl=driver.getCurrentUrl();
		WebElement SearchHotelInputField=driver.findElement(By.className("sc-phbroq-2"));
	if(websiteurl.contains("en"))
	{
		
		SearchHotelInputField.sendKeys(EnglishCities[randomenglish]);
	}
	else
	{
	SearchHotelInputField.sendKeys(Arabiccities[randomarabic]);
	}
	WebElement ListOfLocations=driver.findElement(By.cssSelector(".sc-phbroq-2.uQFRS.AutoComplete__Input"));
WebElement finalresult=	driver.findElements(By.tagName("li")).get(1);
finalresult.click();
	}
@Test(priority = 9)
public void RandomlySelectTheNumberOfVisitors()
{
	WebElement selectofthevisitor=driver.findElement(By.xpath("//select[@data-testid='HotelSearchBox__ReservationSelect_Select']"));
	Select select=new Select(selectofthevisitor);
		//By Index
select.selectByIndex(randomindex);
	//By Value
//	select.selectByValue("B");
	//By VisibleText
//	if(driver.getCurrentUrl().contains("en"))
//{select.selectByVisibleText("1 Room, 1 Adult, 0 Children");
//}else
//{
//	select.selectByVisibleText("1 غرفة، 1 بالغ، 0 أطفال");
//	}
//}
WebElement searchbutton=driver.findElement(By.xpath("//button[@data-testid='HotelSearchBox__SearchButton']"));
searchbutton.click();


}
@Test(priority = 10)
public void checkThePageFullyLoaded() throws InterruptedException
{
	Thread.sleep(10000);
String results=driver.findElement(By.xpath("//span[@data-testid='HotelSearchResult__resultsFoundCount']")).getText();
boolean finished=results.contains("وجدنا")||results.contains("found");
	System.out.println(finished);
	//Assert.assertEquals(finished, expectedresult);
	
}

@Test(priority = 11)
public void SortItemsLowestToHighestPrice()
{
	
	WebElement lowestpricesort=driver.findElement(By.xpath("//button[@data-testid='HotelSearchResult__sort__LOWEST_PRICE']"));
	lowestpricesort.click();
	WebElement pricescontainer=driver.findElement(By.cssSelector(".sc-htpNat.KtFsv.col-9"));
	List<WebElement> Allprices=pricescontainer.findElements(By.className("Price__Value"));
	String lowestprice=Allprices.get(0).getText();
	String highestprice=Allprices.get(Allprices.size()-1).getText();
	int lowestpriceASint=Integer.parseInt(lowestprice);
	int highestpriceAsint=Integer.parseInt(highestprice);
	boolean actualresult=lowestpriceASint<highestpriceAsint;
	Assert.assertEquals(actualresult, expectedresult2);
	
	
	
	
	
	
	
	}
}
