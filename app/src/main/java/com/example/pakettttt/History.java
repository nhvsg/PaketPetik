package com.example.pakettttt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class History extends AppCompatActivity {

    protected TextView inputan;

    protected Spinner spinnertgl,spinnerbln,spinnerthn;

    protected String tanggal,bulan,tahun,tanggallengkap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        Intent intent = getIntent();

        String namapenerima = intent.getStringExtra("namapenerima");
        String isipesan = intent.getStringExtra("isipesan");
        String tanggal = intent.getStringExtra("tanggal");
        String bulan = intent.getStringExtra("bulan");
        String tahun = intent.getStringExtra("tahun");
        String pengirim = intent.getStringExtra("pengirim");

        TableLayout tableLayout = findViewById(R.id.tabellayout);

        // Membuat TableRow baru
        TableRow newRow = new TableRow(this);

        // Membuat TextView untuk setiap nilai yang diterima
        TextView namaPenerimaTextView = new TextView(this);
        namaPenerimaTextView.setText(namapenerima);

        TextView isiPaketTextView = new TextView(this);
        isiPaketTextView.setText(isipesan);

        TextView tanggalTextView = new TextView(this);
        tanggalTextView.setText(tanggal + " " + bulan + " " + tahun);

        TextView pengirimTextview = new TextView(this);
        pengirimTextview.setText(pengirim);


        newRow.addView(namaPenerimaTextView);
        newRow.addView(isiPaketTextView);
        newRow.addView(tanggalTextView);
        newRow.addView(pengirimTextview);

        tableLayout.addView(newRow);
    }
}