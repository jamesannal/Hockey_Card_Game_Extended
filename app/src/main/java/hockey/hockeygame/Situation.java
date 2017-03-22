package hockey.hockeygame;

/**
 * Created by user on 19/03/2017.
 */

public class Situation {

    private Move move;

    public Situation(Move move){
        this.move = move;
    }

    Move getMoveName() {
        return this.move;
    }

}