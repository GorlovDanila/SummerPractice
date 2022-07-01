package com.example.summer_practice.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summer_practice.R
import com.example.summer_practice.databinding.FragmentMessagesBinding


class MessagesFragment: Fragment(R.layout.fragment_messages) {

    private var _binding: FragmentMessagesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMessagesBinding.bind(view)

        with(binding) {
            btnSettings.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG_TEXT",
                    (etText.text ?: "Error").toString()
                )
                findNavController().navigate(
                    R.id.action_messageFragment_to_finishFragment,
                    bundle
                )
            }
        }
    }
}