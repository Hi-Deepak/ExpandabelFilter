package com.example.expandabelfilter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.expandabelfilter.model.Filters

class FilterAdapter(private val context: Context, var rowModels: MutableList<RowModelForFilter>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    /**
     * flag to restrict expand / collapse action it is already expanding / collapsing
     */
    private var actionLock = false

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal val nameTv: TextView = itemView.findViewById(R.id.name_tv) as TextView
        internal val toggleBtn: ImageButton = itemView.findViewById(R.id.toggle_btn) as ImageButton
    }

    override fun getItemViewType(position: Int): Int {
        return rowModels[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val viewHolder: RecyclerView.ViewHolder = CountryViewHolder(
            LayoutInflater.from(parent.getContext()).inflate(R.layout.country_row, parent, false)
        )
        return viewHolder
    }


    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {


        val row = rowModels[p1]

        (p0 as CountryViewHolder).nameTv.text = row.filters.get(p1).name

        if (row.filters.get(p1).options == null || row.filters.get(p1).options.isEmpty()) {
            p0.toggleBtn.visibility = View.GONE
        } else {
            if (p0.toggleBtn.visibility == View.GONE) {
                p0.toggleBtn.visibility = View.VISIBLE
            }

            if (row.isExpanded) {
                p0.toggleBtn.background =
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.ic_remove_circle_outline_black_24dp
                    )
            } else {
                p0.toggleBtn.background =
                    ContextCompat.getDrawable(
                        context,
                        R.drawable.ic_control_point_black_24dp
                    )
            }

            p0.toggleBtn.setOnClickListener {
                if (!actionLock) {
                    actionLock = true
                    if (row.isExpanded) {
                        row.isExpanded = false
                        collapse(p1)
                    } else {
                        row.isExpanded = true
                        expand(p1)
                    }
                }
            }
        }

    }


    fun expand(position: Int) {

        var nextPosition = position

        val row = rowModels[position]

        /**
         * add element just below of clicked row
         */
        for (state in row.filters) {
            rowModels.add(
                ++nextPosition, RowModelForFilter(
                    type = 1,
                    filters = Filters(),
                    isExpanded = true
                )
            )
        }

        notifyDataSetChanged()





        actionLock = false
    }

    fun collapse(position: Int) {
        val row = rowModels[position]
        val nextPosition = position + 1
        if (nextPosition == rowModels.size || rowModels.get(nextPosition).type === 1) {
            return
        }

        notifyDataSetChanged()



        actionLock = false
    }


    override fun getItemCount() = rowModels.size

}