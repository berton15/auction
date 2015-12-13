
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AuctionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AuctionTest
{
    private Auction auction1;

    /**
     * Default constructor for test class AuctionTest
     */
    public AuctionTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        auction1 = new Auction();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testClose()
    {
        // Make some lots
        auction1.enterLot("Ornate chest");
        auction1.enterLot("Painting of a pig");
        auction1.enterLot("Gold cup");
        // Show the entered lots
        auction1.showLots();
        // Make a bidder
        Person person1 = new Person("Source Hunter");
        // Make a bid
        auction1.makeABid(2, person1, 1000);
        // Show lots to check bid
        auction1.showLots();
        // Close auctions
        auction1.close();
    }
}

