package com.uty.responsi_067

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uty.responsi_067.model.ListGunungAdapter
import com.uty.responsi_067.model.gunung
import com.uty.responsi_067.model.gunungg
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.item_gunung.*

class HomeActivity : AppCompatActivity() {

    private lateinit var rvgunung: RecyclerView
    private var list: ArrayList<gunung> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        gunungg = clearFindViewByIdCache()
        rvgunung.setHasFixedSize(true)
        list.addAll(gunungg.listgunung)
        showFoodList()

        img_item_poster.setOnClickListener(){
            intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }


    }
    private fun showFoodList(){
        rvgunung.layoutManager = LinearLayoutManager(this)
        val ListGunungAdapter = ListGunungAdapter(list)
        rvgunung.adapter = ListGunungAdapter
    }

}