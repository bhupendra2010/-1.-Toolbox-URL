package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {
    WebDriver driver;

    @FindBy(id = "primary-header-flight")
    WebElement header;
    @FindBy(xpath = "//button[@id='tab-flight-tab-flp']//span[@class='icons-container']")
    WebElement flighttab;
    @FindBy(css = "#flight-origin-flp")
    WebElement origin;
    @FindBy(css = "#flight-destination-flp")
    WebElement destination;
    @FindBy(id = "flight-departing-flp")
    WebElement departingdate;
    @FindBy(id = "flight-returning-flp")
    WebElement returndate;
    public Page(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);

}
public void clickflighttab(){
        header.click();
        flighttab.click();
}
public void setorigin(String originci){

        origin.sendKeys(originci);
}
public void setDestination(String destinationde){
        destination.sendKeys(destinationde);
}
public void setDepartingdate(String departingdate1){
        departingdate.sendKeys(departingdate1);
}
public void setReturndate(String returndate1){
        returndate.sendKeys(returndate1);
}
}