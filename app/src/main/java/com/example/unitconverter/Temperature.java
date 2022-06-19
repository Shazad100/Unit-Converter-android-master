package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class Temperature extends AppCompatActivity {

    private Button btnCalculate;
   private   RadioButton btnCel,  btnFah, btnKelvin , btnCel1, btnFah1 , btnKelvin1;
    private EditText editTextValue;
    private TextView textViewAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        getSupportActionBar().hide();

        btnCalculate = findViewById(R.id.button);
        btnCel = findViewById(R.id.radioButton);
        btnFah = findViewById(R.id.radioButton2);
        btnKelvin = findViewById(R.id.radioButton3);
        btnCel1 = findViewById(R.id.radioButton4);
        btnFah1 = findViewById(R.id.radioButton5);
        btnKelvin1 = findViewById(R.id.radioButton6);
        textViewAns = findViewById(R.id.tvAns);
        editTextValue = findViewById(R.id.editTextNumber);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);


        btnCel.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnCel1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Temperature.this, "don't select same", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnFah.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnFah1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Temperature.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnKelvin.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnKelvin1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Temperature.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnCel1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnCel.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Temperature.this, "don't select same", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnFah1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnFah.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Temperature.this, "don't select same", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnKelvin1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnKelvin.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Temperature.this, "don't select same", Toast.LENGTH_SHORT).show();
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

                    if (btnCel.isChecked() && btnFah1.isChecked()) {
                        d = celsius * 9.0 / 5.0 + 32;
                        textViewAns.setText("Cel/Fah" + "=" + d);

                    } else if (btnCel.isChecked() && btnKelvin1.isChecked()) {
                        d = celsius + 273.15;
                        textViewAns.setText("Cel/Kel" + "=" + d);
                    } else if (btnFah.isChecked() && btnCel1.isChecked()) {
                        d = (celsius - 32) * 5.0 / 9.0;
                        textViewAns.setText("Fah/Cel" + "=" + d);
                    } else if (btnFah.isChecked() && btnKelvin1.isChecked()) {
                        d = celsius - 32 * 5.0 / 9.0 + 273.15;
                        textViewAns.setText("Fah/Kel" + "=" + d);
                    } else if (btnKelvin.isChecked() && btnCel1.isChecked()) {
                        d = celsius - 273.15;
                        textViewAns.setText("Kel/Cel" + "=" + d);
                    } else if (btnKelvin.isChecked() && btnFah1.isChecked()) {
                        d = celsius - 273.15 * 9.0 / 5.0 + 32;
                        textViewAns.setText("Kel/Fah" + "=" + d);
                    } else {
                        Toast.makeText(Temperature.this, "please select", Toast.LENGTH_LONG).show();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }



            }

        });

    }
}