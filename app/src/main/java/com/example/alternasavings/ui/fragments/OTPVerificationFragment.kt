package com.example.alternasavings.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.alternasavings.R

class OTPVerificationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Fragment Title
        (activity as AppCompatActivity).supportActionBar?.title = "OTP Verification"

        return inflater.inflate(R.layout.fragment_otp_verification, container, false)

    }
}