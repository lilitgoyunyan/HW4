import org.junit.Assert;
import org.junit.Test;
import pages.FlightClubSneakers;
import pages.FlightClubSneakersAirJordan;
import pages.HomePage;

public class LogoTest {
    @Test
    public void logoTakesToHomePageTest(){
        HomePage homePage = new HomePage();
        FlightClubSneakers flightClubSneakers = new FlightClubSneakers();
        homePage.clickSneakersButton();
        flightClubSneakers.clickLogo();
        Assert.assertTrue(flightClubSneakers.isShopNowDisplayed());
    }
}
