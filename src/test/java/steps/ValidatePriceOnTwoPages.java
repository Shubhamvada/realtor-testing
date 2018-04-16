package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import page.DetailPage;
import page.HomePage;
import page.SearchPage;
import util.BrowserInit;

public class ValidatePriceOnTwoPages {

    WebDriver driver;
    HomePage homePage;
    SearchPage searchPage;
    private DetailPage detailPage;
    static String costSearchPage;
    static String costDetailsPage;

    public ValidatePriceOnTwoPages(BrowserInit browser){

        this.driver=browser;
        homePage = new HomePage(browser);
        searchPage = new SearchPage(browser);

    }

    @Given("^User click on second search$")
    public void userClickOnSecondSearch() throws Throwable {

        homePage.navigateUrl();
        homePage.inputSearchBox.sendKeys("Morgantown,WV");
        homePage.inputSearchBox.sendKeys(Keys.ENTER);
        costSearchPage=searchPage.homePriceSearchPage.getText();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].click",searchPage.homeImageLink);
        costDetailsPage=detailPage.homePriceDetailPage.getText();

    }

    @Then("^price on searchResult page is same as viewDetails page$")
    public void priceOnSearchResultPageIsSameAsViewDetailsPage() throws Throwable {

        Assert.assertEquals(costDetailsPage,costSearchPage);
    }
}

