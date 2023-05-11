package com.example.noiseperiodtracker.ui.newdatum

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.noiseperiodtracker.R
import com.example.noiseperiodtracker.databinding.FragmentNewdatumBinding

class NewDatumFragment : Fragment() {
    private var _binding: FragmentNewdatumBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val newDatumViewModel =
            ViewModelProvider(this).get(NewDatumViewModel::class.java)

        _binding = FragmentNewdatumBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val addFlow = binding.addFlow
        val addSymptoms = binding.addSymptoms

        addFlow.setOnClickListener {
            openNewFlowView()
        }

        addSymptoms.setOnClickListener {
            openNewSymptomsView()
        }

        return root
    }

    private fun openNewFlowView() {
        parentFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.nav_host_fragment_activity_main, NewFlowFragment())
            addToBackStack(null)
        }
    }

    private fun openNewSymptomsView() {
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}