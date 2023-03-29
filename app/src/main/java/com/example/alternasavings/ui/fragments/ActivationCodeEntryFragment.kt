package com.example.alternasavings.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R

class ActivationCodeEntryFragment : Fragment() {
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //hide action bar
//      (activity as AppCompatActivity).supportActionBar?.hide()

//        val keypad = view?.findViewById<Keypad>(R.id.kp_keypad)
//        keypad?.setOnClickListener {
//            print("Hi")
//        }

        return inflater.inflate(R.layout.fragment_activation_code_entry, container, false)


    }

}