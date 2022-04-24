import org.junit.Assert;
import org.junit.Test;
import pages.FlightClubSneakers;
import pages.FlightClubSneakersAirJordan;
import pages.HomePage;

public class FlightClubSneakersTest extends BaseTest {

    @Test
    public void goToSneakersPageTest(){
        HomePage homePage = new HomePage();
        FlightClubSneakers flightClubSneakersPage = new FlightClubSneakers();
        FlightClubSneakersAirJordan flightClubSneakersAirJordan = new FlightClubSneakersAirJordan();
        Assert.assertTrue(homePage.isSneakersButtonDisplayed());
        homePage.clickSneakersButton();
        Assert.assertTrue(flightClubSneakersPage.isAirJordanDisplayed());
        flightClubSneakersPage.clickSneakersButton();
        Assert.assertTrue(flightClubSneakersAirJordan.isAirJordanSizeDisplayed());
    }
}
