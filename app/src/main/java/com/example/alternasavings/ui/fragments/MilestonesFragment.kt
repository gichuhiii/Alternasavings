package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MilestonesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_milestones, container, false)
        val NavBar = view.findViewById<BottomNavigationView>(R.id.bottom_nav_view)

        NavBar.setOnItemSelectedListener {
            print(it.itemId)
            when (it.itemId) {
                R.id.home -> {
                    findNavController().navigate(R.id.action_milestonesFragment_to_dashboardFragment)
                    true
                }
                R.id.goals -> {
                    findNavController().navigate(R.id.action_milestonesFragment_to_goalsFragment)
                    true
                }
                R.id.milestones -> {
                    findNavController().navigate(R.id.action_milestonesFragment_self)
                    true
                }
                R.id.portfolio -> {
                    findNavController().navigate(R.id.action_milestonesFragment_to_portfolioFragment)
                    true
                }
                R.id.settings -> {
                    findNavController().navigate(R.id.action_milestonesFragment_to_settingsFragment)
                    true
                }
                else -> false
            }
        }

        return view
    }
}