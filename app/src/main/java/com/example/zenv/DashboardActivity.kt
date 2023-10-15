package com.example.zenv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zenv.adapters.RvItem
import com.example.zenv.databinding.ActivityDashboardBinding
import com.example.zenv.model.ItemModel

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private lateinit var adapterMain: RvItem

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        setRvAdapter()
    }

    // layoutManager
    private fun init() {
        binding.rvExample.layoutManager = LinearLayoutManager(this@DashboardActivity)
    }

    // set array
    private fun setRvAdapter() {
        val dataList: MutableList<ItemModel> = mutableListOf()

        nameHead().forEachIndexed{index, name ->
            dataList.add(ItemModel(ImageItem().get(index),name,descName()[index],dateName()[index],btnName()[index], btnName2()[index]))
        }

        Log.d("ISI DATANYA", dataList.toString())
        adapterMain = RvItem(dataList)
        binding.rvExample.adapter =adapterMain
    }

    // array
    private fun nameHead(): Array<String> = resources.getStringArray(R.array.data_name)
    private fun descName(): Array<String> = resources.getStringArray(R.array.data_description)
    private fun dateName(): Array<String> = resources.getStringArray(R.array.data_date)
    private fun btnName(): Array<String> = resources.getStringArray(R.array.data_btn)
    private fun btnName2(): Array<String> = resources.getStringArray(R.array.data_btn2)
    private fun ImageItem():List<Int> = listOf(
        R.drawable.photo1,
        R.drawable.photo2,
        R.drawable.photo3,
        R.drawable.photo4
    )
}