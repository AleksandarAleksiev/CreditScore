package com.aaleksiev.clearscoreapi.creditreport.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreditReportResponse(
    @Json(name = "accountIDVStatus")
    val accountIDVStatus: String,
    @Json(name = "creditReportInfo")
    val creditReportInfo: CreditReportInfo,
    @Json(name = "dashboardStatus")
    val dashboardStatus: String,
    @Json(name = "personaType")
    val personaType: String,
    @Json(name = "coachingSummary")
    val coachingSummary: CoachingSummary,
    @Json(name = "augmentedCreditScore")
    val augmentedCreditScore: Int?,
)