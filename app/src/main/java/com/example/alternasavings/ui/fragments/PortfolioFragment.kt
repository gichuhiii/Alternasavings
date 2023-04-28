package com.example.alternasavings.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class PortfolioFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_portfolio, container, false)
        val NavBar = view.findViewById<BottomNavigationView>(R.id.bottom_nav_view)

        NavBar.setOnItemSelectedListener {
            print(it.itemId)
            when (it.itemId) {
                R.id.home -> {
                    findNavController().navigate(R.id.action_portfolioFragment_to_dashboardFragment)
                    true
                }
                R.id.goals -> {
                    findNavController().navigate(R.id.action_portfolioFragment_to_goalsFragment)
                    true
                }
                R.id.milestones -> {
                    findNavController().navigate(R.id.action_portfolioFragment_to_milestonesFragment)
                    true
                }
                R.id.portfolio -> {
                    findNavController().navigate(R.id.action_portfolioFragment_self)
                    true
                }
                R.id.settings -> {
                    findNavController().navigate(R.id.action_portfolioFragment_to_settingsFragment)
                    true
                }
                else -> false
            }
        }

        return view
    }
}