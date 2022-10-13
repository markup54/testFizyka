package com.example.flagi3pgr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sprawdz(View view) {
        Integer id = view.getId();

        if(id == R.id.button3){
            Toast.makeText(MainActivity.this,
                    "dobra odpowiedź",
                    Toast.LENGTH_SHORT)
                    .show();
        }
        else{
            Toast.makeText(MainActivity.this,
                    "zła odpowiedź",
                    Toast.LENGTH_SHORT)
                    .show();
        }
    }
}