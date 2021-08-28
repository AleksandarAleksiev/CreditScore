package com.aaleksiev.creditscore.di

import com.aaleksiev.core.di.ApiEndpoint
import com.aaleksiev.creditscore.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @ApiEndpoint
    fun providesApiEndpoint(): String = BuildConfig.API_ENDPOINT
}