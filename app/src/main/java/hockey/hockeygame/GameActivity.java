package hockey.hockeygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static hockey.hockeygame.R.id.player_box;
import static hockey.hockeygame.R.id.situation_box;

/**
 * Created by user on 18/03/2017.
 */

public class GameActivity extends AppCompatActivity {

    TextView title;
    Button draftCard;
    TextView show;
    TextView playerShow;
    TextView situationShow;
    Team userTeam = new Team();
    Team computerTeam = new Team();
    Game game = new Game("You", "Opponent", userTeam, computerTeam);
    private ArrayList<Situation> situations;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d(getClass().toString(), "GameActivity.onCreateCalled");
        setContentView(R.layout.activity_game);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        game.setUpGame();
        String dealresult = game.deal();

        Move moveResult = game.takeInSituation().getMoveName();

//        situationShow.setText("");

        title = (TextView) findViewById(R.id.title_text);
        show = (TextView) findViewById(R.id.result_box);
        show.setText("");

//        String plyrs = extras.getString("playerShow");
//        Move sit = (Move) intent.getSerializableExtra("situationShow");
//        String sit = extras.getString("situationShow");
        playerShow = (TextView) findViewById(player_box);
        playerShow.setText(dealresult);


        situationShow = (TextView) findViewById(situation_box);
        situationShow.setText(moveResult.toString());

//        playerShow.setText(plyrs);
//        situationShow.setText(sit.toString());


//        Log.d(getClass().toString(), "onCreate called");
    }



    public void onTakeThemOnButtonPressed(View button) {
        String result = game.play();
        Log.d("game.play result", result);
        show.setText(result);
        game.setUpGame();
        String dealresult = game.deal();
        Log.d("game.deal result", dealresult);
        playerShow.setText(dealresult);
        Move moveResult = game.takeInSituation().getMoveName();
        situationShow.setText(moveResult.toString());
        Log.d("situation", moveResult.toString());
    }

    public void onOffTheGlassButtonPressed(View button) {
        String result = game.glass();
        Log.d("game.glass result", result);
        show.setText(result);
        game.setUpGame();
        String dealresult = game.deal();
        Log.d("game.deal result", dealresult);
        playerShow.setText(dealresult);
//        show.setText("Safety First");
        Move moveResult = game.takeInSituation().getMoveName();
        situationShow.setText(moveResult.toString());
        Log.d("situation", moveResult.toString());
    }
}