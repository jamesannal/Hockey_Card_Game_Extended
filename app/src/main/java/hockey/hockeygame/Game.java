package hockey.hockeygame;

/**
 * Created by user on 18/03/2017.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Game {

    private DraftPool draftPool;
    private ArrayList<User> users;
    private Move move;
    private User user1;
    private User computer;
    private History history;
    private Situation situation;
    private ArrayList<Situation> situations;

    public Game(String playerName, String computer, Team userTeam, Team computerTeam) {
        this.user1 = new User(playerName, userTeam);
        this.computer = new User(computer, computerTeam);
        this.draftPool = new DraftPool(new ArrayList<Card>());
        this.users = new ArrayList<>();
        this.history = new History();
        this.situations = new ArrayList<>();
    }

    public void setUpGame() {
        users.clear();
        users.add(user1);
        users.add(computer);
    }

    private void setUpSituation() {
        for (Move move : Move.values()) {
            situations.add(new Situation(move));
        }
    }

    public Situation takeInSituation() {
        setUpSituation();
        randomise();
        this.situation = situations.get(0);
        return situations.get(0);
    }

    private void randomise() {
        Collections.shuffle(situations);
    }

    public String deal() {
        Card card;
        for (User user : users) {
            user.getTeam().getCards().clear();

            history.add(user.getUserName());

            card = draftPool.dealCard(user);
            history.add(card.toString());
            System.out.println(user.getUserName() + " received " + card.getPlayerDisplay() + "");
       }
        return ("" + user1.getUserName() + " have embodied: " + "\r\n" + user1.getTeam().getCardStringified()
                + "\r\n " + "\r\n" + " You are facing: " + "\r\n" +
                computer.getTeam().getCardStringified() + "").replaceAll("\\[|\\]", "");
    }

    private String findWinner() {
        if ( this.situation.getMoveName().toString() == "DEKE"){
            return playDeke();
        } else if ( this.situation.getMoveName().toString() == "POKECHECK"){
            return playPokecheck();
        } else if ( this.situation.getMoveName().toString() == "STICKLIFT"){
            return playSticklift();
        } else if ( this.situation.getMoveName().toString() == "WINDMILL"){
            return playWindmill();
        } else if ( this.situation.getMoveName().toString() == "SLAPSHOT"){
            return playSlapshot();
        } else if ( this.situation.getMoveName().toString() == "SHOTBLOCK"){
            return playShotblock();
        } else if ( this.situation.getMoveName().toString() == "BREAKAWAY"){
            return playBreakaway();
        } else if ( this.situation.getMoveName().toString() == "BODYCHECK"){
            return playBodycheck();
        } else if ( this.situation.getMoveName().toString() == "BACKCHECK"){
            return playBackcheck();
        } else if ( this.situation.getMoveName().toString() == "POWERMOVE"){
            return playPowermove();
        }
        else {
            return ("You're a wizard!");
        }
    }

    private String findWinnerDeke() {
        if (user1.getRosterStickhandling() + user1.getRosterShot() - computer.getRosterStickhandling() - computer.getRosterChecking() >= 0) {
            return ("Deked him out his jock!");
        } else {
            return ("You forgot the puck!");
        }
    }

    private String findWinnerPokecheck() {
        if (user1.getRosterStickhandling() + user1.getRosterChecking() - computer.getRosterStickhandling() - computer.getRosterShot() >= 0) {
            return ("Stripped the puck!");
        } else {
            return ("Called for tripping!");
        }
    }

    private String findWinnerSticklift() {
        if (user1.getRosterStickhandling() + user1.getRosterStrength() - computer.getRosterStrength() - computer.getRosterSkating() >= 0) {
            return ("Tied him up beautifully!");
        } else {
            return ("Called for hooking!");
        }
    }

    private String findWinnerWindmill() {
        if (user1.getRosterStickhandling() + user1.getRosterSkating() - computer.getRosterChecking() - computer.getRosterStrength() >= 0) {
            return ("You broke in and scored!");
        } else {
            return ("Keep your head up!");
        }
    }

    private String findWinnerSlapShot () {
        if (user1.getRosterShot() + user1.getRosterShot() + user1.getRosterStrength() - computer.getRosterShot() - computer.getRosterChecking() >= 0) {
            return ("Beat the goalie clean!");
        } else {
            return ("You're a shinpad sniper!");
        }
    }

    private String findWinnerShotblock () {
        if (user1.getRosterShot() + user1.getRosterShot() + user1.getRosterChecking() - computer.getRosterShot() - computer.getRosterStrength() >= 0) {
            return ("Took one for the team!");
        } else {
            return ("Get in the shooting lane!");
        }
    }

    private String findWinnerBreakaway () {
        if (user1.getRosterShot() + user1.getRosterSkating() - computer.getRosterChecking() - computer.getRosterSkating() >= 0){
            return("You broke in and scored!");
        }
        else {
            return("Keep skating hard!");
        }
    }

    private String findWinnerBodyCheck () {
        if (user1.getRosterChecking() + user1.getRosterStrength() - computer.getRosterSkating() - computer.getRosterStickhandling()>= 0){
            return("Caught him looking down!");
        }
        else {
            return("You got danced!");
        }
    }

    private String findWinnerBackCheck () {
        if (user1.getRosterChecking() + user1.getRosterSkating() - computer.getRosterShot() - computer.getRosterSkating()>= 0){
            return("You broke up the play");
        }
        else {
            return("They scored on a break!");
        }
    }

    private String findWinnerPowermove () {
        if (user1.getRosterStrength() + user1.getRosterSkating() - computer.getRosterStrength() - computer.getRosterStickhandling()>= 0){
            return("You went hard and scored!");
        }
        else {
            return("You lost the puck!");
        }
    }

    public String play(){
        findWinner();
        history.showResults();
        String result = findWinner();
        return result;
    }

    public String playDeke(){
        findWinnerDeke();
        history.showResults();
        String result = findWinnerDeke();
        return result;
    }

    public String playPokecheck(){
        findWinnerPokecheck();
        history.showResults();
        String result = findWinnerPokecheck();
        return result;
    }

    public String playSticklift(){
        findWinnerSticklift();
        history.showResults();
        String result = findWinnerSticklift();
        return result;
    }

    public String playWindmill(){
        findWinnerWindmill();
        history.showResults();
        String result = findWinnerWindmill();
        return result;
    }

    public String playShotblock(){
        findWinnerShotblock();
        history.showResults();
        String result = findWinnerShotblock();
        return result;
    }
    public String playSlapshot(){
        findWinnerSlapShot();
        history.showResults();
        String result = findWinnerSlapShot();
        return result;
    }
    public String playBreakaway(){
        findWinnerBreakaway();
        history.showResults();
        String result = findWinnerBreakaway();
        return result;
    }
    public String playBodycheck(){
        findWinnerBodyCheck();
        history.showResults();
        String result = findWinnerBodyCheck();
        return result;
    }
    public String playBackcheck(){
        findWinnerBackCheck();
        history.showResults();
        String result = findWinnerBackCheck();
        return result;
    }
    public String playPowermove(){
        findWinnerPowermove();
        history.showResults();
        String result = findWinnerPowermove();
        return result;
    }

    public String glass(){
        findGlass();
        history.showResults();
        String result = findGlass();
        return result;
    }

    public String findGlass() {

        if ( this.situation.getMoveName().toString() == "DEKE"){
            return glassDeke();
        } else if ( this.situation.getMoveName().toString() == "POKECHECK"){
            return glassPokecheck();
        } else if ( this.situation.getMoveName().toString() == "STICKLIFT"){
            return glassSticklift();
        } else if ( this.situation.getMoveName().toString() == "WINDMILL"){
            return glassWindmill();
        } else if ( this.situation.getMoveName().toString() == "SLAPSHOT"){
            return glassSlapshot();
        } else if ( this.situation.getMoveName().toString() == "SHOTBLOCK"){
            return glassShotblock();
        } else if ( this.situation.getMoveName().toString() == "BREAKAWAY"){
            return glassBreakaway();
        } else if ( this.situation.getMoveName().toString() == "BODYCHECK"){
            return glassBodycheck();
        } else if ( this.situation.getMoveName().toString() == "BACKCHECK"){
            return glassBackcheck();
        } else if ( this.situation.getMoveName().toString() == "POWERMOVE"){
            return glassPowermove();
        }
        else {
            return ("You're a wizard!");
        }
    }

    public String glassPowermove() {
        findGlassPowermove();
        history.showResults();
        String result = findGlassPowermove();
        return result;
    }

    public String glassBackcheck() {
        findGlassBackcheck();
        history.showResults();
        String result = findGlassBackcheck();
        return result;
    }

    public String glassBodycheck() {
        findGlassBodycheck();
        history.showResults();
        String result = findGlassBodycheck();
        return result;
    }

    public String glassBreakaway() {
        findGlassBreakaway();
        history.showResults();
        String result = findGlassBreakaway();
        return result;
    }

    public String glassShotblock() {
        findGlassShotblock();
        history.showResults();
        String result = findGlassShotblock();
        return result;
    }

    public String glassSlapshot() {
        findGlassSlapshot();
        history.showResults();
        String result = findGlassSlapshot();
        return result;
    }

    public String glassWindmill() {
        findGlassWindmill();
        history.showResults();
        String result = findGlassWindmill();
        return result;
    }

    public String glassSticklift() {
        findGlassSticklift();
        history.showResults();
        String result = findGlassSticklift();
        return result;
    }

    public String glassPokecheck() {
        findGlassPokecheck();
        history.showResults();
        String result = findGlassPokecheck();
        return result;
    }

    public String glassDeke() {
        findGlassDeke();
        history.showResults();
        String result = findGlassDeke();
        return result;
    }

    public String findGlassDeke() {
        if (user1.getRosterStickhandling() + user1.getRosterShot() - computer.getRosterStickhandling() - computer.getRosterChecking() >= 0) {
            return ("You could've had him!");
        } else {
            return ("Good choice!");
        }
    }
    public String findGlassPokecheck() {
        if (user1.getRosterStickhandling() + user1.getRosterChecking() - computer.getRosterStickhandling() - computer.getRosterShot() >= 0) {
            return ("You could've had him!");
        } else {
            return ("Good choice!");
        }
    }

    public String findGlassSticklift() {
        if (user1.getRosterStickhandling() + user1.getRosterStrength() - computer.getRosterStrength() - computer.getRosterSkating() >= 0) {
            return ("You could've had him!");
        } else {
            return ("Good choice!");
        }
    }

    public String findGlassWindmill() {
        if (user1.getRosterStickhandling() + user1.getRosterSkating() - computer.getRosterChecking() - computer.getRosterStrength() >= 0) {
            return ("You could've had him!");
        } else {
            return ("Good choice!");
        }
    }

    public String findGlassSlapshot() {
        if (user1.getRosterShot() + user1.getRosterShot() + user1.getRosterStrength() - computer.getRosterShot() - computer.getRosterChecking() >= 0) {
            return ("You could've had him!");
        } else {
            return ("Good choice!");
        }
    }

    public String findGlassShotblock() {
        if (user1.getRosterShot() + user1.getRosterShot() + user1.getRosterChecking() - computer.getRosterShot() - computer.getRosterStrength() >= 0) {
            return ("You could've had him!");
        } else {
            return ("Good choice!");
        }
    }

    public String findGlassBreakaway() {
        if (user1.getRosterShot() + user1.getRosterSkating() - computer.getRosterChecking() - computer.getRosterSkating() >= 0){
            return("You could've had him!");
        }
        else {
            return("Good choice!");
        }
    }


    public String findGlassBodycheck() {
        if (user1.getRosterChecking() + user1.getRosterStrength() - computer.getRosterSkating() - computer.getRosterStickhandling()>= 0){
            return("You could've had him!");
        }
        else {
            return("Good choice!");
        }
    }

    public String findGlassBackcheck() {
        if (user1.getRosterChecking() + user1.getRosterSkating() - computer.getRosterShot() - computer.getRosterSkating()>= 0){
            return("You could've had him!");
        }
        else {
            return("Good choice!");
        }
    }

    public String findGlassPowermove() {
        if (user1.getRosterStrength() + user1.getRosterSkating() - computer.getRosterStrength() - computer.getRosterStickhandling()>= 0){
            return("You could've had him!");
        }
        else {
            return("Good choice!");
        }
    }

}

