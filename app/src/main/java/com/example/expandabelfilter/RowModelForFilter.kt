package com.example.expandabelfilter

import com.example.expandabelfilter.model.Filters
import com.example.expandabelfilter.model.Option

class RowModelForFilter {


    var filters: Filters
    var isExpanded: Boolean
    var type: Int

    constructor(type: Int, filters: Filters, isExpanded: Boolean = false) {
        this.filters = filters
        this.isExpanded = isExpanded
        this.type = type
    }


}

object Constants {
    const val PARENT = 0
    const val CHILD = 1
}