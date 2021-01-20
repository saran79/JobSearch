package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    public WebDriver driver;

    @FindBy(xpath="//header/div[1]/div[1]/div[1]/div[1]/a[1]")
    private WebElement logo;
    @FindBy(id="keywords")
    private WebElement searchField;
    @FindBy(id="search-button")
    private WebElement searchIcon;
    @FindBy(xpath="//div[@class=\"page-title\"]/h1")
    private WebElement jobsList;


    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public boolean validateHomePage() {
        return logo.isDisplayed();
    }

    public void setSearchText(String searchText) {
        searchField.sendKeys(searchText);
    }

    public void clickSearchIcon() {
        searchIcon.click();
    }

    public String getJobsListTitle() {
        return jobsList.getText();
    }
}


