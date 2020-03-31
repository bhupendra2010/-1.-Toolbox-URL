package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class WebDriverListener {
    public static void main(String[]args){
        WebDriver driver=new ChromeDriver();
        String baseurl="https://www.expedia.co.uk/";

        EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
        edriver.get(baseurl);
        edriver.findElement(By.id("tab-flight-tab")).click();

    }
}
