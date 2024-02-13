package com.example.expandabelfilter.model

data class ExpandableRow<T>(
    val expanded: Boolean = false,
    val children: List<ExpandableRow<T>>,
    val data: T
) {
    fun hasChildren() = children.isNotEmpty()
    companion object
}
