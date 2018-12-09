package com.example.zingzing.heartree;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;


public class Sub2content extends Activity {

    private ImageView imgview;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2content);

        imgview = (ImageView)findViewById(R.id.imageView_pic);
        ImageButton imgbtn = (ImageButton)findViewById(R.id.imageButton2);

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

    protected void onActivityResult(int requestCode,int resultCode, Intent data) {

        Bundle extras = data.getExtras();
        if (extras != null) {
            Bitmap photo = extras.getParcelable("data");
            imgview.setImageBitmap(photo);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub2content, menu);
        return true;
    }

    public void onClick_back(View v){
        finish();
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

    public void addcomplete(View v) {
        EditText time = (EditText) findViewById(R.id.content_time);
        EditText content = (EditText) findViewById(R.id.content_multi);

        String t = time.getText().toString();
        String con = content.getText().toString();

        Intent intent_submit = new Intent(getApplicationContext(), Sub1.class);

        intent_submit.putExtra("날짜", t);
        intent_submit.putExtra("내용", con);

        startActivity(intent_submit);

        finish();
    }

    /*public void onClick_view(View v) {
        Intent intent = new Intent(this, MainActivity.class);

        String[] myStrings = new String[] {"test", "test2"};

        intent.putExtra("strings",myStrings);
        startActivity(intent);
    }*/
}
