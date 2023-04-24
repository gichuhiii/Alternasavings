package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R
import com.example.alternasavings.data.network.ApiClient
import com.example.alternasavings.data.network.LoginRequestPayload
import com.example.alternasavings.data.network.LoginResponsePayload
import retrofit2.Call
import retrofit2.Response

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()

        val view = inflater.inflate(R.layout.fragment_login, container, false)


        val btnNext = view.findViewById<ConstraintLayout>(R.id.cl_next)

        val requestData = LoginRequestPayload(
            view.findViewById<EditText>(R.id.et_phone_number).toString(),
            view.findViewById<EditText>(R.id.et_pin).toString()
        )

        btnNext.setOnClickListener {
            ApiClient.authService.login(requestData)
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
                            val token = response.body()?.access_token

                            Toast.makeText(requireContext(), token, Toast.LENGTH_SHORT).show()

                            findNavController().navigate(R.id.action_loginFragment_to_dashboardFragment)
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