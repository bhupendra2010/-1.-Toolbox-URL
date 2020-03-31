package pagefactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FrameWorkTest {
    private WebDriver driver;
    private String baseurl;
    Page searchpage;

    @Before
    public void setup(){
        driver=new ChromeDriver();
        baseurl= "https://www.expedia.co.uk/";
        searchpage=new Page(driver);


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseurl);
    }
    @Test
    public void test(){
        searchpage.header.click();
        searchpage.flighttab.click();
        searchpage.setorigin("Newyork");
        searchpage.setDestination("Chicago");
        searchpage.setDepartingdate("12/11/2016");
        searchpage.setReturndate("13/01/2017");

    }
   // @After
    public void closebrowser(){
        driver.quit();
    }
}
