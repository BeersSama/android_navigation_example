package com.example.android_navigation_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_navigation_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    /***
     * Fragment
     * Fragment khong tu sing ra ma no duoc attach tren 1 activity hoac 1 fragment khac
     *
     * Tai sao su dung fragment?
     * Single - activity la gi?
     *
     * Fragment no co the xay dung 1 man hinh, va no lam duoc nhung dieu ma
     * activity lam duoc, no nhe hon activity rat nhieu
     *
     * Single - activity: 1 app chi co 1 MainActivity con lai su dung het bang fragment
     */

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}