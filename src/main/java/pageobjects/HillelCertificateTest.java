package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HillelCertificateTest {
    @FindBy(xpath = "//input[@name=\"certificate\"]")
    WebElement searchField;
    @FindBy(xpath = "//p[@class=\"certificate-check_message\"]")
    WebElement message;


    public void sendKeysToSearchField(String str){
        searchField.sendKeys(str);
        searchField.sendKeys(Keys.ENTER);;
    }
    public String getMessage() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return message.getText();}


}
