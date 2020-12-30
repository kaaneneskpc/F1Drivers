package com.example.f1drivers

import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val intent = intent
        val driversname = intent.getStringExtra("name")
        textViewName.text=driversname
        val images=intent.getIntExtra("image",0)
        val selectedBitmap = BitmapFactory.decodeResource(applicationContext.resources,images)
        imageView.setImageBitmap(selectedBitmap)

       /* val singleton =Singleton.SelectedImage
        val selectedBitmap = singleton.selectedImage
        imageView.setImageBitmap(selectedBitmap)*/
    }
}