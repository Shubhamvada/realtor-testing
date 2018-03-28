package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.DetailPage;
import page.SearchPage;

public class ValidatePriceOnTwoPages {

    WebDriver driver;
    private SearchPage searchPage;
    private DetailPage detailPage;
    static String costSearchPage;
    static String costDetailsPage;

    @Given("^User click on second search$")
    public void userClickOnSecondSearch() throws Throwable {

        costSearchPage=searchPage.homePriceSearchPage.getText();
        JavascriptExecutor js=new (JavascriptExecutor)driver;
        js.executeScript("argument[0].click",searchPage.homeImageLink);
        costDetailsPage=detailPage.homePriceDetailPage.getText();

    }

    @Then("^price on searchResult page is same as viewDetails page$")
    public void priceOnSearchResultPageIsSameAsViewDetailsPage() throws Throwable {

        Assert.assertEquals(costDetailsPage,costSearchPage);
    }
}

