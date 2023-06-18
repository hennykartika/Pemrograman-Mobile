package com.example.uts_mobile.ui.makanan

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts_mobile.databinding.FragmentMakananBinding
import com.example.uts_mobile.ui.makanan.Makanan

class MakananFragment : Fragment() {
    private var list: ArrayList<Makanan> = arrayListOf()
    private var _binding: FragmentMakananBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMakananBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val rvMakanan = binding.rvMakanan
        rvMakanan.layoutManager = LinearLayoutManager(context)

        list.addAll(MakananData.listData)

        val makananAdapter = MakananAdapter(list)
        rvMakanan.adapter = makananAdapter

        makananAdapter.setOnItemClickCallback(object : MakananAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Makanan) {
                val intent = Intent(requireContext(), DetailMakananActivity::class.java)
                intent.putExtra(DetailMakananActivity.EXTRA_DATA, data)
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
