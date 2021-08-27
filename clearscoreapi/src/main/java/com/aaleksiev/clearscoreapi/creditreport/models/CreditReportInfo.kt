package com.aaleksiev.clearscoreapi.creditreport.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CreditReportInfo(
    @Json(name = "score")
    val score: Int,
    @Json(name = "scoreBand")
    val scoreBand: Int,
    @Json(name = "clientRef")
    val clientRef: String,
    @Json(name = "status")
    val status: String,
    @Json(name = "maxScoreValue")
    val maxScoreValue: Int,
    @Json(name = "minScoreValue")
    val minScoreValue: Int,
    @Json(name = "monthsSinceLastDefaulted")
    val monthsSinceLastDefaulted: Int,
    @Json(name = "hasEverDefaulted")
    val hasEverDefaulted: Boolean,
    @Json(name = "monthsSinceLastDelinquent")
    val monthsSinceLastDelinquent: Int,
    @Json(name = "hasEverBeenDelinquent")
    val hasEverBeenDelinquent: Boolean,
    @Json(name = "percentageCreditUsed")
    val percentageCreditUsed: Int,
    @Json(name = "percentageCreditUsedDirectionFlag")
    val percentageCreditUsedDirectionFlag: Int,
    @Json(name = "changedScore")
    val changedScore: Int,
    @Json(name = "currentShortTermDebt")
    val currentShortTermDebt: Int,
    @Json(name = "currentShortTermNonPromotionalDebt")
    val currentShortTermNonPromotionalDebt: Int,
    @Json(name = "currentShortTermCreditLimit")
    val currentShortTermCreditLimit: Int,
    @Json(name = "currentShortTermCreditUtilisation")
    val currentShortTermCreditUtilisation: Int,
    @Json(name = "changeInShortTermDebt")
    val changeInShortTermDebt: Int,
    @Json(name = "currentLongTermDebt")
    val currentLongTermDebt: Int,
    @Json(name = "currentLongTermNonPromotionalDebt")
    val currentLongTermNonPromotionalDebt: Int,
    @Json(name = "currentLongTermCreditLimit")
    val currentLongTermCreditLimit: Int?,
    @Json(name = "currentLongTermCreditUtilisation")
    val currentLongTermCreditUtilisation: Int?,
    @Json(name = "changeInLongTermDebt")
    val changeInLongTermDebt: Int,
    @Json(name = "numPositiveScoreFactors")
    val numPositiveScoreFactors: Int,
    @Json(name = "numNegativeScoreFactors")
    val numNegativeScoreFactors: Int,
    @Json(name = "equifaxScoreBand")
    val equifaxScoreBand: Int,
    @Json(name = "equifaxScoreBandDescription")
    val equifaxScoreBandDescription: String,
    @Json(name = "daysUntilNextReport")
    val daysUntilNextReport: Int
)