package com.vazquez.carlos.buttonapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
    }

    public void onNewButton(View view) {
        Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.new_button_msg), Toast.LENGTH_LONG).show();
    }
    public void onIconButton(View view) {
        Toast.makeText(getApplicationContext(),
                getResources().getString(R.string.icon_button_msg), Toast.LENGTH_LONG).show();
    }
    public void onColorsButtonPNG(View view) {
        Intent intent = new Intent(ButtonActivity.this, ButtonColorsPNGActivity.class);
        startActivity(intent);
    }
    public void onColorsButtonHValues(View view) {
        Intent intent = new Intent(ButtonActivity.this, ButtonColorsHValuesActivity.class);
        startActivity(intent);
    }

    public void onImageButton(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uprb.edu"));
        startActivity(intent);
    }
}
