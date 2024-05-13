package com.example.pakettttt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainPaket extends AppCompatActivity {

    protected Spinner spinnertanggal,spinnerbulan,spinnertahun,spinnerpengirimang;
    protected ChipGroup chipGroup;
    protected Button kirimkan;
    protected EditText isimasuk,namamasuk;

    protected TextView text;

    protected List<Chip> chipList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_paket);

        spinnertanggal = findViewById(R.id.spinnertanggal);
        spinnerbulan = findViewById(R.id.spinnerbulan);
        spinnertahun = findViewById(R.id.spinnertahun);
        spinnerpengirimang = findViewById(R.id.spinnerPengiriman);
        isimasuk = findViewById(R.id.masukisi);
        namamasuk = findViewById(R.id.masuknama);
        kirimkan = findViewById(R.id.btnkirim);

        ArrayAdapter<CharSequence> adaptertanggal = ArrayAdapter.
                createFromResource(this,
                        R.array.tanggals,android.R.layout.simple_spinner_item);
        adaptertanggal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnertanggal.setAdapter(adaptertanggal);
        spinnertanggal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        adaptertanggal.getItem(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        ArrayAdapter<CharSequence> adapterbulan = ArrayAdapter.
                createFromResource(this,
                        R.array.bulans,android.R.layout.simple_spinner_item);
        adapterbulan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerbulan.setAdapter(adapterbulan);
        spinnerbulan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        adapterbulan.getItem(position),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> adaptertahun = ArrayAdapter.
                createFromResource(this,
                        R.array.tahuns,android.R.layout.simple_spinner_item);
        adaptertahun.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnertahun.setAdapter(adaptertahun);
        spinnertahun.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        adaptertahun.getItem(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        ArrayAdapter<CharSequence> spinnerpengirim = ArrayAdapter.createFromResource
                (this,
                R.array.pengirimans,android.R.layout.simple_spinner_item);
        spinnerpengirim.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerpengirimang.setAdapter(spinnerpengirim);
        spinnerpengirimang.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        spinnerpengirim.getItem(position),Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        kirimkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainPaket.this, History.class);


                String namapenerima = namamasuk.getText().toString();
                String isipesan = isimasuk.getText().toString();
                String tanggal = spinnertanggal.getSelectedItem().toString();
                String bulan = spinnerbulan.getSelectedItem().toString();
                String tahun = spinnertahun.getSelectedItem().toString();
                String pengirim = spinnerpengirimang.getSelectedItem().toString();



                intent.putExtra("namapenerima", namapenerima);
                intent.putExtra("isipesan", isipesan);
                intent.putExtra("tanggal", tanggal);
                intent.putExtra("bulan", bulan);
                intent.putExtra("tahun", tahun);
                intent.putExtra("pengirim", pengirim);
                startActivity(intent);



            }
        });











    }
}