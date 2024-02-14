package com.example.expandabelfilter

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expandabelfilter.model.Filter
import com.example.expandabelfilter.model.Row

class MainActivity : AppCompatActivity() {

    // Dummy data adapter
//    private lateinit var adapter: RecursiveExpandableAdapter<Row>

    // Main data adapter
    private lateinit var adapter: RecursiveExpandableAdapter<Filter>

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)

        // Dummy data
//        adapter = RecursiveExpandableAdapter(
//            data = DataHelper.getData(),
//            labelExtractor = { it.name },
//            childrenExtractor = { it.children },
//            onClick = {
//                Toast.makeText(this, it.name, Toast.LENGTH_SHORT).show()
//            }
//        )

        // Main data
        adapter = RecursiveExpandableAdapter(
            data = DataHelper.getMainData(),
            labelExtractor = { it.name ?: it.value },
            childrenExtractor = { it.options ?: it.child ?: emptyList() },
            onClick = {
                Toast.makeText(this, it.name ?: it.value, Toast.LENGTH_SHORT).show()
            }
        )

        // Disable animation due to internal bug causing crash
        recyclerView.layoutManager =
            object : LinearLayoutManager(this, RecyclerView.VERTICAL, false) {
                override fun supportsPredictiveItemAnimations() = false
            }

        recyclerView.adapter = adapter
    }
}
