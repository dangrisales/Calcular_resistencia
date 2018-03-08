package com.danielescobar.calcular_resistencia;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tFranja1, tFranja2, tFranja3, tFranja4, tResistencia;
    Double val_res;
    String franja1, franja2, franja3, franja4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tFranja1 = findViewById(R.id.t1franja1);
        tFranja2 = findViewById(R.id.t2franja2);
        tFranja3 = findViewById(R.id.t3franja3);
        tFranja4 = findViewById(R.id.t4franja4);
        tResistencia = findViewById(R.id.tresistencia);
        tFranja1.setBackgroundResource(R.color.saddlebrown);
        franja1 = "1";
        tFranja2.setBackgroundResource(R.color.black);
        franja2 = "0";
        tFranja3.setBackgroundResource(R.color.black);
        franja3 = "0";
        tFranja4.setBackgroundResource(R.color.saddlebrown);
        franja4 = "1";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked1f1(View view) {
        tFranja1.setBackgroundResource(R.color.saddlebrown);
        franja1 = "1";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked2f1(View view) {
        tFranja1.setBackgroundResource(R.color.red);
        franja1 = "2";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked3f1(View view) {
        tFranja1.setBackgroundResource(R.color.darkorange);
        franja1 = "3";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked4f1(View view) {
        tFranja1.setBackgroundResource(R.color.yellow);
        franja1 = "4";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked5f1(View view) {

        tFranja1.setBackgroundResource(R.color.lime);
        franja1 = "5";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked6f1(View view) {
        tFranja1.setBackgroundResource(R.color.blue);
        franja1 = "6";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked7f1(View view) {
        tFranja1.setBackgroundResource(R.color.mediumvioletred);
        franja1 = "7";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked8f1(View view) {
        tFranja1.setBackgroundResource(R.color.gray);
        franja1 = "8";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked9f1(View view) {
        tFranja1.setBackgroundResource(R.color.whitesmoke);
        franja1 = "9";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked0f2(View view) {
        tFranja2.setBackgroundResource(R.color.black);
        franja2 = "0";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked1f2(View view) {
        tFranja2.setBackgroundResource(R.color.saddlebrown);
        franja2 = "1";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked2f2(View view) {
        tFranja2.setBackgroundResource(R.color.red);
        franja2 = "2";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked3f2(View view) {
        tFranja2.setBackgroundResource(R.color.darkorange);
        franja2 = "3";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked4f2(View view) {
        tFranja2.setBackgroundResource(R.color.yellow);
        franja2 = "4";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked5f2(View view) {

        tFranja2.setBackgroundResource(R.color.lime);
        franja2 = "5";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked6f2(View view) {

        tFranja2.setBackgroundResource(R.color.blue);
        franja2 = "6";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked7f2(View view) {
        tFranja2.setBackgroundResource(R.color.mediumvioletred);
        franja2 = "7";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked8f2(View view) {

        tFranja2.setBackgroundResource(R.color.gray);
        franja2 = "8";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked9f2(View view) {
        tFranja2.setBackgroundResource(R.color.whitesmoke);
        franja2 = "9";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }

    public void onButtonClicked0f3(View view) {
        tFranja3.setBackgroundResource(R.color.black);
        franja3 = "0";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked1f3(View view) {
        tFranja3.setBackgroundResource(R.color.saddlebrown);
        franja3 = "1";
        funcion_auxiliar(franja1, franja2, franja3, franja4);


    }

    public void onButtonClicked2f3(View view) {

        tFranja3.setBackgroundResource(R.color.red);
        franja3 = "2";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked3f3(View view) {
        tFranja3.setBackgroundResource(R.color.darkorange);
        franja3 = "3";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked4f3(View view) {

        tFranja3.setBackgroundResource(R.color.yellow);
        franja3 = "4";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked5f3(View view) {
        tFranja3.setBackgroundResource(R.color.lime);
        franja3 = "5";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked6f3(View view) {
        tFranja3.setBackgroundResource(R.color.blue);
        franja3 = "6";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked7f3(View view) {
        tFranja3.setBackgroundResource(R.color.mediumvioletred);
        franja3 = "7";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked8f3(View view) {
        tFranja3.setBackgroundResource(R.color.gold);
        franja3 = "10";
        funcion_auxiliar(franja1, franja2, franja3, franja4);


    }

    public void onButtonClicked9f3(View view) {
        tFranja3.setBackgroundResource(R.color.gray);
        franja3 = "100";
        funcion_auxiliar(franja1, franja2, franja3, franja4);


    }

    public void onButtonClicked1f4(View view) {
        tFranja4.setBackgroundResource(R.color.gray);
        franja4 = "0.05";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked2f4(View view) {

        tFranja4.setBackgroundResource(R.color.limegreen);
        franja4 = "0.10";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked3f4(View view) {
        tFranja4.setBackgroundResource(R.color.blue);
        franja4 = "0.25";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked4f4(View view) {
        tFranja4.setBackgroundResource(R.color.mediumvioletred);
        franja4 = "0.5";
        funcion_auxiliar(franja1, franja2, franja3, franja4);
    }


    public void onButtonClicked5f4(View view) {
        tFranja4.setBackgroundResource(R.color.saddlebrown);
        franja4 = "1";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked6f4(View view) {
        tFranja4.setBackgroundResource(R.color.red);
        franja4 = "2";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked7f4(View view) {
        tFranja4.setBackgroundResource(R.color.gold);
        franja4 = "5";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void onButtonClicked8f4(View view) {
        tFranja4.setBackgroundResource(R.color.silver);
        franja4 = "10";
        funcion_auxiliar(franja1, franja2, franja3, franja4);

    }

    public void funcion_auxiliar(String f1, String f2, String f3, String f4) {
        String res = f1 + f2;
        float val_res;
        if (f3 == "10" || f3 == "100") {
            val_res = (float) (Integer.parseInt(res) / Integer.parseInt(f3));

        } else {
             val_res = (float) (Integer.parseInt(res) * (Math.pow(10, Integer.parseInt(f3))));
        }
        if ((val_res / 1000) < 1) {
            tResistencia.setText(String.valueOf(val_res) + " Ω" + "\n" +"±" + franja4);
        } else if (val_res / 1000000 < 1) {
            tResistencia.setText(String.valueOf(val_res / 1000) + " K" + " Ω"+"\n"+ "±" + franja4);
        } else {
            tResistencia.setText(String.valueOf(val_res / 1000000) + " M"+ " Ω"+"\n"+ "±" + franja4);
        }

    }


}
