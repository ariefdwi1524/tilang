package com.example.tilangonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UtamaMain extends AppCompatActivity {

    private DatabaseReference database;
    private Button btnjnsplgrn, btnok;
    private String dtpelanggar;
    private EditText enama, ejk, enoktp, ekota, ekendaraan, enopol, etglskrng, etmptkjdn, enohp, eemail, tjp, tp, td;


    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);

        enama = findViewById(R.id.etnama);
        ejk = findViewById(R.id.etjk);
        enoktp = findViewById(R.id.etnoktp);
        ekota = findViewById(R.id.etkota);
        ekendaraan = findViewById(R.id.etkendaraan);
        enopol = findViewById(R.id.etnopol);
        etglskrng = findViewById(R.id.ettglskrg);
        etmptkjdn = findViewById(R.id.ettmpkjdn);
        enohp = findViewById(R.id.etnohp);
        eemail = findViewById(R.id.etemail);
        tjp = findViewById(R.id.etjnsplgrn);
        tp = findViewById(R.id.etpasal);
        td = findViewById(R.id.etdenda);
        btnok = findViewById(R.id.btn_ok);
        btnjnsplgrn = findViewById(R.id.btn_jnsplgrn);

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("") && td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal287.1"));
            tjp.setText(i.getStringExtra("melanggarlalin"));
            td.setText(i.getStringExtra("denda287.1"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("Pasal291.1"));
            tjp.setText(i.getStringExtra("tdkhelm"));
            td.setText(i.getStringExtra("denda291.1"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal288.2"));
            tjp.setText(i.getStringExtra("tdkmjksim"));
            td.setText(i.getStringExtra("denda288.2"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal280"));
            tjp.setText(i.getStringExtra("tdkpkplat"));
            td.setText(i.getStringExtra("denda280"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal285.1"));
            tjp.setText(i.getStringExtra("mtrtdktkns"));
            td.setText(i.getStringExtra("denda285.1"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal285.2"));
            tjp.setText(i.getStringExtra("mbltdktkns"));
            td.setText(i.getStringExtra("denda285.2"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal278"));
            tjp.setText(i.getStringExtra("mbltdklengkap"));
            td.setText(i.getStringExtra("denda278"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal287.5"));
            tjp.setText(i.getStringExtra("mlgrkcptn"));
            td.setText(i.getStringExtra("denda287.5"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal288.1"));
            tjp.setText(i.getStringExtra("tdklkpstnk"));
            td.setText(i.getStringExtra("denda288.1"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal289"));
            tjp.setText(i.getStringExtra("tdkmgnksabuk"));
            td.setText(i.getStringExtra("denda289"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal281"));
            tjp.setText(i.getStringExtra("tdkmmlksim"));
            td.setText(i.getStringExtra("denda281"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal293.1"));
            tjp.setText(i.getStringExtra("lptdknyatamalam"));
            td.setText(i.getStringExtra("denda293.1"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal293.2"));
            tjp.setText(i.getStringExtra("lptdknyatasiang"));
            td.setText(i.getStringExtra("denda293.2"));
        }

        if (tjp.getText().toString().equals("") && tp.getText().toString().equals("")&& td.getText().toString().equals("")) {
            Intent i = getIntent();
            tp.setText(i.getStringExtra("pasal294"));
            tjp.setText(i.getStringExtra("lpsein"));
            td.setText(i.getStringExtra("denda294"));
        }


        database = FirebaseDatabase.getInstance().getReference("Data_Pelanggar");
        dtpelanggar = database.push().getKey();

        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (enoktp.getText().toString().length()!=16){
                enoktp.setError("NO KTP KURANG DARI 16 DIGIT!!");
                //validasi input untuk no ktp dengan 16 digit
                }else {
                Intent data = new Intent(UtamaMain.this, ResultMain.class);
                data.putExtra("nama", enama.getText().toString());
                data.putExtra("jk", ejk.getText().toString());
                data.putExtra("noktp", enoktp.getText().toString());
                data.putExtra("kota", ekota.getText().toString());
                data.putExtra("kendaraan", ekendaraan.getText().toString());
                data.putExtra("nopol", enopol.getText().toString());
                data.putExtra("tglsekarang", etglskrng.getText().toString());
                data.putExtra("tmpkejadian", etmptkjdn.getText().toString());
                data.putExtra("nohp", enohp.getText().toString());
                data.putExtra("email", eemail.getText().toString());
                data.putExtra("jp", tjp.getText().toString());
                data.putExtra("pasal", tp.getText().toString());
                data.putExtra("denda", td.getText().toString());
                Simpandata();
                startActivity(data);
            }}
        });

        btnjnsplgrn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gopopup = new Intent(UtamaMain.this, PopupMain.class);
                startActivity(gopopup);
            }
        });
    }

            private void Simpandata() {
                Requests requests = new Requests(dtpelanggar,
                        enama.getText().toString(),
                        ejk.getText().toString(),
                        enoktp.getText().toString(),
                        ekota.getText().toString(),
                        ekendaraan.getText().toString(),
                        enopol.getText().toString(),
                        etglskrng.getText().toString(),
                        etmptkjdn.getText().toString(),
                        enohp.getText().toString(),
                        eemail.getText().toString(),
                        tjp.getText().toString(),
                        tp.getText().toString(),
                        td.getText().toString());
                    database.child(dtpelanggar).setValue(requests);

            }
    @Override
    public void onBackPressed() {
        Intent gologin = new Intent( UtamaMain.this, MenuPilihMain.class);
        startActivity(gologin);
        finish();
    }
}
