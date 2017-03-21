package hockey.hockeygame;

/**
 * Created by user on 18/03/2017.
 */

class Card {
    private final Player playername;
    private int value;
    private int stickhandling;
    private int shot;
    private int checking;
    private int strength;
    private int skating;

    public Card(Player playername, int value, int stickhandling, int shot, int checking, int strength, int skating) {
        this.playername = playername;
        this.value = value;
        this.stickhandling = stickhandling;
        this.shot = shot;
        this.checking = checking;
        this.strength = strength;
        this.skating = skating;
    }

    int getValue() {
        return this.value;
    }

    Player getPlayerName() {
        return this.playername;
    }

    String getPlayerDisplay() {
        return this.playername + "(" + this.value +")";
    }


    public int getPlayerStickhandling() {
        return this.stickhandling;
    }

    public int getPlayerChecking() {
        return this.checking;
    }

    public int getPlayerStrength() {
        return this.strength;
    }

    public int getPlayerSkating() {
        return this.skating;
    }

    public int getPlayerShooting() {
        return this.shot;
    }
}
