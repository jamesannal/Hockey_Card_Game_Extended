package hockey.hockeygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    TextView title;
    TextView explain;
    Button draftCard;
    TextView show;
    Intent intent;
    TextView playerShow;
    Team userTeam = new Team();
    Team computerTeam = new Team();
    Game game = new Game("You", "Opponent", userTeam, computerTeam);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        title = (TextView)findViewById(R.id.title_text);
        explain = (TextView)findViewById(R.id.game_explain);
        draftCard = (Button)findViewById(R.id.draft_card);
        show = (TextView)findViewById(R.id.result_box);
        playerShow = (TextView)findViewById(R.id.player_box);
        intent = new Intent(StartActivity.this, GameActivity.class);

        Log.d(getClass().toString(), "onCreate called");

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_start, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
    public void onDraftButtonPressed(View button) {
        Log.d(getClass().toString(), draftCard.getText().toString());
        userTeam.getCards().clear();
        computerTeam.getCards().clear();
        game.setUpGame();
        String result2 = game.deal();

        Log.d("game.deal result", result2);
        playerShow.setText(result2);
        show.setText("");
        startActivity(intent);

    }

//    public void onTakeThemOnButtonPressed(View button) {
//
//        String result = game.play();
//        Log.d("game.play result", result);
//        show.setText(result);
//    }
//
//    public void onOffTheGlassButtonPressed(View button) {
//        Log.d(getClass().toString(), draftCard.getText().toString());
//        userTeam.getCards().clear();
//        computerTeam.getCards().clear();
//        game.setUpGame();
//        String result = game.deal();
//        Log.d("game.deal result", result);
//        playerShow.setText(result);
//        show.setText("");
//    }

}
