package hockey.hockeygame;

/**
 * Created by user on 18/03/2017.
 */

import android.util.Log;

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

    public Game(String playerName, String computer, Team userTeam, Team computerTeam){
        this.user1 = new User(playerName, userTeam);
        this.computer = new User(computer, computerTeam);
        this.draftPool = new DraftPool(new ArrayList<Card>());
        this.users = new ArrayList<>();
        this.history = new History();
        this.situations = new ArrayList<>();
        this.situation = new Situation(move);

    }

    public void setUpGame() {
        users.clear();
        users.add(user1);
        users.add(computer);
    }

    private void setUpSituation() {
        for (Move move : Move.values()) {
            situations.add(new Situation(move));
            randomise();
        }
    }

    Situation takeInSituation() {
        setUpSituation();
        randomise();
        return situations.get(0);
    }

    private void randomise() {
        Collections.shuffle(situations);
    }

    public String deal(){
        Card card;
        for (User user: users) {
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

    private String findWinner () {
        if (user1.getTotalValue() - computer.getTotalValue() >= 0){
            System.out.println("Yay!!!");
            return("You win!");
        }
        else {
            System.out.println("Boo!!!");
            return("You lose!");
        }
    }

    private String findWinnerStickhandling () {
        if (user1.getRosterStickhandling() - computer.getRosterStickhandling() >= 0){
            System.out.println("Yay!!!");
            return("You win!");
        }
        else {
            System.out.println("Boo!!!");
            return("You lose!");
        }
    }

    private String findWinnerShot () {
        if (user1.getRosterShot() - computer.getRosterShot() >= 0){
            System.out.println("Yay!!!");
            return("You win!");
        }
        else {
            System.out.println("Boo!!!");
            return("You lose!");
        }
    }    private String findWinnerChecking () {
        if (user1.getRosterChecking() - computer.getRosterChecking() >= 0){
            System.out.println("Yay!!!");
            return("You win!");
        }
        else {
            System.out.println("Boo!!!");
            return("You lose!");
        }
    }

    private String findWinnerStrength () {
        if (user1.getRosterStrength() - computer.getRosterStrength() >= 0){
            System.out.println("Yay!!!");
            return("You win!");
        }
        else {
            System.out.println("Boo!!!");
            return("You lose!");
        }
    }
    private String findWinnerSkating () {
        if (user1.getRosterSkating() - computer.getRosterSkating() >= 0){
            System.out.println("Yay!!!");
            return("You win!");
        }
        else {
            System.out.println("Boo!!!");
            return("You lose!");
        }
    }

    public String play(){
        findWinner();
        history.showResults();
        String result = findWinner();
        Log.d(getClass().toString(), result);
        return result;
    }

    public String playStickhandling(){
        findWinnerStickhandling();
        history.showResults();
        String result = findWinner();
        Log.d(getClass().toString(), result);
        return result;
    }

    public String playShot(){
        findWinnerShot();
        history.showResults();
        String result = findWinner();
        Log.d(getClass().toString(), result);
        return result;
    }

    public String playChecking(){
        findWinnerChecking();
        history.showResults();
        String result = findWinner();
        Log.d(getClass().toString(), result);
        return result;
    }

    public String playStrength(){
        findWinnerStrength();
        history.showResults();
        String result = findWinner();
        Log.d(getClass().toString(), result);
        return result;
    }

    public String playSkating(){
        findWinnerSkating();
        history.showResults();
        String result = findWinner();
        Log.d(getClass().toString(), result);
        return result;
    }
}
