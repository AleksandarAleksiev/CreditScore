package com.aaleksiev.clearscoreapi.di

import com.aaleksiev.clearscoreapi.creditreport.CreditReportApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
class ClearScoreApiModule {
    @Provides
    fun providesCreditReportApi(retrofit: Retrofit): CreditReportApi =
        retrofit.create(CreditReportApi::class.java)
}