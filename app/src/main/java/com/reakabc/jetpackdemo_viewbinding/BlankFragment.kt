package com.reakabc.jetpackdemo_viewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.reakabc.jetpackdemo_viewbinding.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    var binding: FragmentBlankBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentBlankBinding.inflate(inflater, container, false)
        val view: View = binding!!.root
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.messageOfFragment.text = "Hello form fragment"
    }

    companion object {
        fun newInstance() = BlankFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}