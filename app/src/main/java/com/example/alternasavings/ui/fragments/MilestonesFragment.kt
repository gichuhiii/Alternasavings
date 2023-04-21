package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.alternasavings.R

class MilestonesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_milestones, container, false)
    }
}