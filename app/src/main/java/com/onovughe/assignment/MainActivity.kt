package com.onovughe.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val name = arrayOf("Jackie", "Jet", "Keanu", "Jason",
    "Vin", "Sylvester", "Angelina", "Jean", "Cristiano", "Lionel",
        "Jackie", "Jet", "Keanu", "Jason",
        "Vin", "Sylvester", "Angelina", "Jean", "Cristiano", "Lionel")

    private val image = arrayOf(R.drawable.Img1,
    R.drawable.img2, R.drawable.Img1, R.drawable.Img1, R.drawable.Img1,
        R.drawable.Img1, R.drawable.Img1, R.drawable.Img1, R.drawable.Img1,
        R.drawable.Img1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ListView>(R.id.list_view).adapter = MyAdapter(this,image,name )
    }
}