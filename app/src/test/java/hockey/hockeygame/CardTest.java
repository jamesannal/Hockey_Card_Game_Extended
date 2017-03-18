package hockey.hockeygame;

import org.junit.Before;
import org.junit.Test;

import static hockey.hockeygame.Player.WEBER;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class CardTest {
    private Card card;

    @Before
    public void before(){
        card = new Card(WEBER, WEBER.value);
    }

    @Test
    public void canGetValue(){
        assertEquals(97, card.getValue());
    }

    @Test
    public void canGetPlayerName(){
        assertEquals(WEBER, card.getPlayerName());
    }

    @Test
    public void canGetPlayerDisplay(){
        assertEquals("WEBER(97)", card.getPlayerDisplay());
    }

}
