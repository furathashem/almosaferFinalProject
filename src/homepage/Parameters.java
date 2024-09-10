package homepage;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameters {
	WebDriver driver = new ChromeDriver();
	String AlmosaferURL = "http://global.almosafer.com/en";
	String ExpectedDefaultLanguage = "en";
	Random rand = new Random();
	String ExpectedCurrency = "SAR";
	String ExpectedContantNumber = "+966554400000";
	boolean ExpectedResult = true;
	String expectedvalue = "false";
	LocalDate todaydate = LocalDate.now();
	int today = todaydate.getDayOfMonth();
	int tomorrow = todaydate.plusDays(1).getDayOfMonth();
	int TheDayAfterTomorrow = todaydate.plusDays(2).getDayOfMonth();
	String[] EnglishCities= {"Dubbai","Jeddah","riyadh"};
	String[] Arabiccities= {"جدة","دبي"};
	int randomenglish=rand.nextInt(EnglishCities.length);
	int randomarabic=rand.nextInt(Arabiccities.length);
	boolean expectedresult=true;
	int randomindex=rand.nextInt(2);
	boolean expectedresult2=true;
	
	public  void RandomSelectTheLanguageofthewebsite()
	{
		String[] URLs = { "https://www.almosafer.com/en", "https://www.almosafer.com/ar" };

		int RandomIndex = rand.nextInt(URLs.length);

		driver.get(URLs[RandomIndex]);
	}
public void GeneralSetup()
{
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get(AlmosaferURL);
}

}
