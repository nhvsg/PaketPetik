package com.example.pakettttt;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
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

    private Spinner spinnertanggal,spinnerbulan,spinnertahun,spinnerpengirimang;
    private ChipGroup chipGroup;

    private TextView text;

    private List<Chip> chipList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_paket);

        spinnertanggal = findViewById(R.id.spinnertanggal);
        spinnerbulan = findViewById(R.id.spinnerbulan);
        spinnertahun = findViewById(R.id.spinnertahun);
        spinnerpengirimang = findViewById(R.id.spinnerPengiriman);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.
                createFromResource(getApplicationContext(),
                        R.array.tanggals,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnertanggal.setAdapter(adapter);
        spinnertanggal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        adapter.getItem(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

        ArrayAdapter<CharSequence> adapterbulan = ArrayAdapter.
                createFromResource(getApplicationContext(),
                        R.array.bulans,android.R.layout.simple_spinner_item);
        adapterbulan.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerbulan.setAdapter(adapterbulan);
        spinnerbulan.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        adapter.getItem(position),Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter<CharSequence> adaptertahun = ArrayAdapter.
                createFromResource(getApplicationContext(),
                        R.array.tahuns,android.R.layout.simple_spinner_item);
        adaptertahun.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnertahun.setAdapter(adaptertahun);
        spinnertahun.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        adapter.getItem(position),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        ArrayAdapter<CharSequence> spinnerpengirim = ArrayAdapter.createFromResource
                (getApplicationContext(),
                R.array.pengirimans,android.R.layout.simple_spinner_item);
        spinnerpengirim.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerpengirimang.setAdapter(spinnerpengirim);
        spinnerpengirimang.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),
                        adapter.getItem(position),Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });











    }
}