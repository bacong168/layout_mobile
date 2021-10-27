package com.iot.covid.duantotnghiep.Doctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import com.iot.covid.duantotnghiep.R;

public class UrgentNotice extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urgent_notice);
        drawerLayout = findViewById(R.id.drawerLayout);
    }
    public void ClickLogo(View view){
        MainActivity.redirectActivity(this, DoctorInformation.class);
    }
    public void ClickMenu(View view) {
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickHome(View view) {
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickUrgentNotice(View view) {
        recreate();
    }

    public void ClickDoctorInformation(View view) {
        MainActivity.redirectActivity(this, DoctorInformation.class);
    }

    public void ClickLogout(View view) {
        MainActivity.logout(this);
    }
    @Override
    protected void onPause() {
        super.onPause();
        MainActivity.closeDrawer(drawerLayout);
    }
}