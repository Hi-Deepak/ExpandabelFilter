package com.example.expandabelfilter.model

data class Child(
    val child: List<ChildX>,
    val count: Int,
    val key: String,
    val level: String,
    val name: String,
    val parent_node_id: String,
    val value: String
)