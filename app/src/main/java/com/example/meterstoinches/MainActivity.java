package com.example.meterstoinches;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText enterMeter;
    private Button convertbutton;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeter=(EditText) findViewById(R.id.editText1);
        @SuppressLint("ResourceType") ImageView image = (ImageView)findViewById(R.drawable.metertoinches);
        result = (TextView) findViewById(R.id.textView);
        convertbutton=(Button) findViewById(R.id.button);
        convertbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multiplier = 39.37;
                double finalresult = 0.00;

                if (enterMeter.getText().toString().equals("")){

                    result.setText(("Enter Meters"));
                    result.setTextColor(Color.RED);
                }
                else {

                    double meterval = Double.parseDouble(enterMeter.getText().toString());
                    finalresult = meterval * multiplier;
                    result.setTextColor(Color.GRAY);

                    result.setText(String.format("%.2f", finalresult));
                }


            }
        });


    }
}
