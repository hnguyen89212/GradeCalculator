package com.hainguyen.android.gradecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private CheckBox agreeToTermsCheckbox;
    private Button getStartedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        agreeToTermsCheckbox = findViewById(R.id.agreeToTermsCheckbox);
        getStartedBtn = findViewById(R.id.getStartedBtn);
    }

    public void goToHomeActivity(View view) {
        if (!agreeToTermsCheckbox.isChecked()) {
            // complains
            return;
        }
        Intent homeIntent = new Intent(this, Home.class);
        startActivity(homeIntent);
    }
}
