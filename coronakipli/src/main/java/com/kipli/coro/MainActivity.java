package com.kipli.coro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView btnTips = findViewById(R.id.btn_tips);
        btnTips.setOnClickListener(this);

        CardView btnNewsUpdate = findViewById(R.id.btn_news_update);
        btnNewsUpdate.setOnClickListener(this);

        CardView btnDialAmbul = findViewById(R.id.btn_dial_ambulance);
        btnDialAmbul.setOnClickListener(this);

        CardView btnDokter = findViewById(R.id.hospital_list);
        btnDokter.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){


            case R.id.btn_tips:
                Intent tipsIntent= new Intent(MainActivity.this,TipsActivity.class);
                startActivity(tipsIntent);
                break;

            case R.id.btn_news_update:
                Uri webpage = Uri.parse("https://nasional.kompas.com/read/2020/04/05/15562001/update-total-kasus-covid-19-di-indonesia-ada-2273-bertambah-181");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
                break;

            case R.id.btn_dial_ambulance:
                String NomorAmbulance = "119";
                Intent dialAmbulanceIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+NomorAmbulance));
                startActivity(dialAmbulanceIntent);
                break;
            case R.id.hospital_list:
                Intent dokterIntent= new Intent(MainActivity.this, HospitalActivity.class);
                startActivity(dokterIntent);
        }
    }
}