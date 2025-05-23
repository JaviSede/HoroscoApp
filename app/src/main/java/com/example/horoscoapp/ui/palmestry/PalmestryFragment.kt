package com.example.horoscoapp.ui.palmestry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.horoscoapp.databinding.FragmentPalmestryBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PalmestryFragment : Fragment() {
    private var _binding: FragmentPalmestryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPalmestryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}