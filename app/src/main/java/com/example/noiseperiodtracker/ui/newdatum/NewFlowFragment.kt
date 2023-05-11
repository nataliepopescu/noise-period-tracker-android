package com.example.noiseperiodtracker.ui.newdatum

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.noiseperiodtracker.R

class NewFlowFragment : Fragment() {

    companion object {
        fun newInstance() = NewFlowFragment()
    }

    private lateinit var viewModel: NewFlowViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_new_flow, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(NewFlowViewModel::class.java)
        // TODO: Use the ViewModel
    }

}