package com.example.mm.podsjetnik_s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Podsjetnik_kupovina extends AppCompatActivity {

    private Button buttonPocetnaK;
    private Button  buttonPodsjetnikK;
    private Button buttonLijekoviPK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podsjetnik_kupovina);

        buttonPocetnaK = (Button) findViewById(R.id.buttonPocetnaK);
        buttonPodsjetnikK = (Button) findViewById(R.id.buttonPodsjetnikK);
        buttonLijekoviPK = (Button) findViewById(R.id.buttonLijekoviPK);


        buttonLijekoviPK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopisLijekova();
            }
        });

        buttonPocetnaK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPocetnaK();
            }
        });

        buttonPodsjetnikK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPodsjetnik();
            }
        });
    }
    public void openPodsjetnik() {
        Intent intent1 = new Intent(this, Podsjetnik_lijek.class);
        startActivity(intent1);
    }

    public void openPocetnaK(){
        Intent intent2 = new Intent (this, MainActivity.class);
        startActivity(intent2);
    }

    public void openPopisLijekova(){
        Intent intent3 = new Intent(this, Lijek.class);
        startActivity(intent3);
    }

    }

