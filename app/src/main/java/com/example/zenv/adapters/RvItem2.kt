package com.example.zenv.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zenv.databinding.ItemMain2Binding
import com.example.zenv.model.ItemModel2

class RvItem2(private val list: List<ItemModel2>): RecyclerView.Adapter<RvItem2.ViewHolder>() {

    class ViewHolder(val binding: ItemMain2Binding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMain2Binding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(list[position]){
                binding.ivPhoto2.setImageResource(this.image)
                binding.tvPhoto2.text = this.name
                binding.tvDesc2.text = this.desc
                binding.tvDate2.text = this.date
                binding.btnSatu2.text = this.btn
                binding.btnDua2.text = this.btn2
            }
        }
    }
}