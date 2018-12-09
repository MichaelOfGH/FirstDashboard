package firstdashboard.michael.com.firstdashboard;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView bankcard, ideacard;
    private ImageView bankImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bankcard = findViewById(R.id.bank_card);
        ideacard = findViewById(R.id.idea_card);//
        bankImg = findViewById(R.id.bankImg);//图片
        bankcard.setOnClickListener(this);
        ideacard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent inte;
        switch (v.getId()) {
            case R.id.bank_card:
                inte = new Intent(this, BankActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(this,bankImg,"BankImg");
                startActivity(inte,options.toBundle());
                overridePendingTransition(0, 0);
                break;
            case R.id.idea_card:
                inte = new Intent(this, IdeaActivity.class);
                startActivity(inte);
                overridePendingTransition(0, 0);
                break;
            default:
                break;

        }
    }

}
