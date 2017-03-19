package hockey.hockeygame;

import org.junit.Before;
import org.junit.Test;

import static hockey.hockeygame.Player.GLASS;
import static hockey.hockeygame.Player.HORVAT;
import static org.junit.Assert.assertEquals;

/**
 * Created by user on 18/03/2017.
 */

public class TeamTest {
    private Team team;
    private Card card;
    private Card card2;

    @Before
    public void before() {
        team = new Team();
        card = new Card(HORVAT, HORVAT.value, HORVAT.stickhandling, HORVAT.shot, HORVAT.strength, HORVAT.checking, HORVAT.skating);
        card2 = new Card(GLASS, GLASS.value, GLASS.stickhandling, GLASS.shot, GLASS.strength, GLASS.checking, HORVAT.skating);
        team.draftCard(card);
    }

    @Test
    public void canDraftCard() {
        assertEquals(1, team.getRosterNumber());
    }

    @Test
    public void canGetCardScore(){
        assertEquals(88, team.getRosterScore());
    }

    @Test
    public void canCheckCardName() {
        assertEquals(HORVAT, card.getPlayerName());
    }

    @Test
    public void canCheckRosterScore() {
        team.draftCard(card2);
        assertEquals(89, team.getRosterScore());
    }

}
