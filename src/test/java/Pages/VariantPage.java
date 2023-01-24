package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VariantPage {

    private WebDriver webDriver;
    public VariantPage(WebDriver driver){
        this.webDriver = driver;
    }

    private By messageFromPage = By.xpath("//body//p");

    private String getTextFromPage(){
        String text = webDriver.findElement(messageFromPage).getText();
        return text;
    }

    public boolean checkTextFromPage(String expectedText){
        if(getTextFromPage().contains(expectedText)){
            return true;
        }
        return false;
    }
}
