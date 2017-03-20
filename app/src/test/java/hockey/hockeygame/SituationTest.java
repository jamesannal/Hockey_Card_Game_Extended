package hockey.hockeygame;

import org.junit.Before;
import org.junit.Test;

import static hockey.hockeygame.Move.DEKE;
import static hockey.hockeygame.Player.GLASS;
import static hockey.hockeygame.Player.HORVAT;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/03/2017.
 */

public class SituationTest {

    private Team team;
    private Card card;
    private Card card2;
    private Situation situation;

    @Before
    public void before() {
        team = new Team();
        card = new Card(HORVAT, HORVAT.value, HORVAT.stickhandling, HORVAT.shot, HORVAT.strength, HORVAT.checking, HORVAT.skating);
        card2 = new Card(GLASS, GLASS.value, GLASS.stickhandling, GLASS.shot, GLASS.strength, GLASS.checking, HORVAT.skating);
        team.draftCard(card);
        situation = new Situation(DEKE);

    }

    @Test
    public void canGetMoveName() {
        assertEquals(DEKE, situation.getMoveName());
    }

}
