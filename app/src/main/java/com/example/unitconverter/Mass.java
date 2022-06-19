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

public class Mass extends AppCompatActivity {

    private Button btnCalculate;
    private RadioButton btnMetric,  btnKilogram, btnGram , getBtnMetric11, getBtnKilogram11 , getBtnGram11;
    private EditText editTextValue;
    private TextView textViewAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass);

        getSupportActionBar().hide();

        btnCalculate = findViewById(R.id.button2);
        btnMetric = findViewById(R.id.btnMetric);
        btnKilogram = findViewById(R.id.btnKiloGram);
        btnGram = findViewById(R.id.btnGram);
        getBtnMetric11 = findViewById(R.id.btnMetric1);
        getBtnKilogram11 = findViewById(R.id.btnKiloGram1);
        getBtnGram11 = findViewById(R.id.btnGram1);
        textViewAns = findViewById(R.id.tvAns2);
        editTextValue = findViewById(R.id.editTextNumber2);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);


        btnMetric.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (getBtnMetric11.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Mass.this, "don't select same degree", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnKilogram.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (getBtnKilogram11.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Mass.this, "don't select same degree", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnGram.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (getBtnGram11.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Mass.this, "don't select same degree", Toast.LENGTH_SHORT).show();
                }

            }

        });

        getBtnMetric11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnMetric.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Mass.this, "don't select same degree", Toast.LENGTH_SHORT).show();
                }


            }
        });

        getBtnKilogram11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnKilogram.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Mass.this, "don't select same degree", Toast.LENGTH_SHORT).show();
                }


            }
        });

        getBtnKilogram11.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnKilogram.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Mass.this, "don't select same degree", Toast.LENGTH_SHORT).show();
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

                    if (btnMetric.isChecked() && getBtnKilogram11.isChecked()) {
                        d = celsius *1000;
                        textViewAns.setText("Metric/KiloG" + "=" + d);

                    } else if (btnMetric.isChecked() && getBtnGram11.isChecked()) {
                        d = celsius *1e+6;
                        textViewAns.setText("Metric/Gram" + "=" + d);
                    } else if (btnKilogram.isChecked() && getBtnMetric11.isChecked()) {
                        d =celsius /1000;
                        textViewAns.setText("KiloG/Metric" + "=" + d);
                    } else if (btnKilogram.isChecked() &&getBtnGram11.isChecked()) {
                        d = celsius *1000;
                        textViewAns.setText("KiloG/Gram" + "=" + d);
                    } else if (btnGram.isChecked() && getBtnMetric11.isChecked()) {
                        d = celsius /1e+6;
                        textViewAns.setText("Gram/Metric" + "=" + d);
                    } else if (btnGram.isChecked() &&getBtnKilogram11.isChecked()) {
                        d = celsius /1000;
                        textViewAns.setText("Gram/KiloG" + "=" + d);
                    } else {
                        Toast.makeText(Mass.this, "please select and enter", Toast.LENGTH_LONG).show();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }



            }

        });

    }
}