package ru.tinkoff.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.tinkoff.application.databinding.ActivityCatBinding

class CatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCatBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}