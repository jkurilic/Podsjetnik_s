package com.example.mm.podsjetnik_s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lijek extends AppCompatActivity {

    private Button buttonPocetna;
    private Button  buttonPodsjetnikL;
    private Button  buttonKupovinaL;
    private Button fabNoviLijek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lijek);

        buttonPocetna = (Button) findViewById(R.id.buttonPocetnaK);
        buttonPodsjetnikL = (Button) findViewById(R.id.buttonLijekovi);
        buttonKupovinaL = (Button) findViewById(R.id.buttonPodsjetnikK);
        fabNoviLijek = (Button) findViewById(R.id.fabNoviLijek);

        fabNoviLijek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPocetna();
            }
        });

        buttonKupovinaL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopisKupovina();
            }
        });

        buttonPocetna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNoviLijek();
            }
        });

        buttonPodsjetnikL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUnosPodsjetnika();
            }
        });
    }
    public void openUnosPodsjetnika() {
        Intent intent1 = new Intent(this, unos_podsjetnika.class);
        startActivity(intent1);
    }

    public void openNoviLijek(){
        Intent intent2 = new Intent (this, unos_lijeka.class);
        startActivity(intent2);
    }

    public void openPopisKupovina(){
        Intent intent3 = new Intent(this, Podsjetnik_kupovina.class);
        startActivity(intent3);
    }

    public void openPocetna(){
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);
    }
    }

