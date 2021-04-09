package stepDefinition;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test_steps {
	public String browserType;
	public final String screenshotsFolderPath = System.getProperty("user.dir") + "\\output\\screenshots\\";
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String path="C:\\Users\\tejas\\Downloads\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
		Reporter.addStepLog("User_Navigate_to_LogIn_Page");
	}

	@When("^User enters \"(.*)\" and \"(.*)\" with credentials$")
	public void user_enters_UserName_and_Password_withcredentials(String uidval,String pwdval) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("log")).sendKeys(uidval); 	 
	    driver.findElement(By.id("pwd")).sendKeys(pwdval);
	    driver.findElement(By.id("login")).click();
	}
	@And("^Compelte registraion \"(.*)\" and \"(.*)\"$")
	public void compelte_registraion(String strFname,String strLname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Firstname")).sendKeys(strFname); 	 
	    driver.findElement(By.id("Lastname")).sendKeys(strLname);
	}
	
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("log")).sendKeys("testuser_1"); 	 
	    driver.findElement(By.id("pwd")).sendKeys("Test@123");
	    driver.findElement(By.id("login")).click();
	}
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successfully");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String imagePath = getScreenshotPath();
		FileHandler.copy(scrFile, new File(imagePath));
		Reporter.addScreenCaptureFromPath(imagePath);		
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
		}catch(Exception e){
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String imagePath = getScreenshotPath();	
			FileHandler.copy(scrFile, new File(imagePath));
			Reporter.addScreenCaptureFromPath(imagePath);
			Assert.fail("Unable to Login");
		}
	}
	
	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("LogOut Successfully");	
	}
	
	public static String getTimeStamp() 
	{
		DateFormat dateTimeInstance = SimpleDateFormat.getDateTimeInstance();
	    String DateTimeStamp = dateTimeInstance.format(Calendar.getInstance().getTime());
	    DateTimeStamp = DateTimeStamp.replace(",", "");
	    DateTimeStamp = DateTimeStamp.replace(" ", "_");
	    DateTimeStamp = DateTimeStamp.replace(":", "-");
		return  DateTimeStamp;
	}
	
	
	
	public String getScreenshotPath(){
		return screenshotsFolderPath + getTimeStamp() + ".png";
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
}
