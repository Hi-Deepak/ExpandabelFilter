package com.example.expandabelfilter.model

data class ChildX(
    val child: List<Any>,
    val count: Int,
    val level: String,
    val name: String,
    val parent_node_id: String,
    val value: String
)