package com.aaleksiev.clearscoreapi.creditreport.models

import com.aaleksiev.clearscoreapi.di.NetworkModule
import junit.framework.TestCase.assertEquals
import org.junit.Test

class CreditReportResponseTest {

    private val moshi by lazy {
        NetworkModule.providesMoshi()
    }

    @Test
    fun `given credit report JSON then will deserialize it in credit report object`() {
        val actual =
            moshi.adapter(CreditReportResponse::class.java).fromJson(Dummy.creditReportJson)

        assertEquals(Dummy.expectedCreditReportResponse, actual)
    }

    @Test
    fun `given credit report response object then will serialize it as JSON string`() {
        val actual = moshi.adapter(CreditReportResponse::class.java)
            .toJson(Dummy.expectedCreditReportResponse)

        assertEquals(Dummy.expectedJson, actual)
    }
}