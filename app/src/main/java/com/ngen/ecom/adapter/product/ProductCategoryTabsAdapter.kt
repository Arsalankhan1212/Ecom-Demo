package com.ngen.ecom.adapter.product

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ProductCategoryTabsAdapter(activity : FragmentActivity) : FragmentStateAdapter(activity) {
    private val mFragmentList: MutableList<Fragment> = ArrayList()
    private val mFragmentTitleList: MutableList<String> = ArrayList()

    fun addFragment(fragment: Fragment, title : String){
        mFragmentList.add(fragment)
        mFragmentTitleList.add(title)
    }

    fun getTabTitle(position : Int): String{
        return mFragmentTitleList[position]
    }

    override fun getItemCount(): Int = mFragmentList.size


    override fun createFragment(position: Int) = mFragmentList[position]
}