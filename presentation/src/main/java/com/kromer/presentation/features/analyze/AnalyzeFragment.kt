package com.kromer.presentation.features.analyze

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.fragment.app.viewModels
import com.kromer.domain.models.Nutrition
import com.kromer.domain.utils.Status
import com.kromer.domain.utils.ValidationError
import com.kromer.presentation.R
import com.kromer.presentation.base.BaseFragment
import com.kromer.presentation.databinding.FragmentAnalyzeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnalyzeFragment : BaseFragment<FragmentAnalyzeBinding>() {

    private val viewModel: AnalyzeViewModel by viewModels()

    override fun getVBInflater(): (LayoutInflater) -> FragmentAnalyzeBinding =
        FragmentAnalyzeBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setViewModel()
        initObservers()
    }

    private fun setViewModel() {
        binding.viewModel = viewModel
    }

    private fun initObservers() {
        viewModel.data.observe(viewLifecycleOwner, {
            when (it.status) {
                Status.LOADING -> {

                }

                Status.ERROR -> {
                    if (it.validationError == ValidationError.EMPTY_INGREDIENT) {
                        binding.etIngredients.error = getString(R.string.hint_ingredient)
                        binding.etIngredients.requestFocus()
                    }
                }

                Status.SUCCESS -> {
                    it.data?.let { data ->
                        setData(data)
                    }
                }
            }
        })
    }

    private fun setData(data: Nutrition) {
        binding.nutrition = data
    }
}