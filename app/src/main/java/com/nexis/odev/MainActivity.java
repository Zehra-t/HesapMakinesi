package com.nexis.odev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button_C,button_parantez_a,button_parantez_k,button_bolme;
    Button button_7,button_8,button_9,button_carpma;
    Button button_4,button_5,button_6,button_cikarma;
    Button button_1,button_2,button_3,button_toplama;
    Button button_AC,button_0,button_nokta,button_esittir;
    TextView cozum,sonuc;
    float sayi1,sayi2;
    boolean topla,cikar,bol,carp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cozum=findViewById(R.id.cozum);
        sonuc=findViewById(R.id.sonuc);

        button_C=(Button) findViewById(R.id.button_C);
        button_parantez_a=(Button) findViewById(R.id.button_parantez_a);
        button_parantez_k=(Button) findViewById(R.id.button_parantez_k);
        button_bolme=(Button) findViewById(R.id.button_bolme);
        button_7=(Button) findViewById(R.id.button_7);
        button_8=(Button) findViewById(R.id.button_8);
        button_9=(Button) findViewById(R.id.button_9);
        button_carpma=(Button) findViewById(R.id.button_carpma);
        button_4=(Button) findViewById(R.id.button_4);
        button_5=(Button) findViewById(R.id.button_5);
        button_6=(Button) findViewById(R.id.button_6);
        button_cikarma=(Button) findViewById(R.id.button_cikarma);
        button_1=(Button) findViewById(R.id.button_1);
        button_2=(Button) findViewById(R.id.button_2);
        button_3=(Button) findViewById(R.id.button_3);
        button_toplama=(Button) findViewById(R.id.button_toplama);
        button_AC=(Button) findViewById(R.id.button_AC);
        button_0=(Button) findViewById(R.id.button_0);
        button_nokta=(Button) findViewById(R.id.button_nokta);
        button_esittir=(Button) findViewById(R.id.button_esittir);

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"1");
                cozum.setText(sonuc.getText());
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"2");
                cozum.setText(sonuc.getText());
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"3");
                cozum.setText(sonuc.getText());
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"4");
                cozum.setText(sonuc.getText());
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"5");
                cozum.setText(sonuc.getText());
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"6");
                cozum.setText(sonuc.getText());
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"7");
                cozum.setText(sonuc.getText());
            }
        });button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"8");
                cozum.setText(sonuc.getText());
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"9");
                cozum.setText(sonuc.getText());
            }
        });
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"0");
                cozum.setText(sonuc.getText());
            }
        });
        button_nokta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+".");
                cozum.setText(sonuc.getText());
            }
        });
        button_parantez_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+"(");
                cozum.setText(sonuc.getText());
            }
        });
        button_parantez_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText(sonuc.getText()+")");
                cozum.setText(sonuc.getText());
            }
        });

        button_AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonuc.setText("");
            }
        });
        button_toplama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc==null){
                    sonuc.setText("");
                }
                else{
                    sayi1=Float.parseFloat(sonuc.getText()+"");
                    topla=true;
                    sonuc.setText(null);
                }

            }
        });
        button_cikarma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc==null){
                    sonuc.setText("");
                }
                else{
                    sayi1=Float.parseFloat(sonuc.getText()+"");
                    cikar=true;
                    sonuc.setText(null);
                }

            }
        });
        button_carpma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc==null){
                    sonuc.setText("");
                }
                else{
                    sayi1=Float.parseFloat(sonuc.getText()+"");
                    carp=true;
                    sonuc.setText(null);
                }

            }
        });
        button_bolme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sonuc==null){
                    sonuc.setText("");
                }
                else{
                    sayi1=Float.parseFloat(sonuc.getText()+"");
                    bol=true;
                    sonuc.setText(null);
                }

            }
        });
        button_esittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sayi2=Float.parseFloat(sonuc.getText()+"");
                if(topla==true){
                    sonuc.setText(sayi1+sayi2+"");
                    cozum.setText(sayi1+"+"+sayi2);
                    topla=false;
                }
                if(cikar==true){
                    sonuc.setText(sayi1-sayi2+"");
                    cozum.setText(sayi1+"-"+sayi2);
                    cikar=false;
                }
                if(bol==true){
                    sonuc.setText(sayi1/sayi2+"");
                    cozum.setText(sayi1+"/"+sayi2);
                    bol=false;
                }
                if(carp==true){
                    sonuc.setText(sayi1*sayi2+"");
                    cozum.setText(sayi1+"x"+sayi2);
                    carp=false;
                }
            }
        });
    }
}