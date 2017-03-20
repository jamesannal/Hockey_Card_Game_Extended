package hockey.hockeygame;

import java.util.ArrayList;

/**
 * Created by user on 18/03/2017.
 */

class Team {
    private ArrayList<Card> cards;

    Team() {
        this.cards = new ArrayList<Card>();
    }

    void draftCard(Card card) {
        cards.add(card);
    }


    int getRosterNumber() {
        return cards.size();
    }

    int getRosterScore() {
        int total = 0;
        for (Card card : cards) {
            total += card.getValue();
        }
        return total;
    }

    public int getTeamStickhandling() {
        int total = 0;
        for (Card card : cards) {
            total += card.getPlayerStickhandling();
        }
        return total;
    }

    public int getTeamShot() {
        int total = 0;
        for (Card card : cards) {
            total += card.getPlayerShooting();
        }
        return total;
    }

    public int getTeamChecking() {
        int total = 0;
        for (Card card : cards) {
            total += card.getPlayerChecking();
        }
        return total;
    }

    public int getTeamStrength() {
        int total = 0;
        for (Card card : cards) {
            total += card.getPlayerStrength();
        }
        return total;
    }

    public int getTeamSkating() {
        int total = 0;
        for (Card card : cards) {
            total += card.getPlayerSkating();
        }
        return total;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public ArrayList<String> getCardStringified(){
        ArrayList<String> stringifiedCards = new ArrayList<>();
        for(Card card : cards){
            String answer = card.getPlayerName().toString().toLowerCase();
            answer = answer.substring(0,1).toUpperCase() + answer.substring(1).toLowerCase();
            stringifiedCards.add(answer);

        }
        return stringifiedCards;
    }


}
