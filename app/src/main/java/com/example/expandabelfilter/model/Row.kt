package com.example.expandabelfilter.model

data class Row(
    val name: String,
    val children: List<Row> = emptyList()
)
