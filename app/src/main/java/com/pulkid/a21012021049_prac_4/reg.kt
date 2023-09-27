package com.pulkid.a21012021049_prac_4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class reg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        var lgn:Button=findViewById(R.id.lgn);
        lgn.setOnClickListener(){
            var intent=Intent(this,login_ori::class.java);
            startActivity(intent);
        }
    }
}
