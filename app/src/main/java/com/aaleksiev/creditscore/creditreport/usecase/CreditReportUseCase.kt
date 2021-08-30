package com.aaleksiev.creditscore.creditreport.usecase

import com.aaleksiev.core.coroutines.CoroutineDispatcherProvider
import com.aaleksiev.creditscore.creditreport.mapper.CreditReportMapper
import com.aaleksiev.creditscore.creditreport.models.UserCreditReport
import com.aaleksiev.creditscore.creditreport.repository.CreditReportRepository
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CreditReportUseCase @Inject constructor(
    private val creditReportRepository: CreditReportRepository,
    private val creditReportMapper: CreditReportMapper,
    private val coroutineDispatcherProvider: CoroutineDispatcherProvider
) {
    suspend fun getUserCreditReport(): UserCreditReport =
        withContext(coroutineDispatcherProvider.io()) {
            creditReportRepository.getUserCreditReport().run {
                creditReportMapper.map(this)
            }
        }
}