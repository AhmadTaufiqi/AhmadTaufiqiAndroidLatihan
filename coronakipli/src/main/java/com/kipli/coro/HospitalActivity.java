package com.kipli.coro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

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
        ListHospitalAdapter listDokterAdapter = new ListHospitalAdapter(list);
        rvDokter.setAdapter(listDokterAdapter);
    }

    private void showRecyclerBiggerView(){
        rvDokter.setLayoutManager(new LinearLayoutManager(this));
        BiggerViewHospitalAdapter biggerViewDokterAdapter = new BiggerViewHospitalAdapter(list);
        rvDokter.setAdapter(biggerViewDokterAdapter);
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
                break;

            case R.id.detailed_view:
                showRecyclerBiggerView();
                break;
        }
    }
}
