package com.example.zingzing.heartree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class SubMainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //애칭과 첫만남 가져오기
        TextView textView_cn = (TextView) findViewById(R.id.textView_cn);
        TextView textView_fm = (TextView) findViewById(R.id.textView_fm);

        Intent intent_submit = getIntent();

        String cn = intent_submit.getStringExtra("입력한 애칭");
        String fm = intent_submit.getStringExtra("입력한 1일");

        textView_cn.setText(String.valueOf(cn));
        textView_fm.setText(String.valueOf(fm));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClick_view(View v) {
        Intent intent01 = new Intent(getApplicationContext(),Sub1.class);
        startActivity(intent01);

    }

    public void onClick_add(View v) {
        Intent intent01 = new Intent(getApplicationContext(),Sub2content.class);
        startActivity(intent01);
    }
    //dday 액티비티로 이동
    public void onClick_dday(View v) {
        Intent intent01 = new Intent(getApplicationContext(),DdayActivity.class);
        startActivity(intent01);
    }
    //calendar 액티비티로 이동
    public void onClick_calendar(View v) {
        Intent intent01 = new Intent(getApplicationContext(),CalActivity.class);
        startActivity(intent01);
    }
    //로그아웃됨
    public void onClick_logout(View v) {
        finish();
    }

    //setting 액티비티로 이동
    public void onClick_to_setting(View v) {
        Intent intent01 = new Intent(getApplicationContext(),Setting_main.class);
        startActivity(intent01);
    }


}

