package com.example.alternasavings.ui.fragments

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.AttributeSet
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.SearchView.OnCloseListener
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.example.alternasavings.R
import java.util.zip.Inflater

class Keypad(context: Context, attrs: AttributeSet) :ConstraintLayout(context, attrs) {
    private val keyValues = SparseArray<String>()
    var code = StringBuilder()

    init {
        inflate(context, R.layout.keypad, this)
        val tv_1 = findViewById<View>(R.id.tv_1)
        val tv_2 = findViewById<View>(R.id.tv_2)
        val tv_3 = findViewById<View>(R.id.tv_3)
        val tv_4 = findViewById<View>(R.id.tv_4)
        val tv_5 = findViewById<View>(R.id.tv_5)
        val tv_6 = findViewById<View>(R.id.tv_6)
        val tv_7 = findViewById<View>(R.id.tv_7)
        val tv_8 = findViewById<View>(R.id.tv_8)
        val tv_9 = findViewById<View>(R.id.tv_9)
        val tv_0 = findViewById<View>(R.id.tv_0)
        val iv_delete = findViewById<View>(R.id.iv_delete)

        tv_1?.setOnClickListener(context as OnClickListener)
        tv_2?.setOnClickListener(context as OnClickListener)
        tv_3?.setOnClickListener(context as OnClickListener)
        tv_4?.setOnClickListener(context as OnClickListener)
        tv_5?.setOnClickListener(context as OnClickListener)
        tv_6?.setOnClickListener(context as OnClickListener)
        tv_7?.setOnClickListener(context as OnClickListener)
        tv_8?.setOnClickListener(context as OnClickListener)
        tv_9?.setOnClickListener(context as OnClickListener)
        tv_0?.setOnClickListener(context as OnClickListener)
        iv_delete?.setOnClickListener(context as OnClickListener)

        keyValues.put(R.id.tv_1, "1")
        keyValues.put(R.id.tv_2, "2")
        keyValues.put(R.id.tv_3, "3")
        keyValues.put(R.id.tv_4, "4")
        keyValues.put(R.id.tv_5, "5")
        keyValues.put(R.id.tv_6, "6")
        keyValues.put(R.id.tv_7, "7")
        keyValues.put(R.id.tv_8, "8")
        keyValues.put(R.id.tv_9, "9")
        keyValues.put(R.id.tv_0, "0")

    }
}
//    override fun onCreateView(
//        inflater: LayoutInflater,
//        container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {


//        iv_delete?.setOnClickListener(this)
//
//        keyValues.put(R.id.tv_1, "1")
//        keyValues.put(R.id.tv_2, "2")
//        keyValues.put(R.id.tv_3, "3")
//        keyValues.put(R.id.tv_4, "4")
//        keyValues.put(R.id.tv_5, "5")
//        keyValues.put(R.id.tv_6, "6")
//        keyValues.put(R.id.tv_7, "7")
//        keyValues.put(R.id.tv_8, "8")
//        keyValues.put(R.id.tv_9, "9")
//        keyValues.put(R.id.tv_0, "0")
//
//        return inflater.inflate(R.layout.keypad, container, false)
//
//    }

//    override fun onClick(v: View?) {
//        TODO("Not yet implemented")
//    }
