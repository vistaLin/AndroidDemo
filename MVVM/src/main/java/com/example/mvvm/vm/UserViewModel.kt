package com.example.mvvm.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvm.bean.User

/**
 * @author LinXingkuan
 * @since Create on 2024/7/23.
 */
class UserViewModel : ViewModel() {
   private val _users = MutableLiveData<List<User>>()
   val users: LiveData<List<User>> get() = _users

   init {
      _users.value = listOf(
         User("Johe", 25),
         User("Smith", 30)
      )
   }

   /**
    * 更新数据方法
    */
   fun addUser(user: User) {
      val updateUsers = _users.value?.toMutableList()
      updateUsers?.add(user)
//      _users.value = updateUsers
   }
}