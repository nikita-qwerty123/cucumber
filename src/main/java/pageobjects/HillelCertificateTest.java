package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HillelCertificateTest {
    @FindBy(xpath = "//input[@name=\"certificate\"]")
    WebElement searchField;
    @FindBy(xpath = "//p[@class=\"certificate-check_message\"]")
    WebElement message;


    public void sendKeysToSearchField(String str){
        searchField.sendKeys(str);
        searchField.submit();
    }
    public String getMessage() {return message.getText();}



}
