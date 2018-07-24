package com.example.thrwat_zidan.example_1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button showDialog;
    TextView Tvcity1;
    TextView Tvcity2;
    TextView Tvcity3;
    TextView Tvcity4;
    TextView Tvcity5;
    TextView average;
    EditText edCity1;
    EditText edCity2;
    EditText edCity3;
    EditText edCity4;
    EditText edCity5;
    int cityAvrage,CT1,CT2,CT3,CT4,CT5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tvcity1 = (TextView)  findViewById(R.id.Tv_city1);
        Tvcity2 = (TextView)  findViewById(R.id.Tv_city2);
        Tvcity3 = (TextView)  findViewById(R.id.Tv_city3);
        Tvcity4 = (TextView)  findViewById(R.id.Tv_city4);
        Tvcity5 = (TextView)  findViewById(R.id.Tv_city5);
        average=(TextView) findViewById(R.id.Average);
        showDialog = (Button) findViewById(R.id.ShowDialog);

        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 AlertDialog.Builder alertdialig = new AlertDialog.Builder(MainActivity.this);
                View mview = getLayoutInflater().inflate(R.layout.user_input, null);
                edCity1 = (EditText) mview. findViewById(R.id.city_T1);
                edCity2 = (EditText) mview. findViewById(R.id.city_T2);
                edCity3 = (EditText) mview. findViewById(R.id.city_T3);
                edCity4 = (EditText) mview. findViewById(R.id.city_T4);
                edCity5 = (EditText) mview. findViewById(R.id.city_T5);
                alertdialig.setView(mview);
                alertdialig.setCancelable(true)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                Tvcity1. setText(edCity1.getText());
                                Tvcity2. setText(edCity2.getText());
                                Tvcity3. setText(edCity3.getText());
                                Tvcity4. setText(edCity4.getText());
                                Tvcity5. setText(edCity5.getText());
                                CT1 = Integer.parseInt(Tvcity1.getText().toString());
                                CT2 = Integer.parseInt(Tvcity2.getText().toString());
                                CT3 = Integer.parseInt(Tvcity3.getText().toString());
                                CT4 = Integer.parseInt(Tvcity4.getText().toString());
                                CT5 = Integer.parseInt(Tvcity5.getText().toString());
                                cityAvrage=(CT1+CT2+CT3+CT4+CT5)/5;
                                average.setText(String.valueOf(cityAvrage));

                            }
                        });
                Dialog dialog = alertdialig.create();

                dialog.show();


            }
        });


    }


}
