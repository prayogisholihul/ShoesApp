package com.example.shoesapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var list: ArrayList<Shoes> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Statusbar
        window.statusBarColor = resources.getColor(R.color.app)

        //Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //recyclerView
        list.addAll(ShoesData.listData)

        rvShoes.setHasFixedSize(true)
        showRecyclerList()
    }

    //MenuToolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    //AboutButton
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_add -> {
                val intent = Intent(this@MainActivity, About::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerList() {
        rvShoes.layoutManager = GridLayoutManager(this, 2)
        val adapter = AdapterShoes(list)
        rvShoes.adapter = adapter

        adapter.setOnItemClickCallback(object : AdapterShoes.OnItemClickCallback {
            override fun onItemClicked(data: Shoes, buttonFav: ImageView, fav: CardView) {
                getData(data)

                var click = false
                fav.setOnClickListener {
                    click = if (click) {
                        buttonFav.setImageResource(R.drawable.ic_favorite)
                        false
                    } else {
                        buttonFav.setImageResource(R.drawable.ic_favorite_clicked)
                        true
                    }
                }
            }
        })
    }

    private fun getData (shoes: Shoes){
        val intent = Intent(this@MainActivity, DetailShoes::class.java)
        intent.putExtra(DetailShoes.EXTRA_DATA,shoes)
        startActivity(intent)
    }
}