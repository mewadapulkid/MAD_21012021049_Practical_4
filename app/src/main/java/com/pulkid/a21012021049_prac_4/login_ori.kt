package com.pulkid.a21012021049_prac_4
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class login_ori : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_ori)
        var signup:Button=findViewById(R.id.sign_up);
        var name:EditText=findViewById(R.id.email);
        var password:EditText=findViewById(R.id.password);
        signup.setOnClickListener(){
            var intent=Intent(this,reg::class.java);
            intent.putExtra("email",name.text.toString());
            intent.putExtra("password",password.text.toString());
            startActivity(intent);
        }
    }
}

