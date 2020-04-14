package com.kipli.coro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import adapter.BiggerViewHospitalAdapter;
import adapter.ListHospitalAdapter;
import data.HospitalData;
import models.Hospital;

public class HospitalActivity extends AppCompatActivity {
private RecyclerView rvDokter;
private ArrayList<Hospital> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dokter);

        rvDokter = findViewById(R.id.rv_dokter);
        rvDokter.setHasFixedSize(true);
        list.addAll(HospitalData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvDokter.setLayoutManager(new LinearLayoutManager(this));
        ListHospitalAdapter listHospitalAdapter = new ListHospitalAdapter(list);
        rvDokter.setAdapter(listHospitalAdapter);
    }

    private void showRecyclerBiggerView(){
        rvDokter.setLayoutManager(new LinearLayoutManager(this));
        BiggerViewHospitalAdapter biggerViewHospitalAdapter = new BiggerViewHospitalAdapter(list);
        rvDokter.setAdapter(biggerViewHospitalAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.view_mode, menu);
    return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.simple_view:
                showRecyclerList();
                break;

            case R.id.detailed_view:
                showRecyclerBiggerView();
                break;
        }
    }
}
