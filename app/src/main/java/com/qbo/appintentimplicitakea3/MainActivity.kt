package com.qbo.appintentimplicitakea3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qbo.appintentimplicitakea3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val vista = binding.root
        setContentView(vista)

        binding.btncompartir.setOnClickListener {
            val enviarIntent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Hola mundo")
                type = "text/plain"
            }
            if(enviarIntent.resolveActivity(packageManager) != null){
                startActivity(enviarIntent)
            }
        }

    }
}