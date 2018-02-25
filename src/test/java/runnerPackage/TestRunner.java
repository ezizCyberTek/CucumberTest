package runnerPackage;

import cucumber.api.CucumberOptions;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

@CucumberOptions(features={"features"})
public class TestRunner {
  
	
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
