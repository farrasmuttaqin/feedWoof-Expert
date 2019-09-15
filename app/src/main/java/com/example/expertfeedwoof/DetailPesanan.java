package com.example.expertfeedwoof;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class DetailPesanan extends AppCompatActivity {

    BottomNavigationView mBtmView,bottomNavigationView;
    Button chatTernak;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.acitivty_detail_pelatihan);

        super.onCreate(savedInstanceState);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        mBtmView = (BottomNavigationView) findViewById(R.id.btm_nav);
        mBtmView.getMenu().findItem(R.id.action_home).setChecked(true);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(Html.fromHtml("<font color='#555424'>Detail Pelatihan</font>"));

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.action_home :
                        openBeranda();
                        break;
                    case R.id.action_message :
                        openMessage();
                        break;
                    case R.id.action_monet :
//                        openSaldo();
                        break;
                    case R.id.action_profile :
//                        openProfile();
                        break;
                }

                return true;
            }
        });

        chatTernak = findViewById(R.id.chatTernak);
        chatTernak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChat();
            }
        });
    }

    private void openBeranda(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }

    private void openMessage(){
        Intent intent = new Intent(this, MessageActivity.class);
        startActivity(intent);
    }

    private void openChat(){
        Intent intent = new Intent(this,MessageActivity.class);
        startActivity(intent);
    }
}
