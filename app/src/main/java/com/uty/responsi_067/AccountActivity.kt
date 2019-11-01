package com.uty.responsi_067

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_account.*

class AccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)

        val bundle=intent.extras
        val nama = bundle?.get("nama")
        val alamat = bundle?.get("alamat")
        val Email = bundle?.get("Email")

        tw_nama.text= ("nama:"+(nama))
        tw_Email.text= ("Email:"+ (Email))
        tw_alamat.text= ("alamat:"+ (alamat))


    }
}
