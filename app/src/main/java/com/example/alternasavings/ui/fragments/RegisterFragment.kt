package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R
import com.example.alternasavings.databinding.FragmentRegisterBinding
import com.example.alternasavings.ui.viewmodels.RegisterViewModel
import androidx.lifecycle.Observer


class RegisterFragment : Fragment() {

    private lateinit var binding: FragmentRegisterBinding
    private lateinit var registerViewModel: RegisterViewModel
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Fragment Title
        (activity as AppCompatActivity).supportActionBar?.title = "Register"

        binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val genderOptions = listOf("Male", "Female", "Prefer not to say")
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_dropdown_item_1line,
            genderOptions
        )
        val genderAutoCompleteTextView =
            binding.autocompleteTextview
        genderAutoCompleteTextView.setAdapter(adapter)

        registerViewModel = ViewModelProvider(this).get(RegisterViewModel::class.java)

        registerViewModel.registrationResponse.observe(viewLifecycleOwner, Observer
        { registrationResponse ->
            if (registrationResponse != null) {
                // Registration successful, navigate to next screen
                findNavController().navigate(R.id.action_registerFragment_to_OTPVerificationFragment)
            } else {
                // Registration failed, show error message
                Toast.makeText(requireContext(), "Failed to register", Toast.LENGTH_SHORT).show()
            }
        })
    }
}


//        //for auto complete text view
//        val genderOptions = listOf("Male", "Female", "Prefer not to say")
//        val adapter = ArrayAdapter(
//            requireContext(),
//            android.R.layout.simple_dropdown_item_1line,
//            genderOptions
//        )
//        val genderAutoCompleteTextView =
//            view?.findViewById<AutoCompleteTextView>(R.id.autocomplete_textview)
//        genderAutoCompleteTextView?.setAdapter(adapter)
//
//        val fullname = view.findViewById<EditText>(R.id.et_fullname)
//        val id = view.findViewById<EditText>(R.id.et_idnumber)
//        val dob = view.findViewById<EditText>(R.id.et_dob)
//        val gender = view.findViewById<AutoCompleteTextView>(R.id.autocomplete_textview)
//        val phone = view.findViewById<EditText>(R.id.et_confirm_phone_number)
//        val email = view.findViewById<EditText>(R.id.et_email)
//
//        //for next view
//        val button = view.findViewById<ConstraintLayout>(R.id.cl_next)
//        button.setOnClickListener {
//
//            findNavController().navigate(R.id.action_registerFragment_to_OTPVerificationFragment)
//        }
//
//        return view
//    }


