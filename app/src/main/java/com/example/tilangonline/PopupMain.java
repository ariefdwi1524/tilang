package com.example.tilangonline;


import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class PopupMain extends UtamaMain implements View.OnClickListener{

    Button btn_mlgrll, btn_tdkhelm, btn_tdkmjksim, btn_tdkpkplat, btn_mtrtdktkns,
            btn_mbltdktkns, btn_mbltdklengkap, btn_mlgrkcptn, btn_tdklkpstnk,
            btn_tdkmgnksabuk, btn_tdkmmlksim, btn_lptdknyatamalam,
            btn_lptdknyatasiang, btn_lpsein;
    String pmlgrll, ptdkhelm, ptdkmjksim, ptdkpkplat, pmtrtdktkns,
            pmbltdktkns, pmbltdklengkap, pmlgrkcptn, ptdklkpstnk,
            ptdkmgnksabuk, ptdkmmlksim, plptdknyatamalam, plptdknyatasiang, plpsein;
    String jmlgrll, jtdkhelm, jtdkmjksim, jtdkpkplat, jmtrtdktkns,
            jmbltdktkns, jmbltdklengkap, jmlgrkcptn, jtdklkpstnk,
            jtdkmgnksabuk, jtdkmmlksim, jlptdknyatamalam, jlptdknyatasiang, jlpsein;
    String dmlgrll, dtdkhelm, dtdkmjksim, dtdkpkplat, dmtrtdktkns, dmbltdktkns,
            dmbltdklengkap, dmlgrkcptn, dtdklkpstnk, dtdkmgnksabuk,
            dtdkmmlksim, dlptdknyatamalam, dlptdknyatasiang, dlpsein;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        pmlgrll = "Pasal 287 ayat 1";
        jmlgrll = "melanggar rambu lalu lintas";
        dmlgrll = "Rp.500.000";

        ptdkhelm = "Pasal 291 ayat 1 ";
        jtdkhelm = "tak mengenakan helm standar";
        dtdkhelm = "Rp.250.000";

        ptdkmjksim = "Pasal 288 ayat 2";
        jtdkmjksim = "tidak menunjukan sim saat razia";
        dtdkmjksim = "Rp.250.000";

        ptdkpkplat = "Pasal 280 ";
        jtdkpkplat = "tak dipasangi Tanda Nomor Kendaraan";
        dtdkpkplat = "Rp.500.000";

        pmtrtdktkns = "Pasal 285 ayat 1";
        jmtrtdktkns = "motor tidak memenuhi persyaratan teknis";
        dmtrtdktkns = "Rp.250.000";

        pmbltdktkns = "Pasal 285 ayat 2";
        jmbltdktkns = "mobil tidak memenuhi persyaratan teknis";
        dmbltdktkns = "Rp.500.000";

        pmbltdklengkap = "Pasal 278";
        jmbltdklengkap = "mobil tidak dilengkapi dengan perlengkapan";
        dmbltdklengkap = "Rp.250.000";

        pmlgrkcptn = "Pasal 287 ayat 5";
        jmlgrkcptn = "melanggar kecepatan paling tinggi atau paling rendah";
        dmlgrkcptn = "Rp.500.000";

        ptdklkpstnk = "Pasal 288 ayat 1 ";
        jtdklkpstnk = "tidak dilengkapi STNK Bermotor";
        dtdklkpstnk = "Rp.500.000";

        ptdkmgnksabuk = "Pasal 289 ";
        jtdkmgnksabuk = "pengemudi atau penumpang mobil tak mengenakan sabuk keselamatan";
        dtdkmgnksabuk = "Rp.250.000";

        ptdkmmlksim = "Pasal 281 ";
        jtdkmmlksim = "pengendara tidak memiliki SIM";
        dtdkmmlksim = "Rp.1.000.000";

        plptdknyatamalam = "Pasal 293 ayat 1";
        jlptdknyatamalam = "tidak menyalakan lampu utama pada malam hari dan kondisi tertentu";
        dlptdknyatamalam = "Rp.250.000";

        plptdknyatasiang = "Pasal 293 ayat 2";
        jlptdknyatasiang = "tidak menyalakan lampu utama pada siang hari ";
        dlptdknyatasiang = "Rp.100.000";

        plpsein = "Pasal 294";
        jlpsein = "berbelok atau balik arah tanpa memberi isyarat lampu";
        dlpsein = "Rp.250.000";



        btn_mlgrll = (Button)findViewById(R.id.btn_mlgrll);
        btn_mlgrll.setOnClickListener(this);

        btn_tdkhelm = (Button)findViewById(R.id.btn_tdkhelm);
        btn_tdkhelm.setOnClickListener(this);

        btn_tdkmjksim = (Button)findViewById(R.id.btn_tdkmjksim);
        btn_tdkmjksim.setOnClickListener(this);

        btn_tdkpkplat = (Button)findViewById(R.id.btn_tdkpkplat);
        btn_tdkpkplat.setOnClickListener(this);

        btn_mtrtdktkns = (Button)findViewById(R.id.btn_mtrtdktkns);
        btn_mtrtdktkns.setOnClickListener(this);

        btn_mbltdktkns = (Button)findViewById(R.id.btn_mbltdktkns);
        btn_mbltdktkns.setOnClickListener(this);

        btn_mbltdklengkap = (Button)findViewById(R.id.btn_mbltdklengkap);
        btn_mbltdklengkap.setOnClickListener(this);

        btn_mlgrkcptn = (Button)findViewById(R.id.btn_mlgrkcptn);
        btn_mlgrkcptn.setOnClickListener(this);

        btn_tdklkpstnk = (Button)findViewById(R.id.btn_tdklkpstnk);
        btn_tdklkpstnk.setOnClickListener(this);

        btn_tdkmgnksabuk = (Button)findViewById(R.id.btn_tdkmgnksabuk);
        btn_tdkmgnksabuk.setOnClickListener(this);

        btn_tdkmmlksim = (Button)findViewById(R.id.btn_tdkmmlksim);
        btn_tdkmmlksim.setOnClickListener(this);

        btn_lptdknyatamalam = (Button)findViewById(R.id.btn_lptdknyatamalam);
        btn_lptdknyatamalam.setOnClickListener(this);

        btn_lptdknyatasiang = (Button)findViewById(R.id.btn_lptdknyatasiang);
        btn_lptdknyatasiang.setOnClickListener(this);

        btn_lpsein = (Button)findViewById(R.id.btn_lpsein);
        btn_lpsein.setOnClickListener(this);


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int heigth = dm.widthPixels;

        getWindow().setLayout((int) (width * .8), (int) (heigth * .7));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x = 0;
        params.y = -20;

        getWindow().setAttributes(params);


    }

    public void onClick(View v){
        if (v==btn_mlgrll){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal287.1",pmlgrll);
            i.putExtra("melanggarlalin",jmlgrll);
            i.putExtra("denda287.1",dmlgrll);
            startActivity(i);
        }

        if (v==btn_tdkhelm){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("Pasal291.1",ptdkhelm);
            i.putExtra("tdkhelm",jtdkhelm);
            i.putExtra("denda291.1",dtdkhelm);
            startActivity(i);
        }

        if (v==btn_tdkmjksim){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal288.2",ptdkmjksim);
            i.putExtra("tdkmjksim",jtdkmjksim);
            i.putExtra("denda288.2",dtdkmjksim);
            startActivity(i);
        }

        if (v==btn_tdkpkplat){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal280",ptdkpkplat);
            i.putExtra("tdkpkplat",jtdkpkplat);
            i.putExtra("denda280",dtdkpkplat);
            startActivity(i);
        }

        if (v==btn_mtrtdktkns){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal285.1",pmtrtdktkns);
            i.putExtra("mtrtdktkns",jmtrtdktkns);
            i.putExtra("denda285.1",dmtrtdktkns);
            startActivity(i);
        }

        if (v==btn_mbltdktkns){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal285.2",pmbltdktkns);
            i.putExtra("mbltdktkns",jmbltdktkns);
            i.putExtra("denda285.2",dmbltdktkns);
            startActivity(i);
        }

        if (v==btn_mbltdklengkap){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal278",pmbltdklengkap);
            i.putExtra("mbltdklengkap",jmbltdklengkap);
            i.putExtra("denda278",dmbltdklengkap);
            startActivity(i);
        }

        if (v==btn_mlgrkcptn){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal287.5",pmlgrkcptn);
            i.putExtra("mlgrkcptn",jmlgrkcptn);
            i.putExtra("denda287.5",dmlgrkcptn);
            startActivity(i);
        }

        if (v==btn_tdklkpstnk){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal288.1",ptdklkpstnk);
            i.putExtra("tdklkpstnk",jtdklkpstnk);
            i.putExtra("denda288.1",dtdklkpstnk);
            startActivity(i);
        }

        if (v==btn_tdkmgnksabuk){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal289",ptdkmgnksabuk);
            i.putExtra("tdkmgnksabuk",jtdkmgnksabuk);
            i.putExtra("denda289",dtdkmgnksabuk);
            startActivity(i);
        }

        if (v==btn_tdkmmlksim){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal281",ptdkmmlksim);
            i.putExtra("tdkmmlksim",jtdkmmlksim);
            i.putExtra("denda281",dtdkmmlksim);
            startActivity(i);
        }

        if (v==btn_lptdknyatamalam){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal293.1",plptdknyatamalam);
            i.putExtra("lptdknyatamalam",jlptdknyatamalam);
            i.putExtra("denda293.1",dlptdknyatamalam);
            startActivity(i);
        }

        if (v==btn_lptdknyatasiang){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal293.2",plptdknyatasiang);
            i.putExtra("lptdknyatasiang",jlptdknyatasiang);
            i.putExtra("denda293.2",dlptdknyatasiang);
            startActivity(i);
        }

        if (v==btn_lpsein){
            Intent i = new Intent(getApplicationContext(), UtamaMain.class);
            i.putExtra("pasal294",plpsein);
            i.putExtra("lpsein",jlpsein);
            i.putExtra("denda294",dlpsein);
            startActivity(i);
        }


    }
}

