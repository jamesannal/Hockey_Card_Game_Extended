package hockey.hockeygame;

/**
 * Created by user on 18/03/2017.
 */

class User {

    private String name;
    private Team team;

    User(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    String getUserName() {
        return name;
    }

    void draftCardToTeam(Card card) {
        team.draftCard(card);
    }

    int getRosterNumber() {
        return team.getRosterNumber();
    }

    int getTotalValue() {
        return team.getRosterScore();
    }

    Team getTeam() {
        return team;
    }

//    public void showPlayers() {
//        for (Card card : getTeam().getCards());
//    }
}
