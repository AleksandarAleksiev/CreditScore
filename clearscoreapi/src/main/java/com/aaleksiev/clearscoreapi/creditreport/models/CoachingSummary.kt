package com.aaleksiev.clearscoreapi.creditreport.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CoachingSummary(
    @Json(name = "activeTodo")
    val activeTodo: Boolean,
    @Json(name = "activeChat")
    val activeChat: Boolean,
    @Json(name = "numberOfTodoItems")
    val numberOfTodoItems: Int,
    @Json(name = "numberOfCompletedTodoItems")
    val numberOfCompletedTodoItems: Int,
    @Json(name = "selected")
    val selected: Boolean
)
