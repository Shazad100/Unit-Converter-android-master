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

public class Area extends AppCompatActivity {

    private Button btnCalculate;
    private RadioButton btnSquare,  btnHectare, btnSquareM , btnSquare1, btnHectare1 ,btnSquareM1;
    private EditText editTextValue;
    private TextView textViewAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        getSupportActionBar().hide();
        btnCalculate=findViewById(R.id.button5);
        btnSquare = findViewById(R.id.btnSquare);
        btnHectare = findViewById(R.id.btnHectare);
        btnSquareM = findViewById(R.id.btnSquareM);
        btnSquare1 = findViewById(R.id.btnSquare1);
        btnHectare1 = findViewById(R.id.btnHectare1);
        btnSquareM1=findViewById(R.id.btnSquareM1);
        textViewAns = findViewById(R.id.tvAns5);
        editTextValue = findViewById(R.id.editTextNumber5);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);



        btnSquare.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnSquare1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Area.this, "don't select same", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnHectare.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnHectare1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Area.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnSquareM.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnSquareM1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Area.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnSquare1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnSquare.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Area.this, "don't select same", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnHectare1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnHectare.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Area.this, "don't select same", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnSquareM1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnSquareM.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Area.this, "don't select same", Toast.LENGTH_SHORT).show();
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

                    if (btnSquare.isChecked() && btnHectare1.isChecked()) {
                        d = celsius *1000;
                        textViewAns.setText("Sqr/Hec" + "=" + d);

                    } else if (btnSquare.isChecked() && btnSquareM1.isChecked()) {
                        d = celsius*10000;
                        textViewAns.setText("Sqr/SM" + "=" + d);
                    } else if (btnHectare.isChecked() && btnSquare1.isChecked()) {
                        d = celsius/1000;
                        textViewAns.setText("Hec/Sqr" + "=" + d);
                    } else if (btnHectare.isChecked() && btnSquareM1.isChecked()) {
                        d = celsius *100;
                        textViewAns.setText("Hec/SM" + "=" + d);
                    } else if (btnSquareM.isChecked() && btnSquare1.isChecked()) {
                        d = celsius /100000;
                        textViewAns.setText("SM/Sqr" + "=" + d);
                    } else if (btnSquareM.isChecked() && btnHectare1.isChecked()) {
                        d = celsius *100;
                        textViewAns.setText("SM/Hec" + "=" + d);
                    } else {
                        Toast.makeText(Area.this, "please select and enter", Toast.LENGTH_LONG).show();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }



            }

        });
    }
}