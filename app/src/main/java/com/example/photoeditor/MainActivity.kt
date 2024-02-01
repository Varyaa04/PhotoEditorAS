package com.example.photoeditor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registr(view: View)
    {
        setContentView(R.layout.registration)
    }

    fun back(view: View)
    {
        setContentView(R.layout.activity_main)
    }
}