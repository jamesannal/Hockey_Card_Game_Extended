package hockey.hockeygame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import static hockey.hockeygame.R.id.player_box;
import static hockey.hockeygame.R.id.situation_box;

/**
 * Created by user on 18/03/2017.
 */

public class GameActivity extends AppCompatActivity {

    TextView title;
    TextView show;
    TextView playerShow;
    TextView situationShow;
    Team userTeam = new Team();
    Team computerTeam = new Team();
    Game game = new Game("You", "Opponent", userTeam, computerTeam);

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        game.setUpGame();
        String dealresult = game.deal();

        Move moveResult = game.takeInSituation().getMoveName();

        title = (TextView) findViewById(R.id.title_text);
        show = (TextView) findViewById(R.id.result_box);
        show.setText("");

        playerShow = (TextView) findViewById(player_box);
        playerShow.setText(dealresult);

        situationShow = (TextView) findViewById(situation_box);
        situationShow.setText("You need to do a: " + moveResult.toString());
    }

    public void onTakeThemOnButtonPressed(View button) {
        String result = game.play();
        show.setText(result);
        game.setUpGame();
        String dealresult = game.deal();
        playerShow.setText(dealresult);
        Move moveResult = game.takeInSituation().getMoveName();
        situationShow.setText("You need to do a: " + moveResult.toString());
    }

    public void onOffTheGlassButtonPressed(View button) {
        String result = game.glass();
        show.setText(result);
        game.setUpGame();
        String dealresult = game.deal();
        playerShow.setText(dealresult);
        Move moveResult = game.takeInSituation().getMoveName();
        situationShow.setText("You need to do a: " + moveResult.toString());
    }
}