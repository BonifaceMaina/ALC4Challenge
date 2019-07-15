package com.boniface.alc40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent newIntent = new Intent(getApplicationContext(), AboutALC.class);
                startActivity(newIntent);
            }

        });
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(getApplicationContext(), MyProfile.class);
                startActivity(profile);
            }

        });
    }
}
