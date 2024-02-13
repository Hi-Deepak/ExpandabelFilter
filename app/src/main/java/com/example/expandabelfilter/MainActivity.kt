package com.example.expandabelfilter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expandabelfilter.model.Row

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: RecursiveExpandableAdapter<Row>
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler_view)
        adapter = RecursiveExpandableAdapter(
            data = DataHelper.getData(),
            labelExtractor = { it.name },
            childrenExtractor = { it.children }
        )

        // Disable animation due to internal bug causing crash
        recyclerView.layoutManager =
            object : LinearLayoutManager(this, RecyclerView.VERTICAL, false) {
                override fun supportsPredictiveItemAnimations() = false
            }

        recyclerView.adapter = adapter
    }
}
