package com.wechat;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class Login extends Activity {
	private EditText mUser;  
	private EditText mPassword;  

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
        mUser = (EditText)findViewById(R.id.login_user_edit);
        mPassword = (EditText)findViewById(R.id.login_passwd_edit);
        
    }

    public void login_mainweixin(View v) {
    	if("afeng".equals(mUser.getText().toString()) && "afeng".equals(mPassword.getText().toString()))   
        {
             Intent intent = new Intent();
             intent.setClass(Login.this,LoadingActivity.class);
             startActivity(intent);
             
          }
        else if("".equals(mUser.getText().toString()) || "".equals(mPassword.getText().toString()))   
        {
        	new AlertDialog.Builder(Login.this)
			.setIcon(getResources().getDrawable(R.drawable.login_error_icon))
			.setTitle("Waning")
			.setMessage("Please enter your username and password.")
			.create().show();
         }
        else{
           
        	new AlertDialog.Builder(Login.this)
			.setIcon(getResources().getDrawable(R.drawable.login_error_icon))
			.setTitle("Waning")
			.setMessage("Your password or username is not correct.")
			.create().show();
        }
    	
    	//
    	/*
      	Intent intent = new Intent();
		intent.setClass(Login.this,Whatsnew.class);
		startActivity(intent);
		Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
		this.finish();*/
      }  
    public void login_back(View v) {     
      	this.finish();
      }  
    public void login_pw(View v) {      
    	Uri uri = Uri.parse("http://3g.qq.com"); 
    	Intent intent = new Intent(Intent.ACTION_VIEW, uri); 
    	startActivity(intent);
    	//Intent intent = new Intent();
    	//intent.setClass(Login.this,Whatsnew.class);
        //startActivity(intent);
      }  
}
