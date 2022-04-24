import org.junit.Assert;
import org.junit.Test;
import pages.FlightClubSneakers;
import pages.HomePage;

public class SneakersSizeTest {
    @Test
    public void sneakerSizeTest(){
        HomePage homePage = new HomePage();
        FlightClubSneakers flightClubSneakers = new FlightClubSneakers();
        homePage.clickSneakersButton();
        flightClubSneakers.clickYouthSize();
        Assert.assertTrue(flightClubSneakers.isYouthSize2Displayed());
        flightClubSneakers.clickYouthSize2();

    }

}
