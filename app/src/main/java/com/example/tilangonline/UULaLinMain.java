package com.example.tilangonline;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UULaLinMain extends AppCompatActivity {

    private TextView psl1, psl2, psl3, psl4, psl5, psl6, psl7, psl8, psl9, psl10, psl11, psl12, psl13, psl14;
    private TextView isipsl1, isipsl2, isipsl3, isipsl4, isipsl5, isipsl6, isipsl7, isipsl8, isipsl9, isipsl10, isipsl11, isipsl12, isipsl13, isipsl14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uulalin);

        psl1 = findViewById(R.id.tvpsl1);
        psl2 = findViewById(R.id.tvpsl2);
        psl3 = findViewById(R.id.tvpsl3);
        psl4 = findViewById(R.id.tvpsl4);
        psl5 = findViewById(R.id.tvpsl5);
        psl6 = findViewById(R.id.tvpsl6);
        psl7 = findViewById(R.id.tvpsl7);
        psl8 = findViewById(R.id.tvpsl8);
        psl9 = findViewById(R.id.tvpsl9);
        psl10 = findViewById(R.id.tvpsl10);
        psl11 = findViewById(R.id.tvpsl11);
        psl12 = findViewById(R.id.tvpsl12);
        psl13 = findViewById(R.id.tvpsl13);
        psl14 = findViewById(R.id.tvpsl14);

        isipsl1 = findViewById(R.id.tvisipsl1);
        isipsl2 = findViewById(R.id.tvisipsl2);
        isipsl3 = findViewById(R.id.tvisipsl3);
        isipsl4 = findViewById(R.id.tvisipsl4);
        isipsl5 = findViewById(R.id.tvisipsl5);
        isipsl6 = findViewById(R.id.tvisipsl6);
        isipsl7 = findViewById(R.id.tvisipsl7);
        isipsl8 = findViewById(R.id.tvisipsl8);
        isipsl9 = findViewById(R.id.tvisipsl9);
        isipsl10 = findViewById(R.id.tvisipsl10);
        isipsl11 = findViewById(R.id.tvisipsl11);
        isipsl12 = findViewById(R.id.tvisipsl12);
        isipsl13 = findViewById(R.id.tvisipsl13);
        isipsl14 = findViewById(R.id.tvisipsl14);


        {
            psl1.setText("  Pasal 281  ");
            psl2.setText("  Pasal 288 ayat 2  ");
            psl3.setText("  Pasal 280 ");
            psl4.setText("  Pasal 285 ayat 1  ");
            psl5.setText("  Pasal 285 ayat 2  ");
            psl6.setText("  Pasal 278  ");
            psl7.setText("  Pasal 287 ayat 1  ");
            psl8.setText("  Pasal 287 ayat 5  ");
            psl9.setText("  Pasal 288 ayat 1  ");
            psl10.setText("  Pasal 289  ");
            psl11.setText("  Pasal 291 ayat 1  ");
            psl12.setText("  Pasal 293 ayat 1  ");
            psl13.setText("  Pasal 293 ayat 2  ");
            psl14.setText("  Pasal 294  ");


            isipsl1.setText("Setiap pengendara kendaraan bermotor yang tidak memiliki SIM (Surat Izin Mengemudi) dipidana dengan pidana kurungan paling lama empat bulan atau denda paling banyak Rp 1 juta.");
            isipsl2.setText("Setiap pengendara kendaraan bermotor yang memiliki SIM namun tak dapat menunjukkannya saat razia dipidana dengan pidana kurungan paling lama satu bulan atau denda paling banyak Rp 250 ribu.");
            isipsl3.setText("Setiap pengendara kendaraan bermotor yang tak dipasangi Tanda Nomor Kendaraan dipidana dengan pidana kurungan paling lama dua bulan atau denda paling banyak Rp 500 ribu.");
            isipsl4.setText("Setiap pengendara sepeda motor yang tidak memenuhi persyaratan teknis dan laik jalan seperti spion, lampu utama, lampu rem, klakson, pengukur kecepatan, dan knalpot dipidana dengan pidana kurungan paling lama satu bulan atau denda paling banyak Rp 250 ribu.");
            isipsl5.setText("Setiap pengendara mobil yang tidak memenuhi persyaratan teknis seperti spion, klakson, lampu utama, lampu mundur, lampu rem, kaca depan, bumper, penghapus kaca dipidana dengan pidana kurungan paling lama dua bulan atau denda paling banyak Rp 500 ribu.");
            isipsl6.setText("Setiap pengendara mobil yang tidak dilengkapi dengan perlengkapan berupa ban cadangan, segitiga pengaman, dongkrak, pembuka roda, dan peralatan pertolongan pertama pada kecelakaan dipidana dengan pidana kurungan paling lama satu bulan atau denda paling banyak Rp 250 ribu.");
            isipsl7.setText("Setiap pengendara yang melanggar rambu lalu lintas dipidana dengan pidana kurungan paling lama dua bulan atau denda paling banyak Rp 500 ribu.");
            isipsl8.setText("Setiap pengendara yang melanggar aturan batas kecepatan paling tinggi atau paling rendah dipidana dengan pidana kurungan paling lama dua bulan atau denda paling banyak Rp 500 ribu.");
            isipsl9.setText("Setiap pengendara yang tidak dilengkapi Surat Tanda Nomor Kendaraan Bermotor atau Surat Tanda Coba Kendaraan Bermotor dipidana dengan pidana kurungan paling lama dua bulan atau denda paling banyak Rp 500 ribu.");
            isipsl10.setText("Setiap pengemudi atau penumpang yang duduk di samping pengemudi mobil tak mengenakan sabuk keselamatan dipidana dengan pidana kurungan paling lama satu bulan atau denda paling banyak Rp 250 ribu.");
            isipsl11.setText("Setiap pengendara atau penumpang sepeda motor yang tak mengenakan helm standar nasional dipidana dengan pidana kurungan paling lama satu bulan atau denda paling banyak Rp 250 ribu.");
            isipsl12.setText("Setiap orang yang mengemudikan kendaraan bermotor di jalan tanpa menyalakan lampu utama pada malam hari dan kondisi tertentu sebagaimana dimaksud dalam Pasal 107 ayat (1) dipidana dengan pidana kurungan paling lama satu bulan atau denda paling banyak Rp 250 ribu.");
            isipsl13.setText("Setiap orang yang mengemudikan sepeda motor di jalan tanpa menyalakan lampu utama pada siang hari sebagaimana dimaksud dalam Pasal 107 ayat (2) dipidana dengan pidana kurungan paling lama 15 hari atau denda paling banyak Rp 100 ribu.");
            isipsl14.setText("Setiap pengendara sepeda motor yang akan berbelok atau balik arah tanpa memberi isyarat lampu dipidana kurungan paling lama satu bulan atau denda paling banyak Rp 250 ribu.");
        }
    }
    @Override
    public void onBackPressed() {
        Intent gomenup = new Intent( UULaLinMain.this, MenuPilihMain.class);
        startActivity(gomenup);
        finish();
    }
}


