package com.example.kalpeshsoni.practical5;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button bt1,bt2;
    TextView t1,t2,t3,t4;
    int cnt = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1 = findViewById(R.id.editText2);
        et2 = findViewById(R.id.editText3);
        bt1 = findViewById(R.id.button);
        bt2 = findViewById(R.id.button2);
        t1 = findViewById(R.id.textView2);
        t2 = findViewById(R.id.textView3);
        t3 = findViewById(R.id.textView4);
        t4 = findViewById(R.id.textView7);

        t2.setVisibility(View.GONE);
        t3.setVisibility(View.GONE);
        t4.setVisibility(View.GONE);

        bt1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                if (et1.getText().toString().equals("Dhruvin") && et2.getText().toString().equals("Dhruvin"))
                {
                    Toast.makeText(getApplicationContext(), "Login Succesfull", Toast.LENGTH_SHORT).show();
                    t2.setVisibility(View.VISIBLE);
                    t2.setText("Login Successfull");
                    t2.setBackgroundColor(R.color.green);

                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Username of Password", Toast.LENGTH_SHORT).show();
                    t3.setVisibility(View.VISIBLE);
                    t4.setVisibility(View.VISIBLE);
                    t4.setBackgroundColor(R.color.red);
                    cnt = cnt - 1;
                    t4.setText(Integer.toString(cnt));
                    t2.setVisibility(View.VISIBLE);
                    t2.setBackgroundColor(R.color.red);
                    t2.setText("Wrong Username of Password");

                    if (cnt == 0)
                    {
                        bt1.setEnabled(false);
                    }
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
    }
}
