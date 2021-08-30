package com.aaleksiev.creditscore.creditreport.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.aaleksiev.clearscoreapi.extensions.runCatchingWithLoading
import com.aaleksiev.core.coroutines.CoroutineDispatcherProvider
import com.aaleksiev.core.models.UIState
import com.aaleksiev.creditscore.creditreport.models.UserCreditReport
import com.aaleksiev.creditscore.creditreport.usecase.CreditReportUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CreditReportViewModel @Inject constructor(
    private val creditReportUseCase: CreditReportUseCase,
    private val coroutinesDispatcherProvider: CoroutineDispatcherProvider
) : ViewModel() {

    val uiState = liveData<UIState<UserCreditReport>>(coroutinesDispatcherProvider.main()) {
        runCatchingWithLoading({
            creditReportUseCase.getUserCreditReport()
        }, {
            emit(UIState.Loading(isLoading = it))
        })
            .onSuccess { emit(UIState.Success(it)) }
            .onFailure { emit(UIState.Error(it.localizedMessage.orEmpty())) }
    }
}