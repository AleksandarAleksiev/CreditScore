package com.aaleksiev.clearscoreapi.creditreport

import com.aaleksiev.clearscoreapi.creditreport.models.CreditReportResponse
import retrofit2.http.GET

interface CreditReportApi {
    @GET("/endpoint.json")
    suspend fun getCreditReport(): CreditReportResponse
}