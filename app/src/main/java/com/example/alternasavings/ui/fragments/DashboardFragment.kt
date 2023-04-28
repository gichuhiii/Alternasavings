package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.alternasavings.R
import com.example.alternasavings.databinding.FragmentDashboardBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard, container, false)

}
//        binding = FragmentDashboardBinding.inflate(inflater, container, false)
//        binding.root
//        replaceFragment(DashboardFragment())
//
//        binding.bottomNavView.setOnItemSelectedListener {
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


//
//        private fun replaceFragment(fragment: Fragment) {
//
//            val fragmentManager = getChildFragmentManager()
//            val fragmentTransaction = fragmentManager.beginTransaction()
//            fragmentTransaction.replace(R.id.fragmentContainerView, fragment)
//            fragmentTransaction.commit()
//        }

        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_dashboard, container, false)



    }
