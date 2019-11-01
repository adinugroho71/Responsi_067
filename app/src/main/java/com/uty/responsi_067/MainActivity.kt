package com.uty.responsi_067

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.tx_username)
        val password = findViewById<EditText>(R.id.tx_password)

        btn_login.setOnClickListener(){
            if (username.text.toString()== "Adi" && password.text.toString()== "12345"){
                intent= Intent(this, HomeActivity:: class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext, "username & password anda salah boss !!!", Toast.LENGTH_LONG).show()

            }
        }

        tw_register.setOnClickListener(){
            intent= Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
