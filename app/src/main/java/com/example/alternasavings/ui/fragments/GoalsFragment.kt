package com.example.alternasavings.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.alternasavings.R
import com.example.alternasavings.ui.adapters.Horizontal_RecyclerView

class GoalsFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Horizontal_RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        recyclerView = view?.findViewById(R.id.rv_popularchallenges)!!
        adapter = Horizontal_RecyclerView()

        recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = adapter

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_goals, container, false)
    }

}