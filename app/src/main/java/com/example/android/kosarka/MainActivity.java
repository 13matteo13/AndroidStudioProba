package com.example.android.kosarka;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int domaci = 0;
    int gosti = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Domaći


    public void bacanje(View view) {

        domaci = domaci + 1;
        displayDomaci(domaci);
    }

    public void dva(View view) {
        domaci = domaci + 2;
        displayDomaci(domaci);
    }

    public void tri(View view) {
        domaci = domaci + 3;
        displayDomaci(domaci);
    }

    private void displayDomaci(int rezultatDomaci) {
        TextView scoreView = (TextView) findViewById(R.id.domaci_rezultat);
        scoreView.setText(String.valueOf(rezultatDomaci));
    }


    //Gosti


    public void slobodnoBacanje(View view) {
        gosti = gosti + 1;
        displayGosti(gosti);
    }

    public void dva_boda(View view) {
        gosti = gosti + 2;
        displayGosti(gosti);
    }

    public void tri_boda(View view) {
        gosti = gosti + 3;
        displayGosti(gosti);
    }

    private void displayGosti(int rezultatGosti) {
        TextView scoreView = (TextView) findViewById(R.id.gosti_rezultat);
        scoreView.setText(String.valueOf(rezultatGosti));
    }


    //Reset button

    public void reset(View view) {
        domaci = 0;
        gosti = 0;
        displayDomaci(0);
        displayGosti(0);

    }
}
