package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver browser;

    public HomePage(WebDriver driver){
        this.browser=driver;
        PageFactory.initElements(browser,this);
    }

    public void navigateUrl(){
        browser.get("https://www.realtor.com");
    }

    @FindBy(how= How.ID, using="for_sale")
    public WebElement radioBuy;

    @FindBy(how= How.ID, using="for_rent")
    public WebElement radioRent;

    @FindBy(how= How.ID, using="recently_sold")
    public WebElement radioJustHold;

    @FindBy(how= How.ID, using="property_records")
    public WebElement radioHomeEstimate;

    @FindBy(how= How.ID, using="searchBox")
    public WebElement inputSearchBox;


}
