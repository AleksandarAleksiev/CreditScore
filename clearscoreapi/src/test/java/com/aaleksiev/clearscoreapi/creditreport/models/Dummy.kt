package com.aaleksiev.clearscoreapi.creditreport.models

object Dummy {
    const val creditReportJson = "{\n" +
            "  \"accountIDVStatus\": \"PASS\",\n" +
            "  \"creditReportInfo\": {\n" +
            "    \"score\": 514,\n" +
            "    \"scoreBand\": 4,\n" +
            "    \"clientRef\": \"CS-SED-655426-708782\",\n" +
            "    \"status\": \"MATCH\",\n" +
            "    \"maxScoreValue\": 700,\n" +
            "    \"minScoreValue\": 0,\n" +
            "    \"monthsSinceLastDefaulted\": -1,\n" +
            "    \"hasEverDefaulted\": false,\n" +
            "    \"monthsSinceLastDelinquent\": 1,\n" +
            "    \"hasEverBeenDelinquent\": true,\n" +
            "    \"percentageCreditUsed\": 44,\n" +
            "    \"percentageCreditUsedDirectionFlag\": 1,\n" +
            "    \"changedScore\": 0,\n" +
            "    \"currentShortTermDebt\": 13758,\n" +
            "    \"currentShortTermNonPromotionalDebt\": 13758,\n" +
            "    \"currentShortTermCreditLimit\": 30600,\n" +
            "    \"currentShortTermCreditUtilisation\": 44,\n" +
            "    \"changeInShortTermDebt\": 549,\n" +
            "    \"currentLongTermDebt\": 24682,\n" +
            "    \"currentLongTermNonPromotionalDebt\": 24682,\n" +
            "    \"changeInLongTermDebt\": -327,\n" +
            "    \"numPositiveScoreFactors\": 9,\n" +
            "    \"numNegativeScoreFactors\": 0,\n" +
            "    \"equifaxScoreBand\": 4,\n" +
            "    \"equifaxScoreBandDescription\": \"Excellent\",\n" +
            "    \"daysUntilNextReport\": 9\n" +
            "  },\n" +
            "  \"dashboardStatus\": \"PASS\",\n" +
            "  \"personaType\": \"INEXPERIENCED\",\n" +
            "  \"coachingSummary\": {\n" +
            "    \"activeTodo\": false,\n" +
            "    \"activeChat\": true,\n" +
            "    \"numberOfTodoItems\": 0,\n" +
            "    \"numberOfCompletedTodoItems\": 0,\n" +
            "    \"selected\": true\n" +
            "  }\n" +
            "}"

    val expectedCreditReportResponse = CreditReportResponse(
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

    val expectedJson = creditReportJson.replace("\n", "").replace(" ", "")
}