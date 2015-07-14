package com.example.Hello;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.CheckBox;


public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */

    private EditText tvUserName = null;
    private EditText tvPassword = null;
    private Button btnLogin = null;
    private RadioButton rbMale = null;
    private RadioButton rbFemale = null;
    private CheckBox cbSoccer = null;
    private CheckBox cbBasketball = null;
    private Button btnSave = null;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tvUserName = (EditText)super.findViewById(R.id.userName);
        tvPassword = (EditText)super.findViewById(R.id.password);
        btnLogin = (Button)super.findViewById(R.id.login);
        btnLogin.setOnClickListener(new LoginOnClickListener());

        rbMale = (RadioButton)super.findViewById(R.id.male);
        rbFemale = (RadioButton)super.findViewById(R.id.famale);
        cbSoccer = (CheckBox)super.findViewById(R.id.soccer);
        cbBasketball = (CheckBox)super.findViewById(R.id.basketball);
        btnSave = (Button)super.findViewById(R.id.save);
        btnSave.setOnClickListener(new SaveOnClickListener());
    }
    private  class LoginOnClickListener implements OnClickListener{
        public void onClick(View v){
            String username = tvUserName.getText().toString();
            String password = tvPassword.getText().toString();
            String info = "用户名: " + username + "    密码: " + password;
            Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
        }
    }
    private class SaveOnClickListener implements OnClickListener{
        public void onClick(View v){
            String sGender = "";
            String sFav = "";
            String sInfo = "";

            if (rbMale.isChecked())
                sGender = rbMale.getText().toString();
            if (rbFemale.isChecked())
                sGender = rbFemale.getText().toString();
            if (cbSoccer.isChecked())
                sFav += cbSoccer.getText().toString();
            if (cbBasketball.isChecked())
                sFav += cbBasketball.getText().toString();

            if (sFav == "")
                sFav = "无";
            sInfo = "性别: " + sGender + "    爱好: " + sFav;

            Toast.makeText(getApplicationContext(), sInfo, Toast.LENGTH_SHORT).show();
        }
    }
}
