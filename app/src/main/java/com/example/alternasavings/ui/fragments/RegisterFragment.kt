package com.example.alternasavings.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Spinner
import com.example.alternasavings.R
import com.example.alternasavings.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

        private lateinit var binding: FragmentRegisterBinding

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentRegisterBinding.inflate(inflater, container, false)
            return binding.root
        }
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            arguments?.let {

            }
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)

        }
}