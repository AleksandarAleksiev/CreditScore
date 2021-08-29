package com.aaleksiev.creditscore

import com.aaleksiev.clearscoreapi.creditreport.CreditReportApi
import com.aaleksiev.clearscoreapi.di.ClearScoreApiModule
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.testing.TestInstallIn
import org.mockito.Mockito.mock
import javax.inject.Singleton

@Module
@TestInstallIn(
    components = [SingletonComponent::class],
    replaces = [ClearScoreApiModule::class]
)
class TestApiModule {

    @Singleton
    @Provides
    fun provideCreditReportApi(): CreditReportApi {
        return mock(CreditReportApi::class.java)
    }
}