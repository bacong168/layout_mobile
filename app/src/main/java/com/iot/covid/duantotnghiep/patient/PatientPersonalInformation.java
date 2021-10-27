package com.iot.covid.duantotnghiep.patient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import com.iot.covid.duantotnghiep.Doctor.MainActivity;
import com.iot.covid.duantotnghiep.Doctor.UrgentNotice;
import com.iot.covid.duantotnghiep.R;

public class PatientPersonalInformation extends AppCompatActivity {
    DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_personal_information);
        drawerLayout = findViewById(R.id.patientDrawerLayout);
    }
    public void ClickMenu(View view) {
        MainActivity.openDrawer(drawerLayout);
    }

    public void ClickLogo(View view) {
        recreate();
    }

    public void ClickHome(View view) {
        MainActivity.redirectActivity(this, PatientMainActivity.class);
    }

    public void ClickUrgentNotice(View view) {
        MainActivity.redirectActivity(this, UrgentNotice.class);
    }

    public void ClickPatientPersonalInformation(View view) {
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