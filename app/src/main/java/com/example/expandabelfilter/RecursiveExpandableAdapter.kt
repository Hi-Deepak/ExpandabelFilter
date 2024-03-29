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

class RecursiveExpandableAdapter<T>(
    data: List<T>,
    val childrenExtractor: (T) -> List<T>,
    val labelExtractor: (T) -> String,
    val onClick: (T) -> Unit
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

        val onClick = {
            if (row.expanded) collapse(row) else expand(row)
            onClick(data)
        }
        holder.b.toggleBtn.setOnClickListener { onClick() }
        holder.itemView.setOnClickListener { onClick() }
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

        val nextPosition = position + 1
        var noOfItemsRemoved = 0

        // Iterate and remove while lower level (numerically higher) elements are found
        while (rows[nextPosition].level > row.level) {
            rows.removeAt(nextPosition)
            noOfItemsRemoved++
            if (nextPosition > rows.lastIndex) break
        }

        notifyItemChanged(position)
        notifyItemRangeRemoved(position + 1, noOfItemsRemoved)
    }

}