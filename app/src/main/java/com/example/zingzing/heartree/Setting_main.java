package com.example.zingzing.heartree;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Setting_main extends Activity {

    private ImageView imgview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_main);

        imgview = (ImageView) findViewById(R.id.imageView_pic);
        ImageButton imgbtn = (ImageButton) findViewById(R.id.imageButton2);

        imgbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //갤러리
                Intent intent = new Intent();

                intent.setType("image/*");
                intent.setAction(intent.ACTION_GET_CONTENT);

                //잘라내기
                intent.putExtra("crop", "true");
                intent.putExtra("aspectX", 0);
                intent.putExtra("aspectY", 0);
                intent.putExtra("outputX", 200);
                intent.putExtra("outputY", 150);
                try {
                    intent.putExtra("return-data", true);
                    startActivityForResult(Intent.createChooser(intent, "Complete"), 0);
                } catch (ActivityNotFoundException e) {
                }
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Bundle extras = data.getExtras();
        if (extras != null) {
            Bitmap photo = extras.getParcelable("data");
            imgview.setImageBitmap(photo);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_setting_main, menu);
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

    public void onClick_back(View v) {
        finish();
    }

    public void onClick_submit(View v) {
        EditText couplename = (EditText) findViewById(R.id.editText_cn);
        EditText firstmeet = (EditText) findViewById(R.id.editText_fm);

        String cn = couplename.getText().toString();
        String fm = firstmeet.getText().toString();

        Intent intent_submit = new Intent(getApplicationContext(), SubMainActivity.class);

        intent_submit.putExtra("입력한 애칭", cn);
        intent_submit.putExtra("입력한 1일", fm);

        startActivity(intent_submit);
    }
}