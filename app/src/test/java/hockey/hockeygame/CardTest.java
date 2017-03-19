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
        card = new Card(WEBER, WEBER.value, WEBER.stickhandling, WEBER.shot, WEBER.checking, WEBER.strength, WEBER.skating);
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

    @Test
    public void canGetPlayerStickhandling() {
        assertEquals(80, card.getPlayerStickhandling());
    }

    @Test
    public void canGetPlayerShooting(){
        assertEquals(95, card.getPlayerShooting());
    }

    @Test
    public void canGetPlayerChecking(){
        assertEquals(95, card.getPlayerChecking());
    }

    @Test
    public void canGetPlayerStrength(){
        assertEquals(99, card.getPlayerStrength());
    }

    @Test
    public void canGetPlayerSkating() {
        assertEquals(70, card.getPlayerSkating());
    }
}
