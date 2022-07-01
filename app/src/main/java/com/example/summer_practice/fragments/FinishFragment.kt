package com.example.summer_practice.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.summer_practice.R
import com.google.android.material.snackbar.Snackbar

class FinishFragment: Fragment(R.layout.fragment_finish) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val text = arguments?.getString("ARG_TEXT")
        if (text != null) {
            if (text.isNotEmpty()) {
                Snackbar.make(view, text, Snackbar.LENGTH_SHORT).show()
            }
        }
    }

}