package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DetailPage {

    private WebDriver browser;

    public DetailPage(WebDriver driver){
        this.browser=driver;
        PageFactory.initElements(browser,this);
    }

    @FindBy(how= How.XPATH, using="//div[contains(@class,'header-price')]//span[contains(@itemprop,'price')]\"")
    public WebElement homePriceDetailPage;

}
