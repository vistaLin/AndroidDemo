package com.example.mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvm.R
import com.example.mvvm.adapter.UserAdapter
import com.example.mvvm.databinding.ActivityMvvmdemoBinding
import com.example.mvvm.vm.UserViewModel

class MVVMDemoActivity : AppCompatActivity() {

    private val userViewModel: UserViewModel by lazy {
        getModel(UserViewModel::class.java)
    }

    private lateinit var binding: ActivityMvvmdemoBinding
    private lateinit var userAdapter: UserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // 设置 DataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvmdemo)
        binding.lifecycleOwner = this
        binding.viewModel = userViewModel

        // 初始化 RecyclerView 和适配器
        userAdapter = UserAdapter()
        binding.rlHome.layoutManager = LinearLayoutManager(this)
        binding.rlHome.adapter = userAdapter

        // 观察 ViewModel 中的数据变化
        userViewModel.users.observe(this, Observer { users ->
            userAdapter.setNewInstance(users.toMutableList())
        })
    }

    fun <T : UserViewModel> FragmentActivity.getModel(modelClass: Class<T>): T {
        return ViewModelProvider(this).get(modelClass)
    }
}