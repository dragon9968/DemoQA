package automationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String exePath = "D:\\WORK\\Re-Learn AT\\geckodriver-v0.28.0-win64\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", exePath); 
		
		WebDriver driver = new FirefoxDriver();	
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/login");
	 	Thread.sleep(2000);
		driver.manage().window().maximize();
		
	/*	String title = driver.getTitle();
		System.out.println("The page title is : " +title);
		WebElement uName = driver.findElement(By.xpath("//*[@id='userName']"));
		WebElement pswd = driver.findElement(By.xpath("//*[@id='password']"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id='login']"));
		uName.sendKeys("testuser");
		Thread.sleep(1000);
		pswd.sendKeys("Password@123");
		Thread.sleep(1000);
		loginBtn.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 try {
			 
			 //Locating web element
			 WebElement logoutBtn = driver.findElement(By.xpath("//div[@class='text-right col-md-5 col-sm-12']//button[@id='submit']"));
			 //Validating presence of element 
			 if(logoutBtn.isDisplayed()){
			 
			 //Performing action on web element
		     Thread.sleep(2000);
			 logoutBtn.click();
			 System.out.println("LogOut Successful!");
			 driver.navigate().to("https://demoqa.com/automation-practice-form");
			 }
			 } 
			 catch (Exception e) {
			 System.out.println("Incorrect login....");
			 }
		 Thread.sleep(2000); 
		WebElement selectbox1 = driver.findElement(By.xpath("//label[text()='Sports']"));
		boolean isSelected = selectbox1.isSelected();
		if(isSelected == false) 
		{
			selectbox1.click();
		}
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']")).click();
		
		WebElement radio = driver.findElement(By.xpath("//label[text()='Female']"));
		String attValue = radio.getAttribute("id");
		System.out.println(attValue);
		boolean isDisplayed = radio.isDisplayed();
		if(isDisplayed == true)
		{
		 radio.click();
		}
		Thread.sleep(2000);
		*/
		driver.navigate().to("https://www.demoqa.com/select-menu");
		Thread.sleep(2000);
		
		Actions keyDown = new Actions(driver);
	/*	WebElement selectValue= driver.findElement(By.id("withOptGroup")); 
		selectValue.click();
		keyDown.sendKeys("Group 2, option 1").sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		
		WebElement selectOne= driver.findElement(By.id("selectOne")); 
		selectOne.click();
		keyDown.sendKeys("Ms.").sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		
		// Create object of the Select class
		Select se = new Select(driver.findElement(By.id("oldSelectMenu")));				
		//Select the option by index
		se.selectByIndex(5);
		List<WebElement> lst = se.getOptions();
		for(WebElement options: lst)
            System.out.println(options.getText());
		
		WebElement semul= driver.findElement(By.xpath("//*[@class=' css-1hwfws3']//*[text()='Select...']"));		
		semul.click();
		keyDown.sendKeys("Blue").sendKeys(Keys.TAB).perform();
		keyDown.sendKeys("Green").sendKeys(Keys.TAB).perform();
		semul.click();
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250)"); // if the element is on bottom.

		Select se_car = new Select(driver.findElement(By.id("cars")));	
		List<WebElement> car_options = se_car.getOptions();
		 
        for(WebElement option: car_options)
            System.out.println(option.getText());
        if(se_car.isMultiple())
        {
        	se_car.selectByIndex(2);
        	se_car.selectByIndex(3);
        	se_car.deselectAll();
        }*/
        
		driver.navigate().to("https://www.demoqa.com/webtables");
        String sRow ="1";
        String SCol ="1";
		String sRowValue = "Alden";
		WebElement sCellValue = driver.findElement(By.xpath("//*[@class='rt-table']//*[@class='rt-tbody']/div["+ sRow +"]"));
		String rowtext = sCellValue.getText();
		System.out.println("Main Row is : " +rowtext);	
		for (int i=1;i<=5;i++)
		{
			String svalue = null;
			svalue = sCellValue.findElement(By.xpath("//*[@class='rt-table']//*[@class='rt-tbody']/div["+ i +"]/div/div")).getText();
			if(svalue.equalsIgnoreCase(sRowValue))
			{
				for(int j=1;j<=5;j++) 
				{
			   svalue = sCellValue.findElement(By.xpath("//*[@class='rt-table']//*[@class='rt-tbody']/div["+ i +"]/div/div["+ j +"]")).getText();
			   System.out.println("Cell is : " +svalue);	 
			    }
		}
			
	}
	}
}
