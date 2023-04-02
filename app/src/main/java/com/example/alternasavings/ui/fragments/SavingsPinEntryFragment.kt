package com.example.alternasavings.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.alternasavings.R


class SavingsPinEntryFragment : Fragment() {
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

//        //hide action bar
//        (activity as AppCompatActivity).supportActionBar?.hide()

        return inflater.inflate(R.layout.fragment_savings_pin_entry, container, false)

    }
}