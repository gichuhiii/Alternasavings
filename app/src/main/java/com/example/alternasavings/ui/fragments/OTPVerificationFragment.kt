package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R

class OTPVerificationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Fragment Title
        (activity as AppCompatActivity).supportActionBar?.title = "OTP Verification"

        val view = inflater.inflate(R.layout.fragment_otp_verification, container, false)

        //  For the next button
        val btnNext = view.findViewById<ConstraintLayout>(R.id.cl_next)
        btnNext.setOnClickListener {
            Toast.makeText(requireContext(), "Verify", Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.action_OTPVerificationFragment_to_activationCodeEntryFragment)
        }

        return view
    }
}