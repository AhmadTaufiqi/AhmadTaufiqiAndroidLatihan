package com.kipli.latintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSms = findViewById(R.id.btn_sms);
        btnSms.setOnClickListener(this);

        Button btnDialPolisi = findViewById(R.id.btn_dial_polisi);
        btnDialPolisi.setOnClickListener(this);

        Button btnDialAyah = findViewById(R.id.btn_dial_ayah);
        btnDialAyah.setOnClickListener(this);

        Button btnDialIbu = findViewById(R.id.btn_dial_ibu);
        btnDialIbu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.btn_sms:
                String SmsNoIbu = "089827166662";
                String SmsNoAyah = "081210841382";
                String isiPesan="Pesan darurat di kirim oleh pemilik hp ini";
                Intent smsIntent = new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms",SmsNoIbu + SmsNoAyah,null));
                smsIntent.putExtra("sms_body",isiPesan);
                startActivity(smsIntent);
                break;

            case R.id.btn_dial_polisi:
                String NomorPolisi = "911";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+NomorPolisi));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_dial_ayah:
                String NomorAyah = "081210841382";
                Intent dialAyahIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+NomorAyah));
                startActivity(dialAyahIntent);
                break;

            case R.id.btn_dial_ibu:
                String NomorIbu = "089827166662";
                Intent dialIbuIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+NomorIbu));
                startActivity(dialIbuIntent);
                break;
        }
    }
}