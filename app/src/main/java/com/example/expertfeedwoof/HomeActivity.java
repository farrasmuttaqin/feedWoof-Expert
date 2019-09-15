package com.example.expertfeedwoof;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity  {

    private BottomNavigationView bottomNavigationView;
    private boolean doubleBackToExitPressedOnce;
    private Button detils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_home);
        super.onCreate(savedInstanceState);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        BottomNavigationView mBtmView = (BottomNavigationView) findViewById(R.id.btm_nav);
        mBtmView.getMenu().findItem(R.id.action_home).setChecked(true);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.action_message :
                        openInbox();
                        break;
                    case R.id.action_monet :
//                        openMonet();
                        break;
                    case R.id.action_profile:
//                        openProfile();
                        break;
                }

                return true;
            }
        });

        detils = findViewById(R.id.detil);
        detils.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetil();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    protected void openInbox(){
        Intent intent = new Intent(this,InboxActivity.class);
        startActivity(intent);
    }

    private void openDetil(){
        Intent intent = new Intent(this,DetailPesanan.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        if (doubleBackToExitPressedOnce) {
            finishAffinity();
            finish();
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click back again to exit from Feed Woof (Expert)", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
