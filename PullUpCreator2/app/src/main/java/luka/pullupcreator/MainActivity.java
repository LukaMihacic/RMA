package luka.pullupcreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        Button bStart;
        TextView tvIme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetUPUI();
    }

    private void SetUPUI() {
        bStart = (Button) findViewById(R.id.bStart);
        tvIme = (TextView) findViewById(R.id.tvIme);
        bStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent explicitIntent = new Intent (getApplicationContext(), MenuActivity.class);
                startActivity(explicitIntent);
            }
        });
    }
}
