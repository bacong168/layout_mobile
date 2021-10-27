package com.iot.covid.duantotnghiep.Doctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import com.iot.covid.duantotnghiep.R;

public class DoctorInformation extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_information);
        drawerLayout = findViewById(R.id.drawerLayout);
    }

    public void ClickMenu(View view) {
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view) {
        recreate();
    }

    public void ClickHome(View view) {
        MainActivity.redirectActivity(this, MainActivity.class);
    }

    public void ClickUrgentNotice(View view) {
        MainActivity.redirectActivity(this, UrgentNotice.class);
    }

    public void ClickDoctorInformation(View view) {
        recreate();
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