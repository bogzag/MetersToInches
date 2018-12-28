package com.example.lenovo.meterstoinches;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
       1m=39.370in
     */
    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = (EditText) findViewById(R.id.metersEditText);
        resultTextView = (TextView) findViewById(R.id.resultid);
        convertButton = (Button) findViewById(R.id.convertButtonID);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversion logic
                double multiplier = 39.37;
                double result = 0.0;

                double meterValue = Double.parseDouble(enterMeters.getText().toString());
                result = meterValue*multiplier;

                resultTextView.setText(Double.toString(result) + " inches");

            }
        });



    }
}
