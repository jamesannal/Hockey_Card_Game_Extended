package hockey.hockeygame;

import org.junit.Before;
import org.junit.Test;

import static hockey.hockeygame.Player.HORVAT;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class UserTest {

    private User user;
    private Card card;

    @Before
    public void before() {
        user = new User("James", new Team());
        card = new Card(HORVAT, HORVAT.value, HORVAT.stickhandling, HORVAT.shot, HORVAT.checking, HORVAT.strength, HORVAT.skating);
        user.draftCardToTeam(card);

    }

    @Test
    public void canGetUserName(){
        assertEquals("James", user.getUserName());
    }

    @Test
    public void canAddCardToTeam(){
        assertEquals(1, user.getRosterNumber());
    }

    @Test
    public void canGetRosterScore() {
        assertEquals(88, user.getTotalValue());
    }

    @Test
    public void canGetRosterStickhandling() {
        assertEquals(70, user.getRosterStickhandling());
    }

    @Test
    public void canGetRosterShot() {
        assertEquals(79, user.getRosterShot());
    }

    @Test
    public void canGetRosterChecking() {
        assertEquals(83, user.getRosterChecking());
    }

    @Test
    public void canGetTeamStrength() {
        assertEquals(87, user.getRosterStrength());
    }

    @Test
    public void canGetTeamSkating() {
        assertEquals(90, user.getRosterSkating());
    }
}