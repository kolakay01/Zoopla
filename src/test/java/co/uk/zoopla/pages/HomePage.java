package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {



    // constructor
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".ui-button-primary.ui-cookie-accept-all-medium-large")
    private WebElement acceptCookiesButton;

    //location
    @FindBy(id="header-location")
    private WebElement Location;

    // Pick top  location on the list
    @FindBy(css = ".css-w266us-StyledSuggestionButton.eubx8ma5")
    private List<WebElement> autocomplete;

    //Bedroom Drop down arrow
    @FindBy(css = ".css-11zqwlb-StyledDownArrowIcon.e1tnwg460")
    private WebElement bedDrop;

    //min Bed
    @FindBy(id = "beds_min")
    private WebElement minimumBed;

    //max Bed
    @FindBy(id = "beds_max")
    private WebElement maximumBed;

   //Price Drop down arrow
    @FindBy(css = ".css-11zqwlb-StyledDownArrowIcon.e1tnwg460")
    private WebElement PriceDrop;

    //min Price
    @FindBy(id = "price_min")
    private WebElement minimumPrice;

    //max Price
    @FindBy(id = "price_max")
    private WebElement maximumPrice;

    // Property Type drop down  NOT WORKING
    @FindBy(css = ".css-11zqwlb-StyledDownArrowIcon.e1tnwg460")
    private WebElement PropertyTyp;


    //PropertySelect
    @FindBy(css = ".css-181bif4-StyledLabel.e1k8yt8w1")
    private WebElement PropertyTY;


    //   searchButton
    @FindBy(css = ".css-1s5vaqk-Button-UpdateButton-StyledButton.ebz205c11")
    private WebElement SearchButton;




    public void acceptcookiePolicy()
    {
        acceptCookiesButton.click();
    }
    public void enterlocation (String loc)
    {
        Location.sendKeys(loc);
    }

    public void clickFirstOption()
    {
        autocomplete.get(0).click();
    }

    public void BedDropDown()
    {
        bedDrop.click();
    }

    public void selectMinBed(String MinBed)
    {
        selectByText(minimumBed,MinBed);
    }

    public void selectMaxBed(String MaxBed)
    {
        selectByText(maximumBed,MaxBed);
    }


    public void PriceDropDown()
    {
        PriceDrop.click();
    }

   public void selectMinPrice(String MiniPrice)
    {
        selectByText(minimumPrice,MiniPrice);
    }

    public void selectMaxPrice(String MaxiPrice)
    {
        selectByText(maximumPrice,MaxiPrice);
    }

    public void PropertyTypeSelector()
    {
       PropertyTyp.click();
    }

    public void PropertyPick()
    {
        PropertyTyp.click();
    }

    public void searchButtonClick()
    {
        SearchButton.click();
    }




}
