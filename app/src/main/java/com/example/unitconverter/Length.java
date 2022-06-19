package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Length extends AppCompatActivity {

    Button btnCalculate;
    RadioButton btnKilo,  btnMeter, btnCenti , btnKilo11, btnMeter11 , btnCenti11;
    EditText editTextValue;
    TextView textViewAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        getSupportActionBar().hide();

        btnCalculate = findViewById(R.id.button1);
        btnKilo = findViewById(R.id.btnKilo);
        btnMeter = findViewById(R.id.btnMeter);
        btnCenti = findViewById(R.id.btnCenti);
        btnKilo11 = findViewById(R.id.btnKilo1);
        btnMeter11 = findViewById(R.id.btnMeter1);
        btnCenti11 = findViewById(R.id.btnCenti1);
        textViewAns = findViewById(R.id.tvAns1);
        editTextValue = findViewById(R.id.editTextNumber1);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);


        btnKilo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnKilo11.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Length.this, "don't select same", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnMeter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnMeter11.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Length.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnCenti.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnCenti11.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Length.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnKilo11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnKilo.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Length.this, "don't select same", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnMeter11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnMeter.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Length.this, "don't select same", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnCenti11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnCenti.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Length.this, "don't select same", Toast.LENGTH_SHORT).show();
                }


            }
        });


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String s = editTextValue.getText().toString();
                    int celsius = Integer.parseInt(s);

                    double d;

                    if (btnKilo.isChecked() && btnMeter11.isChecked()) {
                        d = celsius *1000;
                        textViewAns.setText("Kilo/Meter" + "=" + d);

                    } else if (btnKilo.isChecked() && btnCenti11.isChecked()) {
                        d = celsius*10000;
                        textViewAns.setText("Kilo/Centi" + "=" + d);
                    } else if (btnMeter.isChecked() && btnKilo11.isChecked()) {
                        d = celsius/1000;
                        textViewAns.setText("Meter/Kilo" + "=" + d);
                    } else if (btnMeter.isChecked() && btnCenti11.isChecked()) {
                        d = celsius *100;
                        textViewAns.setText("Meter/Centi" + "=" + d);
                    } else if (btnCenti.isChecked() && btnKilo11.isChecked()) {
                        d = celsius /100000;
                        textViewAns.setText("Centi/Kilo" + "=" + d);
                    } else if (btnCenti.isChecked() && btnMeter11.isChecked()) {
                        d = celsius *100;
                        textViewAns.setText("Centi/Meter" + "=" + d);
                    } else {
                        Toast.makeText(Length.this, "please select and enter value", Toast.LENGTH_LONG).show();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }



            }

        });

    }
}