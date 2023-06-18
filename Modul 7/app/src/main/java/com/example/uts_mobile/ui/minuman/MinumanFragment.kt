package com.example.uts_mobile.ui.minuman

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_mobile.databinding.FragmentMinumanBinding

class MinumanFragment : Fragment() {
    private var list: ArrayList<Minuman> = arrayListOf()
    private var _binding: FragmentMinumanBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMinumanBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val rvMinuman = binding.rvMinuman
        rvMinuman.layoutManager = LinearLayoutManager(context)

        list.addAll(MinumanData.listData)

        val minumanAdapter = MinumanAdapter(list)
        rvMinuman.adapter = minumanAdapter

        minumanAdapter.setOnItemClickCallback(object : MinumanAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Minuman) {
                val intent = Intent(requireContext(), DetailMinumanActivity::class.java)
                intent.putExtra(DetailMinumanActivity.EXTRA_DATA, data)
                startActivity(intent)
            }
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
