package runner;

import configuretions.BROWSERS;
import configuretions.BaseClass;
import configuretions.DriverConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/features"},
        glue = {"steps"},
        tags = "@NegativeTests",//list feature files for run
        dryRun = false
)
public class Runer {
    @BeforeClass
    static public void start() {
        System.out.println("Start testing");
        BaseClass.driver= DriverConfig.create(BROWSERS.CHROMEINCOGNITO);
    }
    @AfterClass
    static public void end(){
        System.out.println("------end-------");
        BaseClass.driver.quit();
    }
}
