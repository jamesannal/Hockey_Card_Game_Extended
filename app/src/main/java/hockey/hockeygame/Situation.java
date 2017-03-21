package hockey.hockeygame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 19/03/2017.
 */

public class Situation {

    private ArrayList<Move> moves;
    private Move move;
    private ArrayList<Situation> situations;

    public Situation(Move move){
        this.move = move;
    }

//    Situation(ArrayList<Situation> situations) {
//        this.situations = situations;
//        setUpSituation();
//    }

    Move getMoveName() {
        return this.move;
    }

    private void randomise() {
        Collections.shuffle(situations);
    }

    private void setUpSituation() {
        for (Move move : Move.values()) {
            situations.add(new Situation(move));
            randomise();
        }
    }

//    Situation takeInSituation(Move move) {
//        setUpSituation();
//        randomise();
//        return situations.get(0);
//    }
}