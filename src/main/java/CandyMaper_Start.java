import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Set;



public class CandyMaper_Start {

    @Test
    public void testNewWindow()


    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Ania\\Desktop\\Selenium11.024.2024\\chrome-win64\\chrome.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Ania\\Desktop\\Selenium11.024.2024\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();




        driver.get("https://candymapper.com");

        String currentWindow = driver.getWindowHandle();
        Set<String> WindowNames = driver.getWindowHandles();
        for (String window : WindowNames){
            if (!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }
        driver.findElement(By.id("popup-widget238491-cta")).click();




    }
}
