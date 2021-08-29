package com.aaleksiev.creditscore.creditreport.usecase

import com.aaleksiev.creditscore.Dummy.creditReportResponse
import com.aaleksiev.creditscore.Dummy.expectedUserCreditReport
import com.aaleksiev.creditscore.TestBase
import com.aaleksiev.creditscore.creditreport.mapper.CreditReportMapper
import com.aaleksiev.creditscore.creditreport.repository.CreditReportRepository
import com.aaleksiev.creditscore.runTest
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.BDDMockito.given
import org.mockito.BDDMockito.verifyNoInteractions
import org.mockito.Mock
import org.mockito.Mockito.verify

class CreditReportUseCaseTest : TestBase() {
    @Mock
    private lateinit var creditReportRepository: CreditReportRepository

    @Mock
    private lateinit var creditReportMapper: CreditReportMapper

    private lateinit var underTest: CreditReportUseCase

    override fun setUp() {
        super.setUp()
        underTest = CreditReportUseCase(
            creditReportRepository = creditReportRepository,
            creditReportMapper = creditReportMapper,
            coroutineDispatcherProvider = coroutineDispatcherProvider
        )
    }

    @Test
    fun `will load user credit report`() = runTest {
        given(creditReportRepository.getUserCreditReport()).willReturn(creditReportResponse)
        given(creditReportMapper.map(creditReportResponse)).willReturn(expectedUserCreditReport)

        val actual = underTest.getUserCreditReport()

        assertEquals(expectedUserCreditReport, actual)
        verify(creditReportRepository).getUserCreditReport()
        verify(creditReportMapper).map(creditReportResponse)
    }

    @Test(expected = IllegalArgumentException::class)
    fun `given error when loading credit report then will rethrow the error`() = runTest {
        given(creditReportRepository.getUserCreditReport()).willThrow(IllegalArgumentException::class.java)

        underTest.getUserCreditReport()

        verify(creditReportRepository).getUserCreditReport()
        verifyNoInteractions(creditReportMapper)
    }
}