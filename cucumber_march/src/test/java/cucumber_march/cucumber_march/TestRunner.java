package cucumber_march.cucumber_march;

import java.net.UnknownHostException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature/Loginhrm.feature"}
		,glue={"stepDefinition"}
		,tags= {"@Regression"}
		,plugin={"pretty","json:target/cucumber.json","html:target/cucumber.html"
				,"junit:target/cucumber.xml"}
		)
public class TestRunner {
	  @AfterClass
	    public static void teardown() throws UnknownHostException {
//	        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//	        Reporter.setSystemInfo("OS", System.getProperty("os.name"));
//	        Reporter.setSystemInfo("OS Architecture", System.getProperty("os.arch"));
//	        Reporter.setSystemInfo("Java Version", System.getProperty("java.version"));
//	        Reporter.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());       
//	        Reporter.setSystemInfo("Machine IP", InetAddress.getLocalHost().getHostAddress()); 
//	        Reporter.setTestRunnerOutput("Sample test runner output message");
	  }   
}
