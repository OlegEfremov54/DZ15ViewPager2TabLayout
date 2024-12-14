package com.example.dz15viewpager2tablayout

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TableLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TableLayout
    private val pageList = Page.pages
    private lateinit var adapter: PageAdapter
    private var urlString:String = ""



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        adapter= PageAdapter(this,pageList)
        viewPager.adapter= adapter

        TabLayoutMediator(tabLayout,viewPager){
            tab, position ->
            val name = pageList[position].name
            urlString = "${pageList[position].adress}"
            tab.text = name
            tab.setIcon(pageList[position].image)

            if (position==3){
                val badge = tab.orCreateBadge
                badge.number = 1
            }
        }
            .attach()

        }


//Инициализация Меню
override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menuInflater.inflate(R.menu.menu_main, menu)
    return true
}.

override fun onOptionsItemSelected(item: MenuItem): Boolean {
    when (item.itemId) {
        R.id.infoMenuMain -> {
            Toast.makeText(
                applicationContext, "Автор Ефремов О.В. Создан 14.12.2024",
                Toast.LENGTH_LONG
            ).show()
        }

        R.id.exitMenuMain -> {
            Toast.makeText(
                applicationContext, "Работа приложения завершена",
                Toast.LENGTH_LONG
            ).show()
            finishAffinity()
        }
    }
    return super.onOptionsItemSelected(item)
}
}





