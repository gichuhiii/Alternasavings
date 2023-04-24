package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R

class SignupLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        //  Inflate layout for this fragment
        val view = inflater.inflate(R.layout.fragment_signuplogin, container, false)

        //  For the signup button
        val buttonsignup = view.findViewById<Button>(R.id.btn_signup)
        buttonsignup.setOnClickListener {
            findNavController().navigate(R.id.action_signupLoginFragment_to_registerFragment)
        }

        //  For the login button
        val buttonlogin = view.findViewById<Button>(R.id.btn_login)
        buttonlogin.setOnClickListener {
            findNavController().navigate(R.id.action_signupLoginFragment_to_loginFragment)
        }

        return view
    }
}