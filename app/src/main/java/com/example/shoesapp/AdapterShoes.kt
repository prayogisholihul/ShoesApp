package com.example.shoesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.adapter_shoes.view.*

class AdapterShoes(private val data: ArrayList<Shoes>) :
    RecyclerView.Adapter<AdapterShoes.ViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_shoes, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //Picture
        Glide.with(holder.itemView.context)
            .load(data[position].pic)
            .apply(RequestOptions().override(350, 550))
            .into(holder.image)

        //SetText
        holder.shoesname.text = data[position].name
        holder.shoesprice.text = "$${data[position].price.toString()}"

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(data[holder.adapterPosition],holder.buttonFav,holder.fav) }
    }

    override fun getItemCount(): Int = data.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val shoesname = itemView.shoesNameAdapter
        val shoesprice = itemView.shoesPriceAdapter
        val image: ImageView = itemView.imageShoes
        val fav: CardView = itemView.cardFav
        val buttonFav: ImageView = itemView.buttonFav
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Shoes, buttonFav: ImageView, fav: CardView)
    }

}

