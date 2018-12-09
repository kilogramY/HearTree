package com.example.zingzing.heartree;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;


public class Sub1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        TextView textView_t = (TextView) findViewById(R.id.textView_t);
        TextView textView_con = (TextView) findViewById(R.id.textView_con);

        Intent intent_submit = getIntent();

        String t = intent_submit.getStringExtra("날짜");
        String con = intent_submit.getStringExtra("내용");

        textView_t.setText(String.valueOf(t));
        textView_con.setText(String.valueOf(con));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub1, menu);
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
    public void btnadd(View v) {
        Intent intent01 = new Intent(getApplicationContext(),Sub2content.class);
        startActivity(intent01);
        finish();
    }

    public void onClick_back(View v){
        finish();
    }
}
