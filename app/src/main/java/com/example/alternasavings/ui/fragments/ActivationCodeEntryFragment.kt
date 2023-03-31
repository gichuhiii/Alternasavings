package com.example.alternasavings.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.alternasavings.R

class ActivationCodeEntryFragment : Fragment() {
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //hide action bar
//      (activity as AppCompatActivity).supportActionBar?.hide()
//
//        val keypad = view?.findViewById(R.id.keypad) as Keypad
//        keypad?.setOnClickListener {
//            print("Hi")
//        }

        return inflater.inflate(R.layout.fragment_activation_code_entry, container, false)

    }
}