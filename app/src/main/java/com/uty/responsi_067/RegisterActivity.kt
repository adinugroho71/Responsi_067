package com.uty.responsi_067

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val nama = findViewById<EditText>(R.id.nama)
        val alamat = findViewById<EditText>(R.id.alamat)
        val user = findViewById<EditText>(R.id.username)

        btn_register.setOnClickListener(){
            val nama = nama.text.toString()
            val alamat = alamat.text.toString()
            val user = username.text.toString()

            val intent = Intent (this, AccountActivity::class.java)
            intent.putExtra("nama",nama)
            intent.putExtra("alamat",alamat)
            intent.putExtra("user",user)
            startActivity(intent)

        }

    }
}
