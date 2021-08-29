package com.aaleksiev.creditscore.creditreport

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.aaleksiev.core.models.updateUI
import com.aaleksiev.creditscore.R
import com.aaleksiev.creditscore.creditreport.models.UserCreditReport
import com.aaleksiev.creditscore.creditreport.viewmodel.CreditReportViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreditReportFragment : Fragment(R.layout.fragment_credit_report) {

    private val viewModel: CreditReportViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.uiState.observe(viewLifecycleOwner) { uiState ->
            uiState.updateUI(
                onLoading = ::onLoading,
                onSuccess = ::onSuccess,
                onError = ::onError
            )
        }
    }

    private fun onLoading(isLoading: Boolean) {
        //TODO "Not yet implemented"
    }

    private fun onSuccess(userCreditReport: UserCreditReport) {
        //TODO "Not yet implemented"
    }

    private fun onError(message: String) {
        //TODO "Not yet implemented"
    }
}