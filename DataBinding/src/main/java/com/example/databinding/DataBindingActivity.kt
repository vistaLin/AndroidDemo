package com.example.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import com.example.databinding.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {

    private val viewModel: DataBindingViewModel by lazy {
        getModel(DataBindingViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_data_binding)

        val binding: ActivityDataBindingBinding = setContentView(this, R.layout.activity_data_binding)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }

    fun <T : DataBindingViewModel> FragmentActivity.getModel(modelClass: Class<T>): T {
        return ViewModelProvider(this).get(modelClass)
    }
}