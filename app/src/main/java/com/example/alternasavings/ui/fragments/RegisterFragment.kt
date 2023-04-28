package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R
import com.example.alternasavings.data.network.ApiClient
import com.example.alternasavings.data.network.LoginResponsePayload
import com.example.alternasavings.data.network.RegisterRequestPayload
import retrofit2.Call
import retrofit2.Response


class RegisterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        //  Fragment Title
        (activity as AppCompatActivity).supportActionBar?.title = "Register"

        val view = inflater.inflate(R.layout.fragment_register, container, false)

        //  For the next button
        val btnNext = view.findViewById<ConstraintLayout>(R.id.cl_next)

        btnNext.setOnClickListener {
            val requestData = RegisterRequestPayload(
                view.findViewById<EditText>(R.id.et_fullname).text.toString(),
                view.findViewById<EditText>(R.id.et_idnumber).text.toString(),
                view.findViewById<EditText>(R.id.et_dob).text.toString(),
                view.findViewById<AutoCompleteTextView>(R.id.autocomplete_textview).text.toString(),
                view.findViewById<EditText>(R.id.et_phone_number).text.toString(),
                view.findViewById<EditText>(R.id.et_email).text.toString(),
            )

            ApiClient.authService.register(requestData)
                .enqueue(object : retrofit2.Callback<LoginResponsePayload> {
                    override fun onResponse(
                        call: Call<LoginResponsePayload>,
                        response: Response<LoginResponsePayload>
                    ) {
                        Log.d("REQ", call.request().toString())
                        Log.d("RES", response.toString())

                        //  Check if response is successful and display response body
                        if (response.isSuccessful) {
                            //  Get results from response body
                            Toast.makeText(requireContext(), "Registered!", Toast.LENGTH_SHORT)
                                .show()
                            findNavController().navigate(R.id.action_registerFragment_to_OTPVerificationFragment)
                        }
                    }

                    //  If it was not successful
                    override fun onFailure(call: Call<LoginResponsePayload>, t: Throwable) {
                        Log.e("Failed: ", t.message.toString())
                    }
                })
        }

        return view
    }

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
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

        val constraintLayout = binding.clNext
        constraintLayout.setOnClickListener {
            registerViewModel.registrationResponse.observe(viewLifecycleOwner, Observer
            { registrationResponse ->
                if (registrationResponse != null) {
                    // Registration successful, navigate to next screen
                    Toast.makeText(
                        requireContext(),
                        "Registration successful",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    findNavController().navigate(R.id.action_registerFragment_to_OTPVerificationFragment)
                } else {
                    // Registration failed, show error message
                    Toast.makeText(requireContext(), "Failed to register", Toast.LENGTH_SHORT)
                        .show()
                }
            })
        }
    }*/
}


//        for auto complete text view
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


