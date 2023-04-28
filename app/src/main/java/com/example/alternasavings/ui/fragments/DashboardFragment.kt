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

class DashboardFragment : Fragment() {

    //    private lateinit var binding: FragmentDashboardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val NavBar = view.findViewById<BottomNavigationView>(R.id.bottom_nav_view)

        NavBar.setOnItemSelectedListener {
            print(it.itemId)
            when (it.itemId) {
                R.id.home -> {
                    findNavController().navigate(R.id.action_dashboardFragment_self)
                    true
                }
                R.id.goals -> {
                    findNavController().navigate(R.id.action_dashboardFragment_to_goalsFragment)
                    true
                }
                R.id.milestones -> {
                    findNavController().navigate(R.id.action_dashboardFragment_to_milestonesFragment)
                    true
                }
                R.id.portfolio -> {
                    findNavController().navigate(R.id.action_dashboardFragment_to_portfolioFragment)
                    true
                }
                R.id.settings -> {
                    findNavController().navigate(R.id.action_dashboardFragment_to_settingsFragment)
                    true
                }
                else -> false
            }
        }

        return view
    }
}
//        binding = FragmentDashboardBinding.inflate(inflater, container, false)
//        binding.root
//        replaceFragment(DashboardFragment())
//
//        bottomNavView.setOnItemSelectedListener {
//            when (it.itemId) {
//                R.id.home -> {
//                    replaceFragment(DashboardFragment())
//                    true
//                }
//                R.id.goals -> {
//                    replaceFragment(GoalsFragment())
//                    true
//                }
//                R.id.milestones -> {
//                    replaceFragment(MilestonesFragment())
//                    true
//                }
//                R.id.portfolio -> {
//                    replaceFragment((MilestonesFragment()))
//                    true
//                }
//                else -> false
//            }
//        }
//           return binding.root
//        }

    // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_dashboard, container, false)
