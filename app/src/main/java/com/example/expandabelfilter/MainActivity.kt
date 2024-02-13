package com.example.expandabelfilter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expandabelfilter.model.JsonHelper


class MainActivity : AppCompatActivity() {

    lateinit var filterAdapter: FilterAdapter
    lateinit var recyclerView : RecyclerView
    private val filterRows : MutableList<RowModelForFilter> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        filterAdapter = FilterAdapter(this, filterRows)

        recyclerView.layoutManager = LinearLayoutManager(
            this,
            RecyclerView.VERTICAL,
            false
        )

        recyclerView.adapter = filterAdapter

        populateData()
    }


    private fun populateData(){


        val filters = JsonHelper().filterJsonArray

        filterRows.add(RowModelForFilter(1, filters = filters))
        filterAdapter.notifyItemInserted(filterRows.size)


    }
}
