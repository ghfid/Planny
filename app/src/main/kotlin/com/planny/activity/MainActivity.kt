package com.planny.activity

import android.os.Bundle
import com.planny.R
import com.planny.fragment.ItemsFragment

class MainActivity : BaseActivity() {


    override val tag = "Main activity"
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val fragment = ItemsFragment()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, fragment)
            .commit()
    }

}





