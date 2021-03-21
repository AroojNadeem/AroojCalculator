package com.example.aroojcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText x=(EditText) findViewById(R.id.operand1);
        EditText y=(EditText) findViewById(R.id.operand2);
        TextView z =(TextView) findViewById((R.id.texts));
        Button f =(Button) findViewById(R.id.button);
        Spinner m = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter <CharSequence> G = ArrayAdapter.createFromResource(this,R.array.dropdown,android.R.layout.simple_spinner_item);
        G.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m.setAdapter(G);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int p=m.getSelectedItemPosition();
                int op1 = Integer.parseInt(x.getText().toString());
                int op2 = Integer.parseInt(y.getText().toString());
                int res = 0; // assigned result into variable res- assigned it to 0 for now

                if(p==0){ // here we will use the INDEX to indicate what operator was selected
                   res=op1+op2;
                }
                else if(p==1){
                    res=op1-op2;
                }
                else if(p==2){
                    res=op1*op2;

                }
                else if(p==3){
                    res=op1/op2;
                }
                z.setText(String.valueOf(res));
            }
        });



    }
}