package com.aaleksiev.creditscore.creditreport

import com.aaleksiev.clearscoreapi.creditreport.CreditReportApi
import com.aaleksiev.creditscore.*
import dagger.hilt.android.testing.HiltAndroidTest
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.mockito.BDDMockito.given
import javax.inject.Inject

@HiltAndroidTest
class CreditReportFragmentTest : HiltTestBase() {

    @Inject
    lateinit var creditReportApi: CreditReportApi

    @Test
    fun willLoadUserCreditReport() {
        runBlocking {
            given(creditReportApi.getCreditReport()).willReturn(creditReportResponse)

            creditReport {
                withTitle(applicationContext.getString(R.string.your_credit_report))
                withCreditScore(CREDIT_SCORE)
                withDescription(
                    applicationContext.getString(
                        R.string.your_credit_score_out_of,
                        MAX_CREDIT_SCORE
                    )
                )
            }
        }
    }
}