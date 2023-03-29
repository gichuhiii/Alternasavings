package com.example.alternasavings.ui.fragments

import android.os.Build
import android.os.Bundle
import android.util.SparseArray
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.SearchView.OnCloseListener
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.alternasavings.R

class Keypad : Fragment(), View.OnClickListener{
    private val keyValues = SparseArray<String>()
    var code = StringBuilder()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val tv_1 = view?.findViewById<View>(R.id.tv_1)
        val tv_2 = view?.findViewById<View>(R.id.tv_2)
        val tv_3 = view?.findViewById<View>(R.id.tv_3)
        val tv_4 = view?.findViewById<View>(R.id.tv_4)
        val tv_5 = view?.findViewById<View>(R.id.tv_5)
        val tv_6 = view?.findViewById<View>(R.id.tv_6)
        val tv_7 = view?.findViewById<View>(R.id.tv_7)
        val tv_8 = view?.findViewById<View>(R.id.tv_8)
        val tv_9 = view?.findViewById<View>(R.id.tv_9)
        val tv_0 = view?.findViewById<View>(R.id.tv_0)
        val iv_delete = view?.findViewById<View>(R.id.iv_delete)

        tv_1?.setOnClickListener(this)
        tv_2?.setOnClickListener(this)
        tv_3?.setOnClickListener(this)
        tv_4?.setOnClickListener(this)
        tv_5?.setOnClickListener(this)
        tv_6?.setOnClickListener(this)
        tv_7?.setOnClickListener(this)
        tv_8?.setOnClickListener(this)
        tv_9?.setOnClickListener(this)
        tv_0?.setOnClickListener(this)

        iv_delete?.setOnClickListener(this)

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

        return inflater.inflate(R.layout.keypad, container, false)

    }


    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}