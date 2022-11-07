package com.example.onboaringscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.onboaringscreen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewPagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var fragment_list = arrayListOf<Fragment>(
            first_screen(),
            second_screen(),
            third_screen()
        )

        viewPagerAdapter = ViewPagerAdapter(
            fragment_list,
            supportFragmentManager,
            lifecycle
        )

        binding.viewPager2.adapter = viewPagerAdapter





    }





}