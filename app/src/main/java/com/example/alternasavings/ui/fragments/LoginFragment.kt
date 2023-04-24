package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.alternasavings.R
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.databinding.FragmentLoginBinding
import com.example.alternasavings.ui.viewmodels.LoginViewModel


class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()

        return inflater.inflate(R.layout.fragment_login, container, false)
    }
}


//    private lateinit var viewModel: LoginViewModel
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        val binding: ViewDataBinding? = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
//        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
////        binding?.viewModel = viewModel
//        binding?.lifecycleOwner = this
//
//        val constraintLayout = binding?.root?.findViewById<ConstraintLayout>(R.id.cl_next)
//
//        constraintLayout?.setOnClickListener {
//            viewModel.loginResult.observe(viewLifecycleOwner, Observer { loginResponse ->
//                if (loginResponse != null) {
//                    // Login successful, navigate to next screen
//                    findNavController().navigate(R.id.action_loginFragment_to_savingsPinEntryFragment)
//                } else {
//                    // Login failed, show error message
//                    Toast.makeText(requireContext(), "Failed to login", Toast.LENGTH_SHORT).show()
//                }
//            })
//        }
//
//        return binding?.root
//    }
//
//}