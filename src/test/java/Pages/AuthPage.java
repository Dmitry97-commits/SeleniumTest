package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthPage {

    private WebDriver webDriver;

    public AuthPage(WebDriver driver){
        webDriver = driver;
    }

    private By emailField = By.name("auth_email");
    private By passwordField = By.name("auth_pass");
    private By submitButton = By.name("form_auth_submit");

    public AuthPage insertEmail(String text){
        webDriver.findElement(emailField).sendKeys(text);
        webDriver.findElement(emailField).click();
        return this;
    }

    public AuthPage insertPassword(String text){
        webDriver.findElement(passwordField).sendKeys(text);
        webDriver.findElement(passwordField).click();
        return this;
    }

    public AgesPage clickToSubmitButton(){
        webDriver.findElement(submitButton).click();
        return new AgesPage(webDriver);
    }
}
