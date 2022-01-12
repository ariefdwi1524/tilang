package com.example.tilangonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuPilihMain extends AppCompatActivity {

    private Button btn_Tilang, btn_uu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menupilih);

        btn_Tilang = findViewById(R.id.tilang);
        btn_Tilang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goRegister = new Intent(MenuPilihMain.this, UtamaMain.class);
                startActivity(goRegister);
            }

        });

        btn_uu = findViewById(R.id.uulalin);
        btn_uu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goRegister = new Intent(MenuPilihMain.this, UULaLinMain.class);
                startActivity(goRegister);
            }

        });


    }
    @Override
    public void onBackPressed() {
        moveTaskToBack(true);
    }
}


