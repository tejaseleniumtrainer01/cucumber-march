package cucumber_march.cucumber_march;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Feature/Qualification.feature"}
		,glue={"stepDefinition"}
		)
public class TestRunner {
	  @AfterClass
	    public static void teardown() throws UnknownHostException {
	        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
	        Reporter.setSystemInfo("user", System.getProperty("user.name"));
	        Reporter.setSystemInfo("OS", System.getProperty("os.name"));
	        Reporter.setSystemInfo("OS Architecture", System.getProperty("os.arch"));
	        Reporter.setSystemInfo("Java Version", System.getProperty("java.version"));
	        Reporter.setSystemInfo("Machine Name", InetAddress.getLocalHost().getHostName());       
	        Reporter.setSystemInfo("Machine IP", InetAddress.getLocalHost().getHostAddress()); 
	        Reporter.setTestRunnerOutput("Sample test runner output message");
	  }   
}
