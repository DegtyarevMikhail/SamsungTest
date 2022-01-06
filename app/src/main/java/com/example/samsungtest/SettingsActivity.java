package com.example.samsungtest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class SettingsActivity extends AppCompatActivity {

    private int themeIndex = 0;

    private final int[] radioBtns = new int[]{R.id.radioButtonMyCoolStyle, R.id.radioButtonMaterialDark};

    View.OnClickListener radioButtonListener = new View.OnClickListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.radioButtonMyCoolStyle: {
                    themeIndex = 0;
                    break;
                }
                case R.id.radioButtonMaterialDark: {
                    themeIndex = 1;
                    break;
                }
            }
        }
    };

    private void setupClickListenersChooseThemeRadioButton(){

        for (int radioBtn: radioBtns){
            RadioButton rb = findViewById(radioBtn);
            rb.setOnClickListener(radioButtonListener);
            rb.setChecked(false);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        setupClickListenersChooseThemeRadioButton();

        themeIndex = getIntent().getIntExtra(MainActivity.THEME_INDEX, themeIndex);
        if(themeIndex == 0){
            RadioButton rb = findViewById(R.id.radioButtonMyCoolStyle);
            rb.setChecked(true);
        }else if(themeIndex == 1){
            RadioButton rb =  findViewById(R.id.radioButtonMaterialDark);
            rb.setChecked(true);
        }

        findViewById(R.id.choose_text_button).setOnClickListener(v -> {
            Intent resultIntent = new Intent();
            resultIntent.putExtra(MainActivity.THEME_INDEX, themeIndex);
            setResult(Activity.RESULT_OK, resultIntent);
            finish();
        });
    }
}
