package com.aaleksiev.creditscore.creditreport.repository

import com.aaleksiev.clearscoreapi.creditreport.CreditReportApi
import com.aaleksiev.core.coroutines.CoroutineDispatcherProvider
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CreditReportRepository @Inject constructor(
    private val creditReportApi: CreditReportApi,
    private val dispatcherProvider: CoroutineDispatcherProvider
) {
    suspend fun getUserCreditReport() = withContext(dispatcherProvider.io()) {
        creditReportApi.getCreditReport()
    }
}