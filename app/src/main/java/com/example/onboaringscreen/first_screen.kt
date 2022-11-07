package com.example.onboaringscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2


class first_screen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val viewPager:ViewPager2 = requireActivity().findViewById(R.id.viewPager2)
        val next:Button = requireActivity().findViewById(R.id.buttonNext)
        val back:Button = requireActivity().findViewById(R.id.buttonBack)
        back.visibility = View.GONE


        next.setOnClickListener {
            viewPager.currentItem=1
            back.visibility = View.VISIBLE

        }



        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_screen, container, false)
    }


}