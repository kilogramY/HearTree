package com.example.zingzing.heartree;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jinmi on 2015-08-24.
 */
public class Register extends Activity {
        // IP have to be modified to server computer's IP!!
        private final String SERVER_ADDRESS = "http://127.0.0.1/data";


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            // Set View to register.xml
            setContentView(R.layout.activity_register);

            final EditText reg_email = (EditText)findViewById(R.id.reg_email);
            final EditText reg_fullname = (EditText)findViewById(R.id.reg_fullname);
            final EditText reg_password = (EditText)findViewById(R.id.reg_password);
            Button btnRegister = (Button)findViewById(R.id.btnRegister);


            // Listening to Login Screen link
            btnRegister.setOnClickListener(new View.OnClickListener() {

                public void onClick(View arg0) {
                    if( reg_email.getText().toString().equals("") ||
                            reg_fullname.getText().toString().equals("") ||
                            reg_password.getText().toString().equals("") ) { //이름이나 가격중에 하나라도 입력이 안돼있을때
                        Toast.makeText(Register.this,
                                "이메일, 이름, 비밀번호 모두 채워주세요", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    // Switching to Login Screen/closing register screen
                    finish();
                }
            });
        }
    public void onClick_login(View view){
        Intent intent01 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent01);
    }

}
