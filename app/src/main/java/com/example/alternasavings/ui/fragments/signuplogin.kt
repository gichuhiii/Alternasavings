package com.example.alternasavings.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alternasavings.R
import com.example.alternasavings.databinding.FragmentSignuploginBinding

class signuplogin : Fragment() {

    private lateinit var binding: FragmentSignuploginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignuploginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupUI()
    }

    private fun setupUI() {

//        binding.fragmentSignuplogin.apply {
//            btnLogin.setOnClickListener {
//                val loginFragment = LoginFragment()
//                val transaction = requireActivity().supportFragmentManager.beginTransaction()
//                transaction.replace(R.id.fragment_container, loginFragment)
//                transaction.addToBackStack(null)
//                transaction.commit()
//            }
//            btnSignup.setOnClickListener {
//                val registerFragment = RegisterFragment()
//                val transaction = requireActivity().supportFragmentManager.beginTransaction()
//                transaction.replace(R.id.fragment_container, registerFragment)
//                transaction.addToBackStack(null)
//                transaction.commit()
//            }
        }
    }
