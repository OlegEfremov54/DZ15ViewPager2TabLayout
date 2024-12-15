package com.example.dz15viewpager2tablayout

import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class PageAdapter(
    fragment: FragmentActivity,
    private val pageList:MutableList<Page>

): FragmentStateAdapter(fragment)
{
    override fun getItemCount(): Int {
        return pageList.size
    }

    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = Bundle().apply {
            // Передаём позицию
            putInt("position", position)
            // Передаём адрес
            putString("address", pageList[position].adress) // Передаём адрес
        }
        return fragment
    }
}