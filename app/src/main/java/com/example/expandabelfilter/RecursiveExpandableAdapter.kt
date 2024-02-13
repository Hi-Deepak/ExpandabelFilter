package com.example.expandabelfilter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.GONE
import androidx.recyclerview.widget.RecyclerView.VISIBLE
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.expandabelfilter.RecursiveExpandableAdapter.RowViewHolder
import com.example.expandabelfilter.databinding.RowBinding
import com.example.expandabelfilter.model.ExpandableRow
import com.example.expandabelfilter.model.createList
import kotlin.math.sign

class RecursiveExpandableAdapter<T>(
    data: List<T>,
    val childrenExtractor: (T) -> List<T>,
    val labelExtractor: (T) -> String
): RecyclerView.Adapter<RowViewHolder>() {

    private val rows = ExpandableRow.createList(data, childrenExtractor)

    class RowViewHolder(
        val b: RowBinding
    ): ViewHolder(b.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowViewHolder {
        return RowViewHolder(
            RowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun getItemCount() = rows.size

    override fun onBindViewHolder(holder: RowViewHolder, position: Int) {
        val context = holder.itemView.context

        val row = rows[position]
        val data = row.data
        val hasChildren = row.hasChildren()

        holder.b.labelTv.text = labelExtractor(data)

        // Set padding based on level
        val scale = context.resources.displayMetrics.density
        val leftPadding = (row.level * 16 * scale).toInt()
        holder.b.labelTv.setPadding(leftPadding, 0, 0, 0)

        holder.b.toggleBtn.visibility = if (hasChildren) VISIBLE else GONE

        holder.b.toggleBtn.background =
            ContextCompat.getDrawable(
                context,
                if (row.expanded) {
                    R.drawable.ic_remove_circle_outline_black_24dp
                } else {
                    R.drawable.ic_control_point_black_24dp
                }
            )

        holder.b.toggleBtn.setOnClickListener {
            if (row.expanded) collapse(row) else expand(row)
        }
    }

    private fun expand(row: ExpandableRow<T>) {
        val position = rows.indexOf(row)
        rows[position] = row.copy(expanded = true)

        rows.addAll(position + 1, row.children)

        notifyItemChanged(position)
        notifyItemRangeInserted(position, row.children.size)
    }

    private fun collapse(row: ExpandableRow<T>) {
        val position = rows.indexOf(row)
        rows[position] = row.copy(expanded = false)

        var child = rows[position + 1]
        var noOfItemsRemoved = 0

        while (child.level > row.level) {
            rows.removeAt(position + 1)
            if (position + 1 < rows.size) {
                child = rows[position + 1]
                noOfItemsRemoved++
            } else {
                break
            }
        }

        notifyItemChanged(position)
        notifyItemRangeRemoved(position + 1, noOfItemsRemoved)
    }

}