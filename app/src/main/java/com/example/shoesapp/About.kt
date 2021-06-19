package com.example.shoesapp

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_about.*

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


        //Toolbar
        setSupportActionBar(toolbar_about)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_backbutton)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        Glide.with(this)
            .load(R.drawable.foto_diri)
            .circleCrop()
            .into(imageAbout)

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}