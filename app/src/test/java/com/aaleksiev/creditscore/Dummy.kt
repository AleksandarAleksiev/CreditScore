package com.aaleksiev.creditscore

import com.aaleksiev.clearscoreapi.creditreport.models.CoachingSummary
import com.aaleksiev.clearscoreapi.creditreport.models.CreditReportInfo
import com.aaleksiev.clearscoreapi.creditreport.models.CreditReportResponse
import com.aaleksiev.creditscore.creditreport.models.UserCreditReport

object Dummy {
    val creditReportResponse = CreditReportResponse(
        accountIDVStatus = "PASS",
        dashboardStatus = "PASS",
        personaType = "INEXPERIENCED",
        augmentedCreditScore = null,
        creditReportInfo = CreditReportInfo(
            score = 514,
            scoreBand = 4,
            clientRef = "CS-SED-655426-708782",
            status = "MATCH",
            maxScoreValue = 700,
            minScoreValue = 0,
            monthsSinceLastDefaulted = -1,
            hasEverDefaulted = false,
            monthsSinceLastDelinquent = 1,
            hasEverBeenDelinquent = true,
            percentageCreditUsed = 44,
            percentageCreditUsedDirectionFlag = 1,
            changedScore = 0,
            currentShortTermDebt = 13758,
            currentShortTermNonPromotionalDebt = 13758,
            currentShortTermCreditLimit = 30600,
            currentShortTermCreditUtilisation = 44,
            changeInShortTermDebt = 549,
            currentLongTermDebt = 24682,
            currentLongTermNonPromotionalDebt = 24682,
            currentLongTermCreditLimit = null,
            currentLongTermCreditUtilisation = null,
            changeInLongTermDebt = -327,
            numPositiveScoreFactors = 9,
            numNegativeScoreFactors = 0,
            equifaxScoreBand = 4,
            equifaxScoreBandDescription = "Excellent",
            daysUntilNextReport = 9
        ),
        coachingSummary = CoachingSummary(
            activeTodo = false,
            activeChat = true,
            numberOfTodoItems = 0,
            numberOfCompletedTodoItems = 0,
            selected = true
        )
    )

    val expectedUserCreditReport = UserCreditReport(
        creditScore = creditReportResponse.creditReportInfo.score,
        maxCreditScore = creditReportResponse.creditReportInfo.maxScoreValue,
    )
}