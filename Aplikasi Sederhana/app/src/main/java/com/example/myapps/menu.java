package com.example.myapps;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    public void kalku(View view) {
        Intent kal = new Intent(this, MainActivity.class);
        startActivity(kal);
    }
    public void add(View view) {
        Intent tambah = new Intent(this, Tambahdata.class);
        startActivity(tambah);
    }
    public void lihat(View view) {
        Intent listdata = new Intent(this, ListData.class);
        startActivity(listdata);
        //public void lihat(View view) {
        //Toast lihatdata =  new Intent(this, ListData.class);
        //startActivity(lihat);
    }
}