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
        situations.add(situation);
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
//
//            card = draftPool.dealCard(user);
//            history.add(card.toString());
//            System.out.println(user.getUserName() + " received " + card.getPlayerDisplay() + "");
        }
        return ("" + user1.getUserName() + " received: " + "\r\n" + user1.getTeam().getCardStringified()
                + "\r\n " + "\r\n" + "" + computer.getUserName() + " received: " + "\r\n" +
                computer.getTeam().getCardStringified() + "").replaceAll("\\[|\\]", "");
    }

//    private String findWinner() {
//        if (user1.getTotalValue() - computer.getTotalValue() >= 0) {
//            System.out.println("Yay!!!");
//            return ("You win!");
//        } else {
//            System.out.println("Boo!!!");
//            return ("You lose!");
//        }
//    }

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
            System.out.println("Yay!!!");
            return ("You deked him out his jock!");
        } else {
            System.out.println("Boo!!!");
            return ("You forgot the puck!");
        }
    }

    private String findWinnerPokecheck() {
        if (user1.getRosterStickhandling() + user1.getRosterChecking() - computer.getRosterStickhandling() - computer.getRosterShot() >= 0) {
            System.out.println("Yay!!!");
            return ("Great last ditch pokecheck!");
        } else {
            System.out.println("Boo!!!");
            return ("Called for tripping!");
        }
    }

    private String findWinnerSticklift() {
        if (user1.getRosterStickhandling() + user1.getRosterStrength() - computer.getRosterStrength() - computer.getRosterSkating() >= 0) {
            System.out.println("Yay!!!");
            return ("Tied him up beautifully!");
        } else {
            System.out.println("Boo!!!");
            return ("You got called for hooking!");
        }
    }

    private String findWinnerWindmill() {
        if (user1.getRosterStickhandling() + user1.getRosterSkating() - computer.getRosterChecking() - computer.getRosterStrength() >= 0) {
            System.out.println("Yay!!!");
            return ("You broke in and scored!");
        } else {
            System.out.println("Boo!!!");
            return ("Keep your head up!");
        }
    }

    private String findWinnerSlapShot () {
        if (user1.getRosterShot() + user1.getRosterShot() + user1.getRosterStrength() - computer.getRosterShot() - computer.getRosterChecking() >= 0) {
            System.out.println("Yay!!!");
            return ("You beat the goalie clean!");
        } else {
            System.out.println("Boo!!!");
            return ("You're a shinpad sniper!");
        }
    }

    private String findWinnerShotblock () {
        if (user1.getRosterShot() + user1.getRosterShot() + user1.getRosterChecking() - computer.getRosterShot() - computer.getRosterStrength() >= 0) {
            System.out.println("Yay!!!");
            return ("You took one for the team!");
        } else {
            System.out.println("Boo!!!");
            return ("Get in the shooting lane!");
        }
    }

    private String findWinnerBreakaway () {
        if (user1.getRosterShot() + user1.getRosterSkating() - computer.getRosterChecking() - computer.getRosterSkating() >= 0){
            System.out.println("Yay!!!");
            return("You broke in and scored!");
        }
        else {
            System.out.println("Boo!!!");
            return("Keep skating hard!");
        }
    }

    private String findWinnerBodyCheck () {
        if (user1.getRosterChecking() + user1.getRosterStrength() - computer.getRosterSkating() - computer.getRosterStickhandling()>= 0){
            System.out.println("Yay!!!");
            return("Caught him looking down!");
        }
        else {
            System.out.println("Boo!!!");
            return("You got danced!");
        }
    }

    private String findWinnerBackCheck () {
        if (user1.getRosterChecking() + user1.getRosterSkating() - computer.getRosterShot() - computer.getRosterSkating()>= 0){
            System.out.println("Yay!!!");
            return("You broke up the play");
        }
        else {
            System.out.println("Boo!!!");
            return("They scored on a break!");
        }
    }

    private String findWinnerPowermove () {
        if (user1.getRosterStrength() + user1.getRosterSkating() - computer.getRosterStrength() - computer.getRosterStickhandling()>= 0){
            System.out.println("Yay!!!");
            return("You went hard and scored!");
        }
        else {
            System.out.println("Boo!!!");
            return("You lost the puck!");
        }
    }

    public String play(){
        findWinner();
        history.showResults();
        String result = findWinner();
//        Log.d(getClass().toString(), result);
        return result;
    }

    public String playDeke(){
        findWinnerDeke();
        history.showResults();
        String result = findWinnerDeke();
//        Log.d(getClass().toString(), result);
        return result;
    }

    public String playPokecheck(){
        findWinnerPokecheck();
        history.showResults();
        String result = findWinnerPokecheck();
//        Log.d(getClass().toString(), result);
        return result;
    }

    public String playSticklift(){
        findWinnerSticklift();
        history.showResults();
        String result = findWinnerSticklift();
//        Log.d(getClass().toString(), result);
        return result;
    }

    public String playWindmill(){
        findWinnerWindmill();
        history.showResults();
        String result = findWinnerWindmill();
//        Log.d(getClass().toString(), result);
        return result;
    }

    public String playShotblock(){
        findWinnerShotblock();
        history.showResults();
        String result = findWinnerShotblock();
//        Log.d(getClass().toString(), result);
        return result;
    }
    public String playSlapshot(){
        findWinnerSlapShot();
        history.showResults();
        String result = findWinnerSlapShot();
//        Log.d(getClass().toString(), result);
        return result;
    }
    public String playBreakaway(){
        findWinnerBreakaway();
        history.showResults();
        String result = findWinnerBreakaway();
//        Log.d(getClass().toString(), result);
        return result;
    }
    public String playBodycheck(){
        findWinnerBodyCheck();
        history.showResults();
        String result = findWinnerBodyCheck();
//        Log.d(getClass().toString(), result);
        return result;
    }
    public String playBackcheck(){
        findWinnerBackCheck();
        history.showResults();
        String result = findWinnerBackCheck();
//        Log.d(getClass().toString(), result);
        return result;
    }
    public String playPowermove(){
        findWinnerPowermove();
        history.showResults();
        String result = findWinnerPowermove();
//        Log.d(getClass().toString(), result);
        return result;
    }
}
