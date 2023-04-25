package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R

class SplashScreenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()

        val view = inflater.inflate(R.layout.fragment_splash_screen, container, false)
        view.alpha = 0f
        view.animate().setDuration(3500).alpha(1f).withEndAction {
            findNavController().navigate(R.id.action_splashScreenFragment_to_onBoardingTwoFragment)
        }
        return view
    }
}