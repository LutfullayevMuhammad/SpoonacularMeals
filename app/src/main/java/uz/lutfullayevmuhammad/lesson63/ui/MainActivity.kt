package uz.lutfullayevmuhammad.lesson63.ui

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import uz.lutfullayevmuhammad.lesson63.databinding.ActivityMainBinding

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}