package com.example.compexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class CalcFragment : Fragment() {

    private lateinit var editTextA: EditText
    private lateinit var editTextB: EditText
    private lateinit var editTextResult: EditText
    private lateinit var buttonCalc: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_calc, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextA = view.findViewById(R.id.editTextA)
        editTextB = view.findViewById(R.id.editTextB)
        editTextResult = view.findViewById(R.id.editTextResult)

        buttonCalc = view.findViewById(R.id.buttonCalc)
        buttonCalc.setOnClickListener(buttonCalcClickListener)
    }

    private var buttonCalcClickListener = View.OnClickListener {
        var a = editTextA.text.toString().toInt()
        var b = editTextB.text.toString().toInt()
        var result = a+b
        editTextResult.setText(result.toString())
    }


}