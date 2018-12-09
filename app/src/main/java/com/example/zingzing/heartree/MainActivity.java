package com.example.zingzing.heartree;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }
    public void onClick_login(View view) {
        EditText password = (EditText) findViewById(R.id.Password);
        String str1 = password.getText().toString();
        String str2 = "1234"; //비밀번호

        if (str1.equals(str2)) {
            Intent intent01 = new Intent(getApplicationContext(), SubMainActivity.class);
            startActivity(intent01);
        } else {
            Toast.makeText(MainActivity.this, "잘못입력하셨습니다.", Toast.LENGTH_SHORT).show();
        }
    }
    public void onClick_register(View view){
        Intent intent01 = new Intent(getApplicationContext(), Register.class);
        startActivity(intent01);
    }
}
