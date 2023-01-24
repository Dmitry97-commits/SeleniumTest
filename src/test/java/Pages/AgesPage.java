package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AgesPage {

    private WebDriver webDriver;

    public AgesPage(WebDriver driver){
        webDriver = driver;
    }

    private By collectionsOfChoices = By.xpath("//form//ol//li/input");
    private By buttonSend = By.xpath("//input[@type = 'submit']");

    public AgesPage chooseVariantOfAges(String textWithVariant){
        List<WebElement> listWithVariants = webDriver.findElements(collectionsOfChoices);
        for (WebElement e: listWithVariants) {
            if(e.getAttribute("value").equals(textWithVariant)){
                e.click();
            }
        }
        return this;
    }

    public VariantPage clickToButtonSend(){
        webDriver.findElement(buttonSend).click();
        return new VariantPage(webDriver);
    }
}
