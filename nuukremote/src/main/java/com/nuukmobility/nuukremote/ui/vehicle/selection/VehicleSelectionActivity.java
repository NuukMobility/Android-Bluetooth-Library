package com.nuukmobility.nuukremote.ui.vehicle.selection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.nuukmobility.nuukremote.R;
import com.nuukmobility.nuukremote.ui.login.LoginViewModel;

public class VehicleSelectionActivity extends AppCompatActivity {

    private VehicleSelectionViewModel vehicleSelectionViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_selection);
    }
}