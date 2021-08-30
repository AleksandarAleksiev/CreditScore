package com.aaleksiev.core.di

import com.aaleksiev.core.coroutines.CoroutineDispatcherProvider
import com.aaleksiev.core.coroutines.CoroutineDispatcherProviderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class CoroutinesDispatcherModule {
    @Binds
    internal abstract fun bindCoroutinesDispatcher(coroutineDispatcher: CoroutineDispatcherProviderImpl): CoroutineDispatcherProvider
}