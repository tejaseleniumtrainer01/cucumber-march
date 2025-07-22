package cucumber_march.cucumber_march;

import org.testng.annotations.AfterClass;
import java.net.UnknownHostException;

import org.testng.annotations.AfterClass;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@SuppressWarnings("unused")
@CucumberOptions(
		features = {"Feature/catachaclassapplication.feature"}
		,glue={"stepDefinition"}
		,tags= {"@SmokeTest"}
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
