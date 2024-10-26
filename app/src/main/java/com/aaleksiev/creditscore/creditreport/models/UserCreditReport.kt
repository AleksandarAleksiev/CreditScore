package com.aaleksiev.creditscore.creditreport.models

data class UserCreditReport(
    val creditScore: Int,
    val maxCreditScore: Int
) {
    fun percentOfTotal(): Int {
        return creditScore.times(100).floorDiv(maxCreditScore)
    }
}