package com.example.mvvm.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.mvvm.R
import com.example.mvvm.bean.User
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.mvvm.databinding.ItemUserBinding


/**
 * @author LinXingkuan
 * @since Create on 2024/7/23.
 */
class UserAdapter(data: MutableList<User>? = null) : BaseQuickAdapter<User, UserAdapter.UserViewHolder>(R.layout.item_user, data) {
    override fun onCreateDefViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UserAdapter.UserViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemUserBinding = DataBindingUtil.inflate(layoutInflater, R.layout.item_user, parent, false)
        return  UserViewHolder(binding)
    }

    override fun convert(holder: UserViewHolder, item: User) {

        holder.bind(item)
    }

    class UserViewHolder(private  val binding: ItemUserBinding) : BaseViewHolder(binding.root) {
        fun bind(user: User) {
            binding.user = user
            binding.executePendingBindings()
        }
    }
}