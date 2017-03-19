package hockey.hockeygame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user on 18/03/2017.
 */

public class GameActivity extends AppCompatActivity {

    TextView title;
    Button draftCard;
    TextView show;
    TextView playerShow;
    Team userTeam = new Team();
    Team computerTeam = new Team();
    Game game = new Game("You", "Opponent", userTeam, computerTeam);

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getClass().toString(), "GameActivity.onCreateCalled");
        setContentView(R.layout.activity_game);

        title = (TextView) findViewById(R.id.title_text);
        show = (TextView) findViewById(R.id.result_box);
        playerShow = (TextView) findViewById(R.id.player_box);
        Log.d(getClass().toString(), "onCreate called");
    }

    public void onDraftButtonPressed(View button) {
        Log.d(getClass().toString(), draftCard.getText().toString());
        userTeam.getCards().clear();
        computerTeam.getCards().clear();
        game.setUpGame();
        String result2 = game.deal();

        Log.d("game.deal result", result2);
        playerShow.setText(result2);
        show.setText("");
    }

    public void onTakeThemOnButtonPressed(View button) {
        String result = game.play();
        Log.d("game.play result", result);
        show.setText(result);
        game.setUpGame();
        String result2 = game.deal();
        Log.d("game.deal result", result2);
        playerShow.setText(result2);
    }

    public void onOffTheGlassButtonPressed(View button) {
        game.setUpGame();
        String result = game.deal();
        Log.d("game.deal result", result);
        playerShow.setText(result);
        show.setText("");
    }

}
