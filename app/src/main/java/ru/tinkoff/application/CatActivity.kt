package ru.tinkoff.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat)
    }
}