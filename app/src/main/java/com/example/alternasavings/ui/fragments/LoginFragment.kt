package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R


class LoginFragment : Fragment() {

    private var username: String = ""
    private var password: String = ""
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val button = view.findViewById<ConstraintLayout>(R.id.cl_next)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_OTPLoginFragment)
        }
        //Fragment Title
        (activity as AppCompatActivity).supportActionBar?.title = "Account Login"

        return view
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        login(username = "username", password = "password")
//    }

//    private fun login(username: String, password: String) {
//
//    }
}

