package com.example.expandabelfilter.model

data class FiltersItem(
    val key: String,
    val name: String,
    val options: List<Option>
)