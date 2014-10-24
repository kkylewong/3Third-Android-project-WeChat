package com.wechat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class InfoAFeng extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_afeng);              
    }

   public void btn_back(View v) {     
      	this.finish();
      } 
   public void btn_back_send(View v) {    
     	this.finish();
     } 
   public void head_xiaohei(View v) {    
	   Intent intent = new Intent();
		intent.setClass(InfoAFeng.this,InfoAFengHead.class);
		startActivity(intent);
    } 
    
}
