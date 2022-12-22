package steps;

import configuretions.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HillelCertificateTest;

import java.util.concurrent.TimeUnit;

public class Steps extends BaseClass {
    static HillelCertificateTest hillelCertificateTest = PageFactory.initElements(driver, HillelCertificateTest.class);

    @When("I open page {string}")
    public void iOpenPage(String url) {driver.get(url);}


    @And("Enter code {string}")
    public void enterCode(String code) {
        hillelCertificateTest.sendKeysToSearchField(code);
    }

    @Then("Check that message is displayed")
    public void checkThatMessageIsDisplayed() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Assert.assertEquals("Сертифікат не знайдено",hillelCertificateTest.getMessage());
    }
}
