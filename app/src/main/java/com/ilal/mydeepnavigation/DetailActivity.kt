package com.ilal.mydeepnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ilal.mydeepnavigation.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object{
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_MESSAGE = "extra_message"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_detail)

        val title = intent.getStringExtra("extra_title")
        val message = intent.getStringExtra("extra_message")

        binding.tvTitle.text = title
        binding.tvMessage.text = message
    }
}