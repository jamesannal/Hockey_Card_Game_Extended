package hockey.hockeygame;

/**
 * Created by user on 18/03/2017.
 */

class Card {
    private final Player playername;
    private int value;

    public Card(Player playername, int value) {
        this.playername = playername;
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public Player getPlayerName() {
        return this.playername;
    }

    public String getPlayerDisplay() {
        return this.playername + "(" + this.value +")";
    }


}
