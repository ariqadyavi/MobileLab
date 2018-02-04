package com.example.asus.ariqadyavi_1202153376_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView name;
    TextView menu;
    TextView porsi;
    TextView harga;
    private  final int saldo = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        name = findViewById(R.id.namatempat);
        menu = findViewById(R.id.namamakanan);
        porsi = findViewById(R.id.totalporsi);
        harga = findViewById(R.id.totalharga);

        Intent y = getIntent();

        String namatempat = y.getStringExtra("namatempat");
        String namamenu = y.getStringExtra("namamenu");
        String jumlahporsi = y.getStringExtra("jumlahporsi");
        String totalharga = y.getStringExtra("totalharga");

        int totalHarga = Integer.valueOf(totalharga) * Integer.valueOf(jumlahporsi);

        name.setText(namatempat);
        menu.setText(namamenu);
        porsi.setText(jumlahporsi);
        harga.setText(String.valueOf(totalHarga));

        if (totalHarga <= saldo){
            Toast.makeText(this, "Disini saja makan malamnya", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this,"Jangan disini makan malamnua, uang kamu tidak cukup", Toast.LENGTH_LONG).show();
        }
    }
}