package hockey.hockeygame;

/**
 * Created by user on 20/03/2017.
 */

enum Move {
    DEKE("Finesse Deke"),
    POKECHECK("Pokecheck"),
    STICKLIFT("Sticklift"),
    WINDMILL("Windmill Deke"),
    BATTLE("Net Battle"),
    SLAPSHOT("Slapshot"),
    BREAKAWAY("Breakaway"),
    BODYCHECK("Bodycheck"),
    BACKCHECK("Backcheck"),
    POWERMOVE("Powermove");


public String movename;

        Move(String movename) {
        this.movename = movename;

        }
};

