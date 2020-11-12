package Runner;





import org.junit.runner.RunWith;	

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/home/prathik.g/eclipse-workspace/RestAPIFramework/src/test/java/features", //the path of the feature files
		glue={"StepDefinations"},//the path of the step definition fil
        //format={"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
	dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"@SmokeTest , @RegressionTest"}		
		)
public class TestRunner {
	
	

}
