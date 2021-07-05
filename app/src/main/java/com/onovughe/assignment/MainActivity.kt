package com.onovughe.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    private val name = arrayOf("Jackie", "Jet", "Keanu", "Jason",
    "Vin", "Sylvester", "Angelina", "Jean", "Cristiano", "Lionel",
        "Wayne", "Paul", "David", "Balogun",
        "Mason", "Chris", "Rick", "Jean", "Burna", "Paul")

    private val name3 = arrayOf("Jackie", "Jet", "Keanu", "Jason",
        "Vin", "Sylvester", "Angelina", "Jean", "Cristiano", "Lionel",
        "Wayne", "Paul", "David", "Balogun",
        "Mason", "Chris", "Rick", "Jean", "Burna", "Paul")

    private val image = arrayOf(R.drawable.Img1,
    R.drawable.img2, R.drawable.img3, R.drawable.Img4, R.drawable.Img5,
        R.drawable.Img6, R.drawable.Img7, R.drawable.Img8, R.drawable.img9,
        R.drawable.Img10, R.drawable.Img11,
        R.drawable.Img12, R.drawable.img13, R.drawable.Img14, R.drawable.Img15,
        R.drawable.img16, R.drawable.Img17, R.drawable.Img18, R.drawable.Img19,
        R.drawable.Img20)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ListView>(R.id.list_view).adapter = MyAdapter(this,image,name, name3 )
    }
}