package com.example.mm.podsjetnik_s;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button  buttonPodsjetnik;
    private Button  buttonLijekovi;
    private Button  buttonKupovina;
    private Button fabPodsjetnikLijek;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonPodsjetnik = (Button) findViewById(R.id.buttonPodsjetnik);
        buttonLijekovi = (Button) findViewById(R.id.buttonLijekovi);
        buttonKupovina = (Button) findViewById(R.id.buttonKupovina);
        fabPodsjetnikLijek = (Button) findViewById(R.id.fabNoviPodsjetnik);

        fabPodsjetnikLijek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPodsjetnikLijek();
            }
        });

        buttonKupovina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPopisKupovina();
            }
        });

        buttonLijekovi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUnosLijeka();
            }
        });

        buttonPodsjetnik.setOnClickListener(new View.OnClickListener() {
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

    public void openUnosLijeka(){
        Intent intent2 = new Intent (this, unos_lijeka.class);
        startActivity(intent2);
    }

    public void openPopisKupovina(){
        Intent intent3 = new Intent(this, Podsjetnik_kupovina.class);
        startActivity(intent3);
    }

    public void openPodsjetnikLijek(){
        Intent intent4 = new Intent(this, Podsjetnik_lijek.class);
        startActivity(intent4);
    }

}
