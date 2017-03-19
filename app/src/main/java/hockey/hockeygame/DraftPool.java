package hockey.hockeygame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 18/03/2017.
 */

class DraftPool {
    private ArrayList<Card> cards;

    DraftPool(ArrayList<Card> cards) {
        this.cards = cards;
        setUpDraft();
    }

    int getCardAmountInPool() {
        return cards.size();
    }

    private void setUpDraft() {
        for (Player player : Player.values()){
            cards.add(new Card(player, player.value, player.stickhandling, player.shot, player.checking, player.strength, player.skating));
            randomise();
        }
    }

    private void randomise() {
        Collections.shuffle(cards);
    }

    Card dealCard(User user) {
        Card card = cards.get(0);
        user.draftCardToTeam(card);
        cards.remove(0);
        setUpDraft();
        return card;
    }
}