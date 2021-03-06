package org.techtown.ssubook;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Mypage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
/*
        ActionBar ab = getSupportActionBar();
        ab.setTitle("마이페이지");
*/
    }

    public void onLogOutButtonClick( View v )
    {
        Toast.makeText( this, "Log Out 시도중", Toast.LENGTH_LONG ).show();
    }



    public void onMyPostButtonClick( View v )
    {

        Intent intent = new Intent();
        ComponentName componentName = new ComponentName (
                "com.example.soongsilbook",
                "com.example.soongsilbook.Post");
        intent.setComponent(componentName);
        intent.putExtra("activty", 0);
        startActivity(intent);
    }


    public void onInterestedPostButtonClick( View v )
    {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName (
                "com.example.soongsilbook",
                "com.example.soongsilbook.Post");
        intent.setComponent(componentName);
        intent.putExtra("activity", 1);
        startActivity(intent);
    }


    public void onTermsButtonClick( View v )
    {
        Toast.makeText( this, "Terms of Use 접근중", Toast.LENGTH_LONG ).show();

        Intent intent = new Intent();
        ComponentName componentName = new ComponentName (
                "kr.co.company.b",
                "kr.co.company.b.MainActivity");
        intent.setComponent(componentName);
        startActivity(intent);

    }

}