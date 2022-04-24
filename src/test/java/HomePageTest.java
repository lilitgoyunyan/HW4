import org.junit.Assert;
import org.junit.Test;
import pages.FlightClubSneakers;
import pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test
    public void goToSneakersPageTest(){
        HomePage homePage = new HomePage();
        FlightClubSneakers flightClubSneakersPage = new FlightClubSneakers();
        Assert.assertTrue(homePage.isSneakersButtonDisplayed());
        homePage.clickSneakersButton();
        Assert.assertTrue(flightClubSneakersPage.isNikeDisplayed());
    }
}
