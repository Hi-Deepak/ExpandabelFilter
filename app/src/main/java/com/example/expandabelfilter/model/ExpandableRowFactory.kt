package com.example.expandabelfilter.model

fun <T> ExpandableRow.Companion.createList(
    data: List<T>,
    childrenExtractor: (T) -> List<T>,
    level: Int = 0
): MutableList<ExpandableRow<T>> {
    return data.map {
        ExpandableRow(
            data = it,
            level = level + 1,
            children = createList(childrenExtractor(it), childrenExtractor, level + 1)
        )
    }.toMutableList()
}