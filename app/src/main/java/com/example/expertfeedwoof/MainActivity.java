package com.example.expertfeedwoof;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView register;
    Button tanpaDaftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        register = (TextView) findViewById(R.id.daftar);
        tanpaDaftar = (Button) findViewById(R.id.masuk);

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openRegister();
            }
        });

        tanpaDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTanpaDaftar();
            }
        });
    }

    private void openRegister(){
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }

    private void openTanpaDaftar(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }
}
