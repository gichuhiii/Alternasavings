package com.example.alternasavings.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alternasavings.R


class ActivationCodeEntryFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //  hide action bar
        (activity as AppCompatActivity).supportActionBar?.hide()

        val view = inflater.inflate(R.layout.fragment_activation_code_entry, container, false)

        val keypad = view.findViewById<Keypad>(R.id.keypad)
        val btnNext = view.findViewById<Button>(R.id.btn_next)

        btnNext.setOnClickListener {
            if (keypad?.inputText?.text.toString().length < 6) {
                Toast.makeText(
                    requireContext(),
                    "Activate Code: " + keypad?.inputText?.text + " MUST be 6 digits.",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(requireContext(), "Activated", Toast.LENGTH_SHORT).show()

                findNavController().navigate(R.id.action_activationCodeEntryFragment_to_enterNewPinFragment)
            }
        }

        return view
    }
}