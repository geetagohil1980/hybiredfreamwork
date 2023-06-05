package CommanPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage {
    public WebElement getElement(By locator){
        WebElement element =driver.findElement(locator);
        return element;
    }
    public void  doClick(By locator){
        getElement(locator).click();
    }
    public void doSendkey(By locator, String value){
        getElement(locator).sendKeys(value);
    }
//    public String waitForTitlePresent(int timeout, String titleValue){
//        WebDriverWait wait = new WebDriverWait(driver,timeout);
//        wait.until( ExpectedConditions.titleIs(titleValue));
//        return driver.getTitle();
//    }


}
