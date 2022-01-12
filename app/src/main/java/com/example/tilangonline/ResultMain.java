package com.example.tilangonline;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultMain extends AppCompatActivity {

    private TextView result, tsub;
    private Button btnokresult, btnkirimemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        String nama = getIntent().getExtras().getString("nama");
        String jk = getIntent().getExtras().getString("jk");
        String noktp = getIntent().getExtras().getString("noktp");
        String kota = getIntent().getExtras().getString("kota");
        String kendaraan = getIntent().getExtras().getString("kendaraan");
        String nopol = getIntent().getExtras().getString("nopol");
        String tglsekarang = getIntent().getExtras().getString("tglsekarang");
        String tmpkejadian = getIntent().getExtras().getString("tmpkejadian");
        String nohp = getIntent().getExtras().getString("nohp");
        final String email = getIntent().getExtras().getString("email");
        String jp = getIntent().getExtras().getString("jp");
        String pasal = getIntent().getExtras().getString("pasal");
        String denda = getIntent().getExtras().getString("denda");

        result = findViewById(R.id.t_result);
        result.setText("NAMA =  "+nama+
                "\nJENIS KELAMIN =  "+jk+
                "\nNO KTP = "+noktp+
                "\nKOTA =   "+kota+
                "\nKENDARAAN =  "+kendaraan+
                "\nNOMOR KENDARAAN =  "+nopol+
                "\nTANGGAL SEKARANG =   "+tglsekarang+
                "\nTEMPAT KEJADIAN =    "+tmpkejadian+
                "\nNO HP =  "+nohp+
                "\nEMAIL =  " +email+
                "\nJENIS PELANGGARAN =  "+jp+
                "\nPASAL =  "+pasal+
                "\nDENDA =  "+denda+
                "\n--------------------" +
                "\nPEMBAYARAN DILAKUKAN DENGAN TRANSFER "+
                "\nMELALUI ATM BANK DENGAN "+
                "\nNOMOR REKENING 01.39.01.000794.30.7 "+
                "\n--------------------" +
                "\nHARAP AMBIL STNK ATAU SIM ANDA "+
                "\nDI PENGADILAN NEGERI"+
                "\nDENGAN MEMBAWA BUKTI TRANSFER");

        tsub = findViewById(R.id.t_sub);
        tsub.setText("TILANG ONLINE");

        btnokresult = findViewById(R.id.btn_okresult);
        btnokresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gomenupilih = new Intent(ResultMain.this, MenuPilihMain.class);
                startActivity(gomenupilih);
            }
        });

        btnkirimemail = findViewById(R.id.btn_kirimemail);
        btnkirimemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goemail = new Intent(ResultMain.this, ToMailMain.class);
                goemail.putExtra("datapelanggar", result.getText().toString());
                goemail.putExtra("subject",tsub.getText().toString());
                goemail.putExtra("email",email);
                startActivity(goemail);
            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent gologin = new Intent( ResultMain.this, MenuPilihMain.class);
        startActivity(gologin);
        finish();
    }
}


