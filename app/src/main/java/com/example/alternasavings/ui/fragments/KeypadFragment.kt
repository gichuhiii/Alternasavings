package com.example.alternasavings.ui.fragments

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.alternasavings.R
import com.google.android.material.textfield.TextInputEditText

class KeypadFragment(context: Context, attrs: AttributeSet) :ConstraintLayout(context, attrs) {
    //    private val keyValues = SparseArray<String>()
//
//    //StringBuilder is used to modify a string
//    var code = StringBuilder()
    var inputText: TextInputEditText? = null

    init {
        inflate(context, R.layout.keypad, this)

        inputText = findViewById(R.id.et_input)

        val b_1 = findViewById<Button>(R.id.tv_1)
        val b_2 = findViewById<Button>(R.id.tv_2)
        val b_3 = findViewById<Button>(R.id.tv_3)
        val b_4 = findViewById<Button>(R.id.tv_4)
        val b_5 = findViewById<Button>(R.id.tv_5)
        val b_6 = findViewById<Button>(R.id.tv_6)
        val b_7 = findViewById<Button>(R.id.tv_7)
        val b_8 = findViewById<Button>(R.id.tv_8)
        val b_9 = findViewById<Button>(R.id.tv_9)
        val b_0 = findViewById<Button>(R.id.tv_0)
        val iv_delete = findViewById<View>(R.id.iv_delete)

        //    to delete the most previous entry
        iv_delete.setOnClickListener {
            if (inputText?.text.toString().length > 0) {
                inputText?.text?.delete(
                    inputText?.text.toString().length - 1,
                    inputText?.text.toString().length
                )
            }
        }

        b_1.setOnClickListener { this.onClick(1) }
        b_2.setOnClickListener { this.onClick(2) }
        b_3.setOnClickListener { this.onClick(3) }
        b_4.setOnClickListener { this.onClick(4) }
        b_5.setOnClickListener { this.onClick(5) }
        b_6.setOnClickListener { this.onClick(6) }
        b_7.setOnClickListener { this.onClick(7) }
        b_8.setOnClickListener { this.onClick(8) }
        b_9.setOnClickListener { this.onClick(9) }
        b_0.setOnClickListener { this.onClick(0) }
    }

    fun onClick(v: Int) {
        if (inputText?.text.toString().length < 6) {
            inputText?.append(v.toString())
        } else {
            Toast.makeText(
                context,
                "You have reached the maximum number of characters",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}

