package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src//test//resources",
		glue = {"stepDefinition"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				 "html:target//Reports//HtmlReport.html"}
		)
public class ProductStorePageRunner extends AbstractTestNGCucumberTests {

}
