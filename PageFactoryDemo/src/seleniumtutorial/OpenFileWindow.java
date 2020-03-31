package seleniumtutorial;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import static java.awt.event.KeyEvent.*;

public class OpenFileWindow {
    private WebDriver driver;
    private String baseurl;

    @Before
    public void setup(){
        driver=new ChromeDriver();
        baseurl="https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get(baseurl);
    }
    @Test
    public void Test() throws AWTException, InterruptedException {
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("aumnayee2010@gmail.com");
        driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Aum2010@");
        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
        driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
        driver.findElement(By.cssSelector("textarea[id=':9e']")).sendKeys("aumnayee2010@gmail.com");
        driver.findElement(By.id(":8w")).sendKeys("upload file");
        driver.findElement(By.id(":ae")).click();

        StringSelection ss=new StringSelection("C:\\Users\\bhupe\\Desktop\\git steps for push code");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        Robot robot=new Robot();
        robot.keyPress(VK_CONTROL);
        robot.keyPress(VK_V);
        robot.keyRelease(VK_V);
        robot.keyRelease(VK_CONTROL);
        Thread.sleep(3000);
        robot.keyPress(VK_ENTER);
        robot.keyRelease(VK_ENTER);

        driver.findElement(By.cssSelector("div[id=':8m']")).click();
    }


}
