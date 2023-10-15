package com.example.zenv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zenv.adapters.RvItem2
import com.example.zenv.databinding.ActivityDashboard2Binding
import com.example.zenv.model.ItemModel2

class DashboardActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityDashboard2Binding
    private lateinit var adapterMain: RvItem2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboard2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        init2()
        setRvAdapter2()
    }
    // layoutManager
    private fun init2() {
        binding.rvExample2.layoutManager = LinearLayoutManager(this@DashboardActivity2)
    }
    // set array
    private fun setRvAdapter2() {
        val dataList2: MutableList<ItemModel2> = mutableListOf()

        nameHead().forEachIndexed{index, name ->
            dataList2.add(ItemModel2(ImageItem().get(index),name,descName()[index],dateName()[index],btnName()[index], btnName2()[index]))
        }

        Log.d("ISI DATANYA", dataList2.toString())
        adapterMain = RvItem2(dataList2)
        binding.rvExample2.adapter = adapterMain
    }

    // array
    private fun nameHead(): Array<String> = resources.getStringArray(R.array.data_name2)
    private fun descName(): Array<String> = resources.getStringArray(R.array.data_description2)
    private fun dateName(): Array<String> = resources.getStringArray(R.array.data_date2)
    private fun btnName(): Array<String> = resources.getStringArray(R.array.data_btn3)
    private fun btnName2(): Array<String> = resources.getStringArray(R.array.data_btn4)
    private fun ImageItem():List<Int> = listOf(
        R.drawable.photo5,
        R.drawable.photo6,
    )
}