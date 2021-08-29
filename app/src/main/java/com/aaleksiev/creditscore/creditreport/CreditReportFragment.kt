package com.aaleksiev.creditscore.creditreport

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.aaleksiev.core.models.updateUI
import com.aaleksiev.core.viewbinding.viewBinding
import com.aaleksiev.creditscore.R
import com.aaleksiev.creditscore.creditreport.models.UserCreditReport
import com.aaleksiev.creditscore.creditreport.viewmodel.CreditReportViewModel
import com.aaleksiev.creditscore.databinding.FragmentCreditReportBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreditReportFragment : Fragment(R.layout.fragment_credit_report) {

    private val viewModel: CreditReportViewModel by viewModels()

    private val binding by viewBinding(FragmentCreditReportBinding::bind)

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
        binding.doughnutLayout.setIndeterminate(isLoading)
    }

    private fun onSuccess(userCreditReport: UserCreditReport) = with(binding) {
        doughnutLayout.setPercent(userCreditReport.percentOfTotal())
        totalCreditScore.text =
            getString(R.string.your_credit_score_out_of, userCreditReport.maxCreditScore)
        creditScore.text = userCreditReport.creditScore.toString()
    }

    private fun onError(message: String) {
        //TODO "Not yet implemented"
    }
}