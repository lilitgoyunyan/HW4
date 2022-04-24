package pages;

import locators.FlightClubSneakersAirJordanConstants;
import org.openqa.selenium.By;


public class FlightClubSneakersAirJordan extends BasePage{
    private By men_size_4 = By.xpath(FlightClubSneakersAirJordanConstants.men_size_4);

    @Override
    public String getUrl() {
        return baseURL + "/sneakers?brand=Air%20Jordan";
    }
    public boolean isAirJordanSizeDisplayed(){
        return isElementDisplayed(men_size_4);
    }

}
