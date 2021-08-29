package com.aaleksiev.creditscore.creditreport.mapper

import com.aaleksiev.clearscoreapi.creditreport.models.CreditReportResponse
import com.aaleksiev.creditscore.creditreport.models.UserCreditReport
import javax.inject.Inject

class CreditReportMapper @Inject constructor() {
    fun map(creditReportResponse: CreditReportResponse) = UserCreditReport(
        creditScore = creditReportResponse.creditReportInfo.score,
        maxCreditScore = creditReportResponse.creditReportInfo.maxScoreValue
    )
}