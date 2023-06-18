package com.example.uts_mobile.ui.minuman

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.uts_mobile.databinding.ItemMinumanBinding

class MinumanAdapter(private val listMinuman: ArrayList<Minuman>) :
    RecyclerView.Adapter<MinumanAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(private val binding: ItemMinumanBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(minuman: Minuman) {
            with(binding) {
                itemNama.text = minuman.name
                itemDetail.text = minuman.detail
                Glide.with(itemView.context)
                    .load(minuman.photo)
                    .into(itemFoto)

                itemView.setOnClickListener {
                    onItemClickCallback.onItemClicked(minuman)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val binding =
            ItemMinumanBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(listMinuman[position])
    }

    override fun getItemCount(): Int = listMinuman.size

    interface OnItemClickCallback {
        fun onItemClicked(data: Minuman)
    }
}

