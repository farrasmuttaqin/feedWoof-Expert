package com.example.expertfeedwoof;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.WindowManager;


public class InboxActivity extends AppCompatActivity {

    BottomNavigationView mBtmView,bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inbox);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        mBtmView = (BottomNavigationView) findViewById(R.id.btm_nav);
        mBtmView.getMenu().findItem(R.id.action_message).setChecked(true);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btm_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.action_home :
                        openBeranda();
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

    }

    @Override
    public void onBackPressed() {
        Intent setIntent = new Intent(this,HomeActivity.class);
        setIntent.addCategory(Intent.CATEGORY_HOME);
        setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(setIntent);
    }

    private void openBeranda(){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.bottomnavigation_menu, menu);
//
//        final MenuItem menuItem = menu.findItem(R.id.action_message);
//
//        View actionView = menuItem.getActionView();
//        smsCountTxt = (TextView) actionView.findViewById(R.id.notification_badge);
//
//        setupBadge();
//
//        actionView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onOptionsItemSelected(menuItem);
//            }
//        });
//
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        switch (item.getItemId()) {
//
//            case R.id.action_message: {
//
//                return true;
//            }
//        }
//        return super.onOptionsItemSelected(item);
//    }

//    private void setupBadge() {
//
//        if (smsCountTxt != null) {
//            if (pendingSMSCount == 0) {
//                if (smsCountTxt.getVisibility() != View.GONE) {
//                    smsCountTxt.setVisibility(View.GONE);
//                }
//            } else {
//                smsCountTxt.setText(String.valueOf(Math.min(pendingSMSCount, 99)));
//                if (smsCountTxt.getVisibility() != View.VISIBLE) {
//                    smsCountTxt.setVisibility(View.VISIBLE);
//                }
//            }
//        }
//    }
}
