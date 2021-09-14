package selenium_first;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String url = "http://leaftaps.com/opentaps/control/main";
		driver.get(url);

		String title = driver.getTitle();
		System.out.println("current title is " + title);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		System.out.println("logged IN Successfully !!!");
		String title2 = driver.getTitle();
		System.out.println(title2);
		WebElement crmfa = driver.findElement(By.linkText("CRM/SFA"));
		crmfa.click();
		String title3 = driver.getTitle();
		System.out.println(title3);
		driver.findElement((By.linkText("Create Lead"))).click();

		driver.findElement((By.id("createLeadForm_companyName"))).sendKeys("TATA");
		driver.findElement((By.id("createLeadForm_firstName"))).sendKeys("Sush");
		driver.findElement((By.id("createLeadForm_dataSourceId"))).sendKeys("Other");
		driver.findElement((By.id("createLeadForm_firstNameLocal"))).sendKeys("Sushmi");
		driver.findElement((By.id("createLeadForm_personalTitle"))).sendKeys("Mrs");
		driver.findElement((By.id("createLeadForm_generalProfTitle"))).sendKeys("helo");
		driver.findElement((By.id("createLeadForm_annualRevenue"))).sendKeys("5");
		driver.findElement((By.id("createLeadForm_industryEnumId"))).sendKeys("E-tailor");
		driver.findElement((By.id("createLeadForm_description"))).sendKeys("Welcome to our boutique");
		driver.findElement((By.id("createLeadForm_ownershipEnumId"))).sendKeys("corporation");
		driver.findElement((By.id("createLeadForm_sicCode"))).sendKeys("1235");
		driver.findElement((By.id("createLeadForm_importantNote"))).sendKeys("offer for first 10 members");
		driver.findElement((By.id("createLeadForm_lastName"))).sendKeys("Vicky");
		driver.findElement((By.id("createLeadForm_marketingCampaignId"))).sendKeys("Online mode");
		driver.findElement((By.id("createLeadForm_lastNameLocal"))).sendKeys("Vignesh");
		driver.findElement((By.id("createLeadForm_birthDate"))).sendKeys("08/16/1994");
		driver.findElement((By.id("createLeadForm_departmentName"))).sendKeys("Creativity");
		driver.findElement((By.id("createLeadForm_currencyUomId"))).sendKeys("INR - Indian Rupee");
		driver.findElement((By.id("createLeadForm_numberEmployees"))).sendKeys("50");
		driver.findElement((By.name("tickerSymbol"))).sendKeys("Women");
		WebElement contact = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		contact.clear();
		contact.sendKeys("77089945587");
		driver.findElement((By.id("createLeadForm_primaryPhoneAreaCode"))).sendKeys("607803");
		driver.findElement((By.id("createLeadForm_primaryPhoneExtension"))).sendKeys("91");
		driver.findElement((By.id("createLeadForm_primaryPhoneNumber"))).sendKeys("75315985246");
		driver.findElement((By.id("createLeadForm_primaryPhoneAskForName"))).sendKeys("God");
		driver.findElement((By.id("createLeadForm_primaryWebUrl"))).sendKeys("Ur Choices our design");
		driver.findElement((By.id("createLeadForm_primaryEmail"))).sendKeys("abc@gmail.com");
		driver.findElement((By.id("createLeadForm_generalToName"))).sendKeys("Sushmtha ");
		driver.findElement((By.id("createLeadForm_generalAttnName"))).sendKeys("SushVicky");
		driver.findElement((By.id("createLeadForm_generalAddress1"))).sendKeys("Cake street");
		driver.findElement((By.id("createLeadForm_generalCity"))).sendKeys("Chennai");
		driver.findElement((By.id("createLeadForm_generalStateProvinceGeoId"))).sendKeys("Tn");
		driver.findElement((By.id("createLeadForm_generalAddress1"))).sendKeys("Cake street");
		driver.findElement((By.id("createLeadForm_generalCity"))).sendKeys("TAMILNADU");
		driver.findElement((By.id("createLeadForm_generalPostalCode"))).sendKeys("7894");
		driver.findElement((By.id("createLeadForm_generalCountryGeoId"))).sendKeys("India");
		driver.findElement((By.className("smallSubmit"))).click();
		System.out.println("Created successfully!!");

	}
}
