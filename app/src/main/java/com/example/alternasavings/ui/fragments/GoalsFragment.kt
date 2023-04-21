package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alternasavings.R

//import com.example.alternasavings.ui.adapters.Horizontal_RecyclerView

class GoalsFragment : Fragment() {
        override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()

        return inflater.inflate(R.layout.fragment_goals, container, false)
    }
}

