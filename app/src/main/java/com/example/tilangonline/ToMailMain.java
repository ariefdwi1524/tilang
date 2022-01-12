package com.example.tilangonline;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ToMailMain extends AppCompatActivity {

    private TextView etTo, etSubject, etMessage;
    private Button btnSend, btnMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomail);

        final String datapelanggar = getIntent().getExtras().getString("datapelanggar");
        final String email = getIntent().getExtras().getString("email");
        final String sub = getIntent().getExtras().getString("subject");


        etTo = findViewById(R.id.et_to);
        etTo.setText(email);
        etSubject = findViewById(R.id.et_subject);
        etSubject.setText(sub);
        etMessage = findViewById(R.id.et_message);
        etMessage.setText(datapelanggar);
        btnSend = findViewById(R.id.btn_send);
        btnMenu = findViewById(R.id.btn_menu);



        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
                }
        });

        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gomn = new Intent( ToMailMain.this, MenuPilihMain.class);
                startActivity(gomn);
                finish();
            }
        });

}
    private void sendMail(){

        String email = etTo.getText().toString();
        String subject = etSubject.getText().toString();
        String message = etMessage.getText().toString();

        Intent gokirim = new Intent(android.content.Intent.ACTION_SEND);
        gokirim.setType("plain/text");
        gokirim.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { email });
        gokirim.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
        gokirim.putExtra(android.content.Intent.EXTRA_TEXT, message);

        startActivity(Intent.createChooser(gokirim,"PILIH EMAIL..."));

    }
    @Override
    public void onBackPressed() {
        Intent gomn = new Intent( ToMailMain.this, MenuPilihMain.class);
        startActivity(gomn);
        finish();
    }
}



