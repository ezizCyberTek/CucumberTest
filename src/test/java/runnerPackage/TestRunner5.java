package runnerPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

@CucumberOptions(features={"features"},glue={"stepDefinitionPackage"})
public class TestRunner5 extends AbstractTestNGCucumberTests{
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		//use wedriver manager to specify which driver 
		driver=new ChromeDriver();
	}
}
