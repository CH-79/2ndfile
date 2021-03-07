package com.example.two_rattingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar,ratingBar2;
    TextView ftext,stext;
    Button btn;
    float a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar=findViewById(R.id.ratingBar);
        ratingBar2=findViewById(R.id.ratingBar2);
        ftext=findViewById(R.id.ftext);
        stext=findViewById(R.id.stext);
        btn=findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a=ratingBar.getRating();
                b=ratingBar2.getRating();

                ftext.setText( "1st Ratinbar point is" + a+" 2nd Ratingbar point is" + b);
                c= a + b;
                stext.setText(String.valueOf(c));
                Toast.makeText(MainActivity.this,"Total value"+c,Toast.LENGTH_LONG).show();

            }
        });
    }
}