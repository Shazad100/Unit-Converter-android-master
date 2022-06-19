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

public class Volume extends AppCompatActivity {

    private Button btnCalculate;
    private RadioButton btnUSgal,  btnUSquart, btnUSpint , btnUSgal1, btnUSquart1 ,btnUSpint1;
    private EditText editTextValue;
    private TextView textViewAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);

        getSupportActionBar().hide();

        btnCalculate = findViewById(R.id.button4);
        btnUSgal = findViewById(R.id.btnUSgal);
        btnUSquart = findViewById(R.id.btnUSqauart);
        btnUSpint = findViewById(R.id.btnUSpint);
        btnUSgal1 = findViewById(R.id.btnUSgal1);
        btnUSquart1 = findViewById(R.id.btnUSqauart1);
        btnUSpint1 = findViewById(R.id.btnUSpint1);
        textViewAns = findViewById(R.id.tvAns4);
        editTextValue = findViewById(R.id.editTextNumber4);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);


        btnUSgal.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnUSgal1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Volume.this, "don't select same", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnUSquart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnUSquart1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Volume.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnUSpint.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnUSpint1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Volume.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnUSgal1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnUSgal.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Volume.this, "don't select same", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnUSquart1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnUSquart.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Volume.this, "don't select same", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnUSpint1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnUSpint.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Volume.this, "don't select same", Toast.LENGTH_SHORT).show();
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

                    if (btnUSgal.isChecked() && btnUSquart1.isChecked()) {
                        d = celsius *4;
                        textViewAns.setText("USgal/USquart" + "=" + d);

                    } else if (btnUSgal.isChecked() && btnUSpint1.isChecked()) {
                        d = celsius *8;
                        textViewAns.setText("USgal/USpint" + "=" + d);
                    } else if (btnUSquart.isChecked() && btnUSgal1.isChecked()) {
                        d =celsius /4;
                        textViewAns.setText("USquart/USgal" + "=" + d);
                    } else if (btnUSquart.isChecked() &&btnUSpint1.isChecked()) {
                        d = celsius*2;
                        textViewAns.setText("USquart/USpint" + "=" + d);
                    } else if (btnUSpint.isChecked() && btnUSgal1.isChecked()) {
                        d = celsius/8;
                        textViewAns.setText("USpint/USgal" + "=" + d);
                    } else if (btnUSpint.isChecked() &&btnUSquart1.isChecked()) {
                        d = celsius/2;
                        textViewAns.setText("USgal/USquart" + "=" + d);
                    } else {
                        Toast.makeText(Volume.this, "please select and enter", Toast.LENGTH_LONG).show();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }



            }

        });
    }
}