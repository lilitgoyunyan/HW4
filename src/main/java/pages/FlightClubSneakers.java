package pages;

import helpers.Waiter;
import locators.FlightClubSneakersConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightClubSneakers extends BasePage{
    private By airJordan = By.xpath(FlightClubSneakersConstants.airJordan);
    private By nike = By.xpath(FlightClubSneakersConstants.nike);
    private By youthSize = By.xpath(FlightClubSneakersConstants.youthSize);
    private By size2 = By.xpath(FlightClubSneakersConstants.size2);
    private By logo = By.cssSelector(FlightClubSneakersConstants.logo);
    public By shopNowButton = By.xpath(FlightClubSneakersConstants.shopNowButton);
    @Override
    public String getUrl() {
        return baseURL + "/sneakers";
    }
    public boolean isNikeDisplayed(){
        return isElementDisplayed(nike);
    }
    public FlightClubSneakersAirJordan clickSneakersButton(){
        WebElement air_Jordan = Waiter.getInstance().waitForElementToBeClickable(airJordan);
        air_Jordan.click();
        return new FlightClubSneakersAirJordan();
    }
    public boolean isAirJordanDisplayed(){
        return isElementDisplayed(airJordan);
    }
    public boolean isYouthSize2Displayed(){
        return  isElementDisplayed(size2);
    }
    public FlightClubSneakers clickYouthSize(){
        WebElement webElement = Waiter.getInstance().waitForElementToBeClickable(youthSize);
        webElement.click();
        return new FlightClubSneakers();
    }
    public FlightClubSneakers clickYouthSize2(){
        WebElement webElement = Waiter.getInstance().waitForElementToBeClickable(size2);
        webElement.click();
        return new FlightClubSneakers();
    }
    public FlightClubSneakers clickLogo(){
        WebElement webElement = Waiter.getInstance().waitForElementToBeClickable(logo);
        webElement.click();
        return new FlightClubSneakers();
    }
    public boolean isShopNowDisplayed() {
        return isElementDisplayed(shopNowButton);
    }

}
