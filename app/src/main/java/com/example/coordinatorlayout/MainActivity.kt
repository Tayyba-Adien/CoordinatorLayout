package com.example.coordinatorlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coordinatorlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        mainBinding.behaviorBased.setOnClickListener{
            startActivity(Intent(this,BehaviorBased::class.java))
        }
        mainBinding.layoutBased.setOnClickListener{
            startActivity(Intent(this,LayoutBased::class.java))
        }
    }
}