package configuretions;

import org.openqa.selenium.WebDriver;

public class BaseClass {
    public static WebDriver driver;

    static {
        driver=DriverConfig.create(BROWSERS.CHROMEINCOGNITO);
    }

}
