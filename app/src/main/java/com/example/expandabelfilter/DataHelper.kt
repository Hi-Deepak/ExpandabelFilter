package com.example.expandabelfilter

import com.example.expandabelfilter.model.Row

object DataHelper {

    fun getData(): List<Row> {
        return listOf(
            Row(
                name = "A",
                children = listOf(
                    Row(
                        name = "A1",
                        children = listOf(
                            Row(
                                name = "A1.1",
                                children = listOf(
                                    Row("A1.1.1"),
                                    Row("A1.1.2")
                                )
                            ),
                            Row(
                                name = "A1.2",
                                children = listOf(
                                    Row("A1.2.1"),
                                    Row("A1.2.2")
                                )
                            )
                        )
                    ),
                    Row(
                        name = "A2",
                        children = listOf(
                            Row(
                                name = "A2.1",
                                children = listOf(
                                    Row("A2.1.1"),
                                    Row("A2.1.2")
                                )
                            ),
                            Row(
                                name = "A2.2",
                                children = listOf(
                                    Row("A2.2.1"),
                                    Row("A2.2.2")
                                )
                            )
                        )
                    )
                )
            ),
            Row(
                name = "B",
                children = listOf(
                    Row(
                        name = "B1",
                        children = listOf(
                            Row(
                                name = "B1.1",
                                children = listOf(
                                    Row("B1.1.1"),
                                    Row("B1.1.2")
                                )
                            ),
                            Row(
                                name = "B1.2",
                                children = listOf(
                                    Row("B1.2.1"),
                                    Row("B1.2.2")
                                )
                            )
                        )
                    ),
                    Row(
                        name = "B2",
                        children = listOf(
                            Row(
                                name = "B2.1",
                                children = listOf(
                                    Row("B2.1.1"),
                                    Row("B2.1.2")
                                )
                            ),
                            Row(
                                name = "B2.2",
                                children = listOf(
                                    Row("B2.2.1"),
                                    Row("B2.2.2")
                                )
                            )
                        )
                    )
                )
            )
        )
    }

}