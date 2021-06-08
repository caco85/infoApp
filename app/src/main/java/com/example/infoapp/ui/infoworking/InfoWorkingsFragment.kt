package com.example.infoapp.ui.infoworking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.infoapp.databinding.FragmentInfoworkingsBinding

class InfoWorkingsFragment : Fragment() {

    private lateinit var infoWorkingsViewModel: InfoWorkingsViewModel
    private var _binding: FragmentInfoworkingsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        infoWorkingsViewModel =
            ViewModelProvider(this).get(InfoWorkingsViewModel::class.java)

        _binding = FragmentInfoworkingsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.btnInfo.setOnClickListener(){
            val textView: TextView = binding.textInfo
            infoWorkingsViewModel.text.observe(viewLifecycleOwner, Observer {
                textView.text = it
            })
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}