package com.example.expandabelfilter.model

fun <T> ExpandableRow.Companion.createList(
    data: List<T>,
    childrenExtractor: (T) -> List<T>
): MutableList<ExpandableRow<T>> {
    return data.map {
        ExpandableRow(
            data = it,
            children = createList(childrenExtractor(it), childrenExtractor)
        )
    }.toMutableList()
}