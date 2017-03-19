package hockey.hockeygame;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class DraftPoolTest {
    private DraftPool draftPool;
    private User user;

    @Before
    public void before() {
        draftPool = new DraftPool(new ArrayList<Card>());
        user = new User("James", new Team());
    }

    @Test
    public void checkDraftPoolPopulatesToStart(){
        assertEquals(99, draftPool.getCardAmountInPool());
    }

    @Test
    public void canDealCard() {
        draftPool.dealCard(user);
        assertEquals(1, user.getRosterNumber());
    }


}