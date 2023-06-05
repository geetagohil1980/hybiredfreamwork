package Com.Demo.Nopcommerce.Base.Utilies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils  {
    WebDriver driver;
  public Utils(WebDriver driver){
      this.driver=driver;

 }
public WebElement getElement(By locater){
     WebElement element= driver.findElement ( locater );
return element;
}
public void doCLICK(By locater){
      getElement ( locater ).click ();

}
public void  doSendkey(By locater,String value){
      getElement ( locater ).sendKeys ( value );
}
}
