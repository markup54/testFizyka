package com.example.flagi3pgr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Pytanie> pytania = new ArrayList<>();
    TextView pytTextView;
    int licznik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pytTextView = findViewById(R.id.pytanieTextView);
        dodajPytania();
        wyswietlPytanie(0);

    }
    private void wyswietlPytanie(int i){
        pytTextView.setText(pytania.get(i).getTresc());
    }
    private void dodajPytania(){
        pytania.add(new Pytanie("Jeżeli na ciało nie działa żadana siła ciało porusza się ruchem jednostajnym",true));
        pytania.add(new Pytanie("ciało spada swobodnie z prześpieszeniem 20m/s",false));
        pytania.add(new Pytanie("Ziemia jest płaska",false));
        pytania.add(new Pytanie("W autobusie podczas hamowania działa siła bezwładności w kierunku jazdy autobusu",true));

    }
    public void sprawdz(View view) {
        Integer id = view.getId();
        if(pytania.get(licznik).isOdpowiedz() ) {
            if (id == R.id.button3) {
                Toast.makeText(MainActivity.this,
                        "dobra odpowiedź",
                        Toast.LENGTH_SHORT)
                        .show();
            } else {
                Toast.makeText(MainActivity.this,
                        "zła odpowiedź",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        }
        else{
            if (id == R.id.button3) {
                Toast.makeText(MainActivity.this,
                        "zła odpowiedź",
                        Toast.LENGTH_SHORT)
                        .show();
            } else {
                Toast.makeText(MainActivity.this,
                        "dobra odpowiedź",
                        Toast.LENGTH_SHORT)
                        .show();
            }
        }
    }

    public void kolejne(View view) {
        licznik++;
        if(licznik==pytania.size()){
            pytTextView.setText("Koniec testu");
            view.setVisibility(View.INVISIBLE);
            licznik--;
        }
        else {
            wyswietlPytanie(licznik);
        }
    }
}