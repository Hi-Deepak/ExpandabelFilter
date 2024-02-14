package com.example.expandabelfilter.model

data class Filter(
    val options: List<Filter>?,
    val child: List<Filter>?,
    val count: Int,
    val key: String,
    val level: String,
    val name: String?,
    val parent_node_id: String,
    val value: String
)