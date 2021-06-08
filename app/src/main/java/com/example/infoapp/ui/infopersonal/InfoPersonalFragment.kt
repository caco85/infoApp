package com.example.infoapp.ui.infopersonal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.infoapp.databinding.FragmentInfopersonalBinding

class InfoPersonalFragment : Fragment() {

    private lateinit var infoPersonalViewModel: InfoPersonalViewModel
    private var _binding: FragmentInfopersonalBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        infoPersonalViewModel =
            ViewModelProvider(this).get(InfoPersonalViewModel::class.java)

        _binding = FragmentInfopersonalBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textInfoPersonal
//        infoPersonalViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}