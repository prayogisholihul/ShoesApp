package com.example.shoesapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.text.method.ScrollingMovementMethod
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail_shoes.*

class DetailShoes : AppCompatActivity(){

    companion object{
        const val EXTRA_DATA = "extra_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_shoes)

        //getData
        val getData: Shoes? = intent.getParcelableExtra<Shoes>(EXTRA_DATA)

        //setText
        brandShoes.text = getData?.name
        shoesDetail.text = getData?.desc
        shoesDetail.movementMethod = ScrollingMovementMethod()
        sizeShoes.text = "Size : ${getData?.size}"
        priceShoes.text = "$${getData?.price.toString()}"

        //SetImage
        Glide.with(this)
            .load(getData?.pic)
            .into(shoesimage)

        //Toolbar
        setSupportActionBar(toolbar_detail)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_backbutton)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //Button
        buttonClick()
    }

    private fun buttonClick() {
        buttonBuy.setOnClickListener {
            Toast.makeText(this,R.string.buttonBuy,Toast.LENGTH_SHORT).show()
        }
    }

    //BackButton
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}