package hockey.hockeygame;

import org.junit.Before;
import org.junit.Test;

import static hockey.hockeygame.Player.DOUGHTY;
import static hockey.hockeygame.Player.GLASS;
import static hockey.hockeygame.Player.OVECHKIN;
import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 21/03/2017.
 */

public class GameTest {

    private Team team;
    private Team team2;
    private Card card;
    private Card card2;
    private Card card3;
    private Game game;
    private User user;
    private User computer;

    @Before
    public void before() {
        team = new Team();
        team2 = new Team();
        card3 = new Card(OVECHKIN, OVECHKIN.value, OVECHKIN.stickhandling, OVECHKIN.shot, OVECHKIN.strength, OVECHKIN.checking, OVECHKIN.skating);
        card2 = new Card(GLASS, GLASS.value, GLASS.stickhandling, GLASS.shot, GLASS.strength, GLASS.checking, GLASS.skating);
        card = new Card(DOUGHTY, DOUGHTY.value, DOUGHTY.stickhandling, DOUGHTY.shot, DOUGHTY.strength, DOUGHTY.checking, DOUGHTY.skating);
        user = new User("James", team);
        computer = new User("Computer", team2);
        user.draftCardToTeam(card3);
        computer.draftCardToTeam(card2);
        game = new Game("James", "Computer", team, team2);
    }

    @Test
    public void CanPlayDeke(){
        assertEquals("You deked him out his jock!", game.playDeke());
    }

    @Test
    public void CanPlayPokecheck(){
        assertEquals("Great last ditch pokecheck!", game.playPokecheck());
    }

    @Test
    public void CanPlaySticklift(){
        assertEquals("Tied him up beautifully!", game.playSticklift());
    }

    @Test
    public void CanPlayWindmill(){
        assertEquals("You broke in and scored!", game.playWindmill());
    }

    @Test
    public void CanPlaySlapshot(){
        assertEquals("You beat the goalie clean!", game.playSlapshot());
    }

    @Test
    public void CanPlayShotblock(){
        assertEquals("You took one for the team!", game.playShotblock());
    }

    @Test
    public void CanPlayBreakaway(){
        assertEquals("You broke in and scored!", game.playBreakaway());
    }

    @Test
    public void canPlayBodycheck(){
        assertEquals("Caught him looking down!", game.playBodycheck());
    }

    @Test
    public void canPlayBackcheck(){
        assertEquals("You broke up the play", game.playBackcheck());
    }

    @Test
    public void CanPlayPowerMove(){
        assertEquals("You went hard and scored!", game.playPowermove());
    }

    @Test
    public void canLoseBackcheck(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("They scored on a break!", game.playBackcheck());
    }

    @Test
    public void canLosePowermove(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("You lost the puck!", game.playPowermove());
    }

    @Test
    public void canLoseBodycheck(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("You got danced!", game.playBodycheck());
    }

    @Test
    public void canLoseBreakaway(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Keep skating hard!", game.playBreakaway());
    }

    @Test
    public void canLoseShotblock(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Get in the shooting lane!", game.playShotblock());
    }

    @Test
    public void canLoseSlapshot(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("You're a shinpad sniper!", game.playSlapshot());
    }

    @Test
    public void canLoseWindmill(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Keep your head up!", game.playWindmill());
    }

    @Test
    public void canLoseSticklift(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("You got called for hooking!", game.playSticklift());
    }

    @Test
    public void canLosePokecheck(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Called for tripping!", game.playPokecheck());
    }

    @Test
    public void canLoseDeke(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("You forgot the puck!", game.playDeke());
    }

    @Test
    public void CanPlayGlassDeke(){
        assertEquals("You could've had him!", game.glassDeke());
    }

    @Test
    public void CanPlayGlassPokecheck(){
        assertEquals("You could've had him!", game.glassPokecheck());
    }

    @Test
    public void CanPlayGlassSticklift(){
        assertEquals("You could've had him!", game.glassSticklift());
    }

    @Test
    public void CanPlayGlassWindmill(){
        assertEquals("You could've had him!", game.glassWindmill());
    }

    @Test
    public void CanPlayGlassSlapshot(){
        assertEquals("You could've had him!", game.glassSlapshot());
    }

    @Test
    public void CanPlayGlassShotblock(){
        assertEquals("You could've had him!", game.glassShotblock());
    }

    @Test
    public void CanPlayGlassBreakaway(){
        assertEquals("You could've had him!", game.glassBreakaway());
    }

    @Test
    public void canPlayGlassBodycheck(){
        assertEquals("You could've had him!", game.glassBodycheck());
    }

    @Test
    public void canPlayGlassBackcheck(){
        assertEquals("You could've had him!", game.glassBackcheck());
    }

    @Test
    public void CanPlayGlassPowerMove(){
        assertEquals("You could've had him!", game.glassPowermove());
    }

    @Test
    public void canLoseGlassBackcheck(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassBackcheck());
    }

    @Test
    public void canLoseGlassPowermove(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassPowermove());
    }

    @Test
    public void canLoseGlassBodycheck(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassBodycheck());
    }

    @Test
    public void canLoseGlassBreakaway(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassBreakaway());
    }

    @Test
    public void canLoseGlassShotblock(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassShotblock());
    }

    @Test
    public void canLoseGlassSlapshot(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassSlapshot());
    }

    @Test
    public void canLoseGlassWindmill(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassWindmill());
    }

    @Test
    public void canLoseGlassSticklift(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassSticklift());
    }

    @Test
    public void canLoseGlassPokecheck(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassPokecheck());
    }

    @Test
    public void canLoseGlassDeke(){
        computer.getTeam().getCards().remove(0);
        user.getTeam().getCards().remove(0);

        computer.draftCardToTeam(card3);
        user.draftCardToTeam(card2);
        assertEquals("Good choice!", game.glassDeke());
    }
}