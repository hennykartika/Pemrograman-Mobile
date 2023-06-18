package com.example.uts_mobile.ui.minuman

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_mobile.MainActivity
import com.example.uts_mobile.databinding.ActivityDetailMinumanBinding


class DetailMinumanActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private var _binding: ActivityDetailMinumanBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityDetailMinumanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getParcelableExtra<Minuman>(EXTRA_DATA) ?: return

        binding.dtItemName.text = data.name
        binding.dtItemDetail.text = data.detail
        binding.dtItemFoto.setImageResource(data.photo)
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
