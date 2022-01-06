package com.example.samsungtest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String THEME_INDEX = "THEME_INDEX";
    private int themeIndex = 0;

    private final static String KeyStorage = "KeyStorage";
    Storage data = new Storage();

    private EditText display1;
    private EditText display2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null  && savedInstanceState.containsKey(KeyStorage))
        {

            data = savedInstanceState.getParcelable(KeyStorage);
            themeIndex = savedInstanceState.getInt(THEME_INDEX);
        }

        if(themeIndex == 0){
            setTheme(R.style.MyCoolStyle);
        }else if(themeIndex == 1){
            setTheme(R.style.AppThemeDark);
        }
        setContentView(R.layout.activity_main);

        ActivityResultLauncher<Intent> launcherSettings = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if(result.getResultCode() == Activity.RESULT_OK){
                    if(result.getData() != null){
                        themeIndex = result.getData().getIntExtra(THEME_INDEX, themeIndex);
                        recreate();
                    }
                }
            }
        });

        findViewById(R.id.settings_button).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
            intent.putExtra(THEME_INDEX, themeIndex);
            launcherSettings.launch(intent);
        });


        display1 = (EditText) findViewById(R.id.display1);
        display2 = (EditText) findViewById(R.id.display2);



    }

       @Override
     protected void onSaveInstanceState(@NonNull Bundle outState){
         outState.putParcelable(KeyStorage, data);
         outState.putInt(THEME_INDEX, themeIndex);
         super.onSaveInstanceState(outState);

     }

}