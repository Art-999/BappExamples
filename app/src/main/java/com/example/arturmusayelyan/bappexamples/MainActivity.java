package com.example.arturmusayelyan.bappexamples;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    //Bottom Navigation View

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        try {
            PackageInfo packageInfo=getPackageManager().getPackageInfo(getPackageName(),0);
            Log.d("Art",packageInfo.versionCode+"");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_add:
                Toast.makeText(this,"Action Add Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_edit:
                Toast.makeText(this,"Action Edit Clicked",Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_remove:
                Toast.makeText(this,"Action Remove Clicked",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}

