package com.aaleksiev.creditscore

import androidx.annotation.CallSuper
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.aaleksiev.core.coroutines.CoroutineDispatcherProvider
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.TestCoroutineScope
import org.junit.Before
import org.junit.Rule
import org.mockito.BDDMockito.given
import org.mockito.Mock
import org.mockito.MockitoAnnotations

@OptIn(ExperimentalCoroutinesApi::class)
abstract class TestBase {

    @get:Rule
    val coroutineRule = TestCoroutineRule()

    @get:Rule
    val rule = InstantTaskExecutorRule()

    @Mock
    protected lateinit var coroutineDispatcherProvider: CoroutineDispatcherProvider

    @Before
    @CallSuper
    open fun setUp() {
        MockitoAnnotations.openMocks(this)
        given(coroutineDispatcherProvider.default()).willReturn(
            coroutineRule.testCoroutineDispatcher
        )
        given(coroutineDispatcherProvider.io()).willReturn(coroutineRule.testCoroutineDispatcher)
        given(coroutineDispatcherProvider.main()).willReturn(coroutineRule.testCoroutineDispatcher)
        given(coroutineDispatcherProvider.unconfined()).willReturn(
            coroutineRule.testCoroutineDispatcher
        )
    }
}

@OptIn(ExperimentalCoroutinesApi::class)
fun TestBase.runTest(testBlock: suspend (TestCoroutineScope) -> Unit) =
    this.coroutineRule.runBlockingTest {
        testBlock.invoke(this)
    }