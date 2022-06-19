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

public class Speed extends AppCompatActivity {

    private Button btnCalculate;
    private RadioButton btnMH,  btnFS, btnMS , btnMH1, btnFS1 ,btnMS1;
    private EditText editTextValue;
    private TextView textViewAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);

        getSupportActionBar().hide();

        btnCalculate = findViewById(R.id.button3);
        btnMH = findViewById(R.id.btnMH);
        btnFS = findViewById(R.id.btnFS);
        btnMS = findViewById(R.id.btnMS);
        btnMH1 = findViewById(R.id.btnMH1);
        btnFS1 = findViewById(R.id.btnFS1);
        btnMS1 = findViewById(R.id.btnMS1);
        textViewAns = findViewById(R.id.tvAns3);
        editTextValue = findViewById(R.id.editTextNumber3);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);


        btnMH.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnMH1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Speed.this, "don't select same", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnFS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnFS1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Speed.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnMS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnMS1.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Speed.this, "don't select same", Toast.LENGTH_SHORT).show();
                }

            }

        });

        btnMH1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnMH.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Speed.this, "don't select same ", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnFS1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnFS.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Speed.this, "don't select same ", Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnMS1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (btnMS.isChecked()) {
                    buttonView.setChecked(false);
                    Toast.makeText(Speed.this, "don't select same", Toast.LENGTH_SHORT).show();
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

                    if (btnMH.isChecked() && btnFS1.isChecked()) {
                        d = celsius *1.467;
                        textViewAns.setText("M/H/Feet/S" + "=" + d);

                    } else if (btnMH.isChecked() && btnMS1.isChecked()) {
                        d = celsius /2.237;
                        textViewAns.setText("M/H/Meter/S" + "=" + d);
                    } else if (btnFS.isChecked() && btnMH1.isChecked()) {
                        d =celsius /1.467;
                        textViewAns.setText("Feet/S/M/H" + "=" + d);
                    } else if (btnFS.isChecked() &&btnMS1.isChecked()) {
                        d = celsius/3.281;
                        textViewAns.setText("Feet/S/M/S" + "=" + d);
                    } else if (btnMS.isChecked() && btnMH1.isChecked()) {
                        d = celsius *2.237;
                        textViewAns.setText("Meter/S/M/H" + "=" + d);
                    } else if (btnMS.isChecked() &&btnFS1.isChecked()) {
                        d = celsius*3.281;
                        textViewAns.setText("Meter/S/M/H" + "=" + d);
                    } else {
                        Toast.makeText(Speed.this, "please select and enter", Toast.LENGTH_LONG).show();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }



            }

        });
    }
}