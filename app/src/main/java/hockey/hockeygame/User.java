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

    public int getRosterStickhandling() {
        return team.getTeamStickhandling();
    }

    public int getRosterShot() {
        return team.getTeamShot();
    }

    public int getRosterChecking() {
        return team.getTeamChecking();
    }

    public int getRosterStrength() {
        return team.getTeamStrength();
    }

    public int getRosterSkating() {
        return team.getTeamSkating();
    }

//    public void showPlayers() {
//        for (Card card : getTeam().getCards());
//    }
}
