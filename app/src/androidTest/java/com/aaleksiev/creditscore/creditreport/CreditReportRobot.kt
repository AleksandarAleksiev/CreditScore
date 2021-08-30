package com.aaleksiev.creditscore.creditreport

import com.aaleksiev.creditscore.R
import com.aaleksiev.creditscore.robot.BaseRobot

class CreditReportRobot : BaseRobot() {
    fun withTitle(title: String) = matchText(R.id.title, title)

    fun withCreditScore(score: Int) = matchText(R.id.credit_score, score.toString())

    fun withDescription(description: String) = matchText(R.id.total_credit_score, description)

    fun errorIsDisplayed() {
        issDisplayed(R.id.error_title)
        issDisplayed(R.id.error_message)
    }
}

fun creditReport(block: CreditReportRobot.() -> Unit) = CreditReportRobot().apply(block)