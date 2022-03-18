package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\ADMIN\\eclipse-workspace\\BDDFameW\\src\\test\\resources\\features\\login.feature"
		,glue= {"stepDefinition"},monochrome= (true)//hey i have added this recently pls check it out is their any changes happens or not
		
		)

public class testRunner {

}
