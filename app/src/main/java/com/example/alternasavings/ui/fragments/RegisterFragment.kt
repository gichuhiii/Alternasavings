package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R


class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register, container, false)
        val button = view.findViewById<ConstraintLayout>(R.id.cl_next)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_OTPVerificationFragment)
        }
        //Fragment Title
        (activity as AppCompatActivity).supportActionBar?.title = "Register"

        return view
    }
}

