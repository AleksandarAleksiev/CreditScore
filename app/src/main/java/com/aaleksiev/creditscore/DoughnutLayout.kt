package com.aaleksiev.creditscore

import android.content.Context
import android.util.AttributeSet
import androidx.core.view.*
import com.aaleksiev.core.extensions.layoutInflater
import com.aaleksiev.creditscore.databinding.LayoutDoughnutBinding
import com.google.android.material.card.MaterialCardView
import kotlin.math.min

class DoughnutLayout : MaterialCardView {

    private val binding = LayoutDoughnutBinding.inflate(context.layoutInflater(), this)

    constructor(context: Context) : this(context, null, 0)
    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        doOnLayout {
            updateProgressSize()
        }
    }

    fun setPercent(percent: Int) = with(binding) {
        setIndeterminate(false)
        doughnutProgress.progress = percent
    }

    fun setIndeterminate(isIndeterminate: Boolean) = with(binding.doughnutProgress) {
        isVisible = false
        this.isIndeterminate = isIndeterminate
        isVisible = true
    }

    private fun updateProgressSize() = with(binding.doughnutProgress) {
        val margin = marginTop + marginStart + marginEnd + marginBottom
        indicatorSize = min(this@DoughnutLayout.width, this@DoughnutLayout.height) - margin
        requestLayout()
    }
}