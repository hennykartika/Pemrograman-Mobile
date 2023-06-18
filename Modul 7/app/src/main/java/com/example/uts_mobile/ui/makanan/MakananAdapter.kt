package com.example.uts_mobile.ui.makanan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.uts_mobile.databinding.ItemMakananBinding

class MakananAdapter(private val listMakanan: ArrayList<Makanan>) :
    RecyclerView.Adapter<MakananAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(private val binding: ItemMakananBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(makanan: Makanan) {
            with(binding) {
                itemNama.text = makanan.name
                itemDetail.text = makanan.detail
                Glide.with(itemView.context)
                    .load(makanan.photo)
                    .into(itemFoto)

                itemView.setOnClickListener {
                    onItemClickCallback.onItemClicked(makanan)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            ItemMakananBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listMakanan[position])
    }

    override fun getItemCount(): Int = listMakanan.size

    interface OnItemClickCallback {
        fun onItemClicked(data: Makanan)
    }
}