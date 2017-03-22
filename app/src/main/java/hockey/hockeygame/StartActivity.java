package hockey.hockeygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity {

    TextView title;
    TextView explain;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        title = (TextView)findViewById(R.id.title_text);
        explain = (TextView)findViewById(R.id.game_explain);
        intent = new Intent(StartActivity.this, GameActivity.class);

        Log.d(getClass().toString(), "onCreate called");
    }

    public void onDraftButtonPressed(View button) {
        startActivity(intent);
    }


}
