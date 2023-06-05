public class AutomationWork1 {
 WebDriver driver;
@Test(priority = 1)
 void openBrowser(){

     System.out.println("Open Browser");
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.nopcommerce.com/");





 }
}
