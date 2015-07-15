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
import android.widget.Spinner;
import android.widget.ImageButton;
import android.widget.ImageView;


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

    private Spinner spinProvince = null;
    private Button btnSave2 = null;
    private ImageButton ibtnic_5 = null;
    private ImageView ivwPicture = null;
    private ImageButton ibtnProv = null;
    private ImageButton ibtnNext = null;
    private Integer[] iImages = {R.drawable.ic_1, R.drawable.ic_2, R.drawable.ic_3, R.drawable.ic_4};
    private int i = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
//
//        tvUserName = (EditText)super.findViewById(R.id.userName);
//        tvPassword = (EditText)super.findViewById(R.id.password);
//        btnLogin = (Button)super.findViewById(R.id.login);
//        btnLogin.setOnClickListener(new LoginOnClickListener());
//
//        rbMale = (RadioButton)super.findViewById(R.id.male);
//        rbFemale = (RadioButton)super.findViewById(R.id.famale);
//        cbSoccer = (CheckBox)super.findViewById(R.id.soccer);
//        cbBasketball = (CheckBox)super.findViewById(R.id.basketball);
//        btnSave = (Button)super.findViewById(R.id.save);
//        btnSave.setOnClickListener(new SaveOnClickListener());

//        spinProvince = (Spinner)super.findViewById(R.id.province);
//        btnSave2 = (Button)super.findViewById(R.id.save2);
//        btnSave2.setOnClickListener(new SaveOnClickListener2());
//        ibtnic_5 = (ImageButton)super.findViewById(R.id.ic_5);
//        ibtnic_5.setOnClickListener(new ic_5OnClickListener());
        ivwPicture = (ImageView)super.findViewById(R.id.picture);
        ibtnProv = (ImageButton)super.findViewById(R.id.prov);
        ibtnNext = (ImageButton)super.findViewById(R.id.next);
        ibtnProv.setOnClickListener(new ProvOnClickListener());
        ibtnNext.setOnClickListener(new NextOnClickListener());
    }

//    private  class LoginOnClickListener implements OnClickListener{
//        public void onClick(View v){
//            String username = tvUserName.getText().toString();
//            String password = tvPassword.getText().toString();
//            String info = "用户名: " + username + "    密码: " + password;
//            Toast.makeText(getApplicationContext(), info, Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    private class SaveOnClickListener implements OnClickListener{
//        public void onClick(View v){
//            String sGender = "";
//            String sFav = "";
//            String sInfo = "";
//
//            if (rbMale.isChecked())
//                sGender = rbMale.getText().toString();
//            if (rbFemale.isChecked())
//                sGender = rbFemale.getText().toString();
//            if (cbSoccer.isChecked())
//                sFav += cbSoccer.getText().toString();
//            if (cbBasketball.isChecked())
//                sFav += cbBasketball.getText().toString();
//
//            if (sFav.equals(""))
//                sFav = "无";
//
//            sInfo = "性别: " + sGender + "    爱好: " + sFav;
//            Toast.makeText(getApplicationContext(), sInfo, Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    private class SaveOnClickListener2 implements OnClickListener{
//        public void onClick(View v){
//            String sInfo2 = "";
//
//            sInfo2 = spinProvince.getSelectedItem().toString();
//            Toast.makeText(getApplicationContext(), sInfo2, Toast.LENGTH_SHORT).show();
//        }
//    }
    private class ProvOnClickListener implements OnClickListener{
        public void onClick(View v){
            if (i<=0)
                i = 4;
            ivwPicture.setImageResource(iImages[--i]);
        }
    }
    private class NextOnClickListener implements OnClickListener{
        public void onClick(View v){
            if (i>=3)
                i = -1;
            ivwPicture.setImageResource(iImages[++i]);
        }
    }

}
