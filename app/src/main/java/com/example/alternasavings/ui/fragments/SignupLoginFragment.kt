package com.example.alternasavings.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R
import com.example.alternasavings.databinding.FragmentSignuploginBinding

class SignupLoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        //inflate layout for this fragment
        val view = inflater.inflate(R.layout.fragment_signuplogin, container, false)

        //for the signup button
        val buttonsignup = view.findViewById<Button>(R.id.btn_signup)
        buttonsignup.setOnClickListener {
           findNavController().navigate(R.id.action_signupLoginFragment_to_registerFragment)

        }
        //for the login button
        val buttonlogin = view.findViewById<Button>(R.id.btn_login)
        buttonlogin.setOnClickListener {
            findNavController().navigate(R.id.action_signupLoginFragment_to_loginFragment)
        }

        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()
        return view
    }
}