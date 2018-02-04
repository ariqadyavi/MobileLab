package com.example.asus.ariqadyavi_1202153376_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editUduk, editJumlah; //untuk deklarasi objek
    Button btn_abnormal, btn_eatbus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUduk = findViewById(R.id.edit_uduk);
        editJumlah = findViewById(R.id.edit_jumlah);
        btn_eatbus = findViewById(R.id.btn_eatbus);
        btn_abnormal = findViewById(R.id.btn_abnormal);

       btn_eatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lanjut = new Intent(MainActivity.this, SecondActivity.class);
                lanjut.putExtra("namatempat", "EATBUS");
                lanjut.putExtra("namamenu", editUduk.getText().toString());
                lanjut.putExtra("jumlahporsi", editJumlah.getText().toString());
                lanjut.putExtra("totalharga", "50000");
                startActivity(lanjut);
            }
        });

        btn_abnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanjut = new Intent(MainActivity.this,SecondActivity.class);
                lanjut.putExtra("namatempat", "ABNORMAL");
                lanjut.putExtra("namamenu", editUduk.getText().toString());
                lanjut.putExtra("jumlahporsi", editJumlah.getText().toString());
                lanjut.putExtra("totalharga", "30000");
                startActivity(lanjut);
            }
        });

    }
}
